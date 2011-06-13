// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g 2011-06-10 16:31:08

var ExpParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    ExpParser.superclass.constructor.call(this, input, state);


         

    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(ExpParser, {
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

// public instance methods/vars
org.antlr.lang.extend(ExpParser, org.antlr.runtime.Parser, {
        
    setTreeAdaptor: function(adaptor) {
        this.adaptor = adaptor;
    },
    getTreeAdaptor: function() {
        return this.adaptor;
    },

    getTokenNames: function() { return ExpParser.tokenNames; },
    getGrammarFileName: function() { return "/home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g"; }
});
org.antlr.lang.augmentObject(ExpParser.prototype, {

    // inline static return class
    formula_return: (function() {
        ExpParser.formula_return = function(){};
        org.antlr.lang.extend(ExpParser.formula_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:24:1: formula : ( EQ )? expression ;
    // $ANTLR start "formula"
    formula: function() {
        var retval = new ExpParser.formula_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EQ1 = null;
         var expression2 = null;

        var EQ1_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:2: ( ( EQ )? expression )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:4: ( EQ )? expression
            root_0 = this.adaptor.nil();

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:4: ( EQ )?
            var alt1=2;
            var LA1_0 = this.input.LA(1);

            if ( (LA1_0==EQ) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:5: EQ
                    EQ1=this.match(this.input,EQ,ExpParser.FOLLOW_EQ_in_formula63); 


                    break;

            }

            this.pushFollow(ExpParser.FOLLOW_expression_in_formula68);
            expression2=this.expression();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expression2.getTree());



            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    expression_return: (function() {
        ExpParser.expression_return = function(){};
        org.antlr.lang.extend(ExpParser.expression_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:31:1: expression : boolExpr ;
    // $ANTLR start "expression"
    expression: function() {
        var retval = new ExpParser.expression_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

         var boolExpr3 = null;


        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:32:2: ( boolExpr )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:32:4: boolExpr
            root_0 = this.adaptor.nil();

            this.pushFollow(ExpParser.FOLLOW_boolExpr_in_expression84);
            boolExpr3=this.boolExpr();

            this.state._fsp--;

            this.adaptor.addChild(root_0, boolExpr3.getTree());



            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    boolExpr_return: (function() {
        ExpParser.boolExpr_return = function(){};
        org.antlr.lang.extend(ExpParser.boolExpr_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:34:1: boolExpr : concatExpr ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )* ;
    // $ANTLR start "boolExpr"
    boolExpr: function() {
        var retval = new ExpParser.boolExpr_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set5 = null;
         var concatExpr4 = null;
         var concatExpr6 = null;

        var set5_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:2: ( concatExpr ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:4: concatExpr ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )*
            root_0 = this.adaptor.nil();

            this.pushFollow(ExpParser.FOLLOW_concatExpr_in_boolExpr94);
            concatExpr4=this.concatExpr();

            this.state._fsp--;

            this.adaptor.addChild(root_0, concatExpr4.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:15: ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )*
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( ((LA2_0>=EQ && LA2_0<=NOTEQ)) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:16: ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr
                    set5=input.LT(1);
                    set5=this.input.LT(1);
                    if ( (this.input.LA(1)>=EQ && this.input.LA(1)<=NOTEQ) ) {
                        this.input.consume();
                        root_0 = this.adaptor.becomeRoot(this.adaptor.create(set5), root_0);
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(ExpParser.FOLLOW_concatExpr_in_boolExpr130);
                    concatExpr6=this.concatExpr();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, concatExpr6.getTree());


                    break;

                default :
                    break loop2;
                }
            } while (true);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    concatExpr_return: (function() {
        ExpParser.concatExpr_return = function(){};
        org.antlr.lang.extend(ExpParser.concatExpr_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:37:1: concatExpr : sumExpr ( CONCAT sumExpr )* ;
    // $ANTLR start "concatExpr"
    concatExpr: function() {
        var retval = new ExpParser.concatExpr_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var CONCAT8 = null;
         var sumExpr7 = null;
         var sumExpr9 = null;

        var CONCAT8_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:2: ( sumExpr ( CONCAT sumExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:4: sumExpr ( CONCAT sumExpr )*
            root_0 = this.adaptor.nil();

            this.pushFollow(ExpParser.FOLLOW_sumExpr_in_concatExpr142);
            sumExpr7=this.sumExpr();

            this.state._fsp--;

            this.adaptor.addChild(root_0, sumExpr7.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:12: ( CONCAT sumExpr )*
            loop3:
            do {
                var alt3=2;
                var LA3_0 = this.input.LA(1);

                if ( (LA3_0==CONCAT) ) {
                    alt3=1;
                }


                switch (alt3) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:13: CONCAT sumExpr
                    CONCAT8=this.match(this.input,CONCAT,ExpParser.FOLLOW_CONCAT_in_concatExpr145); 
                    CONCAT8_tree = this.adaptor.create(CONCAT8);
                    root_0 = this.adaptor.becomeRoot(CONCAT8_tree, root_0);

                    this.pushFollow(ExpParser.FOLLOW_sumExpr_in_concatExpr148);
                    sumExpr9=this.sumExpr();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, sumExpr9.getTree());


                    break;

                default :
                    break loop3;
                }
            } while (true);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    sumExpr_return: (function() {
        ExpParser.sumExpr_return = function(){};
        org.antlr.lang.extend(ExpParser.sumExpr_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:40:1: sumExpr : productExpr ( ( SUB | ADD ) productExpr )* ;
    // $ANTLR start "sumExpr"
    sumExpr: function() {
        var retval = new ExpParser.sumExpr_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set11 = null;
         var productExpr10 = null;
         var productExpr12 = null;

        var set11_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:2: ( productExpr ( ( SUB | ADD ) productExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:4: productExpr ( ( SUB | ADD ) productExpr )*
            root_0 = this.adaptor.nil();

            this.pushFollow(ExpParser.FOLLOW_productExpr_in_sumExpr160);
            productExpr10=this.productExpr();

            this.state._fsp--;

            this.adaptor.addChild(root_0, productExpr10.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:16: ( ( SUB | ADD ) productExpr )*
            loop4:
            do {
                var alt4=2;
                var LA4_0 = this.input.LA(1);

                if ( ((LA4_0>=SUB && LA4_0<=ADD)) ) {
                    alt4=1;
                }


                switch (alt4) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:17: ( SUB | ADD ) productExpr
                    set11=this.input.LT(1);
                    set11=this.input.LT(1);
                    if ( (this.input.LA(1)>=SUB && this.input.LA(1)<=ADD) ) {
                        this.input.consume();
                        root_0 = this.adaptor.becomeRoot(this.adaptor.create(set11), root_0);
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(ExpParser.FOLLOW_productExpr_in_sumExpr172);
                    productExpr12=this.productExpr();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, productExpr12.getTree());


                    break;

                default :
                    break loop4;
                }
            } while (true);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    productExpr_return: (function() {
        ExpParser.productExpr_return = function(){};
        org.antlr.lang.extend(ExpParser.productExpr_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:43:1: productExpr : expExpr ( ( DIV | MULT ) expExpr )* ;
    // $ANTLR start "productExpr"
    productExpr: function() {
        var retval = new ExpParser.productExpr_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var set14 = null;
         var expExpr13 = null;
         var expExpr15 = null;

        var set14_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:2: ( expExpr ( ( DIV | MULT ) expExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:4: expExpr ( ( DIV | MULT ) expExpr )*
            root_0 = this.adaptor.nil();

            this.pushFollow(ExpParser.FOLLOW_expExpr_in_productExpr184);
            expExpr13=this.expExpr();

            this.state._fsp--;

            this.adaptor.addChild(root_0, expExpr13.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:12: ( ( DIV | MULT ) expExpr )*
            loop5:
            do {
                var alt5=2;
                var LA5_0 = this.input.LA(1);

                if ( ((LA5_0>=DIV && LA5_0<=MULT)) ) {
                    alt5=1;
                }


                switch (alt5) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:13: ( DIV | MULT ) expExpr
                    set14=input.LT(1);
                    set14=this.input.LT(1);
                    if ( (this.input.LA(1)>=DIV && this.input.LA(1)<=MULT) ) {
                        this.input.consume();
                        root_0 = this.adaptor.becomeRoot(this.adaptor.create(set14), root_0);
                        this.state.errorRecovery=false;
                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        throw mse;
                    }

                    this.pushFollow(ExpParser.FOLLOW_expExpr_in_productExpr196);
                    expExpr15=this.expExpr();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, expExpr15.getTree());


                    break;

                default :
                    break loop5;
                }
            } while (true);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    expExpr_return: (function() {
        ExpParser.expExpr_return = function(){};
        org.antlr.lang.extend(ExpParser.expExpr_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:46:1: expExpr : unaryOperation ( EXP unaryOperation )* ;
    // $ANTLR start "expExpr"
    expExpr: function() {
        var retval = new ExpParser.expExpr_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var EXP17 = null;
         var unaryOperation16 = null;
         var unaryOperation18 = null;

        var EXP17_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:2: ( unaryOperation ( EXP unaryOperation )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:4: unaryOperation ( EXP unaryOperation )*
            root_0 = this.adaptor.nil();

            this.pushFollow(ExpParser.FOLLOW_unaryOperation_in_expExpr208);
            unaryOperation16=this.unaryOperation();

            this.state._fsp--;

            this.adaptor.addChild(root_0, unaryOperation16.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:19: ( EXP unaryOperation )*
            loop6:
            do {
                var alt6=2;
                var LA6_0 = this.input.LA(1);

                if ( (LA6_0==EXP) ) {
                    alt6=1;
                }


                switch (alt6) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:20: EXP unaryOperation
                    EXP17=this.match(this.input,EXP,ExpParser.FOLLOW_EXP_in_expExpr211); 
                    EXP17_tree = this.adaptor.create(EXP17);
                    root_0 = this.adaptor.becomeRoot(EXP17_tree, root_0);

                    this.pushFollow(ExpParser.FOLLOW_unaryOperation_in_expExpr214);
                    unaryOperation18=this.unaryOperation();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, unaryOperation18.getTree());


                    break;

                default :
                    break loop6;
                }
            } while (true);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    unaryOperation_return: (function() {
        ExpParser.unaryOperation_return = function(){};
        org.antlr.lang.extend(ExpParser.unaryOperation_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:49:1: unaryOperation : ( NOT operand | ADD o= operand -> ^( POS $o) | SUB o= operand -> ^( NEG $o) | operand );
    // $ANTLR start "unaryOperation"
    unaryOperation: function() {
        var retval = new ExpParser.unaryOperation_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var NOT19 = null;
        var ADD21 = null;
        var SUB22 = null;
         var o = null;
         var operand20 = null;
         var operand23 = null;

        var NOT19_tree=null;
        var ADD21_tree=null;
        var SUB22_tree=null;
        var stream_SUB=new org.antlr.runtime.tree.RewriteRuleTokenStream(this.adaptor,"token SUB");
        var stream_ADD=new org.antlr.runtime.tree.RewriteRuleTokenStream(this.adaptor,"token ADD");
        var stream_operand=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"rule operand");
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:50:2: ( NOT operand | ADD o= operand -> ^( POS $o) | SUB o= operand -> ^( NEG $o) | operand )
            var alt7=4;
            switch ( this.input.LA(1) ) {
            case NOT:
                alt7=1;
                break;
            case ADD:
                alt7=2;
                break;
            case SUB:
                alt7=3;
                break;
            case VARIABLE:
            case LPAREN:
            case FUNCNAME:
            case NUMBER:
            case STRING:
            case TRUE:
            case FALSE:
            case LBRACKET:
                alt7=4;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 7, 0, this.input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:50:4: NOT operand
                    root_0 = this.adaptor.nil();

                    NOT19=this.match(this.input,NOT,ExpParser.FOLLOW_NOT_in_unaryOperation226); 
                    NOT19_tree = this.adaptor.create(NOT19);
                    root_0 = this.adaptor.becomeRoot(NOT19_tree, root_0);

                    this.pushFollow(ExpParser.FOLLOW_operand_in_unaryOperation229);
                    operand20=this.operand();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, operand20.getTree());


                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:51:4: ADD o= operand
                    ADD21=this.match(this.input,ADD,ExpParser.FOLLOW_ADD_in_unaryOperation234);  
                    stream_ADD.add(ADD21);

                    this.pushFollow(ExpParser.FOLLOW_operand_in_unaryOperation238);
                    o=this.operand();

                    this.state._fsp--;

                    stream_operand.add(o.getTree());


                    // AST REWRITE
                    // elements: o
                    // token labels: 
                    // rule labels: retval, o
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    var stream_retval=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"token retval",retval!=null?retval.tree:null);
                    var stream_o=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"token o",o!=null?o.tree:null);

                    root_0 = this.adaptor.nil();
                    // 51:18: -> ^( POS $o)
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:51:21: ^( POS $o)
                        {
                        var root_1 = this.adaptor.nil();
                        root_1 = this.adaptor.becomeRoot(this.adaptor.create(POS, "POS"), root_1);

                        this.adaptor.addChild(root_1, stream_o.nextTree());

                        this.adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;

                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:52:4: SUB o= operand
                    SUB22=this.match(this.input,SUB,ExpParser.FOLLOW_SUB_in_unaryOperation252);  
                    stream_SUB.add(SUB22);

                    this.pushFollow(ExpParser.FOLLOW_operand_in_unaryOperation256);
                    o=this.operand();

                    this.state._fsp--;

                    stream_operand.add(o.getTree());


                    // AST REWRITE
                    // elements: o
                    // token labels: 
                    // rule labels: retval, o
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    var stream_retval=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"token retval",retval!=null?retval.tree:null);
                    var stream_o=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"token o",o!=null?o.tree:null);

                    root_0 = this.adaptor.nil();
                    // 52:18: -> ^( NEG $o)
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:52:21: ^( NEG $o)
                        {
                        var root_1 = this.adaptor.nil();
                        root_1 = this.adaptor.becomeRoot(this.adaptor.create(NEG, "NEG"), root_1);

                        this.adaptor.addChild(root_1, stream_o.nextTree());

                        this.adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;

                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:53:4: operand
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ExpParser.FOLLOW_operand_in_unaryOperation270);
                    operand23=this.operand();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, operand23.getTree());


                    break;

            }
            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    operand_return: (function() {
        ExpParser.operand_return = function(){};
        org.antlr.lang.extend(ExpParser.operand_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:56:1: operand : ( literal | functionExpr -> ^( CALL functionExpr ) | percent | VARIABLE | LPAREN expression RPAREN -> ^( expression ) );
    // $ANTLR start "operand"
    operand: function() {
        var retval = new ExpParser.operand_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var VARIABLE27 = null;
        var LPAREN28 = null;
        var RPAREN30 = null;
         var literal24 = null;
         var functionExpr25 = null;
         var percent26 = null;
         var expression29 = null;

        var VARIABLE27_tree=null;
        var LPAREN28_tree=null;
        var RPAREN30_tree=null;
        var stream_RPAREN=new org.antlr.runtime.tree.RewriteRuleTokenStream(this.adaptor,"token RPAREN");
        var stream_LPAREN=new org.antlr.runtime.tree.RewriteRuleTokenStream(this.adaptor,"token LPAREN");
        var stream_expression=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"rule expression");
        var stream_functionExpr=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"rule functionExpr");
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:57:2: ( literal | functionExpr -> ^( CALL functionExpr ) | percent | VARIABLE | LPAREN expression RPAREN -> ^( expression ) )
            var alt8=5;
            switch ( this.input.LA(1) ) {
            case STRING:
            case TRUE:
            case FALSE:
            case LBRACKET:
                alt8=1;
                break;
            case NUMBER:
                var LA8_2 = this.input.LA(2);

                if ( (LA8_2==PERCENT) ) {
                    alt8=3;
                }
                else if ( (LA8_2==EOF||(LA8_2>=EQ && LA8_2<=EXP)||LA8_2==RPAREN||LA8_2==COMMA||LA8_2==RBRACKET) ) {
                    alt8=1;
                }
                else {
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 8, 2, this.input);

                    throw nvae;
                }
                break;
            case FUNCNAME:
                alt8=2;
                break;
            case VARIABLE:
                alt8=4;
                break;
            case LPAREN:
                alt8=5;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 8, 0, this.input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:57:4: literal
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ExpParser.FOLLOW_literal_in_operand281);
                    literal24=this.literal();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, literal24.getTree());


                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:58:4: functionExpr
                    this.pushFollow(ExpParser.FOLLOW_functionExpr_in_operand287);
                    functionExpr25=this.functionExpr();

                    this.state._fsp--;

                    stream_functionExpr.add(functionExpr25.getTree());


                    // AST REWRITE
                    // elements: functionExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    var stream_retval=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = this.adaptor.nil();
                    // 58:17: -> ^( CALL functionExpr )
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:58:20: ^( CALL functionExpr )
                        {
                        var root_1 = this.adaptor.nil();
                        root_1 = this.adaptor.becomeRoot(this.adaptor.create(CALL, "CALL"), root_1);

                        this.adaptor.addChild(root_1, stream_functionExpr.nextTree());

                        this.adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;

                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:59:4: percent
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ExpParser.FOLLOW_percent_in_operand300);
                    percent26=this.percent();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, percent26.getTree());


                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:60:4: VARIABLE
                    root_0 = this.adaptor.nil();

                    VARIABLE27=this.match(this.input,VARIABLE,ExpParser.FOLLOW_VARIABLE_in_operand305); 
                    VARIABLE27_tree = this.adaptor.create(VARIABLE27);
                    this.adaptor.addChild(root_0, VARIABLE27_tree);



                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:62:4: LPAREN expression RPAREN
                    LPAREN28=this.match(this.input,LPAREN,ExpParser.FOLLOW_LPAREN_in_operand312);  
                    stream_LPAREN.add(LPAREN28);

                    this.pushFollow(ExpParser.FOLLOW_expression_in_operand314);
                    expression29=this.expression();

                    this.state._fsp--;

                    stream_expression.add(expression29.getTree());
                    RPAREN30=this.match(this.input,RPAREN,ExpParser.FOLLOW_RPAREN_in_operand316);  
                    stream_RPAREN.add(RPAREN30);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    var stream_retval=new org.antlr.runtime.tree.RewriteRuleSubtreeStream(this.adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = this.adaptor.nil();
                    // 62:29: -> ^( expression )
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:62:32: ^( expression )
                        {
                        var root_1 = this.adaptor.nil();
                        root_1 = this.adaptor.becomeRoot(stream_expression.nextNode(), root_1);

                        this.adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;

                    break;

            }
            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    functionExpr_return: (function() {
        ExpParser.functionExpr_return = function(){};
        org.antlr.lang.extend(ExpParser.functionExpr_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:64:1: functionExpr : FUNCNAME LPAREN ( expression ( COMMA expression )* )? RPAREN ;
    // $ANTLR start "functionExpr"
    functionExpr: function() {
        var retval = new ExpParser.functionExpr_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var FUNCNAME31 = null;
        var LPAREN32 = null;
        var COMMA34 = null;
        var RPAREN36 = null;
         var expression33 = null;
         var expression35 = null;

        var FUNCNAME31_tree=null;
        var LPAREN32_tree=null;
        var COMMA34_tree=null;
        var RPAREN36_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:2: ( FUNCNAME LPAREN ( expression ( COMMA expression )* )? RPAREN )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:4: FUNCNAME LPAREN ( expression ( COMMA expression )* )? RPAREN
            root_0 = this.adaptor.nil();

            FUNCNAME31=this.match(this.input,FUNCNAME,ExpParser.FOLLOW_FUNCNAME_in_functionExpr332); 
            FUNCNAME31_tree = this.adaptor.create(FUNCNAME31);
            this.adaptor.addChild(root_0, FUNCNAME31_tree);

            LPAREN32=this.match(this.input,LPAREN,ExpParser.FOLLOW_LPAREN_in_functionExpr334); 
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:21: ( expression ( COMMA expression )* )?
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( ((LA10_0>=SUB && LA10_0<=ADD)||(LA10_0>=NOT && LA10_0<=LPAREN)||LA10_0==FUNCNAME||(LA10_0>=NUMBER && LA10_0<=LBRACKET)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:22: expression ( COMMA expression )*
                    this.pushFollow(ExpParser.FOLLOW_expression_in_functionExpr338);
                    expression33=this.expression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, expression33.getTree());
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:33: ( COMMA expression )*
                    loop9:
                    do {
                        var alt9=2;
                        var LA9_0 = this.input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:34: COMMA expression
                            COMMA34=this.match(this.input,COMMA,ExpParser.FOLLOW_COMMA_in_functionExpr341); 
                            this.pushFollow(ExpParser.FOLLOW_expression_in_functionExpr344);
                            expression35=this.expression();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, expression35.getTree());


                            break;

                        default :
                            break loop9;
                        }
                    } while (true);



                    break;

            }

            RPAREN36=this.match(this.input,RPAREN,ExpParser.FOLLOW_RPAREN_in_functionExpr350); 



            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    literal_return: (function() {
        ExpParser.literal_return = function(){};
        org.antlr.lang.extend(ExpParser.literal_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:67:1: literal : ( arrayLiteral | NUMBER | STRING | TRUE | FALSE );
    // $ANTLR start "literal"
    literal: function() {
        var retval = new ExpParser.literal_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var NUMBER38 = null;
        var STRING39 = null;
        var TRUE40 = null;
        var FALSE41 = null;
         var arrayLiteral37 = null;

        var NUMBER38_tree=null;
        var STRING39_tree=null;
        var TRUE40_tree=null;
        var FALSE41_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:68:2: ( arrayLiteral | NUMBER | STRING | TRUE | FALSE )
            var alt11=5;
            switch ( this.input.LA(1) ) {
            case LBRACKET:
                alt11=1;
                break;
            case NUMBER:
                alt11=2;
                break;
            case STRING:
                alt11=3;
                break;
            case TRUE:
                alt11=4;
                break;
            case FALSE:
                alt11=5;
                break;
            default:
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 11, 0, this.input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:68:4: arrayLiteral
                    root_0 = this.adaptor.nil();

                    this.pushFollow(ExpParser.FOLLOW_arrayLiteral_in_literal361);
                    arrayLiteral37=this.arrayLiteral();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, arrayLiteral37.getTree());


                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:69:4: NUMBER
                    root_0 = this.adaptor.nil();

                    NUMBER38=this.match(this.input,NUMBER,ExpParser.FOLLOW_NUMBER_in_literal366); 
                    NUMBER38_tree = this.adaptor.create(NUMBER38);
                    this.adaptor.addChild(root_0, NUMBER38_tree);



                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:70:4: STRING
                    root_0 = this.adaptor.nil();

                    STRING39=this.match(this.input,STRING,ExpParser.FOLLOW_STRING_in_literal372); 
                    STRING39_tree = this.adaptor.create(STRING39);
                    this.adaptor.addChild(root_0, STRING39_tree);



                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:71:4: TRUE
                    root_0 = this.adaptor.nil();

                    TRUE40=this.match(this.input,TRUE,ExpParser.FOLLOW_TRUE_in_literal378); 
                    TRUE40_tree = this.adaptor.create(TRUE40);
                    this.adaptor.addChild(root_0, TRUE40_tree);



                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:72:4: FALSE
                    root_0 = this.adaptor.nil();

                    FALSE41=this.match(this.input,FALSE,ExpParser.FOLLOW_FALSE_in_literal383); 
                    FALSE41_tree = this.adaptor.create(FALSE41);
                    this.adaptor.addChild(root_0, FALSE41_tree);



                    break;

            }
            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    arrayLiteral_return: (function() {
        ExpParser.arrayLiteral_return = function(){};
        org.antlr.lang.extend(ExpParser.arrayLiteral_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:75:1: arrayLiteral : LBRACKET ( expression ( COMMA expression )* )? RBRACKET ;
    // $ANTLR start "arrayLiteral"
    arrayLiteral: function() {
        var retval = new ExpParser.arrayLiteral_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var LBRACKET42 = null;
        var COMMA44 = null;
        var RBRACKET46 = null;
         var expression43 = null;
         var expression45 = null;

        var LBRACKET42_tree=null;
        var COMMA44_tree=null;
        var RBRACKET46_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:2: ( LBRACKET ( expression ( COMMA expression )* )? RBRACKET )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:4: LBRACKET ( expression ( COMMA expression )* )? RBRACKET
            root_0 = this.adaptor.nil();

            LBRACKET42=this.match(this.input,LBRACKET,ExpParser.FOLLOW_LBRACKET_in_arrayLiteral395); 
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:14: ( expression ( COMMA expression )* )?
            var alt13=2;
            var LA13_0 = this.input.LA(1);

            if ( ((LA13_0>=SUB && LA13_0<=ADD)||(LA13_0>=NOT && LA13_0<=LPAREN)||LA13_0==FUNCNAME||(LA13_0>=NUMBER && LA13_0<=LBRACKET)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:15: expression ( COMMA expression )*
                    this.pushFollow(ExpParser.FOLLOW_expression_in_arrayLiteral399);
                    expression43=this.expression();

                    this.state._fsp--;

                    this.adaptor.addChild(root_0, expression43.getTree());
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:26: ( COMMA expression )*
                    loop12:
                    do {
                        var alt12=2;
                        var LA12_0 = this.input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                        case 1 :
                            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:27: COMMA expression
                            COMMA44=this.match(this.input,COMMA,ExpParser.FOLLOW_COMMA_in_arrayLiteral402); 
                            this.pushFollow(ExpParser.FOLLOW_expression_in_arrayLiteral405);
                            expression45=this.expression();

                            this.state._fsp--;

                            this.adaptor.addChild(root_0, expression45.getTree());


                            break;

                        default :
                            break loop12;
                        }
                    } while (true);



                    break;

            }

            RBRACKET46=this.match(this.input,RBRACKET,ExpParser.FOLLOW_RBRACKET_in_arrayLiteral411); 



            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    },

    // inline static return class
    percent_return: (function() {
        ExpParser.percent_return = function(){};
        org.antlr.lang.extend(ExpParser.percent_return,
                          org.antlr.runtime.ParserRuleReturnScope,
        {
            getTree: function() { return this.tree; }
        });
        return;
    })(),

    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:78:1: percent : NUMBER PERCENT ;
    // $ANTLR start "percent"
    percent: function() {
        var retval = new ExpParser.percent_return();
        retval.start = this.input.LT(1);

        var root_0 = null;

        var NUMBER47 = null;
        var PERCENT48 = null;

        var NUMBER47_tree=null;
        var PERCENT48_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:79:2: ( NUMBER PERCENT )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:79:4: NUMBER PERCENT
            root_0 = this.adaptor.nil();

            NUMBER47=this.match(this.input,NUMBER,ExpParser.FOLLOW_NUMBER_in_percent422); 
            NUMBER47_tree = this.adaptor.create(NUMBER47);
            this.adaptor.addChild(root_0, NUMBER47_tree);

            PERCENT48=this.match(this.input,PERCENT,ExpParser.FOLLOW_PERCENT_in_percent424); 
            PERCENT48_tree = this.adaptor.create(PERCENT48);
            root_0 = this.adaptor.becomeRoot(PERCENT48_tree, root_0);




            retval.stop = this.input.LT(-1);

            retval.tree = this.adaptor.rulePostProcessing(root_0);
            this.adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
                retval.tree = this.adaptor.errorNode(this.input, retval.start, this.input.LT(-1), re);
            } else {
                throw re;
            }
        }
        finally {
        }
        return retval;
    }

    // Delegated rules




}, true); // important to pass true to overwrite default implementations

 

// public class variables
org.antlr.lang.augmentObject(ExpParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "POS", "NEG", "CALL", "EQ", "AND", "OR", "LT", "LTEQ", "GT", "GTEQ", "NOTEQ", "CONCAT", "SUB", "ADD", "DIV", "MULT", "EXP", "NOT", "VARIABLE", "LPAREN", "RPAREN", "FUNCNAME", "COMMA", "NUMBER", "STRING", "TRUE", "FALSE", "LBRACKET", "RBRACKET", "PERCENT", "ESCAPE_SEQUENCE", "WHITESPACE", "LETTER", "DIGIT"],
    FOLLOW_EQ_in_formula63: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_expression_in_formula68: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_boolExpr_in_expression84: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_concatExpr_in_boolExpr94: new org.antlr.runtime.BitSet([0x00007F82, 0x00000000]),
    FOLLOW_set_in_boolExpr97: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_concatExpr_in_boolExpr130: new org.antlr.runtime.BitSet([0x00007F82, 0x00000000]),
    FOLLOW_sumExpr_in_concatExpr142: new org.antlr.runtime.BitSet([0x00008002, 0x00000000]),
    FOLLOW_CONCAT_in_concatExpr145: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_sumExpr_in_concatExpr148: new org.antlr.runtime.BitSet([0x00008002, 0x00000000]),
    FOLLOW_productExpr_in_sumExpr160: new org.antlr.runtime.BitSet([0x00030002, 0x00000000]),
    FOLLOW_set_in_sumExpr163: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_productExpr_in_sumExpr172: new org.antlr.runtime.BitSet([0x00030002, 0x00000000]),
    FOLLOW_expExpr_in_productExpr184: new org.antlr.runtime.BitSet([0x000C0002, 0x00000000]),
    FOLLOW_set_in_productExpr187: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_expExpr_in_productExpr196: new org.antlr.runtime.BitSet([0x000C0002, 0x00000000]),
    FOLLOW_unaryOperation_in_expExpr208: new org.antlr.runtime.BitSet([0x00100002, 0x00000000]),
    FOLLOW_EXP_in_expExpr211: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_unaryOperation_in_expExpr214: new org.antlr.runtime.BitSet([0x00100002, 0x00000000]),
    FOLLOW_NOT_in_unaryOperation226: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_operand_in_unaryOperation229: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_ADD_in_unaryOperation234: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_operand_in_unaryOperation238: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_SUB_in_unaryOperation252: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_operand_in_unaryOperation256: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_operand_in_unaryOperation270: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_literal_in_operand281: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_functionExpr_in_operand287: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_percent_in_operand300: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_VARIABLE_in_operand305: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_LPAREN_in_operand312: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_expression_in_operand314: new org.antlr.runtime.BitSet([0x01000000, 0x00000000]),
    FOLLOW_RPAREN_in_operand316: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_FUNCNAME_in_functionExpr332: new org.antlr.runtime.BitSet([0x00800000, 0x00000000]),
    FOLLOW_LPAREN_in_functionExpr334: new org.antlr.runtime.BitSet([0xFBE30000, 0x00000000]),
    FOLLOW_expression_in_functionExpr338: new org.antlr.runtime.BitSet([0x05000000, 0x00000000]),
    FOLLOW_COMMA_in_functionExpr341: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_expression_in_functionExpr344: new org.antlr.runtime.BitSet([0x05000000, 0x00000000]),
    FOLLOW_RPAREN_in_functionExpr350: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_arrayLiteral_in_literal361: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_NUMBER_in_literal366: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_STRING_in_literal372: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_TRUE_in_literal378: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_FALSE_in_literal383: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_LBRACKET_in_arrayLiteral395: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000001]),
    FOLLOW_expression_in_arrayLiteral399: new org.antlr.runtime.BitSet([0x04000000, 0x00000001]),
    FOLLOW_COMMA_in_arrayLiteral402: new org.antlr.runtime.BitSet([0xFAE30000, 0x00000000]),
    FOLLOW_expression_in_arrayLiteral405: new org.antlr.runtime.BitSet([0x04000000, 0x00000001]),
    FOLLOW_RBRACKET_in_arrayLiteral411: new org.antlr.runtime.BitSet([0x00000002, 0x00000000]),
    FOLLOW_NUMBER_in_percent422: new org.antlr.runtime.BitSet([0x00000000, 0x00000002]),
    FOLLOW_PERCENT_in_percent424: new org.antlr.runtime.BitSet([0x00000002, 0x00000000])
});

})();
