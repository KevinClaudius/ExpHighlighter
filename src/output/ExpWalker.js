// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g 2011-06-10 15:38:23

var ExpWalker = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    ExpWalker.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(ExpWalker, {
    EOF: -1,
    POS: 4,
    NEG: 5,
    CALL: 6,
    EQ: 7,
    AND: 8,
    OR: 9,
    LT: 10,
    LTEQ: 11,
    GT: 12,
    GTEQ: 13,
    NOTEQ: 14,
    CONCAT: 15,
    SUB: 16,
    ADD: 17,
    DIV: 18,
    MULT: 19,
    EXP: 20,
    NOT: 21,
    VARIABLE: 22,
    LPAREN: 23,
    RPAREN: 24,
    FUNCNAME: 25,
    COMMA: 26,
    NUMBER: 27,
    STRING: 28,
    TRUE: 29,
    FALSE: 30,
    LBRACKET: 31,
    RBRACKET: 32,
    PERCENT: 33,
    ESCAPE_SEQUENCE: 34,
    WHITESPACE: 35,
    LETTER: 36,
    DIGIT: 37
});

(function(){
// public class variables
var EOF= -1,
    POS= 4,
    NEG= 5,
    CALL= 6,
    EQ= 7,
    AND= 8,
    OR= 9,
    LT= 10,
    LTEQ= 11,
    GT= 12,
    GTEQ= 13,
    NOTEQ= 14,
    CONCAT= 15,
    SUB= 16,
    ADD= 17,
    DIV= 18,
    MULT= 19,
    EXP= 20,
    NOT= 21,
    VARIABLE= 22,
    LPAREN= 23,
    RPAREN= 24,
    FUNCNAME= 25,
    COMMA= 26,
    NUMBER= 27,
    STRING= 28,
    TRUE= 29,
    FALSE= 30,
    LBRACKET= 31,
    RBRACKET= 32,
    PERCENT= 33,
    ESCAPE_SEQUENCE= 34,
    WHITESPACE= 35,
    LETTER= 36,
    DIGIT= 37;
var UP = org.antlr.runtime.Token.UP,
    DOWN = org.antlr.runtime.Token.DOWN;

// public instance methods/vars
org.antlr.lang.extend(ExpWalker, org.antlr.runtime.tree.TreeParser, {
        

    getTokenNames: function() { return ExpWalker.tokenNames; },
    getGrammarFileName: function() { return "/home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g"; }
});
org.antlr.lang.augmentObject(ExpWalker.prototype, {


    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:20:1: walk : expression ;
    // $ANTLR start "walk"
    walk: function() {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:21:2: ( expression )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:21:4: expression
            this.pushFollow(ExpWalker.FOLLOW_expression_in_walk42);
            this.expression();

            this.state._fsp--;




        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return ;
    },


    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:23:1: expression : ( operand | operation );
    // $ANTLR start "expression"
    expression: function() {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:24:2: ( operand | operation )
            var alt1=2;
            var LA1_0 = this.input.LA(1);

            if ( (LA1_0==VARIABLE||(LA1_0>=NUMBER && LA1_0<=FALSE)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=POS && LA1_0<=NOT)||LA1_0==PERCENT) ) {
                alt1=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 1, 0, this.input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:24:4: operand
                    this.pushFollow(ExpWalker.FOLLOW_operand_in_expression52);
                    this.operand();

                    this.state._fsp--;



                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:25:4: operation
                    this.pushFollow(ExpWalker.FOLLOW_operation_in_expression57);
                    this.operation();

                    this.state._fsp--;



                    break;

            }
        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return ;
    },


    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:27:1: operation : ( ^( POS a= expression ) | ^( NEG a= expression ) | ^( NOT a= expression ) | ^( OR a= expression b= expression ) | ^( AND a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NOTEQ a= expression b= expression ) | ^( ADD a= expression b= expression ) | ^( SUB a= expression b= expression ) | ^( MULT a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( EXP a= expression b= expression ) | ^( CONCAT a= expression b= expression ) | ^( PERCENT n= NUMBER ) | ^( CALL FUNCNAME (funcArgs+= . )* ) );
    // $ANTLR start "operation"
    operation: function() {
        var n = null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:28:2: ( ^( POS a= expression ) | ^( NEG a= expression ) | ^( NOT a= expression ) | ^( OR a= expression b= expression ) | ^( AND a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NOTEQ a= expression b= expression ) | ^( ADD a= expression b= expression ) | ^( SUB a= expression b= expression ) | ^( MULT a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( EXP a= expression b= expression ) | ^( CONCAT a= expression b= expression ) | ^( PERCENT n= NUMBER ) | ^( CALL FUNCNAME (funcArgs+= . )* ) )
            var alt3=19;
            switch ( this.input.LA(1) ) {
            case POS:
                alt3=1;
                break;
            case NEG:
                alt3=2;
                break;
            case NOT:
                alt3=3;
                break;
            case OR:
                alt3=4;
                break;
            case AND:
                alt3=5;
                break;
            case LT:
                alt3=6;
                break;
            case LTEQ:
                alt3=7;
                break;
            case GT:
                alt3=8;
                break;
            case GTEQ:
                alt3=9;
                break;
            case EQ:
                alt3=10;
                break;
            case NOTEQ:
                alt3=11;
                break;
            case ADD:
                alt3=12;
                break;
            case SUB:
                alt3=13;
                break;
            case MULT:
                alt3=14;
                break;
            case DIV:
                alt3=15;
                break;
            case EXP:
                alt3=16;
                break;
            case CONCAT:
                alt3=17;
                break;
            case PERCENT:
                alt3=18;
                break;
            case CALL:
                alt3=19;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 3, 0, this.input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:28:4: ^( POS a= expression )
                    this.match(this.input,POS,ExpWalker.FOLLOW_POS_in_operation68); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation72);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:29:4: ^( NEG a= expression )
                    this.match(this.input,NEG,ExpWalker.FOLLOW_NEG_in_operation79); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation83);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:30:6: ^( NOT a= expression )
                    this.match(this.input,NOT,ExpWalker.FOLLOW_NOT_in_operation92); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation96);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:31:4: ^( OR a= expression b= expression )
                    this.match(this.input,OR,ExpWalker.FOLLOW_OR_in_operation103); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation107);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation111);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:32:4: ^( AND a= expression b= expression )
                    this.match(this.input,AND,ExpWalker.FOLLOW_AND_in_operation118); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation122);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation126);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 6 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:33:4: ^( LT a= expression b= expression )
                    this.match(this.input,LT,ExpWalker.FOLLOW_LT_in_operation133); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation137);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation141);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 7 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:34:4: ^( LTEQ a= expression b= expression )
                    this.match(this.input,LTEQ,ExpWalker.FOLLOW_LTEQ_in_operation148); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation152);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation156);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 8 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:35:4: ^( GT a= expression b= expression )
                    this.match(this.input,GT,ExpWalker.FOLLOW_GT_in_operation163); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation167);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation171);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 9 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:36:4: ^( GTEQ a= expression b= expression )
                    this.match(this.input,GTEQ,ExpWalker.FOLLOW_GTEQ_in_operation178); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation182);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation186);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 10 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:37:4: ^( EQ a= expression b= expression )
                    this.match(this.input,EQ,ExpWalker.FOLLOW_EQ_in_operation193); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation197);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation201);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 11 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:38:4: ^( NOTEQ a= expression b= expression )
                    this.match(this.input,NOTEQ,ExpWalker.FOLLOW_NOTEQ_in_operation208); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation212);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation216);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 12 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:39:4: ^( ADD a= expression b= expression )
                    this.match(this.input,ADD,ExpWalker.FOLLOW_ADD_in_operation223); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation227);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation231);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 13 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:40:4: ^( SUB a= expression b= expression )
                    this.match(this.input,SUB,ExpWalker.FOLLOW_SUB_in_operation238); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation242);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation246);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 14 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:41:4: ^( MULT a= expression b= expression )
                    this.match(this.input,MULT,ExpWalker.FOLLOW_MULT_in_operation253); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation257);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation261);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 15 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:42:4: ^( DIV a= expression b= expression )
                    this.match(this.input,DIV,ExpWalker.FOLLOW_DIV_in_operation268); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation272);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation276);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 16 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:43:4: ^( EXP a= expression b= expression )
                    this.match(this.input,EXP,ExpWalker.FOLLOW_EXP_in_operation283); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation287);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation291);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 17 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:44:4: ^( CONCAT a= expression b= expression )
                    this.match(this.input,CONCAT,ExpWalker.FOLLOW_CONCAT_in_operation298); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation302);
                    this.expression();

                    this.state._fsp--;

                    this.pushFollow(ExpWalker.FOLLOW_expression_in_operation306);
                    this.expression();

                    this.state._fsp--;


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 18 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:45:4: ^( PERCENT n= NUMBER )
                    this.match(this.input,PERCENT,ExpWalker.FOLLOW_PERCENT_in_operation313); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    n=this.match(this.input,NUMBER,ExpWalker.FOLLOW_NUMBER_in_operation317); 

                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;
                case 19 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:46:4: ^( CALL FUNCNAME (funcArgs+= . )* )
                    this.match(this.input,CALL,ExpWalker.FOLLOW_CALL_in_operation324); 

                    this.match(this.input, org.antlr.runtime.Token.DOWN, null); 
                    this.match(this.input,FUNCNAME,ExpWalker.FOLLOW_FUNCNAME_in_operation326); 
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:46:28: (funcArgs+= . )*
                    loop2:
                    do {
                        var alt2=2;
                        var LA2_0 = this.input.LA(1);

                        if ( ((LA2_0>=POS && LA2_0<=DIGIT)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                        case 1 :
                            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:46:28: funcArgs+= .
                            funcArgs=this.input.LT(1);
                            this.matchAny(this.input); 
                            if (org.antlr.lang.isNull(list_funcArgs)) list_funcArgs = [];
                            list_funcArgs.push(funcArgs);



                            break;

                        default :
                            break loop2;
                        }
                    } while (true);


                    this.match(this.input, org.antlr.runtime.Token.UP, null); 


                    break;

            }
        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return ;
    },


    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:48:1: operand : literal ;
    // $ANTLR start "operand"
    operand: function() {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:49:2: ( literal )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:49:4: literal
            this.pushFollow(ExpWalker.FOLLOW_literal_in_operand342);
            this.literal();

            this.state._fsp--;




        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return ;
    },


    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:51:1: literal : ( NUMBER | STRING | TRUE | FALSE | VARIABLE );
    // $ANTLR start "literal"
    literal: function() {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:52:2: ( NUMBER | STRING | TRUE | FALSE | VARIABLE )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:
            if ( this.input.LA(1)==VARIABLE||(this.input.LA(1)>=NUMBER && this.input.LA(1)<=FALSE) ) {
                this.input.consume();
                this.state.errorRecovery=false;
            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                throw mse;
            }




        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return ;
    }

    // Delegated rules




}, true); // important to pass true to overwrite default implementations

 

