parser grammar SlippyParser;

options {
  output=AST;
  tokenVocab=SlippyLexer;
  ASTLabelType=CommonTree;
  backtrack=true;
  k='*';
}

tokens {
  ANNOTATION;           // modifies members (e.g. @static @constrained(x < 4) x)
  BLOCK;                // a bunch of statements
  DEF_FIELD;            // a member field inside a class
  DEF_FUNCTION;         // a member method in a class, or top-level function
  DEF_CLASS;            // a class definition
  DEF_PARAM_LIST;       // formal parameters used in lambdas and function definitions
  EXPR;                 // any expression---contains a child node for actual expression
  EXPR_ADD;             // addition expression
  EXPR_AND;             // logical 'and' expression (e.g. foo and bar)
  EXPR_ARRAY_INIT;      // expression for making an array (e.g. [foo, bar, baz])
  EXPR_ARRAY_INDEX;     // expression for using an array (e.g. a[1])
  EXPR_ASSIGN;          // assignment
  EXPR_CONSTRUCTOR;     // new Foo(x, y)
  EXPR_DIV;             // division expression
  EXPR_EQ;              // equality expression (e.g. a == b)
  EXPR_CLASS_EXTENDS;   // the 'Bar' part of class Foo extends Bar
  EXPR_FQ_CLASS_NAME;   // a fully-qualified class name (e.g. "Foo" or "org.six11.Foo")
  EXPR_FUNC_CALL;       // f(x)
  EXPR_GT;              // greater-than inequality expression
  EXPR_GTEQ;            // greater-than-or-equal-to inequality expression
  EXPR_LAMBDA;          // anonymous function defintion (e.g. { (x) x * x })
  EXPR_LIST;            // list of expressions used as args in function calls
  EXPR_LT;              // less-than inequality expression
  EXPR_LTEQ;            // less-than-or-equal-to inequality expression
  EXPR_MEMBER;          // dot-notation member expression (e.g. a.b().c[3].d)
  EXPR_CLASS_MIXES;     // the 'Bar' part of class Foo mixes Bar
  EXPR_MAP_INIT;        // expression for making a map (e.g. { a : b, "hi" : f(x) } or { })
  EXPR_MAP_ELEMENT;     // an individual mapping in a map init (e.g. a : b)
  EXPR_MINUS;           // subtraction expression
  EXPR_MODULO;          // modulo expression (e.g. 42 % 10 is 2)
  EXPR_MULT;            // multiplication expression
  EXPR_NEQ;             // non-equality expression (e.g. a != b)
  EXPR_OR;              // logical 'or' expression (e.g. foo or bar)
  EXPR_UNARY_NEG;       // negating a numeric expression (e.g. -4 or -x)
  EXPR_UNARY_NOT;	// negating a boolean expression (e.g. not a.contains(x))
  EXPR_UNARY_POS;       // making a unary positive (sort of a no-op though)
  PROG;                 // master tree node for a complete compilation unit
  STMT;                 // any statement: if/while/loop, expressions, definitions....
  STMT_CODESET;         // package part of a fully qualified class name (e.g. "org.six11")
  STMT_CODESET_DECL;    // codeset membership decl. atop file (e.g. "codeset org.six11")
  STMT_CONDITION_BLOCK; // a conditional block of code. used in 'if' and 'loop' expressions
  STMT_ELSE;            // the unconditioned 'else' part of a an if..else if...else expr
  STMT_IF;              // the initial or one of the 'else if' parts of an if..else if..else
  STMT_IMPORT;          // import statements at top of file (e.g. import Foobar)
  STMT_LOOP;            // one of two forms of loop statments (loop(x) or loop(x : myList))
  STMT_WHILE;           // a while statement
}

@header{package org.six11.slippy;}

prog	:	codesetDecl imports statement*
			-> ^(PROG codesetDecl imports ^(BLOCK statement*))
	;


imports	:	(IMPORT classID)? (IMPORT classID)*
			-> ^(STMT_IMPORT classID*)
	;

statement
	:	statementType
			-> ^(STMT statementType)
	;

statementType
	:	defStatement
	|	nondefStatement
	;

defStatement
	:	functionDefStatement
			-> ^(DEF_FUNCTION functionDefStatement)
	|	classDefStatement
			-> ^(DEF_CLASS classDefStatement)
	;

nondefStatement
	:	flowStatement
	|	expression
			-> ^(EXPR expression)
	;

functionDefStatement
	:	annotation* DEFINE ID formalParameters block? DONE
			-> ID formalParameters block? annotation*
	;

classDefStatement
	:	CLASS ID classExtendsExpr? classMixesExpr? classMemberDecl* DONE
			-> ID classExtendsExpr? classMixesExpr? classMemberDecl*
	;

classExtendsExpr
	:	EXTENDS classID
			-> ^(EXPR_CLASS_EXTENDS classID)
	;

classID	:	codeset ID
			-> ^(EXPR_FQ_CLASS_NAME codeset ID) // Eventually I may use a class packaging scheme
	;

codesetDecl
	:	(CODESET (ID DOT)* ID)?
			-> ^(STMT_CODESET_DECL ID*)
	;
	
codeset	:	(ID DOT)? (ID DOT) *
			-> ^(STMT_CODESET ID*)
	;

classMixesExpr
	:	MIXES classID? (COMMA classID)*
			-> ^(EXPR_CLASS_MIXES classID*)
	;

flowStatement
	:	whileStatement
	|	ifStatement
	|	loopStatement
	;

formalParameters
	:	LPAR (ID? (COMMA ID)*) RPAR
			-> ^(DEF_PARAM_LIST ID*)
	;

block	:	statement+
			-> ^(BLOCK statement+)
	;

