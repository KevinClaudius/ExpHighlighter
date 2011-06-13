/*
Robert Stehwien
Kevin Page
*/

grammar Exp;

options {
	language=JavaScript;
   	output=AST;
	ASTLabelType=CommonTree;
	//charVocabulary='\u0000'..'\uFFFE'; // defines the valid set of characters that can be recognized by the ANTLR scanner
}

tokens {
	POS;
	NEG;
	CALL;
}

//@header {package output;} // for testing
//@lexer::header {package output;} // for testing

formula
	: (EQ!)? expression
	;

//The highest precedence expression is the most deeply nested
//Precedence ties are parsed left to right
//Expression starts with the lowest precedece rule
expression		
	: boolExpr
	;
boolExpr
	: concatExpr ((AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ)^ concatExpr)*
	;
concatExpr
	: sumExpr (CONCAT^ sumExpr)*
	;
// there's a bug around line 485 of the generated ExpParser.js for this rule.  It doesn't put 'this.' in front of input.LA(1), causing the error message 'input is not defined'.  I manually fixed ExpParser.js after generating
sumExpr
	: productExpr ((SUB | ADD)^ productExpr)* 
	;
productExpr
	: expExpr ((DIV | MULT)^ expExpr)*
	;
expExpr
	: unaryOperation (EXP^ unaryOperation)*
	;
unaryOperation
	: NOT^ operand
	| ADD o=operand -> ^(POS $o)
	| SUB o=operand -> ^(NEG $o)
	| operand
	;
// the highest precedence rule uses operand
operand
	: literal 
	| functionExpr -> ^(CALL functionExpr)
	| percent
	| VARIABLE
	//| PV // TODO: make this more general
	| LPAREN expression RPAREN -> ^(expression)
	;
functionExpr
	: FUNCNAME LPAREN! (expression (COMMA! expression)*)? RPAREN!
	;
literal
	: arrayLiteral
	| NUMBER 
	| STRING 
	| TRUE
	| FALSE
	;
	
arrayLiteral
	: LBRACKET! (expression (COMMA! expression)*)? RBRACKET!
	;
percent
	: NUMBER PERCENT^
	;

STRING
	:
	'\"'
		( options {greedy=false;}
		: ESCAPE_SEQUENCE
		| ~'\\'
		)*
	'\"'
	;
// I probably don't want to skip whitespace, because it would be nice to keep it in the result token stream.  Maybe define an expression that has optional whitespace on either side?
WHITESPACE
	: (' ' | '\n' | '\t' | '\r')+ {this.skip();};
TRUE
	: ('t'|'T')('r'|'R')('u'|'U')('e'|'E')
	;
FALSE
	: ('f'|'F')('a'|'A')('l'|'L')('s'|'S')('e'|'E')
	;
	
NOTEQ           : '<>';
LTEQ            : '<=';
GTEQ            : '>=';
AND				: '&&';
OR				: '||';
NOT				: '!';
EQ              : '=';
LT              : '<';
GT              : '>';

EXP             : '^'|'**'; // the wiki says we also support '**' for designating an exponent, but Lex.java uses '^'
MULT            : '*';
DIV             : '/';
ADD             : '+';
SUB             : '-';

CONCAT          : '&';

LPAREN          : '(';
RPAREN          : ')';
LBRACKET	: '{';
RBRACKET	: '}';
COMMA           : ',';
PERCENT         : '%';

// todo: allow UNICODE in identifiers? It looks like Lex.java allows "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@" and \u to \u00FF inclusive in identifiers
//PV
//	: 'pv!' (LETTER)+
//	;
VARIABLE
	: 'pv!' (LETTER)+//'[' ~('[' | ']')+ ']'
	;
FUNCNAME
	: ('@')?(LETTER)+
	;

NUMBER
	: (DIGIT)+ ('.' (DIGIT)+)?
	;

fragment
LETTER 
	: ('a'..'z') | ('A'..'Z')
	;
fragment
DIGIT
	: ('0'..'9')
	;
fragment
ESCAPE_SEQUENCE
	: '\\' 't'
	| '\\' 'n'
	| '\\' '\"'
	| '\\' '\''
	| '\\' '\\'
	;
