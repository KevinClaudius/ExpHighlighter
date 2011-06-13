// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g 2011-06-10 15:16:22
package output;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExpWalker extends TreeParser {
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


        public ExpWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExpWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ExpWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g"; }



    // $ANTLR start "walk"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:20:1: walk : expression ;
    public final void walk() throws RecognitionException {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:21:2: ( expression )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:21:4: expression
            {
            pushFollow(FOLLOW_expression_in_walk47);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "walk"


    // $ANTLR start "expression"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:23:1: expression : ( operand | operation );
    public final void expression() throws RecognitionException {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:24:2: ( operand | operation )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==VARIABLE||(LA1_0>=NUMBER && LA1_0<=FALSE)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=POS && LA1_0<=NOT)||LA1_0==PERCENT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:24:4: operand
                    {
                    pushFollow(FOLLOW_operand_in_expression57);
                    operand();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:25:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_expression62);
                    operation();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "operation"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:27:1: operation : ( ^( POS a= expression ) | ^( NEG a= expression ) | ^( NOT a= expression ) | ^( OR a= expression b= expression ) | ^( AND a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NOTEQ a= expression b= expression ) | ^( ADD a= expression b= expression ) | ^( SUB a= expression b= expression ) | ^( MULT a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( EXP a= expression b= expression ) | ^( CONCAT a= expression b= expression ) | ^( PERCENT n= NUMBER ) | ^( CALL FUNCNAME (funcArgs+= . )* ) );
    public final void operation() throws RecognitionException {
        CommonTree n=null;
        CommonTree funcArgs=null;
        List list_funcArgs=null;

        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:28:2: ( ^( POS a= expression ) | ^( NEG a= expression ) | ^( NOT a= expression ) | ^( OR a= expression b= expression ) | ^( AND a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NOTEQ a= expression b= expression ) | ^( ADD a= expression b= expression ) | ^( SUB a= expression b= expression ) | ^( MULT a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( EXP a= expression b= expression ) | ^( CONCAT a= expression b= expression ) | ^( PERCENT n= NUMBER ) | ^( CALL FUNCNAME (funcArgs+= . )* ) )
            int alt3=19;
            switch ( input.LA(1) ) {
            case POS:
                {
                alt3=1;
                }
                break;
            case NEG:
                {
                alt3=2;
                }
                break;
            case NOT:
                {
                alt3=3;
                }
                break;
            case OR:
                {
                alt3=4;
                }
                break;
            case AND:
                {
                alt3=5;
                }
                break;
            case LT:
                {
                alt3=6;
                }
                break;
            case LTEQ:
                {
                alt3=7;
                }
                break;
            case GT:
                {
                alt3=8;
                }
                break;
            case GTEQ:
                {
                alt3=9;
                }
                break;
            case EQ:
                {
                alt3=10;
                }
                break;
            case NOTEQ:
                {
                alt3=11;
                }
                break;
            case ADD:
                {
                alt3=12;
                }
                break;
            case SUB:
                {
                alt3=13;
                }
                break;
            case MULT:
                {
                alt3=14;
                }
                break;
            case DIV:
                {
                alt3=15;
                }
                break;
            case EXP:
                {
                alt3=16;
                }
                break;
            case CONCAT:
                {
                alt3=17;
                }
                break;
            case PERCENT:
                {
                alt3=18;
                }
                break;
            case CALL:
                {
                alt3=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:28:4: ^( POS a= expression )
                    {
                    match(input,POS,FOLLOW_POS_in_operation73); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation77);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:29:4: ^( NEG a= expression )
                    {
                    match(input,NEG,FOLLOW_NEG_in_operation84); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation88);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:30:6: ^( NOT a= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_operation97); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation101);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:31:4: ^( OR a= expression b= expression )
                    {
                    match(input,OR,FOLLOW_OR_in_operation108); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation112);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation116);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:32:4: ^( AND a= expression b= expression )
                    {
                    match(input,AND,FOLLOW_AND_in_operation123); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation127);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation131);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:33:4: ^( LT a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_operation138); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation142);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation146);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:34:4: ^( LTEQ a= expression b= expression )
                    {
                    match(input,LTEQ,FOLLOW_LTEQ_in_operation153); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation157);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation161);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:35:4: ^( GT a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_operation168); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation172);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation176);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:36:4: ^( GTEQ a= expression b= expression )
                    {
                    match(input,GTEQ,FOLLOW_GTEQ_in_operation183); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation187);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation191);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:37:4: ^( EQ a= expression b= expression )
                    {
                    match(input,EQ,FOLLOW_EQ_in_operation198); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation202);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation206);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:38:4: ^( NOTEQ a= expression b= expression )
                    {
                    match(input,NOTEQ,FOLLOW_NOTEQ_in_operation213); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation217);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation221);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:39:4: ^( ADD a= expression b= expression )
                    {
                    match(input,ADD,FOLLOW_ADD_in_operation228); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation232);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation236);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:40:4: ^( SUB a= expression b= expression )
                    {
                    match(input,SUB,FOLLOW_SUB_in_operation243); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation247);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation251);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:41:4: ^( MULT a= expression b= expression )
                    {
                    match(input,MULT,FOLLOW_MULT_in_operation258); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation262);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation266);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:42:4: ^( DIV a= expression b= expression )
                    {
                    match(input,DIV,FOLLOW_DIV_in_operation273); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation277);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation281);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:43:4: ^( EXP a= expression b= expression )
                    {
                    match(input,EXP,FOLLOW_EXP_in_operation288); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation292);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation296);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:44:4: ^( CONCAT a= expression b= expression )
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_operation303); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_operation307);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_operation311);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:45:4: ^( PERCENT n= NUMBER )
                    {
                    match(input,PERCENT,FOLLOW_PERCENT_in_operation318); 

                    match(input, Token.DOWN, null); 
                    n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operation322); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:46:4: ^( CALL FUNCNAME (funcArgs+= . )* )
                    {
                    match(input,CALL,FOLLOW_CALL_in_operation329); 

                    match(input, Token.DOWN, null); 
                    match(input,FUNCNAME,FOLLOW_FUNCNAME_in_operation331); 
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:46:28: (funcArgs+= . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=POS && LA2_0<=DIGIT)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:46:28: funcArgs+= .
                    	    {
                    	    funcArgs=(CommonTree)input.LT(1);
                    	    matchAny(input); 
                    	    if (list_funcArgs==null) list_funcArgs=new ArrayList();
                    	    list_funcArgs.add(funcArgs);


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operation"


    // $ANTLR start "operand"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:48:1: operand : literal ;
    public final void operand() throws RecognitionException {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:49:2: ( literal )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:49:4: literal
            {
            pushFollow(FOLLOW_literal_in_operand347);
            literal();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operand"


    // $ANTLR start "literal"
    // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:51:1: literal : ( NUMBER | STRING | TRUE | FALSE | VARIABLE );
    public final void literal() throws RecognitionException {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:52:2: ( NUMBER | STRING | TRUE | FALSE | VARIABLE )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/ExpWalker.g:
            {
            if ( input.LA(1)==VARIABLE||(input.LA(1)>=NUMBER && input.LA(1)<=FALSE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_walk47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operand_in_expression57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_expression62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_operation73 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation77 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEG_in_operation84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_operation97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_operation108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation112 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_operation123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation127 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_operation138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation142 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEQ_in_operation153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation157 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_operation168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation172 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEQ_in_operation183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation187 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_operation198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation202 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTEQ_in_operation213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation217 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_operation228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation232 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_in_operation243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation247 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_in_operation258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation262 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_operation273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation277 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_operation288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation292 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_operation303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operation307 = new BitSet(new long[]{0x00000002787FFFF0L});
    public static final BitSet FOLLOW_expression_in_operation311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PERCENT_in_operation318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_operation322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_operation329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FUNCNAME_in_operation331 = new BitSet(new long[]{0x0000003FFFFFFFF8L});
    public static final BitSet FOLLOW_literal_in_operand347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}