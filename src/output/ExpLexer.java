// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g 2011-06-10 15:16:18
package output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExpLexer extends Lexer {
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

    public ExpLexer() {;} 
    public ExpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g"; }

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:83:2: ( '\\\"' ( options {greedy=false; } : ESCAPE_SEQUENCE | ~ '\\\\' )* '\\\"' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:84:2: '\\\"' ( options {greedy=false; } : ESCAPE_SEQUENCE | ~ '\\\\' )* '\\\"'
            {
            match('\"'); 
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:85:3: ( options {greedy=false; } : ESCAPE_SEQUENCE | ~ '\\\\' )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=3;
                }
                else if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:86:5: ESCAPE_SEQUENCE
            	    {
            	    mESCAPE_SEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:87:5: ~ '\\\\'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:92:2: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:92:4: ( ' ' | '\\n' | '\\t' | '\\r' )+
            {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:92:4: ( ' ' | '\\n' | '\\t' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:94:2: ( ( 't' | 'T' ) ( 'r' | 'R' ) ( 'u' | 'U' ) ( 'e' | 'E' ) )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:94:4: ( 't' | 'T' ) ( 'r' | 'R' ) ( 'u' | 'U' ) ( 'e' | 'E' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:97:2: ( ( 'f' | 'F' ) ( 'a' | 'A' ) ( 'l' | 'L' ) ( 's' | 'S' ) ( 'e' | 'E' ) )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:97:4: ( 'f' | 'F' ) ( 'a' | 'A' ) ( 'l' | 'L' ) ( 's' | 'S' ) ( 'e' | 'E' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NOTEQ"
    public final void mNOTEQ() throws RecognitionException {
        try {
            int _type = NOTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:100:17: ( '<>' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:100:19: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQ"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:101:17: ( '<=' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:101:19: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:102:17: ( '>=' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:102:19: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:103:8: ( '&&' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:103:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:104:7: ( '||' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:104:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:105:8: ( '!' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:105:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:106:17: ( '=' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:106:19: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:107:17: ( '<' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:107:19: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:108:17: ( '>' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:108:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "EXP"
    public final void mEXP() throws RecognitionException {
        try {
            int _type = EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:110:17: ( '^' | '**' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            else if ( (LA3_0=='*') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:110:19: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:110:23: '**'
                    {
                    match("**"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXP"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:111:17: ( '*' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:111:19: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:112:17: ( '/' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:112:19: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:113:17: ( '+' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:113:19: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:114:17: ( '-' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:114:19: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:116:17: ( '&' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:116:19: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:118:17: ( '(' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:118:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:119:17: ( ')' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:119:19: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:120:10: ( '{' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:120:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:121:10: ( '}' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:121:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:122:17: ( ',' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:122:19: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:123:17: ( '%' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:123:19: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:2: ( 'pv!' ( LETTER )+ )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:4: 'pv!' ( LETTER )+
            {
            match("pv!"); 

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:10: ( LETTER )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:11: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "FUNCNAME"
    public final void mFUNCNAME() throws RecognitionException {
        try {
            int _type = FUNCNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:2: ( ( '@' )? ( LETTER )+ )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:4: ( '@' )? ( LETTER )+
            {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:4: ( '@' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='@') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:5: '@'
                    {
                    match('@'); 

                    }
                    break;

            }

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:10: ( LETTER )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:11: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCNAME"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:2: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:4: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:4: ( DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:5: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:13: ( '.' ( DIGIT )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='.') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:14: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:18: ( DIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:19: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='a' && LA10_0<='z')) ) {
                alt10=1;
            }
            else if ( ((LA10_0>='A' && LA10_0<='Z')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:4: ( 'a' .. 'z' )
                    {
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:4: ( 'a' .. 'z' )
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:5: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:17: ( 'A' .. 'Z' )
                    {
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:17: ( 'A' .. 'Z' )
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:18: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:2: ( ( '0' .. '9' ) )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:4: ( '0' .. '9' )
            {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:4: ( '0' .. '9' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ESCAPE_SEQUENCE"
    public final void mESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:150:2: ( '\\\\' 't' | '\\\\' 'n' | '\\\\' '\\\"' | '\\\\' '\\'' | '\\\\' '\\\\' )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 't':
                    {
                    alt11=1;
                    }
                    break;
                case 'n':
                    {
                    alt11=2;
                    }
                    break;
                case '\"':
                    {
                    alt11=3;
                    }
                    break;
                case '\'':
                    {
                    alt11=4;
                    }
                    break;
                case '\\':
                    {
                    alt11=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:150:4: '\\\\' 't'
                    {
                    match('\\'); 
                    match('t'); 

                    }
                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:151:4: '\\\\' 'n'
                    {
                    match('\\'); 
                    match('n'); 

                    }
                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:152:4: '\\\\' '\\\"'
                    {
                    match('\\'); 
                    match('\"'); 

                    }
                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:153:4: '\\\\' '\\''
                    {
                    match('\\'); 
                    match('\''); 

                    }
                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:154:4: '\\\\' '\\\\'
                    {
                    match('\\'); 
                    match('\\'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE_SEQUENCE"

    public void mTokens() throws RecognitionException {
        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:8: ( STRING | WHITESPACE | TRUE | FALSE | NOTEQ | LTEQ | GTEQ | AND | OR | NOT | EQ | LT | GT | EXP | MULT | DIV | ADD | SUB | CONCAT | LPAREN | RPAREN | LBRACKET | RBRACKET | COMMA | PERCENT | VARIABLE | FUNCNAME | NUMBER )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:10: STRING
                {
                mSTRING(); 

                }
                break;
            case 2 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:17: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 3 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:28: TRUE
                {
                mTRUE(); 

                }
                break;
            case 4 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:33: FALSE
                {
                mFALSE(); 

                }
                break;
            case 5 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:39: NOTEQ
                {
                mNOTEQ(); 

                }
                break;
            case 6 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:45: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 7 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:50: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 8 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:55: AND
                {
                mAND(); 

                }
                break;
            case 9 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:59: OR
                {
                mOR(); 

                }
                break;
            case 10 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:62: NOT
                {
                mNOT(); 

                }
                break;
            case 11 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:66: EQ
                {
                mEQ(); 

                }
                break;
            case 12 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:69: LT
                {
                mLT(); 

                }
                break;
            case 13 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:72: GT
                {
                mGT(); 

                }
                break;
            case 14 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:75: EXP
                {
                mEXP(); 

                }
                break;
            case 15 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:79: MULT
                {
                mMULT(); 

                }
                break;
            case 16 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:84: DIV
                {
                mDIV(); 

                }
                break;
            case 17 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:88: ADD
                {
                mADD(); 

                }
                break;
            case 18 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:92: SUB
                {
                mSUB(); 

                }
                break;
            case 19 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:96: CONCAT
                {
                mCONCAT(); 

                }
                break;
            case 20 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:103: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 21 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:110: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 22 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:117: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 23 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:126: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 24 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:135: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 25 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:141: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 26 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:149: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 27 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:158: FUNCNAME
                {
                mFUNCNAME(); 

                }
                break;
            case 28 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:167: NUMBER
                {
                mNUMBER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\2\27\1\41\1\43\1\45\4\uffff\1\46\11\uffff\1\27\1\uffff"+
        "\2\27\1\uffff\4\27\10\uffff\5\27\1\uffff\2\61\2\27\1\uffff\2\64"+
        "\1\uffff";
    static final String DFA12_eofS =
        "\65\uffff";
    static final String DFA12_minS =
        "\1\11\2\uffff\1\122\1\101\2\75\1\46\4\uffff\1\52\11\uffff\1\166"+
        "\1\uffff\1\122\1\101\1\uffff\2\125\2\114\10\uffff\1\41\2\105\2\123"+
        "\1\uffff\2\101\2\105\1\uffff\2\101\1\uffff";
    static final String DFA12_maxS =
        "\1\175\2\uffff\1\162\1\141\1\76\1\75\1\46\4\uffff\1\52\11\uffff"+
        "\1\166\1\uffff\1\162\1\141\1\uffff\2\165\2\154\10\uffff\1\41\2\145"+
        "\2\163\1\uffff\2\172\2\145\1\uffff\2\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\5\uffff\1\11\1\12\1\13\1\16\1\uffff\1\20\1\21\1"+
        "\22\1\24\1\25\1\26\1\27\1\30\1\31\1\uffff\1\33\2\uffff\1\34\4\uffff"+
        "\1\5\1\6\1\14\1\7\1\15\1\10\1\23\1\17\5\uffff\1\32\4\uffff\1\3\2"+
        "\uffff\1\4";
    static final String DFA12_specialS =
        "\65\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\2\2\uffff\1\2\22\uffff\1\2\1\11\1\1\2\uffff\1\25\1\7\1\uffff"+
            "\1\20\1\21\1\14\1\16\1\24\1\17\1\uffff\1\15\12\32\2\uffff\1"+
            "\5\1\12\1\6\1\uffff\6\27\1\31\15\27\1\30\6\27\3\uffff\1\13\2"+
            "\uffff\5\27\1\4\11\27\1\26\3\27\1\3\6\27\1\22\1\10\1\23",
            "",
            "",
            "\1\34\37\uffff\1\33",
            "\1\36\37\uffff\1\35",
            "\1\40\1\37",
            "\1\42",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "\1\34\37\uffff\1\33",
            "\1\36\37\uffff\1\35",
            "",
            "\1\51\37\uffff\1\50",
            "\1\51\37\uffff\1\50",
            "\1\53\37\uffff\1\52",
            "\1\53\37\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\56\37\uffff\1\55",
            "\1\56\37\uffff\1\55",
            "\1\60\37\uffff\1\57",
            "\1\60\37\uffff\1\57",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\1\63\37\uffff\1\62",
            "\1\63\37\uffff\1\62",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STRING | WHITESPACE | TRUE | FALSE | NOTEQ | LTEQ | GTEQ | AND | OR | NOT | EQ | LT | GT | EXP | MULT | DIV | ADD | SUB | CONCAT | LPAREN | RPAREN | LBRACKET | RBRACKET | COMMA | PERCENT | VARIABLE | FUNCNAME | NUMBER );";
        }
    }
 

}