lexer grammar SlippySyntaxLexer;

@header{package org.six11.slippy;}

CODESET	:	'codeset'
	;

IMPORT	:	'import'
	;

TRUE	:	'true'
	;
	
FALSE	:	'false'
	;

NUM	:	INT+
	|	INT* '.' INT+
	;

CLASS	:	'class'
	;

EXTENDS	:	'extends'
	;

MIXES	:	'mixes'
	;

NEW	:	'new'
	;
	
DEFINE	:	'define'
	;

LAMBDA	:	'lambda'
	;

DONE	:	'done'
	;

WHILE	:	'while'
	;
	
LOOP	:	'loop'
	;

ELSE	:	'else'
	;
	
//ELSEIF	:	'else if'
//	;
	
IF	:	'if'
	;
	
OR	:	'or'
	;

AND	:	'and'
	;

NOT	:	'not'
	;
	
AT	:	'@'
	;
	
HASH	:	'#'
	;
	
LPAR	:	'('
	;

RPAR	:	')'
	;

LSB	:	'['
	;

RSB	:	']'
	;

LCB	:	'{'
	;
	
RCB	:	'}'
	;

COLON	:	':'
	;

EQ	:	'='
	;
	
EQEQ	:	'=='
	;

NEQ	:	'!='
	;

LT	:	'<'
	;

LTEQ	:	'<='
	;
	
GT	:	'>'
	;

GTEQ	:	'>='
	;
	
PLUS	:	'+'
	;

MINUS	:	'-'
	;

ASTERISK:	'*'
	;

FORWARD_SLASH
	:	'/'
	;

PERCENT	:	'%'
	;

DOT	:	'.'
	;

COMMA	:	','
	;
	
ID	:	(LETTER | '_') (LETTER | '_' | INT)*
	;

fragment
LETTER	:	('a'..'z'|'A'..'Z')
	;
	
fragment
INT	:	('0'..'9')+
    	;

STR_LITERAL
     :   '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
     ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNI_ESC
    |   OCT_ESC
    ;

fragment
OCT_ESC	:	'\\' ('0'..'3') ('0'..'7') ('0'..'7')
	|	'\\' ('0'..'7') ('0'..'7')
	|	'\\' ('0'..'7')
	;

fragment
UNI_ESC	:	'\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    	;

fragment
HEX_DIGIT
	:	('0'..'9'|'a'..'f'|'A'..'F') 
	;
	
LINE_COMMENT
	:	(';' .* '\n') { $channel = HIDDEN; }
		;
	
WS	:	(' ' | '\t' | '\r' | '\n' ) { $channel = HIDDEN; }
	;
