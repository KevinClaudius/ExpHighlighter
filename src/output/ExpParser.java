// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g 2011-06-10 15:16:18
package output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ExpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "POS", "NEG", "CALL", "EQ", "AND", "OR", "LT", "LTEQ", "GT", "GTEQ", "NOTEQ", "CONCAT", "SUB", "ADD", "DIV", "MULT", "EXP", "NOT", "VARIABLE", "LPAREN", "RPAREN", "FUNCNAME", "COMMA", "NUMBER", "STRING", "TRUE", "FALSE", "LBRACKET", "RBRACKET", "PERCENT", "ESCAPE_SEQUENCE", "WHITESPACE", "LETTER", "DIGIT"
    };
    public static final int EOF=-1;
    public static final int POS=4;
    public static final int NEG=5;
    public static final int CALL=6;
    public static final int EQ=7;
    public static final int AND=8;
    public static final int OR=9;
    public static final int LT=10;
    public static final int LTEQ=11;
    public static final int GT=12;
    public static final int GTEQ=13;
    public static final int NOTEQ=14;
    public static final int CONCAT=15;
    public static final int SUB=16;
    public static final int ADD=17;
    public static final int DIV=18;
    public static final int MULT=19;
    public static final int EXP=20;
    public static final int NOT=21;
    public static final int VARIABLE=22;
    public static final int LPAREN=23;
    public static final int RPAREN=24;
    public static final int FUNCNAME=25;
    public static final int COMMA=26;
    public static final int NUMBER=27;
    public static final int STRING=28;
    public static final int TRUE=29;
    public static final int FALSE=30;
    public static final int LBRACKET=31;
    public static final int RBRACKET=32;
    public static final int PERCENT=33;
    public static final int ESCAPE_SEQUENCE=34;
    public static final int WHITESPACE=35;
    public static final int LETTER=36;
    public static final int DIGIT=37;

    // delegates
    // delegators


        public ExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ExpParser.tokenNames; }
    public String getGrammarFileName() { return "/home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g"; }


    public static class formula_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formula"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:24:1: formula : ( EQ )? expression ;
    public final ExpParser.formula_return formula() throws RecognitionException {
        ExpParser.formula_return retval = new ExpParser.formula_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQ1=null;
        ExpParser.expression_return expression2 = null;


        CommonTree EQ1_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:2: ( ( EQ )? expression )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:4: ( EQ )? expression
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:4: ( EQ )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQ) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:25:5: EQ
                    {
                    EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_formula76); 

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_formula81);
            expression2=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression2.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formula"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:31:1: expression : boolExpr ;
    public final ExpParser.expression_return expression() throws RecognitionException {
        ExpParser.expression_return retval = new ExpParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ExpParser.boolExpr_return boolExpr3 = null;



        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:32:2: ( boolExpr )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:32:4: boolExpr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_boolExpr_in_expression97);
            boolExpr3=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr3.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class boolExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolExpr"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:34:1: boolExpr : concatExpr ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )* ;
    public final ExpParser.boolExpr_return boolExpr() throws RecognitionException {
        ExpParser.boolExpr_return retval = new ExpParser.boolExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;
        ExpParser.concatExpr_return concatExpr4 = null;

        ExpParser.concatExpr_return concatExpr6 = null;


        CommonTree set5_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:2: ( concatExpr ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:4: concatExpr ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_concatExpr_in_boolExpr107);
            concatExpr4=concatExpr();

            state._fsp--;

            adaptor.addChild(root_0, concatExpr4.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:15: ( ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=EQ && LA2_0<=NOTEQ)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:35:16: ( AND | OR | LT | LTEQ | GT | GTEQ | EQ | NOTEQ ) concatExpr
            	    {
            	    set5=(Token)input.LT(1);
            	    set5=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NOTEQ) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set5), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_concatExpr_in_boolExpr143);
            	    concatExpr6=concatExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, concatExpr6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "boolExpr"

    public static class concatExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concatExpr"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:37:1: concatExpr : sumExpr ( CONCAT sumExpr )* ;
    public final ExpParser.concatExpr_return concatExpr() throws RecognitionException {
        ExpParser.concatExpr_return retval = new ExpParser.concatExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONCAT8=null;
        ExpParser.sumExpr_return sumExpr7 = null;

        ExpParser.sumExpr_return sumExpr9 = null;


        CommonTree CONCAT8_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:2: ( sumExpr ( CONCAT sumExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:4: sumExpr ( CONCAT sumExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sumExpr_in_concatExpr155);
            sumExpr7=sumExpr();

            state._fsp--;

            adaptor.addChild(root_0, sumExpr7.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:12: ( CONCAT sumExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CONCAT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:38:13: CONCAT sumExpr
            	    {
            	    CONCAT8=(Token)match(input,CONCAT,FOLLOW_CONCAT_in_concatExpr158); 
            	    CONCAT8_tree = (CommonTree)adaptor.create(CONCAT8);
            	    root_0 = (CommonTree)adaptor.becomeRoot(CONCAT8_tree, root_0);

            	    pushFollow(FOLLOW_sumExpr_in_concatExpr161);
            	    sumExpr9=sumExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sumExpr9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "concatExpr"

    public static class sumExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sumExpr"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:40:1: sumExpr : productExpr ( ( SUB | ADD ) productExpr )* ;
    public final ExpParser.sumExpr_return sumExpr() throws RecognitionException {
        ExpParser.sumExpr_return retval = new ExpParser.sumExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;
        ExpParser.productExpr_return productExpr10 = null;

        ExpParser.productExpr_return productExpr12 = null;


        CommonTree set11_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:2: ( productExpr ( ( SUB | ADD ) productExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:4: productExpr ( ( SUB | ADD ) productExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_productExpr_in_sumExpr173);
            productExpr10=productExpr();

            state._fsp--;

            adaptor.addChild(root_0, productExpr10.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:16: ( ( SUB | ADD ) productExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=SUB && LA4_0<=ADD)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:41:17: ( SUB | ADD ) productExpr
            	    {
            	    set11=(Token)input.LT(1);
            	    set11=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SUB && input.LA(1)<=ADD) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set11), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_productExpr_in_sumExpr185);
            	    productExpr12=productExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, productExpr12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sumExpr"

    public static class productExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "productExpr"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:43:1: productExpr : expExpr ( ( DIV | MULT ) expExpr )* ;
    public final ExpParser.productExpr_return productExpr() throws RecognitionException {
        ExpParser.productExpr_return retval = new ExpParser.productExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set14=null;
        ExpParser.expExpr_return expExpr13 = null;

        ExpParser.expExpr_return expExpr15 = null;


        CommonTree set14_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:2: ( expExpr ( ( DIV | MULT ) expExpr )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:4: expExpr ( ( DIV | MULT ) expExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expExpr_in_productExpr197);
            expExpr13=expExpr();

            state._fsp--;

            adaptor.addChild(root_0, expExpr13.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:12: ( ( DIV | MULT ) expExpr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=DIV && LA5_0<=MULT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:44:13: ( DIV | MULT ) expExpr
            	    {
            	    set14=(Token)input.LT(1);
            	    set14=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DIV && input.LA(1)<=MULT) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set14), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expExpr_in_productExpr209);
            	    expExpr15=expExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expExpr15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "productExpr"

    public static class expExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expExpr"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:46:1: expExpr : unaryOperation ( EXP unaryOperation )* ;
    public final ExpParser.expExpr_return expExpr() throws RecognitionException {
        ExpParser.expExpr_return retval = new ExpParser.expExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXP17=null;
        ExpParser.unaryOperation_return unaryOperation16 = null;

        ExpParser.unaryOperation_return unaryOperation18 = null;


        CommonTree EXP17_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:2: ( unaryOperation ( EXP unaryOperation )* )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:4: unaryOperation ( EXP unaryOperation )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryOperation_in_expExpr221);
            unaryOperation16=unaryOperation();

            state._fsp--;

            adaptor.addChild(root_0, unaryOperation16.getTree());
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:19: ( EXP unaryOperation )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==EXP) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:47:20: EXP unaryOperation
            	    {
            	    EXP17=(Token)match(input,EXP,FOLLOW_EXP_in_expExpr224); 
            	    EXP17_tree = (CommonTree)adaptor.create(EXP17);
            	    root_0 = (CommonTree)adaptor.becomeRoot(EXP17_tree, root_0);

            	    pushFollow(FOLLOW_unaryOperation_in_expExpr227);
            	    unaryOperation18=unaryOperation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryOperation18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expExpr"

    public static class unaryOperation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryOperation"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:49:1: unaryOperation : ( NOT operand | ADD o= operand -> ^( POS $o) | SUB o= operand -> ^( NEG $o) | operand );
    public final ExpParser.unaryOperation_return unaryOperation() throws RecognitionException {
        ExpParser.unaryOperation_return retval = new ExpParser.unaryOperation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT19=null;
        Token ADD21=null;
        Token SUB22=null;
        ExpParser.operand_return o = null;

        ExpParser.operand_return operand20 = null;

        ExpParser.operand_return operand23 = null;


        CommonTree NOT19_tree=null;
        CommonTree ADD21_tree=null;
        CommonTree SUB22_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:50:2: ( NOT operand | ADD o= operand -> ^( POS $o) | SUB o= operand -> ^( NEG $o) | operand )
            int alt7=4;
            switch ( input.LA(1) ) {
            case NOT:
                {
                alt7=1;
                }
                break;
            case ADD:
                {
                alt7=2;
                }
                break;
            case SUB:
                {
                alt7=3;
                }
                break;
            case VARIABLE:
            case LPAREN:
            case FUNCNAME:
            case NUMBER:
            case STRING:
            case TRUE:
            case FALSE:
            case LBRACKET:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:50:4: NOT operand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT19=(Token)match(input,NOT,FOLLOW_NOT_in_unaryOperation239); 
                    NOT19_tree = (CommonTree)adaptor.create(NOT19);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT19_tree, root_0);

                    pushFollow(FOLLOW_operand_in_unaryOperation242);
                    operand20=operand();

                    state._fsp--;

                    adaptor.addChild(root_0, operand20.getTree());

                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:51:4: ADD o= operand
                    {
                    ADD21=(Token)match(input,ADD,FOLLOW_ADD_in_unaryOperation247);  
                    stream_ADD.add(ADD21);

                    pushFollow(FOLLOW_operand_in_unaryOperation251);
                    o=operand();

                    state._fsp--;

                    stream_operand.add(o.getTree());


                    // AST REWRITE
                    // elements: o
                    // token labels: 
                    // rule labels: retval, o
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 51:18: -> ^( POS $o)
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:51:21: ^( POS $o)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POS, "POS"), root_1);

                        adaptor.addChild(root_1, stream_o.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:52:4: SUB o= operand
                    {
                    SUB22=(Token)match(input,SUB,FOLLOW_SUB_in_unaryOperation265);  
                    stream_SUB.add(SUB22);

                    pushFollow(FOLLOW_operand_in_unaryOperation269);
                    o=operand();

                    state._fsp--;

                    stream_operand.add(o.getTree());


                    // AST REWRITE
                    // elements: o
                    // token labels: 
                    // rule labels: retval, o
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 52:18: -> ^( NEG $o)
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:52:21: ^( NEG $o)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEG, "NEG"), root_1);

                        adaptor.addChild(root_1, stream_o.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:53:4: operand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operand_in_unaryOperation283);
                    operand23=operand();

                    state._fsp--;

                    adaptor.addChild(root_0, operand23.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryOperation"

    public static class operand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operand"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:56:1: operand : ( literal | functionExpr -> ^( CALL functionExpr ) | percent | VARIABLE | LPAREN expression RPAREN -> ^( expression ) );
    public final ExpParser.operand_return operand() throws RecognitionException {
        ExpParser.operand_return retval = new ExpParser.operand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE27=null;
        Token LPAREN28=null;
        Token RPAREN30=null;
        ExpParser.literal_return literal24 = null;

        ExpParser.functionExpr_return functionExpr25 = null;

        ExpParser.percent_return percent26 = null;

        ExpParser.expression_return expression29 = null;


        CommonTree VARIABLE27_tree=null;
        CommonTree LPAREN28_tree=null;
        CommonTree RPAREN30_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionExpr=new RewriteRuleSubtreeStream(adaptor,"rule functionExpr");
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:57:2: ( literal | functionExpr -> ^( CALL functionExpr ) | percent | VARIABLE | LPAREN expression RPAREN -> ^( expression ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case STRING:
            case TRUE:
            case FALSE:
            case LBRACKET:
                {
                alt8=1;
                }
                break;
            case NUMBER:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==PERCENT) ) {
                    alt8=3;
                }
                else if ( (LA8_2==EOF||(LA8_2>=EQ && LA8_2<=EXP)||LA8_2==RPAREN||LA8_2==COMMA||LA8_2==RBRACKET) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case FUNCNAME:
                {
                alt8=2;
                }
                break;
            case VARIABLE:
                {
                alt8=4;
                }
                break;
            case LPAREN:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:57:4: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_operand294);
                    literal24=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal24.getTree());

                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:58:4: functionExpr
                    {
                    pushFollow(FOLLOW_functionExpr_in_operand300);
                    functionExpr25=functionExpr();

                    state._fsp--;

                    stream_functionExpr.add(functionExpr25.getTree());


                    // AST REWRITE
                    // elements: functionExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 58:17: -> ^( CALL functionExpr )
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:58:20: ^( CALL functionExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_functionExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:59:4: percent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_percent_in_operand313);
                    percent26=percent();

                    state._fsp--;

                    adaptor.addChild(root_0, percent26.getTree());

                    }
                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:60:4: VARIABLE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARIABLE27=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_operand318); 
                    VARIABLE27_tree = (CommonTree)adaptor.create(VARIABLE27);
                    adaptor.addChild(root_0, VARIABLE27_tree);


                    }
                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:62:4: LPAREN expression RPAREN
                    {
                    LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand325);  
                    stream_LPAREN.add(LPAREN28);

                    pushFollow(FOLLOW_expression_in_operand327);
                    expression29=expression();

                    state._fsp--;

                    stream_expression.add(expression29.getTree());
                    RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand329);  
                    stream_RPAREN.add(RPAREN30);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:29: -> ^( expression )
                    {
                        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:62:32: ^( expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_expression.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operand"

    public static class functionExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionExpr"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:64:1: functionExpr : FUNCNAME LPAREN ( expression ( COMMA expression )* )? RPAREN ;
    public final ExpParser.functionExpr_return functionExpr() throws RecognitionException {
        ExpParser.functionExpr_return retval = new ExpParser.functionExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUNCNAME31=null;
        Token LPAREN32=null;
        Token COMMA34=null;
        Token RPAREN36=null;
        ExpParser.expression_return expression33 = null;

        ExpParser.expression_return expression35 = null;


        CommonTree FUNCNAME31_tree=null;
        CommonTree LPAREN32_tree=null;
        CommonTree COMMA34_tree=null;
        CommonTree RPAREN36_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:2: ( FUNCNAME LPAREN ( expression ( COMMA expression )* )? RPAREN )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:4: FUNCNAME LPAREN ( expression ( COMMA expression )* )? RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();

            FUNCNAME31=(Token)match(input,FUNCNAME,FOLLOW_FUNCNAME_in_functionExpr345); 
            FUNCNAME31_tree = (CommonTree)adaptor.create(FUNCNAME31);
            adaptor.addChild(root_0, FUNCNAME31_tree);

            LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionExpr347); 
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:21: ( expression ( COMMA expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=SUB && LA10_0<=ADD)||(LA10_0>=NOT && LA10_0<=LPAREN)||LA10_0==FUNCNAME||(LA10_0>=NUMBER && LA10_0<=LBRACKET)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:22: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_functionExpr351);
                    expression33=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression33.getTree());
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:33: ( COMMA expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:65:34: COMMA expression
                    	    {
                    	    COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionExpr354); 
                    	    pushFollow(FOLLOW_expression_in_functionExpr357);
                    	    expression35=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionExpr363); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionExpr"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:67:1: literal : ( arrayLiteral | NUMBER | STRING | TRUE | FALSE );
    public final ExpParser.literal_return literal() throws RecognitionException {
        ExpParser.literal_return retval = new ExpParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NUMBER38=null;
        Token STRING39=null;
        Token TRUE40=null;
        Token FALSE41=null;
        ExpParser.arrayLiteral_return arrayLiteral37 = null;


        CommonTree NUMBER38_tree=null;
        CommonTree STRING39_tree=null;
        CommonTree TRUE40_tree=null;
        CommonTree FALSE41_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:68:2: ( arrayLiteral | NUMBER | STRING | TRUE | FALSE )
            int alt11=5;
            switch ( input.LA(1) ) {
            case LBRACKET:
                {
                alt11=1;
                }
                break;
            case NUMBER:
                {
                alt11=2;
                }
                break;
            case STRING:
                {
                alt11=3;
                }
                break;
            case TRUE:
                {
                alt11=4;
                }
                break;
            case FALSE:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:68:4: arrayLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_literal374);
                    arrayLiteral37=arrayLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayLiteral37.getTree());

                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:69:4: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER38=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_literal379); 
                    NUMBER38_tree = (CommonTree)adaptor.create(NUMBER38);
                    adaptor.addChild(root_0, NUMBER38_tree);


                    }
                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:70:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING39=(Token)match(input,STRING,FOLLOW_STRING_in_literal385); 
                    STRING39_tree = (CommonTree)adaptor.create(STRING39);
                    adaptor.addChild(root_0, STRING39_tree);


                    }
                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:71:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TRUE40=(Token)match(input,TRUE,FOLLOW_TRUE_in_literal391); 
                    TRUE40_tree = (CommonTree)adaptor.create(TRUE40);
                    adaptor.addChild(root_0, TRUE40_tree);


                    }
                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:72:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FALSE41=(Token)match(input,FALSE,FOLLOW_FALSE_in_literal396); 
                    FALSE41_tree = (CommonTree)adaptor.create(FALSE41);
                    adaptor.addChild(root_0, FALSE41_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLiteral"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:75:1: arrayLiteral : LBRACKET ( expression ( COMMA expression )* )? RBRACKET ;
    public final ExpParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        ExpParser.arrayLiteral_return retval = new ExpParser.arrayLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LBRACKET42=null;
        Token COMMA44=null;
        Token RBRACKET46=null;
        ExpParser.expression_return expression43 = null;

        ExpParser.expression_return expression45 = null;


        CommonTree LBRACKET42_tree=null;
        CommonTree COMMA44_tree=null;
        CommonTree RBRACKET46_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:2: ( LBRACKET ( expression ( COMMA expression )* )? RBRACKET )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:4: LBRACKET ( expression ( COMMA expression )* )? RBRACKET
            {
            root_0 = (CommonTree)adaptor.nil();

            LBRACKET42=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLiteral408); 
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:14: ( expression ( COMMA expression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=SUB && LA13_0<=ADD)||(LA13_0>=NOT && LA13_0<=LPAREN)||LA13_0==FUNCNAME||(LA13_0>=NUMBER && LA13_0<=LBRACKET)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:15: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_arrayLiteral412);
                    expression43=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression43.getTree());
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:26: ( COMMA expression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:76:27: COMMA expression
                    	    {
                    	    COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral415); 
                    	    pushFollow(FOLLOW_expression_in_arrayLiteral418);
                    	    expression45=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACKET46=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLiteral424); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"

    public static class percent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "percent"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:78:1: percent : NUMBER PERCENT ;
    public final ExpParser.percent_return percent() throws RecognitionException {
        ExpParser.percent_return retval = new ExpParser.percent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NUMBER47=null;
        Token PERCENT48=null;

        CommonTree NUMBER47_tree=null;
        CommonTree PERCENT48_tree=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:79:2: ( NUMBER PERCENT )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:79:4: NUMBER PERCENT
            {
            root_0 = (CommonTree)adaptor.nil();

            NUMBER47=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_percent435); 
            NUMBER47_tree = (CommonTree)adaptor.create(NUMBER47);
            adaptor.addChild(root_0, NUMBER47_tree);

            PERCENT48=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_percent437); 
            PERCENT48_tree = (CommonTree)adaptor.create(PERCENT48);
            root_0 = (CommonTree)adaptor.becomeRoot(PERCENT48_tree, root_0);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "percent"

    // Delegated rules


 

    public static final BitSet FOLLOW_EQ_in_formula76 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_expression_in_formula81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpr_in_expression97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatExpr_in_boolExpr107 = new BitSet(new long[]{0x0000000000007F82L});
    public static final BitSet FOLLOW_set_in_boolExpr110 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_concatExpr_in_boolExpr143 = new BitSet(new long[]{0x0000000000007F82L});
    public static final BitSet FOLLOW_sumExpr_in_concatExpr155 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_CONCAT_in_concatExpr158 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_sumExpr_in_concatExpr161 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_productExpr_in_sumExpr173 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_set_in_sumExpr176 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_productExpr_in_sumExpr185 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_expExpr_in_productExpr197 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_set_in_productExpr200 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_expExpr_in_productExpr209 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_unaryOperation_in_expExpr221 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_EXP_in_expExpr224 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_unaryOperation_in_expExpr227 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperation239 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_operand_in_unaryOperation242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperation247 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_operand_in_unaryOperation251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperation265 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_operand_in_unaryOperation269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operand_in_unaryOperation283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_operand294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpr_in_operand300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percent_in_operand313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_operand318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_operand325 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_expression_in_operand327 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RPAREN_in_operand329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCNAME_in_functionExpr345 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_functionExpr347 = new BitSet(new long[]{0x00000000FBE30000L});
    public static final BitSet FOLLOW_expression_in_functionExpr351 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_COMMA_in_functionExpr354 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_expression_in_functionExpr357 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_RPAREN_in_functionExpr363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_literal374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_literal379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLiteral408 = new BitSet(new long[]{0x00000001FAE30000L});
    public static final BitSet FOLLOW_expression_in_arrayLiteral412 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral415 = new BitSet(new long[]{0x00000000FAE30000L});
    public static final BitSet FOLLOW_expression_in_arrayLiteral418 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLiteral424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_percent435 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_PERCENT_in_percent437 = new BitSet(new long[]{0x0000000000000002L});

}