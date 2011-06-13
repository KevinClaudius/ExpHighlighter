/*
Robert Stehwien
Kevin Page

I've removed all evaluation actions in the original grammar.  This grammar 
is just used for walking the expression tree and getting information about 
the location and type of tokens.
*/

tree grammar ExpWalker;

options {
	language=JavaScript;
	tokenVocab=Exp; // reuse tokens
	ASTLabelType=CommonTree;
}

//@header {package output;} // for testing

walk
	: expression
	;
expression
	: operand
	| operation
	;
operation
	: ^(POS a=expression)
	| ^(NEG a=expression)
  	| ^(NOT a=expression)
	| ^(OR a=expression b=expression)
	| ^(AND a=expression b=expression)
	| ^(LT a=expression b=expression)
	| ^(LTEQ a=expression b=expression)
	| ^(GT a=expression b=expression)
	| ^(GTEQ a=expression b=expression)
	| ^(EQ a=expression b=expression)
	| ^(NOTEQ a=expression b=expression)
	| ^(ADD a=expression b=expression)
	| ^(SUB a=expression b=expression)
	| ^(MULT a=expression b=expression)
	| ^(DIV a=expression b=expression)
	| ^(EXP a=expression b=expression)
	| ^(CONCAT a=expression b=expression)
	| ^(PERCENT n=NUMBER)
	| ^(CALL FUNCNAME expression)//^(CALL FUNCNAME funcArgs+=.*)
	;
operand
	: literal
	;
literal
	: NUMBER
	| STRING 
	| TRUE
	| FALSE
	| VARIABLE
	//| PV
	;
