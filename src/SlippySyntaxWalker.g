tree grammar SlippySyntaxWalker; 
options { 
	tokenVocab=SlippySyntaxParser; // reuse token types 
	ASTLabelType=CommonTree; // $label will have type CommonTree 
} 

@header{
package org.six11.slippy;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
}

@members {
	public Map<CommonTree, String> specialThings = new HashMap<CommonTree, String>();
	
	public void code(String value, CommonTree... trees) {
		for (CommonTree t : trees) {
			specialThings.put(t, value);
		}
	}
} 

prog	:	^(PROG codesetDecl imports ^(BLOCK statement*))
	;


imports	:	^(STMT_IMPORT classID*)
	;

statement
	:	^(STMT statementType)
	;

statementType
	:	defStatement
	|	nondefStatement
	;

defStatement
	:	^(DEF_FUNCTION functionDefStatement)
	|	^(DEF_CLASS classDefStatement)
	;

nondefStatement
	:	flowStatement
	|	^(EXPR expression)
	;

functionDefStatement
	:	ID formalParameters block?
			{ code("function def name", $ID); }			  	
	;

classDefStatement
	:	ID classExtendsExpr? classMixesExpr? classMemberDecl*
			{ code("class def name", $ID); }
	;

classExtendsExpr
	:	^(EXPR_CLASS_EXTENDS classID)
			{ code("extends class name", $classID.start); }
	;

classID	:	^(EXPR_FQ_CLASS_NAME codeset ID)
			{ code("class name", $ID); }
	;

codesetDecl
	:	^(STMT_CODESET_DECL ID*)
	;
	
codeset	:	^(STMT_CODESET ID*)
	;

classMixesExpr
	:	^(EXPR_CLASS_MIXES classID*)
	;

flowStatement
	:	whileStatement
	|	ifStatement
	|	loopStatement
	;

formalParameters
	:	^(DEF_PARAM_LIST (id=ID {code("formal param", $id);})*)
	;

block	:	^(BLOCK statement+)
	;

annotation
	:	^(ANNOTATION ID expressionList?)
	;

classMemberDecl
	:	^(DEF_FIELD fieldDeclaration annotation*)
			{code("field declaration", $fieldDeclaration.start); }
	|	^(DEF_FUNCTION functionDefStatement annotation*)
	|	^(DEF_CLASS classDefStatement)
	;

fieldDeclaration
	:	ID expression?
	;

whileStatement
	:	^(STMT_WHILE parExpression block?)
	;

ifStatement
	:	^(STMT_IF conditionalBlock+ block*)
	;

conditionalBlock
	:	^(STMT_CONDITION_BLOCK parExpression block?)
	;

parExpression
	:	expression
	;

loopStatement
	:	^(STMT_LOOP conditionalBlock)
	|	^(STMT_LOOP ID expression block?)
	;
	
expressionList
	:	^(EXPR_LIST expression*)
		;
	
expression
	:	^(EXPR_ASSIGN n=expression expression) 
			{code("assign lval", $n.start);}
	|	^(EXPR_OR expression expression)
	|	^(EXPR_AND expression expression)
	|	^(EXPR_EQ expression expression)
	|	^(EXPR_NEQ expression expression)
	|	^(EXPR_LT expression expression)
	|	^(EXPR_LTEQ expression expression)
	|	^(EXPR_GT expression expression)
	|	^(EXPR_GTEQ expression expression)
	|	^(EXPR_ADD expression expression)
	|	^(EXPR_MINUS expression expression)
	|	^(EXPR_MULT expression expression)
	|	^(EXPR_DIV expression expression)
	|	^(EXPR_MODULO expression expression)
	|	^(EXPR_UNARY_NEG expression)
	|	^(EXPR_UNARY_POS expression)
	|	^(EXPR_UNARY_NOT expression)
	|	^(EXPR_MEMBER n=expression expression)
			{ code("member lval", $n.start); }
	|	ID 
	|	^(EXPR_FUNC_CALL n=expression expressionList)
			{ code("function name", $n.start); }
	|	^(EXPR_ARRAY_INDEX expression expression)
	|	^(EXPR_LAMBDA formalParameters block?)
	|	^(EXPR_ARRAY_INIT expression*)
	|	^(EXPR_MAP_INIT expression*)
	|	^(EXPR_MAP_ELEMENT expression+)
	|	^(EXPR_CONSTRUCTOR ID expressionList?)
			{ code("constructor name", $ID); }
	|	NUM
    	|	STR_LITERAL
    	|	TRUE
    	|	FALSE
	;