annotation
	:	AT ID expressionList?
			-> ^(ANNOTATION ID expressionList?)
	;

classMemberDecl
	:	annotation* fieldDeclaration
			-> ^(DEF_FIELD fieldDeclaration annotation*)
	|	annotation* functionDefStatement
			-> ^(DEF_FUNCTION functionDefStatement annotation*)
	|	classDefStatement
			-> ^(DEF_CLASS classDefStatement)
	;

fieldDeclaration
	:	ID (EQ expression)?
			-> ID expression?
	;

whileStatement
	:	WHILE parExpression block? DONE
			-> ^(STMT_WHILE parExpression block?)
	;

ifStatement
	:	IF conditionalBlock
		(ELSE IF conditionalBlock)*
		(ELSE block?)?
		DONE
			-> ^(STMT_IF conditionalBlock+ block*)
	;

conditionalBlock
	:	parExpression block?
			-> ^(STMT_CONDITION_BLOCK parExpression block?)
	;

parExpression
	:	LPAR expression RPAR
			-> expression
	;

loopStatement
	:	LOOP conditionalBlock DONE
			-> ^(STMT_LOOP conditionalBlock)
	|	LOOP LPAR ID COLON expression RPAR block? DONE
			-> ^(STMT_LOOP ID expression block?)
	;
	
expressionList
	:	LPAR expression? (COMMA expression)* RPAR
			-> ^(EXPR_LIST expression*)
	;
	
expression
	:	assignExpression
	;
	
assignExpression
	:	(conditionalOrExpr -> conditionalOrExpr) (
		 EQ r=conditionalOrExpr
		 	-> ^(EXPR_ASSIGN $assignExpression $r)
		 )?
	;	

conditionalOrExpr
	:	(conditionalAndExpr -> conditionalAndExpr) (
		 OR r=conditionalAndExpr
		 	-> ^(EXPR_OR $conditionalOrExpr $r)
		)*
	;

conditionalAndExpr
	:	(equalityExpression -> equalityExpression) ( 
		    AND r=equalityExpression
		    	-> ^(EXPR_AND $conditionalAndExpr $r)
		)*
	;

equalityExpression
	:	(gtltExpression -> gtltExpression) (
		    EQEQ r=gtltExpression
		    	-> ^(EXPR_EQ $equalityExpression $r)
		 |  NEQ r=gtltExpression
		 	-> ^(EXPR_NEQ $equalityExpression $r)
		)*
	;

gtltExpression
	:	(additionExpr -> additionExpr) (
		    LT  r=additionExpr
		    	-> ^(EXPR_LT $gtltExpression $r)
		 |  LTEQ r=additionExpr
		 	-> ^(EXPR_LTEQ $gtltExpression $r)
		 |  GT  r=additionExpr
		 	-> ^(EXPR_GT $gtltExpression $r)
		 |  GTEQ r=additionExpr
		 	-> ^(EXPR_GTEQ $gtltExpression $r)
		)*
	;

additionExpr
	:	(multExpr -> multExpr) (
	 	    PLUS r=multExpr
	 	    	-> ^(EXPR_ADD $additionExpr $r)
	 	 |  MINUS r=multExpr
	 	 	-> ^(EXPR_MINUS $additionExpr $r)
		)*
	;

multExpr
	:	(unaryExpr -> unaryExpr) (
		    ASTERISK r=unaryExpr
		    	-> ^(EXPR_MULT $multExpr $r)
		 |  FORWARD_SLASH r=unaryExpr
		 	-> ^(EXPR_DIV $multExpr $r)
		 |  PERCENT r=unaryExpr
		 	-> ^(EXPR_MODULO $multExpr $r)
		 )*
	;

unaryExpr
	:	MINUS unaryExpr
			-> ^(EXPR_UNARY_NEG unaryExpr)
	|	PLUS unaryExpr
			-> ^(EXPR_UNARY_POS unaryExpr)
	|	NOT unaryExpr
			-> ^(EXPR_UNARY_NOT unaryExpr)
	|	dotExpr
	;

dotExpr
	:	(primaryExpr -> primaryExpr) (
			DOT r=postfixedExpr /* was primaryExpr */
				-> ^(EXPR_MEMBER $dotExpr $r)
		)*	
	;

primaryExpr
	:	parExpression
	|	literal
	|	newExpression
	|	postfixedExpr
	|	lambdaExpr
	|	arrayExpr
	|	mapExpr
	;

postfixedExpr
	:	(ID -> ID) (
			LPAR expression? (COMMA expression)* RPAR
				-> ^(EXPR_FUNC_CALL $postfixedExpr ^(EXPR_LIST expression*))
		|	LSB r=expression? RSB
				-> ^(EXPR_ARRAY_INDEX $postfixedExpr $r)  
		)*
	;

lambdaExpr
	:	LAMBDA formalParameters block? DONE
			-> ^(EXPR_LAMBDA formalParameters block?)
	|	LCB formalParameters block? RCB
			-> ^(EXPR_LAMBDA formalParameters block?)
	;

arrayExpr
	:	LSB expression? (COMMA expression)* RSB
			-> ^(EXPR_ARRAY_INIT expression*)
	;

mapExpr	:	LCB mapEntryExpr? (COMMA mapEntryExpr)* RCB
			-> ^(EXPR_MAP_INIT mapEntryExpr*)
	;

mapEntryExpr
	:	expression COLON expression
			-> ^(EXPR_MAP_ELEMENT expression+)
	;

literal
	:	NUM
    	|	STR_LITERAL
    	|	TRUE
    	|	FALSE
	;

newExpression
	:	NEW ID expressionList
			-> ^(EXPR_CONSTRUCTOR ID expressionList?)
	;
