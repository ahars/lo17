// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g 2013-11-29 00:33:36
package antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_tp04Lexer extends Lexer {
    public static final int FOCUS=9;
    public static final int PAGE=7;
    public static final int WS=17;
    public static final int UNE=8;
    public static final int VOIRAUSSI=11;
    public static final int POINT=16;
    public static final int COMBIEN=5;
    public static final int CONTENIR=15;
    public static final int CONJ=14;
    public static final int VAR=18;
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int RAPPELS=10;
    public static final int ARTICLE=6;
    public static final int AUTEUR=13;
    public static final int GROSTITRES=12;

    // delegates
    // delegators

    public Tal_tp04Lexer() {;} 
    public Tal_tp04Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Tal_tp04Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:6:8: ( 'vouloir' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:6:10: 'vouloir'
            {
            match("vouloir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "COMBIEN"
    public final void mCOMBIEN() throws RecognitionException {
        try {
            int _type = COMBIEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:7:9: ( 'combien' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:7:11: 'combien'
            {
            match("combien"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMBIEN"

    // $ANTLR start "ARTICLE"
    public final void mARTICLE() throws RecognitionException {
        try {
            int _type = ARTICLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:8:9: ( 'article' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:8:11: 'article'
            {
            match("article"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARTICLE"

    // $ANTLR start "PAGE"
    public final void mPAGE() throws RecognitionException {
        try {
            int _type = PAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:9:6: ( 'page' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:9:8: 'page'
            {
            match("page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAGE"

    // $ANTLR start "UNE"
    public final void mUNE() throws RecognitionException {
        try {
            int _type = UNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:10:5: ( 'une' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:10:7: 'une'
            {
            match("une"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNE"

    // $ANTLR start "FOCUS"
    public final void mFOCUS() throws RecognitionException {
        try {
            int _type = FOCUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:11:7: ( 'focus' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:11:9: 'focus'
            {
            match("focus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOCUS"

    // $ANTLR start "RAPPELS"
    public final void mRAPPELS() throws RecognitionException {
        try {
            int _type = RAPPELS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:12:9: ( 'rappels' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:12:11: 'rappels'
            {
            match("rappels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAPPELS"

    // $ANTLR start "VOIRAUSSI"
    public final void mVOIRAUSSI() throws RecognitionException {
        try {
            int _type = VOIRAUSSI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:13:11: ( 'voiraussi' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:13:13: 'voiraussi'
            {
            match("voiraussi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOIRAUSSI"

    // $ANTLR start "GROSTITRES"
    public final void mGROSTITRES() throws RecognitionException {
        try {
            int _type = GROSTITRES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:14:12: ( 'gros titre' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:14:14: 'gros titre'
            {
            match("gros titre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROSTITRES"

    // $ANTLR start "AUTEUR"
    public final void mAUTEUR() throws RecognitionException {
        try {
            int _type = AUTEUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:15:8: ( 'auteur' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:15:10: 'auteur'
            {
            match("auteur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTEUR"

    // $ANTLR start "CONJ"
    public final void mCONJ() throws RecognitionException {
        try {
            int _type = CONJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:16:6: ( 'et' | 'ou' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='e') ) {
                alt1=1;
            }
            else if ( (LA1_0=='o') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:16:8: 'et'
                    {
                    match("et"); 


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:16:15: 'ou'
                    {
                    match("ou"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONJ"

    // $ANTLR start "CONTENIR"
    public final void mCONTENIR() throws RecognitionException {
        try {
            int _type = CONTENIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:17:10: ( 'contenir' | 'parler' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='c') ) {
                alt2=1;
            }
            else if ( (LA2_0=='p') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:17:12: 'contenir'
                    {
                    match("contenir"); 


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:17:25: 'parler'
                    {
                    match("parler"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTENIR"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:18:7: ( '.' | '?' )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:
            {
            if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
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
    // $ANTLR end "POINT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:4: ( ( ' ' | '\\t' | '\\r' | 'stop' | 'qui' | 'dont' ) | '\\n' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' '||LA4_0=='d'||LA4_0=='q'||LA4_0=='s') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\n') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:6: ( ' ' | '\\t' | '\\r' | 'stop' | 'qui' | 'dont' )
                    {
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:6: ( ' ' | '\\t' | '\\r' | 'stop' | 'qui' | 'dont' )
                    int alt3=6;
                    switch ( input.LA(1) ) {
                    case ' ':
                        {
                        alt3=1;
                        }
                        break;
                    case '\t':
                        {
                        alt3=2;
                        }
                        break;
                    case '\r':
                        {
                        alt3=3;
                        }
                        break;
                    case 's':
                        {
                        alt3=4;
                        }
                        break;
                    case 'q':
                        {
                        alt3=5;
                        }
                        break;
                    case 'd':
                        {
                        alt3=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:7: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:12: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:19: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:26: 'stop'
                            {
                            match("stop"); 


                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:35: 'qui'
                            {
                            match("qui"); 


                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:43: 'dont'
                            {
                            match("dont"); 


                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:65: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00A0' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt5=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt5=2;
                    }
                    break;
                case '-':
                    {
                    alt5=3;
                    }
                    break;
                case '\u00A0':
                case '\u00A1':
                case '\u00A2':
                case '\u00A3':
                case '\u00A4':
                case '\u00A5':
                case '\u00A6':
                case '\u00A7':
                case '\u00A8':
                case '\u00A9':
                case '\u00AA':
                case '\u00AB':
                case '\u00AC':
                case '\u00AD':
                case '\u00AE':
                case '\u00AF':
                case '\u00B0':
                case '\u00B1':
                case '\u00B2':
                case '\u00B3':
                case '\u00B4':
                case '\u00B5':
                case '\u00B6':
                case '\u00B7':
                case '\u00B8':
                case '\u00B9':
                case '\u00BA':
                case '\u00BB':
                case '\u00BC':
                case '\u00BD':
                case '\u00BE':
                case '\u00BF':
                case '\u00C0':
                case '\u00C1':
                case '\u00C2':
                case '\u00C3':
                case '\u00C4':
                case '\u00C5':
                case '\u00C6':
                case '\u00C7':
                case '\u00C8':
                case '\u00C9':
                case '\u00CA':
                case '\u00CB':
                case '\u00CC':
                case '\u00CD':
                case '\u00CE':
                case '\u00CF':
                case '\u00D0':
                case '\u00D1':
                case '\u00D2':
                case '\u00D3':
                case '\u00D4':
                case '\u00D5':
                case '\u00D6':
                case '\u00D7':
                case '\u00D8':
                case '\u00D9':
                case '\u00DA':
                case '\u00DB':
                case '\u00DC':
                case '\u00DD':
                case '\u00DE':
                case '\u00DF':
                case '\u00E0':
                case '\u00E1':
                case '\u00E2':
                case '\u00E3':
                case '\u00E4':
                case '\u00E5':
                case '\u00E6':
                case '\u00E7':
                case '\u00E8':
                case '\u00E9':
                case '\u00EA':
                case '\u00EB':
                case '\u00EC':
                case '\u00ED':
                case '\u00EE':
                case '\u00EF':
                case '\u00F0':
                case '\u00F1':
                case '\u00F2':
                case '\u00F3':
                case '\u00F4':
                case '\u00F5':
                case '\u00F6':
                case '\u00F7':
                case '\u00F8':
                case '\u00F9':
                case '\u00FA':
                case '\u00FB':
                case '\u00FC':
                case '\u00FD':
                case '\u00FE':
                case '\u00FF':
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:48: ( 'a' .. 'z' )
            	    {
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:48: ( 'a' .. 'z' )
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:49: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:59: ( '0' .. '9' )
            	    {
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:59: ( '0' .. '9' )
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:60: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:70: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 4 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:74: ( '\\u00a0' .. '\\u00ff' )
            	    {
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:74: ( '\\u00a0' .. '\\u00ff' )
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:20:75: '\\u00a0' .. '\\u00ff'
            	    {
            	    matchRange('\u00A0','\u00FF'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:8: ( SELECT | COMBIEN | ARTICLE | PAGE | UNE | FOCUS | RAPPELS | VOIRAUSSI | GROSTITRES | AUTEUR | CONJ | CONTENIR | POINT | WS | VAR )
        int alt6=15;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:10: SELECT
                {
                mSELECT(); 

                }
                break;
            case 2 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:17: COMBIEN
                {
                mCOMBIEN(); 

                }
                break;
            case 3 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:25: ARTICLE
                {
                mARTICLE(); 

                }
                break;
            case 4 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:33: PAGE
                {
                mPAGE(); 

                }
                break;
            case 5 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:38: UNE
                {
                mUNE(); 

                }
                break;
            case 6 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:42: FOCUS
                {
                mFOCUS(); 

                }
                break;
            case 7 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:48: RAPPELS
                {
                mRAPPELS(); 

                }
                break;
            case 8 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:56: VOIRAUSSI
                {
                mVOIRAUSSI(); 

                }
                break;
            case 9 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:66: GROSTITRES
                {
                mGROSTITRES(); 

                }
                break;
            case 10 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:77: AUTEUR
                {
                mAUTEUR(); 

                }
                break;
            case 11 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:84: CONJ
                {
                mCONJ(); 

                }
                break;
            case 12 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:89: CONTENIR
                {
                mCONTENIR(); 

                }
                break;
            case 13 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:98: POINT
                {
                mPOINT(); 

                }
                break;
            case 14 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:104: WS
                {
                mWS(); 

                }
                break;
            case 15 :
                // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:1:107: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\21\uffff\11\20\2\53\13\20\1\67\3\20\1\uffff\1\20\1\14\7\20\1\103"+
        "\1\20\1\uffff\3\20\2\14\6\20\1\uffff\1\20\1\117\1\20\1\uffff\5\20"+
        "\1\126\1\127\1\uffff\1\20\1\131\1\20\1\133\1\20\1\135\2\uffff\1"+
        "\136\1\uffff\1\20\1\uffff\1\127\2\uffff\1\140\1\uffff";
    static final String DFA6_eofS =
        "\141\uffff";
    static final String DFA6_minS =
        "\1\11\12\55\2\uffff\3\55\1\uffff\1\151\1\155\2\164\1\147\1\145\1"+
        "\143\1\160\1\157\2\55\1\157\1\151\1\156\1\154\1\162\1\142\1\164"+
        "\1\151\2\145\1\154\1\55\1\165\1\160\1\163\1\uffff\1\160\1\55\1\164"+
        "\1\157\1\141\1\151\1\145\1\143\1\165\1\55\1\145\1\uffff\1\163\1"+
        "\145\1\40\2\55\1\151\1\165\1\145\1\156\1\154\1\162\1\uffff\1\162"+
        "\1\55\1\154\1\uffff\1\162\1\163\1\156\1\151\1\145\2\55\1\uffff\1"+
        "\163\1\55\1\163\1\55\1\162\1\55\2\uffff\1\55\1\uffff\1\151\1\uffff"+
        "\1\55\2\uffff\1\55\1\uffff";
    static final String DFA6_maxS =
        "\13\u00ff\2\uffff\3\u00ff\1\uffff\1\165\1\156\2\164\1\162\1\145"+
        "\1\143\1\160\1\157\2\u00ff\1\157\1\151\1\156\1\154\1\162\1\142\1"+
        "\164\1\151\2\145\1\154\1\u00ff\1\165\1\160\1\163\1\uffff\1\160\1"+
        "\u00ff\1\164\1\157\1\141\1\151\1\145\1\143\1\165\1\u00ff\1\145\1"+
        "\uffff\1\163\1\145\1\40\2\u00ff\1\151\1\165\1\145\1\156\1\154\1"+
        "\162\1\uffff\1\162\1\u00ff\1\154\1\uffff\1\162\1\163\1\156\1\151"+
        "\1\145\2\u00ff\1\uffff\1\163\1\u00ff\1\163\1\u00ff\1\162\1\u00ff"+
        "\2\uffff\1\u00ff\1\uffff\1\151\1\uffff\1\u00ff\2\uffff\1\u00ff\1"+
        "\uffff";
    static final String DFA6_acceptS =
        "\13\uffff\1\15\1\16\3\uffff\1\17\32\uffff\1\13\13\uffff\1\5\13\uffff"+
        "\1\4\3\uffff\1\11\7\uffff\1\6\6\uffff\1\12\1\14\1\uffff\1\1\1\uffff"+
        "\1\2\1\uffff\1\3\1\7\1\uffff\1\10";
    static final String DFA6_specialS =
        "\141\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\15\uffff\1\13\20\uffff\1\13"+
            "\1\uffff\32\20\6\uffff\1\3\1\20\1\2\1\17\1\11\1\6\1\10\7\20"+
            "\1\12\1\4\1\16\1\7\1\15\1\20\1\5\1\1\4\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\16\20\1\21\13\20\45\uffff\140"+
            "\20",
            "\1\20\2\uffff\12\20\47\uffff\16\20\1\22\13\20\45\uffff\140"+
            "\20",
            "\1\20\2\uffff\12\20\47\uffff\21\20\1\23\2\20\1\24\5\20\45\uffff"+
            "\140\20",
            "\1\20\2\uffff\12\20\47\uffff\1\25\31\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\15\20\1\26\14\20\45\uffff\140"+
            "\20",
            "\1\20\2\uffff\12\20\47\uffff\16\20\1\27\13\20\45\uffff\140"+
            "\20",
            "\1\20\2\uffff\12\20\47\uffff\1\30\31\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\21\20\1\31\10\20\45\uffff\140"+
            "\20",
            "\1\20\2\uffff\12\20\47\uffff\23\20\1\32\6\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\24\20\1\33\5\20\45\uffff\140\20",
            "",
            "",
            "\1\20\2\uffff\12\20\47\uffff\23\20\1\34\6\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\24\20\1\35\5\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\16\20\1\36\13\20\45\uffff\140"+
            "\20",
            "",
            "\1\40\13\uffff\1\37",
            "\1\41\1\42",
            "\1\43",
            "\1\44",
            "\1\45\12\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "",
            "\1\130",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\132",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "\1\134",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "",
            "",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "",
            "\1\137",
            "",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            "",
            "",
            "\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | COMBIEN | ARTICLE | PAGE | UNE | FOCUS | RAPPELS | VOIRAUSSI | GROSTITRES | AUTEUR | CONJ | CONTENIR | POINT | WS | VAR );";
        }
    }
 

}