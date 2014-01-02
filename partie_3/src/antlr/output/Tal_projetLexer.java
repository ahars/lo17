// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g 2014-01-02 21:14:26

package antlr.output;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_projetLexer.java
 */


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_projetLexer extends Lexer {
    public static final int FOCUS=16;
    public static final int UNE=20;
    public static final int VOIRAUSSI=21;
    public static final int POINT=24;
    public static final int COMBIEN=5;
    public static final int SOURCE=9;
    public static final int EOF=-1;
    public static final int EMAIL=15;
    public static final int RAPPELS=19;
    public static final int AUTEUR=13;
    public static final int AT=22;
    public static final int WS=11;
    public static final int PAGE=18;
    public static final int PARLER=8;
    public static final int OU=7;
    public static final int VAR=25;
    public static final int ET=6;
    public static final int DATE=14;
    public static final int SELECT=4;
    public static final int NB=23;
    public static final int ARTICLE=12;
    public static final int GROSTITRES=17;
    public static final int TEMPS=10;

    // delegates
    // delegators

    public Tal_projetLexer() {;} 
    public Tal_projetLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Tal_projetLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:29:8: ( 'vouloir' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:29:10: 'vouloir'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:30:9: ( 'combien' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:30:11: 'combien'
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

    // $ANTLR start "ET"
    public final void mET() throws RecognitionException {
        try {
            int _type = ET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:31:4: ( 'et' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:31:6: 'et'
            {
            match("et"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ET"

    // $ANTLR start "OU"
    public final void mOU() throws RecognitionException {
        try {
            int _type = OU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:32:4: ( 'ou' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:32:6: 'ou'
            {
            match("ou"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OU"

    // $ANTLR start "PARLER"
    public final void mPARLER() throws RecognitionException {
        try {
            int _type = PARLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:33:8: ( 'parler' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:33:10: 'parler'
            {
            match("parler"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARLER"

    // $ANTLR start "SOURCE"
    public final void mSOURCE() throws RecognitionException {
        try {
            int _type = SOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:8: ( 'afp' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:10: 'afp'
            {
            match("afp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOURCE"

    // $ANTLR start "TEMPS"
    public final void mTEMPS() throws RecognitionException {
        try {
            int _type = TEMPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:7: ( 'même temps' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:9: 'même temps'
            {
            match("même temps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:4: ( ( ' ' | '\\t' | '\\r' | 'stop' ) | '\\n' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\t'||LA2_0=='\r'||LA2_0==' '||LA2_0=='s') ) {
                alt2=1;
            }
            else if ( (LA2_0=='\n') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:6: ( ' ' | '\\t' | '\\r' | 'stop' )
                    {
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:6: ( ' ' | '\\t' | '\\r' | 'stop' )
                    int alt1=4;
                    switch ( input.LA(1) ) {
                    case ' ':
                        {
                        alt1=1;
                        }
                        break;
                    case '\t':
                        {
                        alt1=2;
                        }
                        break;
                    case '\r':
                        {
                        alt1=3;
                        }
                        break;
                    case 's':
                        {
                        alt1=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:7: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:12: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:19: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:26: 'stop'
                            {
                            match("stop"); 


                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:48: '\\n'
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

    // $ANTLR start "ARTICLE"
    public final void mARTICLE() throws RecognitionException {
        try {
            int _type = ARTICLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:38:9: ( 'article' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:38:11: 'article'
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

    // $ANTLR start "AUTEUR"
    public final void mAUTEUR() throws RecognitionException {
        try {
            int _type = AUTEUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:39:8: ( 'auteur' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:39:10: 'auteur'
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

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:40:6: ( 'date' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:40:8: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "EMAIL"
    public final void mEMAIL() throws RecognitionException {
        try {
            int _type = EMAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:41:7: ( 'email' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:41:9: 'email'
            {
            match("email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMAIL"

    // $ANTLR start "FOCUS"
    public final void mFOCUS() throws RecognitionException {
        try {
            int _type = FOCUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:42:7: ( 'focus' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:42:9: 'focus'
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

    // $ANTLR start "GROSTITRES"
    public final void mGROSTITRES() throws RecognitionException {
        try {
            int _type = GROSTITRES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:43:12: ( 'gros titre' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:43:14: 'gros titre'
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

    // $ANTLR start "PAGE"
    public final void mPAGE() throws RecognitionException {
        try {
            int _type = PAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:44:6: ( 'page' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:44:8: 'page'
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

    // $ANTLR start "RAPPELS"
    public final void mRAPPELS() throws RecognitionException {
        try {
            int _type = RAPPELS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:45:9: ( 'rappels' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:45:11: 'rappels'
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

    // $ANTLR start "UNE"
    public final void mUNE() throws RecognitionException {
        try {
            int _type = UNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:5: ( 'une' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:7: 'une'
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

    // $ANTLR start "VOIRAUSSI"
    public final void mVOIRAUSSI() throws RecognitionException {
        try {
            int _type = VOIRAUSSI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:47:11: ( 'voiraussi' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:47:13: 'voiraussi'
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

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:49:4: ( '@' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:49:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "NB"
    public final void mNB() throws RecognitionException {
        try {
            int _type = NB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:4: ( ( '0' .. '9' )+ )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:6: ( '0' .. '9' )+
            {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:6: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NB"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:7: ( '.' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00A0' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:47: ( ( 'a' .. 'z' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
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
                    alt4=1;
                    }
                    break;
                case '-':
                    {
                    alt4=2;
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
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:48: ( 'a' .. 'z' )
            	    {
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:48: ( 'a' .. 'z' )
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:49: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:59: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:63: ( '\\u00a0' .. '\\u00ff' )
            	    {
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:63: ( '\\u00a0' .. '\\u00ff' )
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:64: '\\u00a0' .. '\\u00ff'
            	    {
            	    matchRange('\u00A0','\u00FF'); 

            	    }


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
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:8: ( SELECT | COMBIEN | ET | OU | PARLER | SOURCE | TEMPS | WS | ARTICLE | AUTEUR | DATE | EMAIL | FOCUS | GROSTITRES | PAGE | RAPPELS | UNE | VOIRAUSSI | AT | NB | POINT | VAR )
        int alt5=22;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:10: SELECT
                {
                mSELECT(); 

                }
                break;
            case 2 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:17: COMBIEN
                {
                mCOMBIEN(); 

                }
                break;
            case 3 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:25: ET
                {
                mET(); 

                }
                break;
            case 4 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:28: OU
                {
                mOU(); 

                }
                break;
            case 5 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:31: PARLER
                {
                mPARLER(); 

                }
                break;
            case 6 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:38: SOURCE
                {
                mSOURCE(); 

                }
                break;
            case 7 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:45: TEMPS
                {
                mTEMPS(); 

                }
                break;
            case 8 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:51: WS
                {
                mWS(); 

                }
                break;
            case 9 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:54: ARTICLE
                {
                mARTICLE(); 

                }
                break;
            case 10 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:62: AUTEUR
                {
                mAUTEUR(); 

                }
                break;
            case 11 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:69: DATE
                {
                mDATE(); 

                }
                break;
            case 12 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:74: EMAIL
                {
                mEMAIL(); 

                }
                break;
            case 13 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:80: FOCUS
                {
                mFOCUS(); 

                }
                break;
            case 14 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:86: GROSTITRES
                {
                mGROSTITRES(); 

                }
                break;
            case 15 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:97: PAGE
                {
                mPAGE(); 

                }
                break;
            case 16 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:102: RAPPELS
                {
                mRAPPELS(); 

                }
                break;
            case 17 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:110: UNE
                {
                mUNE(); 

                }
                break;
            case 18 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:114: VOIRAUSSI
                {
                mVOIRAUSSI(); 

                }
                break;
            case 19 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:124: AT
                {
                mAT(); 

                }
                break;
            case 20 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:127: NB
                {
                mNB(); 

                }
                break;
            case 21 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:130: POINT
                {
                mPOINT(); 

                }
                break;
            case 22 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:136: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\23\uffff\2\22\1\46\1\22\1\50\16\22\1\uffff\1\22\1\uffff\2\22\1"+
        "\73\10\22\1\104\5\22\1\112\1\uffff\3\22\1\10\1\116\3\22\1\uffff"+
        "\3\22\1\125\1\22\1\uffff\2\22\2\uffff\1\131\1\uffff\4\22\1\uffff"+
        "\1\136\1\22\1\140\1\uffff\1\22\1\142\1\22\1\144\1\uffff\1\145\1"+
        "\uffff\1\146\1\uffff\1\22\3\uffff\1\150\1\uffff";
    static final String DFA5_eofS =
        "\151\uffff";
    static final String DFA5_minS =
        "\1\11\7\55\1\uffff\6\55\4\uffff\1\151\1\155\1\55\1\141\1\55\1\147"+
        "\1\160\2\164\1\155\1\157\1\164\1\143\1\157\1\160\1\145\1\154\1\162"+
        "\1\142\1\uffff\1\151\1\uffff\1\154\1\145\1\55\1\151\2\145\1\160"+
        "\1\145\1\165\1\163\1\160\1\55\1\157\1\141\1\151\1\154\1\145\1\55"+
        "\1\uffff\1\143\1\165\1\40\2\55\1\163\1\40\1\145\1\uffff\1\151\1"+
        "\165\1\145\1\55\1\162\1\uffff\1\154\1\162\2\uffff\1\55\1\uffff\1"+
        "\154\1\162\1\163\1\156\1\uffff\1\55\1\145\1\55\1\uffff\1\163\1\55"+
        "\1\163\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\151\3\uffff\1\55"+
        "\1\uffff";
    static final String DFA5_maxS =
        "\10\u00ff\1\uffff\6\u00ff\4\uffff\1\165\1\155\1\u00ff\1\141\1\u00ff"+
        "\1\162\1\160\2\164\1\155\1\157\1\164\1\143\1\157\1\160\1\145\1\154"+
        "\1\162\1\142\1\uffff\1\151\1\uffff\1\154\1\145\1\u00ff\1\151\2\145"+
        "\1\160\1\145\1\165\1\163\1\160\1\u00ff\1\157\1\141\1\151\1\154\1"+
        "\145\1\u00ff\1\uffff\1\143\1\165\1\40\2\u00ff\1\163\1\40\1\145\1"+
        "\uffff\1\151\1\165\1\145\1\u00ff\1\162\1\uffff\1\154\1\162\2\uffff"+
        "\1\u00ff\1\uffff\1\154\1\162\1\163\1\156\1\uffff\1\u00ff\1\145\1"+
        "\u00ff\1\uffff\1\163\1\u00ff\1\163\1\u00ff\1\uffff\1\u00ff\1\uffff"+
        "\1\u00ff\1\uffff\1\151\3\uffff\1\u00ff\1\uffff";
    static final String DFA5_acceptS =
        "\10\uffff\1\10\6\uffff\1\23\1\24\1\25\1\26\23\uffff\1\3\1\uffff"+
        "\1\4\22\uffff\1\6\10\uffff\1\21\5\uffff\1\17\2\uffff\1\7\1\13\1"+
        "\uffff\1\16\4\uffff\1\14\3\uffff\1\15\4\uffff\1\5\1\uffff\1\12\1"+
        "\uffff\1\1\1\uffff\1\2\1\11\1\20\1\uffff\1\22";
    static final String DFA5_specialS =
        "\151\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\10\2\uffff\1\10\22\uffff\1\10\15\uffff\1\21\1\uffff\12\20"+
            "\6\uffff\1\17\32\22\6\uffff\1\6\1\22\1\2\1\12\1\3\1\13\1\14"+
            "\5\22\1\7\1\22\1\4\1\5\1\22\1\15\1\11\1\22\1\16\1\1\4\22\45"+
            "\uffff\140\22",
            "\1\22\63\uffff\16\22\1\23\13\22\45\uffff\140\22",
            "\1\22\63\uffff\16\22\1\24\13\22\45\uffff\140\22",
            "\1\22\63\uffff\14\22\1\26\6\22\1\25\6\22\45\uffff\140\22",
            "\1\22\63\uffff\24\22\1\27\5\22\45\uffff\140\22",
            "\1\22\63\uffff\1\30\31\22\45\uffff\140\22",
            "\1\22\63\uffff\5\22\1\31\13\22\1\32\2\22\1\33\5\22\45\uffff"+
            "\140\22",
            "\1\22\63\uffff\32\22\45\uffff\112\22\1\34\25\22",
            "",
            "\1\22\63\uffff\23\22\1\35\6\22\45\uffff\140\22",
            "\1\22\63\uffff\1\36\31\22\45\uffff\140\22",
            "\1\22\63\uffff\16\22\1\37\13\22\45\uffff\140\22",
            "\1\22\63\uffff\21\22\1\40\10\22\45\uffff\140\22",
            "\1\22\63\uffff\1\41\31\22\45\uffff\140\22",
            "\1\22\63\uffff\15\22\1\42\14\22\45\uffff\140\22",
            "",
            "",
            "",
            "",
            "\1\44\13\uffff\1\43",
            "\1\45",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\47",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\52\12\uffff\1\51",
            "\1\53",
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
            "\1\67",
            "",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "",
            "",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\137",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "",
            "\1\141",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "\1\143",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            "",
            "\1\147",
            "",
            "",
            "",
            "\1\22\63\uffff\32\22\45\uffff\140\22",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | COMBIEN | ET | OU | PARLER | SOURCE | TEMPS | WS | ARTICLE | AUTEUR | DATE | EMAIL | FOCUS | GROSTITRES | PAGE | RAPPELS | UNE | VOIRAUSSI | AT | NB | POINT | VAR );";
        }
    }
 

}