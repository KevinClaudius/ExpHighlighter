// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g 2011-06-10 16:31:08

var ExpLexer = function(input, state) {
// alternate constructor @todo
// public ExpLexer(CharStream input)
// public ExpLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    this.dfa12 = new ExpLexer.DFA12(this);
    ExpLexer.superclass.constructor.call(this, input, state);


};

org.antlr.lang.augmentObject(ExpLexer, {
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
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(ExpLexer, org.antlr.runtime.Lexer, {
    EOF : -1,
    POS : 4,
    NEG : 5,
    CALL : 6,
    EQ : 7,
    AND : 8,
    OR : 9,
    LT : 10,
    LTEQ : 11,
    GT : 12,
    GTEQ : 13,
    NOTEQ : 14,
    CONCAT : 15,
    SUB : 16,
    ADD : 17,
    DIV : 18,
    MULT : 19,
    EXP : 20,
    NOT : 21,
    VARIABLE : 22,
    LPAREN : 23,
    RPAREN : 24,
    FUNCNAME : 25,
    COMMA : 26,
    NUMBER : 27,
    STRING : 28,
    TRUE : 29,
    FALSE : 30,
    LBRACKET : 31,
    RBRACKET : 32,
    PERCENT : 33,
    ESCAPE_SEQUENCE : 34,
    WHITESPACE : 35,
    LETTER : 36,
    DIGIT : 37,
    getGrammarFileName: function() { return "/home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g"; }
});
org.antlr.lang.augmentObject(ExpLexer.prototype, {
    // $ANTLR start STRING
    mSTRING: function()  {
        try {
            var _type = this.STRING;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:83:2: ( '\\\"' ( options {greedy=false; } : ESCAPE_SEQUENCE | ~ '\\\\' )* '\\\"' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:84:2: '\\\"' ( options {greedy=false; } : ESCAPE_SEQUENCE | ~ '\\\\' )* '\\\"'
            this.match('\"'); 
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:85:3: ( options {greedy=false; } : ESCAPE_SEQUENCE | ~ '\\\\' )*
            loop1:
            do {
                var alt1=3;
                var LA1_0 = this.input.LA(1);

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
                    this.mESCAPE_SEQUENCE(); 


                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:87:5: ~ '\\\\'
                    if ( (this.input.LA(1)>='\u0000' && this.input.LA(1)<='[')||(this.input.LA(1)>=']' && this.input.LA(1)<='\uFFFF') ) {
                        this.input.consume();

                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        this.recover(mse);
                        throw mse;}



                    break;

                default :
                    break loop1;
                }
            } while (true);

            this.match('\"'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "STRING",

    // $ANTLR start WHITESPACE
    mWHITESPACE: function()  {
        try {
            var _type = this.WHITESPACE;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:92:2: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:92:4: ( ' ' | '\\n' | '\\t' | '\\r' )+
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:92:4: ( ' ' | '\\n' | '\\t' | '\\r' )+
            var cnt2=0;
            loop2:
            do {
                var alt2=2;
                var LA2_0 = this.input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:
                    if ( (this.input.LA(1)>='\t' && this.input.LA(1)<='\n')||this.input.LA(1)=='\r'||this.input.LA(1)==' ' ) {
                        this.input.consume();

                    }
                    else {
                        var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                        this.recover(mse);
                        throw mse;}



                    break;

                default :
                    if ( cnt2 >= 1 ) {
                        break loop2;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(2, this.input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            this.state.token = org.antlr.runtime.Token.SKIP_TOKEN;



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "WHITESPACE",

    // $ANTLR start TRUE
    mTRUE: function()  {
        try {
            var _type = this.TRUE;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:94:2: ( ( 't' | 'T' ) ( 'r' | 'R' ) ( 'u' | 'U' ) ( 'e' | 'E' ) )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:94:4: ( 't' | 'T' ) ( 'r' | 'R' ) ( 'u' | 'U' ) ( 'e' | 'E' )
            if ( this.input.LA(1)=='T'||this.input.LA(1)=='t' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            if ( this.input.LA(1)=='R'||this.input.LA(1)=='r' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            if ( this.input.LA(1)=='U'||this.input.LA(1)=='u' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            if ( this.input.LA(1)=='E'||this.input.LA(1)=='e' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "TRUE",

    // $ANTLR start FALSE
    mFALSE: function()  {
        try {
            var _type = this.FALSE;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:97:2: ( ( 'f' | 'F' ) ( 'a' | 'A' ) ( 'l' | 'L' ) ( 's' | 'S' ) ( 'e' | 'E' ) )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:97:4: ( 'f' | 'F' ) ( 'a' | 'A' ) ( 'l' | 'L' ) ( 's' | 'S' ) ( 'e' | 'E' )
            if ( this.input.LA(1)=='F'||this.input.LA(1)=='f' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            if ( this.input.LA(1)=='A'||this.input.LA(1)=='a' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            if ( this.input.LA(1)=='L'||this.input.LA(1)=='l' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            if ( this.input.LA(1)=='S'||this.input.LA(1)=='s' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}

            if ( this.input.LA(1)=='E'||this.input.LA(1)=='e' ) {
                this.input.consume();

            }
            else {
                var mse = new org.antlr.runtime.MismatchedSetException(null,this.input);
                this.recover(mse);
                throw mse;}




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "FALSE",

    // $ANTLR start NOTEQ
    mNOTEQ: function()  {
        try {
            var _type = this.NOTEQ;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:100:17: ( '<>' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:100:19: '<>'
            this.match("<>"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "NOTEQ",

    // $ANTLR start LTEQ
    mLTEQ: function()  {
        try {
            var _type = this.LTEQ;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:101:17: ( '<=' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:101:19: '<='
            this.match("<="); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "LTEQ",

    // $ANTLR start GTEQ
    mGTEQ: function()  {
        try {
            var _type = this.GTEQ;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:102:17: ( '>=' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:102:19: '>='
            this.match(">="); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "GTEQ",

    // $ANTLR start AND
    mAND: function()  {
        try {
            var _type = this.AND;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:103:8: ( '&&' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:103:10: '&&'
            this.match("&&"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "AND",

    // $ANTLR start OR
    mOR: function()  {
        try {
            var _type = this.OR;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:104:7: ( '||' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:104:9: '||'
            this.match("||"); 




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "OR",

    // $ANTLR start NOT
    mNOT: function()  {
        try {
            var _type = this.NOT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:105:8: ( '!' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:105:10: '!'
            this.match('!'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "NOT",

    // $ANTLR start EQ
    mEQ: function()  {
        try {
            var _type = this.EQ;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:106:17: ( '=' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:106:19: '='
            this.match('='); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "EQ",

    // $ANTLR start LT
    mLT: function()  {
        try {
            var _type = this.LT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:107:17: ( '<' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:107:19: '<'
            this.match('<'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "LT",

    // $ANTLR start GT
    mGT: function()  {
        try {
            var _type = this.GT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:108:17: ( '>' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:108:19: '>'
            this.match('>'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "GT",

    // $ANTLR start EXP
    mEXP: function()  {
        try {
            var _type = this.EXP;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:110:17: ( '^' | '**' )
            var alt3=2;
            var LA3_0 = this.input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            else if ( (LA3_0=='*') ) {
                alt3=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 3, 0, this.input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:110:19: '^'
                    this.match('^'); 


                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:110:23: '**'
                    this.match("**"); 



                    break;

            }
            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "EXP",

    // $ANTLR start MULT
    mMULT: function()  {
        try {
            var _type = this.MULT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:111:17: ( '*' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:111:19: '*'
            this.match('*'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "MULT",

    // $ANTLR start DIV
    mDIV: function()  {
        try {
            var _type = this.DIV;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:112:17: ( '/' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:112:19: '/'
            this.match('/'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "DIV",

    // $ANTLR start ADD
    mADD: function()  {
        try {
            var _type = this.ADD;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:113:17: ( '+' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:113:19: '+'
            this.match('+'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "ADD",

    // $ANTLR start SUB
    mSUB: function()  {
        try {
            var _type = this.SUB;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:114:17: ( '-' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:114:19: '-'
            this.match('-'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "SUB",

    // $ANTLR start CONCAT
    mCONCAT: function()  {
        try {
            var _type = this.CONCAT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:116:17: ( '&' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:116:19: '&'
            this.match('&'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "CONCAT",

    // $ANTLR start LPAREN
    mLPAREN: function()  {
        try {
            var _type = this.LPAREN;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:118:17: ( '(' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:118:19: '('
            this.match('('); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "LPAREN",

    // $ANTLR start RPAREN
    mRPAREN: function()  {
        try {
            var _type = this.RPAREN;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:119:17: ( ')' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:119:19: ')'
            this.match(')'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "RPAREN",

    // $ANTLR start LBRACKET
    mLBRACKET: function()  {
        try {
            var _type = this.LBRACKET;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:120:10: ( '{' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:120:12: '{'
            this.match('{'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "LBRACKET",

    // $ANTLR start RBRACKET
    mRBRACKET: function()  {
        try {
            var _type = this.RBRACKET;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:121:10: ( '}' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:121:12: '}'
            this.match('}'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "RBRACKET",

    // $ANTLR start COMMA
    mCOMMA: function()  {
        try {
            var _type = this.COMMA;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:122:17: ( ',' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:122:19: ','
            this.match(','); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "COMMA",

    // $ANTLR start PERCENT
    mPERCENT: function()  {
        try {
            var _type = this.PERCENT;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:123:17: ( '%' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:123:19: '%'
            this.match('%'); 



            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "PERCENT",

    // $ANTLR start VARIABLE
    mVARIABLE: function()  {
        try {
            var _type = this.VARIABLE;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:2: ( 'pv!' ( LETTER )+ )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:4: 'pv!' ( LETTER )+
            this.match("pv!"); 

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:10: ( LETTER )+
            var cnt4=0;
            loop4:
            do {
                var alt4=2;
                var LA4_0 = this.input.LA(1);

                if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:130:11: LETTER
                    this.mLETTER(); 


                    break;

                default :
                    if ( cnt4 >= 1 ) {
                        break loop4;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(4, this.input);
                        throw eee;
                }
                cnt4++;
            } while (true);




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "VARIABLE",

    // $ANTLR start FUNCNAME
    mFUNCNAME: function()  {
        try {
            var _type = this.FUNCNAME;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:2: ( ( '@' )? ( LETTER )+ )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:4: ( '@' )? ( LETTER )+
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:4: ( '@' )?
            var alt5=2;
            var LA5_0 = this.input.LA(1);

            if ( (LA5_0=='@') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:5: '@'
                    this.match('@'); 


                    break;

            }

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:10: ( LETTER )+
            var cnt6=0;
            loop6:
            do {
                var alt6=2;
                var LA6_0 = this.input.LA(1);

                if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:133:11: LETTER
                    this.mLETTER(); 


                    break;

                default :
                    if ( cnt6 >= 1 ) {
                        break loop6;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(6, this.input);
                        throw eee;
                }
                cnt6++;
            } while (true);




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "FUNCNAME",

    // $ANTLR start NUMBER
    mNUMBER: function()  {
        try {
            var _type = this.NUMBER;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:2: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:4: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:4: ( DIGIT )+
            var cnt7=0;
            loop7:
            do {
                var alt7=2;
                var LA7_0 = this.input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:5: DIGIT
                    this.mDIGIT(); 


                    break;

                default :
                    if ( cnt7 >= 1 ) {
                        break loop7;
                    }
                        var eee = new org.antlr.runtime.EarlyExitException(7, this.input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:13: ( '.' ( DIGIT )+ )?
            var alt9=2;
            var LA9_0 = this.input.LA(1);

            if ( (LA9_0=='.') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:14: '.' ( DIGIT )+
                    this.match('.'); 
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:18: ( DIGIT )+
                    var cnt8=0;
                    loop8:
                    do {
                        var alt8=2;
                        var LA8_0 = this.input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                        case 1 :
                            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:137:19: DIGIT
                            this.mDIGIT(); 


                            break;

                        default :
                            if ( cnt8 >= 1 ) {
                                break loop8;
                            }
                                var eee = new org.antlr.runtime.EarlyExitException(8, this.input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);



                    break;

            }




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "NUMBER",

    // $ANTLR start LETTER
    mLETTER: function()  {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            var alt10=2;
            var LA10_0 = this.input.LA(1);

            if ( ((LA10_0>='a' && LA10_0<='z')) ) {
                alt10=1;
            }
            else if ( ((LA10_0>='A' && LA10_0<='Z')) ) {
                alt10=2;
            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 10, 0, this.input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:4: ( 'a' .. 'z' )
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:4: ( 'a' .. 'z' )
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:5: 'a' .. 'z'
                    this.matchRange('a','z'); 





                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:17: ( 'A' .. 'Z' )
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:17: ( 'A' .. 'Z' )
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:142:18: 'A' .. 'Z'
                    this.matchRange('A','Z'); 





                    break;

            }
        }
        finally {
        }
    },
    // $ANTLR end "LETTER",

    // $ANTLR start DIGIT
    mDIGIT: function()  {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:2: ( ( '0' .. '9' ) )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:4: ( '0' .. '9' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:4: ( '0' .. '9' )
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:146:5: '0' .. '9'
            this.matchRange('0','9'); 






        }
        finally {
        }
    },
    // $ANTLR end "DIGIT",

    // $ANTLR start ESCAPE_SEQUENCE
    mESCAPE_SEQUENCE: function()  {
        try {
            // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:150:2: ( '\\\\' 't' | '\\\\' 'n' | '\\\\' '\\\"' | '\\\\' '\\'' | '\\\\' '\\\\' )
            var alt11=5;
            var LA11_0 = this.input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( this.input.LA(2) ) {
                case 't':
                    alt11=1;
                    break;
                case 'n':
                    alt11=2;
                    break;
                case '\"':
                    alt11=3;
                    break;
                case '\'':
                    alt11=4;
                    break;
                case '\\':
                    alt11=5;
                    break;
                default:
                    var nvae =
                        new org.antlr.runtime.NoViableAltException("", 11, 1, this.input);

                    throw nvae;
                }

            }
            else {
                var nvae =
                    new org.antlr.runtime.NoViableAltException("", 11, 0, this.input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:150:4: '\\\\' 't'
                    this.match('\\'); 
                    this.match('t'); 


                    break;
                case 2 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:151:4: '\\\\' 'n'
                    this.match('\\'); 
                    this.match('n'); 


                    break;
                case 3 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:152:4: '\\\\' '\\\"'
                    this.match('\\'); 
                    this.match('\"'); 


                    break;
                case 4 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:153:4: '\\\\' '\\''
                    this.match('\\'); 
                    this.match('\''); 


                    break;
                case 5 :
                    // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:154:4: '\\\\' '\\\\'
                    this.match('\\'); 
                    this.match('\\'); 


                    break;

            }
        }
        finally {
        }
    },
    // $ANTLR end "ESCAPE_SEQUENCE",

    mTokens: function() {
        // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:8: ( STRING | WHITESPACE | TRUE | FALSE | NOTEQ | LTEQ | GTEQ | AND | OR | NOT | EQ | LT | GT | EXP | MULT | DIV | ADD | SUB | CONCAT | LPAREN | RPAREN | LBRACKET | RBRACKET | COMMA | PERCENT | VARIABLE | FUNCNAME | NUMBER )
        var alt12=28;
        alt12 = this.dfa12.predict(this.input);
        switch (alt12) {
            case 1 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:10: STRING
                this.mSTRING(); 


                break;
            case 2 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:17: WHITESPACE
                this.mWHITESPACE(); 


                break;
            case 3 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:28: TRUE
                this.mTRUE(); 


                break;
            case 4 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:33: FALSE
                this.mFALSE(); 


                break;
            case 5 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:39: NOTEQ
                this.mNOTEQ(); 


                break;
            case 6 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:45: LTEQ
                this.mLTEQ(); 


                break;
            case 7 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:50: GTEQ
                this.mGTEQ(); 


                break;
            case 8 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:55: AND
                this.mAND(); 


                break;
            case 9 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:59: OR
                this.mOR(); 


                break;
            case 10 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:62: NOT
                this.mNOT(); 


                break;
            case 11 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:66: EQ
                this.mEQ(); 


                break;
            case 12 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:69: LT
                this.mLT(); 


                break;
            case 13 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:72: GT
                this.mGT(); 


                break;
            case 14 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:75: EXP
                this.mEXP(); 


                break;
            case 15 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:79: MULT
                this.mMULT(); 


                break;
            case 16 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:84: DIV
                this.mDIV(); 


                break;
            case 17 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:88: ADD
                this.mADD(); 


                break;
            case 18 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:92: SUB
                this.mSUB(); 


                break;
            case 19 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:96: CONCAT
                this.mCONCAT(); 


                break;
            case 20 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:103: LPAREN
                this.mLPAREN(); 


                break;
            case 21 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:110: RPAREN
                this.mRPAREN(); 


                break;
            case 22 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:117: LBRACKET
                this.mLBRACKET(); 


                break;
            case 23 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:126: RBRACKET
                this.mRBRACKET(); 


                break;
            case 24 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:135: COMMA
                this.mCOMMA(); 


                break;
            case 25 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:141: PERCENT
                this.mPERCENT(); 


                break;
            case 26 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:149: VARIABLE
                this.mVARIABLE(); 


                break;
            case 27 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:158: FUNCNAME
                this.mFUNCNAME(); 


                break;
            case 28 :
                // /home/kevin/workspace/hibernate/ExpHighlighter/src/Exp.g:1:167: NUMBER
                this.mNUMBER(); 


                break;

        }

    }

}, true); // important to pass true to overwrite default implementations

org.antlr.lang.augmentObject(ExpLexer, {
    DFA12_eotS:
        "\u0003\uffff\u0002\u0017\u0001\u0021\u0001\u0023\u0001\u0025\u0004"+
    "\uffff\u0001\u0026\u0009\uffff\u0001\u0017\u0001\uffff\u0002\u0017\u0001"+
    "\uffff\u0004\u0017\u0008\uffff\u0005\u0017\u0001\uffff\u0002\u0031\u0002"+
    "\u0017\u0001\uffff\u0002\u0034\u0001\uffff",
    DFA12_eofS:
        "\u0035\uffff",
    DFA12_minS:
        "\u0001\u0009\u0002\uffff\u0001\u0052\u0001\u0041\u0002\u003d\u0001"+
    "\u0026\u0004\uffff\u0001\u002a\u0009\uffff\u0001\u0076\u0001\uffff\u0001"+
    "\u0052\u0001\u0041\u0001\uffff\u0002\u0055\u0002\u004c\u0008\uffff\u0001"+
    "\u0021\u0002\u0045\u0002\u0053\u0001\uffff\u0002\u0041\u0002\u0045\u0001"+
    "\uffff\u0002\u0041\u0001\uffff",
    DFA12_maxS:
        "\u0001\u007d\u0002\uffff\u0001\u0072\u0001\u0061\u0001\u003e\u0001"+
    "\u003d\u0001\u0026\u0004\uffff\u0001\u002a\u0009\uffff\u0001\u0076\u0001"+
    "\uffff\u0001\u0072\u0001\u0061\u0001\uffff\u0002\u0075\u0002\u006c\u0008"+
    "\uffff\u0001\u0021\u0002\u0065\u0002\u0073\u0001\uffff\u0002\u007a\u0002"+
    "\u0065\u0001\uffff\u0002\u007a\u0001\uffff",
    DFA12_acceptS:
        "\u0001\uffff\u0001\u0001\u0001\u0002\u0005\uffff\u0001\u0009\u0001"+
    "\u000a\u0001\u000b\u0001\u000e\u0001\uffff\u0001\u0010\u0001\u0011\u0001"+
    "\u0012\u0001\u0014\u0001\u0015\u0001\u0016\u0001\u0017\u0001\u0018\u0001"+
    "\u0019\u0001\uffff\u0001\u001b\u0002\uffff\u0001\u001c\u0004\uffff\u0001"+
    "\u0005\u0001\u0006\u0001\u000c\u0001\u0007\u0001\u000d\u0001\u0008\u0001"+
    "\u0013\u0001\u000f\u0005\uffff\u0001\u001a\u0004\uffff\u0001\u0003\u0002"+
    "\uffff\u0001\u0004",
    DFA12_specialS:
        "\u0035\uffff}>",
    DFA12_transitionS: [
            "\u0002\u0002\u0002\uffff\u0001\u0002\u0012\uffff\u0001\u0002"+
            "\u0001\u0009\u0001\u0001\u0002\uffff\u0001\u0015\u0001\u0007"+
            "\u0001\uffff\u0001\u0010\u0001\u0011\u0001\u000c\u0001\u000e"+
            "\u0001\u0014\u0001\u000f\u0001\uffff\u0001\u000d\u000a\u001a"+
            "\u0002\uffff\u0001\u0005\u0001\u000a\u0001\u0006\u0001\uffff"+
            "\u0006\u0017\u0001\u0019\u000d\u0017\u0001\u0018\u0006\u0017"+
            "\u0003\uffff\u0001\u000b\u0002\uffff\u0005\u0017\u0001\u0004"+
            "\u0009\u0017\u0001\u0016\u0003\u0017\u0001\u0003\u0006\u0017"+
            "\u0001\u0012\u0001\u0008\u0001\u0013",
            "",
            "",
            "\u0001\u001c\u001f\uffff\u0001\u001b",
            "\u0001\u001e\u001f\uffff\u0001\u001d",
            "\u0001\u0020\u0001\u001f",
            "\u0001\u0022",
            "\u0001\u0024",
            "",
            "",
            "",
            "",
            "\u0001\u000b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u0027",
            "",
            "\u0001\u001c\u001f\uffff\u0001\u001b",
            "\u0001\u001e\u001f\uffff\u0001\u001d",
            "",
            "\u0001\u0029\u001f\uffff\u0001\u0028",
            "\u0001\u0029\u001f\uffff\u0001\u0028",
            "\u0001\u002b\u001f\uffff\u0001\u002a",
            "\u0001\u002b\u001f\uffff\u0001\u002a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\u0001\u002c",
            "\u0001\u002e\u001f\uffff\u0001\u002d",
            "\u0001\u002e\u001f\uffff\u0001\u002d",
            "\u0001\u0030\u001f\uffff\u0001\u002f",
            "\u0001\u0030\u001f\uffff\u0001\u002f",
            "",
            "\u001a\u0017\u0006\uffff\u001a\u0017",
            "\u001a\u0017\u0006\uffff\u001a\u0017",
            "\u0001\u0033\u001f\uffff\u0001\u0032",
            "\u0001\u0033\u001f\uffff\u0001\u0032",
            "",
            "\u001a\u0017\u0006\uffff\u001a\u0017",
            "\u001a\u0017\u0006\uffff\u001a\u0017",
            ""
    ]
});

org.antlr.lang.augmentObject(ExpLexer, {
    DFA12_eot:
        org.antlr.runtime.DFA.unpackEncodedString(ExpLexer.DFA12_eotS),
    DFA12_eof:
        org.antlr.runtime.DFA.unpackEncodedString(ExpLexer.DFA12_eofS),
    DFA12_min:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(ExpLexer.DFA12_minS),
    DFA12_max:
        org.antlr.runtime.DFA.unpackEncodedStringToUnsignedChars(ExpLexer.DFA12_maxS),
    DFA12_accept:
        org.antlr.runtime.DFA.unpackEncodedString(ExpLexer.DFA12_acceptS),
    DFA12_special:
        org.antlr.runtime.DFA.unpackEncodedString(ExpLexer.DFA12_specialS),
    DFA12_transition: (function() {
        var a = [],
            i,
            numStates = ExpLexer.DFA12_transitionS.length;
        for (i=0; i<numStates; i++) {
            a.push(org.antlr.runtime.DFA.unpackEncodedString(ExpLexer.DFA12_transitionS[i]));
        }
        return a;
    })()
});

ExpLexer.DFA12 = function(recognizer) {
    this.recognizer = recognizer;
    this.decisionNumber = 12;
    this.eot = ExpLexer.DFA12_eot;
    this.eof = ExpLexer.DFA12_eof;
    this.min = ExpLexer.DFA12_min;
    this.max = ExpLexer.DFA12_max;
    this.accept = ExpLexer.DFA12_accept;
    this.special = ExpLexer.DFA12_special;
    this.transition = ExpLexer.DFA12_transition;
};

org.antlr.lang.extend(ExpLexer.DFA12, org.antlr.runtime.DFA, {
    getDescription: function() {
        return "1:1: Tokens : ( STRING | WHITESPACE | TRUE | FALSE | NOTEQ | LTEQ | GTEQ | AND | OR | NOT | EQ | LT | GT | EXP | MULT | DIV | ADD | SUB | CONCAT | LPAREN | RPAREN | LBRACKET | RBRACKET | COMMA | PERCENT | VARIABLE | FUNCNAME | NUMBER );";
    },
    dummy: null
});
 
})();