// public class variables
org.antlr.lang.augmentObject(ExpWalker, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "POS", "NEG", "CALL", "EQ", "AND", "OR", "LT", "LTEQ", "GT", "GTEQ", "NOTEQ", "CONCAT", "SUB", "ADD", "DIV", "MULT", "EXP", "NOT", "VARIABLE", "LPAREN", "RPAREN", "FUNCNAME", "COMMA", "NUMBER", "STRING", "TRUE", "FALSE", "LBRACKET", "RBRACKET", "PERCENT", "ESCAPE_SEQUENCE", "WHITESPACE", "LETTER", "DIGIT"],
    FOLLOW_expression_in_walk42: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_operand_in_expression52: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_operation_in_expression57: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_POS_in_operation68: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation72: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_NEG_in_operation79: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation83: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_NOT_in_operation92: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation96: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_OR_in_operation103: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation107: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation111: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_AND_in_operation118: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation122: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation126: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_LT_in_operation133: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation137: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation141: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_LTEQ_in_operation148: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation152: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation156: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_GT_in_operation163: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation167: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation171: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_GTEQ_in_operation178: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation182: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation186: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EQ_in_operation193: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation197: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation201: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_NOTEQ_in_operation208: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation212: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation216: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_ADD_in_operation223: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation227: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation231: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_SUB_in_operation238: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation242: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation246: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_MULT_in_operation253: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation257: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation261: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_DIV_in_operation268: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation272: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation276: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_EXP_in_operation283: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation287: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation291: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CONCAT_in_operation298: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_expression_in_operation302: new org.antlr.runtime.BitSet([0x787FFFF0, 0x00000002]),
    FOLLOW_expression_in_operation306: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_PERCENT_in_operation313: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_NUMBER_in_operation317: new org.antlr.runtime.BitSet([0x00000008, 0x00000000]),
    FOLLOW_CALL_in_operation324: new org.antlr.runtime.BitSet([0x00000004, 0x00000000]),
    FOLLOW_FUNCNAME_in_operation326: new org.antlr.runtime.BitSet([0xFFFFFFF8, 0x0000003F]),
    FOLLOW_literal_in_operand342: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_set_in_literal0: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();