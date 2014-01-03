// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g 2014-01-04 00:43:48

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
    public static final int FOCUS=15;
    public static final int UNE=23;
    public static final int VOIRAUSSI=24;
    public static final int POINT=32;
    public static final int THEME=22;
    public static final int COMBIEN=5;
    public static final int SOURCE=9;
    public static final int EOF=-1;
    public static final int EMAIL=14;
    public static final int MOT=28;
    public static final int RAPPELS=20;
    public static final int JOURS=17;
    public static final int AUTEUR=12;
    public static final int AT=25;
    public static final int RESUME=21;
    public static final int WS=10;
    public static final int PAGE=18;
    public static final int PARLER=8;
    public static final int OU=7;
    public static final int MOIS=27;
    public static final int PLUS=30;
    public static final int ET=6;
    public static final int VAR=33;
    public static final int PUBLIE=19;
    public static final int DATE=13;
    public static final int SELECT=4;
    public static final int NB=29;
    public static final int ARTICLE=11;
    public static final int GROSTITRES=16;
    public static final int ENTRE=26;
    public static final int PREMIER=31;

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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:4: ( ( ' ' | '\\t' | '\\r' | 'stop' ) | '\\n' )
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:6: ( ' ' | '\\t' | '\\r' | 'stop' )
                    {
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:6: ( ' ' | '\\t' | '\\r' | 'stop' )
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
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:7: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:12: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:19: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:26: 'stop'
                            {
                            match("stop"); 


                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:35:48: '\\n'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:37:9: ( 'article' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:37:11: 'article'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:38:8: ( 'auteur' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:38:10: 'auteur'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:39:6: ( 'date' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:39:8: 'date'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:40:7: ( 'email' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:40:9: 'email'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:41:7: ( 'focus' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:41:9: 'focus'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:42:12: ( 'gros titre' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:42:14: 'gros titre'
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

    // $ANTLR start "JOURS"
    public final void mJOURS() throws RecognitionException {
        try {
            int _type = JOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:43:7: ( 'jours' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:43:9: 'jours'
            {
            match("jours"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOURS"

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

    // $ANTLR start "PUBLIE"
    public final void mPUBLIE() throws RecognitionException {
        try {
            int _type = PUBLIE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:45:8: ( 'publie' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:45:10: 'publie'
            {
            match("publie"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIE"

    // $ANTLR start "RAPPELS"
    public final void mRAPPELS() throws RecognitionException {
        try {
            int _type = RAPPELS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:9: ( 'rappels' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:11: 'rappels'
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

    // $ANTLR start "RESUME"
    public final void mRESUME() throws RecognitionException {
        try {
            int _type = RESUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:47:8: ( 'resume' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:47:10: 'resume'
            {
            match("resume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESUME"

    // $ANTLR start "THEME"
    public final void mTHEME() throws RecognitionException {
        try {
            int _type = THEME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:48:7: ( 'theme' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:48:9: 'theme'
            {
            match("theme"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEME"

    // $ANTLR start "UNE"
    public final void mUNE() throws RecognitionException {
        try {
            int _type = UNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:49:5: ( 'une' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:49:7: 'une'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:11: ( 'voiraussi' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:13: 'voiraussi'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:4: ( '@' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:6: '@'
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

    // $ANTLR start "ENTRE"
    public final void mENTRE() throws RecognitionException {
        try {
            int _type = ENTRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:53:7: ( 'entre' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:53:9: 'entre'
            {
            match("entre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTRE"

    // $ANTLR start "MOIS"
    public final void mMOIS() throws RecognitionException {
        try {
            int _type = MOIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:6: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'sept' | 'octobre' | 'novembre' | 'décembre' )
            int alt3=12;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:8: 'janvier'
                    {
                    match("janvier"); 


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:20: 'février'
                    {
                    match("février"); 


                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:32: 'mars'
                    {
                    match("mars"); 


                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:41: 'avril'
                    {
                    match("avril"); 


                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:51: 'mai'
                    {
                    match("mai"); 


                    }
                    break;
                case 6 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:59: 'juin'
                    {
                    match("juin"); 


                    }
                    break;
                case 7 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:68: 'juillet'
                    {
                    match("juillet"); 


                    }
                    break;
                case 8 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:80: 'août'
                    {
                    match("août"); 


                    }
                    break;
                case 9 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:89: 'sept'
                    {
                    match("sept"); 


                    }
                    break;
                case 10 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:98: 'octobre'
                    {
                    match("octobre"); 


                    }
                    break;
                case 11 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:110: 'novembre'
                    {
                    match("novembre"); 


                    }
                    break;
                case 12 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:123: 'décembre'
                    {
                    match("décembre"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOIS"

    // $ANTLR start "MOT"
    public final void mMOT() throws RecognitionException {
        try {
            int _type = MOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:55:5: ( 'mot' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:55:7: 'mot'
            {
            match("mot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOT"

    // $ANTLR start "NB"
    public final void mNB() throws RecognitionException {
        try {
            int _type = NB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:56:4: ( ( '0' .. '9' )+ )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:56:6: ( '0' .. '9' )+
            {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:56:6: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:56:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "NB"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:57:6: ( 'plus' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:57:8: 'plus'
            {
            match("plus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PREMIER"
    public final void mPREMIER() throws RecognitionException {
        try {
            int _type = PREMIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:9: ( 'premier' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:11: 'premier'
            {
            match("premier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREMIER"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:60:7: ( '.' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:60:9: '.'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00A0' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:47: ( ( 'a' .. 'z' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
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
                case '-':
                    {
                    alt5=2;
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
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:48: ( 'a' .. 'z' )
            	    {
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:48: ( 'a' .. 'z' )
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:49: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:59: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:63: ( '\\u00a0' .. '\\u00ff' )
            	    {
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:63: ( '\\u00a0' .. '\\u00ff' )
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:64: '\\u00a0' .. '\\u00ff'
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
        // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:8: ( SELECT | COMBIEN | ET | OU | PARLER | SOURCE | WS | ARTICLE | AUTEUR | DATE | EMAIL | FOCUS | GROSTITRES | JOURS | PAGE | PUBLIE | RAPPELS | RESUME | THEME | UNE | VOIRAUSSI | AT | ENTRE | MOIS | MOT | NB | PLUS | PREMIER | POINT | VAR )
        int alt6=30;
        alt6 = dfa6.predict(input);
        switch (alt6) {
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
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:45: WS
                {
                mWS(); 

                }
                break;
            case 8 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:48: ARTICLE
                {
                mARTICLE(); 

                }
                break;
            case 9 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:56: AUTEUR
                {
                mAUTEUR(); 

                }
                break;
            case 10 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:63: DATE
                {
                mDATE(); 

                }
                break;
            case 11 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:68: EMAIL
                {
                mEMAIL(); 

                }
                break;
            case 12 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:74: FOCUS
                {
                mFOCUS(); 

                }
                break;
            case 13 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:80: GROSTITRES
                {
                mGROSTITRES(); 

                }
                break;
            case 14 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:91: JOURS
                {
                mJOURS(); 

                }
                break;
            case 15 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:97: PAGE
                {
                mPAGE(); 

                }
                break;
            case 16 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:102: PUBLIE
                {
                mPUBLIE(); 

                }
                break;
            case 17 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:109: RAPPELS
                {
                mRAPPELS(); 

                }
                break;
            case 18 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:117: RESUME
                {
                mRESUME(); 

                }
                break;
            case 19 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:124: THEME
                {
                mTHEME(); 

                }
                break;
            case 20 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:130: UNE
                {
                mUNE(); 

                }
                break;
            case 21 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:134: VOIRAUSSI
                {
                mVOIRAUSSI(); 

                }
                break;
            case 22 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:144: AT
                {
                mAT(); 

                }
                break;
            case 23 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:147: ENTRE
                {
                mENTRE(); 

                }
                break;
            case 24 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:153: MOIS
                {
                mMOIS(); 

                }
                break;
            case 25 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:158: MOT
                {
                mMOT(); 

                }
                break;
            case 26 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:162: NB
                {
                mNB(); 

                }
                break;
            case 27 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:165: PLUS
                {
                mPLUS(); 

                }
                break;
            case 28 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:170: PREMIER
                {
                mPREMIER(); 

                }
                break;
            case 29 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:178: POINT
                {
                mPOINT(); 

                }
                break;
            case 30 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:184: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA3_eotS =
        "\23\uffff";
    static final String DFA3_eofS =
        "\23\uffff";
    static final String DFA3_minS =
        "\2\141\1\uffff\1\141\1\157\5\uffff\2\151\2\uffff\1\154\4\uffff";
    static final String DFA3_maxS =
        "\1\163\1\165\1\uffff\1\141\1\166\5\uffff\1\151\1\162\2\uffff\1\156"+
        "\4\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\2\uffff\1\11\1\12\1\13\1\14\1\1\2\uffff\1\4\1\10\1"+
        "\uffff\1\3\1\5\1\6\1\7";
    static final String DFA3_specialS =
        "\23\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\2\uffff\1\10\1\uffff\1\2\3\uffff\1\1\2\uffff\1\3\1\7\1"+
            "\6\3\uffff\1\5",
            "\1\11\23\uffff\1\12",
            "",
            "\1\13",
            "\1\15\6\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\20\10\uffff\1\17",
            "",
            "",
            "\1\22\1\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "54:1: MOIS : ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'sept' | 'octobre' | 'novembre' | 'décembre' );";
        }
    }
    static final String DFA6_eotS =
        "\26\uffff\2\25\1\72\2\25\1\75\36\25\1\uffff\2\25\1\uffff\6\25\1"+
        "\146\21\25\1\171\1\25\1\173\1\174\10\25\1\u0085\1\25\1\u0087\1\25"+
        "\1\uffff\3\25\1\173\1\7\1\173\1\u008c\6\25\1\173\4\25\1\uffff\1"+
        "\173\2\uffff\4\25\1\u009b\1\u009c\2\25\1\uffff\1\25\1\uffff\3\25"+
        "\1\173\1\uffff\1\25\1\u00a4\1\25\1\uffff\1\u00a6\4\25\1\u00ab\4"+
        "\25\2\uffff\1\25\1\u00b1\1\u00b2\2\25\1\u00b5\1\25\1\uffff\1\25"+
        "\1\uffff\3\25\1\u00bb\1\uffff\1\25\1\u00bd\1\25\1\u00bf\1\173\2"+
        "\uffff\1\u00c0\1\u00c1\1\uffff\1\25\3\173\1\u00c3\1\uffff\1\25\1"+
        "\uffff\1\25\3\uffff\1\173\1\uffff\1\173\1\u00c6\1\uffff";
    static final String DFA6_eofS =
        "\u00c7\uffff";
    static final String DFA6_minS =
        "\1\11\6\55\1\uffff\10\55\1\uffff\2\55\3\uffff\1\151\1\155\1\55\1"+
        "\141\1\164\1\55\1\164\1\147\1\142\1\165\1\145\1\160\2\164\1\162"+
        "\1\u00fb\1\157\1\160\1\164\2\143\1\166\1\157\1\165\1\156\1\151\1"+
        "\160\1\163\2\145\1\151\1\164\1\166\1\154\1\162\1\142\1\uffff\1\151"+
        "\1\162\1\uffff\1\157\1\154\1\145\1\154\1\163\1\155\1\55\1\151\1"+
        "\145\1\151\1\164\1\160\1\164\2\145\1\165\1\162\1\163\1\162\1\166"+
        "\1\154\1\160\1\165\1\155\1\55\1\163\2\55\1\145\1\157\1\141\1\151"+
        "\1\154\1\145\1\142\1\145\1\55\1\151\1\55\1\151\1\uffff\1\143\1\165"+
        "\1\154\4\55\1\155\1\163\1\151\1\40\1\163\1\151\1\55\1\154\1\145"+
        "\1\155\1\145\1\uffff\1\55\2\uffff\1\155\1\151\1\165\1\145\2\55\2"+
        "\162\1\uffff\1\145\1\uffff\1\145\1\154\1\162\1\55\1\uffff\1\142"+
        "\1\55\1\145\1\uffff\1\55\2\145\1\154\1\145\1\55\1\142\1\162\1\163"+
        "\1\156\2\uffff\1\145\2\55\1\162\1\145\1\55\1\162\1\uffff\1\162\1"+
        "\uffff\1\162\1\164\1\163\1\55\1\uffff\1\162\1\55\1\163\2\55\2\uffff"+
        "\2\55\1\uffff\1\145\4\55\1\uffff\1\145\1\uffff\1\151\3\uffff\1\55"+
        "\1\uffff\2\55\1\uffff";
    static final String DFA6_maxS =
        "\7\u00ff\1\uffff\10\u00ff\1\uffff\2\u00ff\3\uffff\1\165\1\155\1"+
        "\u00ff\1\141\1\164\1\u00ff\1\164\1\162\1\142\1\165\1\145\1\160\2"+
        "\164\1\162\1\u00fb\1\157\1\160\1\164\2\143\1\166\1\157\1\165\1\156"+
        "\1\151\1\160\1\163\2\145\1\162\1\164\1\166\1\154\1\162\1\142\1\uffff"+
        "\1\151\1\162\1\uffff\1\157\1\154\1\145\1\154\1\163\1\155\1\u00ff"+
        "\1\151\1\145\1\151\1\164\1\160\1\164\2\145\1\165\1\162\1\163\1\162"+
        "\1\166\1\156\1\160\1\165\1\155\1\u00ff\1\163\2\u00ff\1\145\1\157"+
        "\1\141\1\151\1\154\1\145\1\142\1\145\1\u00ff\1\151\1\u00ff\1\151"+
        "\1\uffff\1\143\1\165\1\154\4\u00ff\1\155\1\163\1\151\1\40\1\163"+
        "\1\151\1\u00ff\1\154\1\145\1\155\1\145\1\uffff\1\u00ff\2\uffff\1"+
        "\155\1\151\1\165\1\145\2\u00ff\2\162\1\uffff\1\145\1\uffff\1\145"+
        "\1\154\1\162\1\u00ff\1\uffff\1\142\1\u00ff\1\145\1\uffff\1\u00ff"+
        "\2\145\1\154\1\145\1\u00ff\1\142\1\162\1\163\1\156\2\uffff\1\145"+
        "\2\u00ff\1\162\1\145\1\u00ff\1\162\1\uffff\1\162\1\uffff\1\162\1"+
        "\164\1\163\1\u00ff\1\uffff\1\162\1\u00ff\1\163\2\u00ff\2\uffff\2"+
        "\u00ff\1\uffff\1\145\4\u00ff\1\uffff\1\145\1\uffff\1\151\3\uffff"+
        "\1\u00ff\1\uffff\2\u00ff\1\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\7\10\uffff\1\26\2\uffff\1\32\1\35\1\36\44\uffff\1\3\2"+
        "\uffff\1\4\50\uffff\1\6\22\uffff\1\24\1\uffff\1\30\1\31\10\uffff"+
        "\1\17\1\uffff\1\33\4\uffff\1\12\3\uffff\1\15\12\uffff\1\13\1\27"+
        "\7\uffff\1\14\1\uffff\1\16\4\uffff\1\23\5\uffff\1\5\1\20\2\uffff"+
        "\1\11\5\uffff\1\22\1\uffff\1\1\1\uffff\1\2\1\34\1\10\1\uffff\1\21"+
        "\2\uffff\1\25";
    static final String DFA6_specialS =
        "\u00c7\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\7\2\uffff\1\7\22\uffff\1\7\15\uffff\1\24\1\uffff\12\23\6"+
            "\uffff\1\20\32\25\6\uffff\1\6\1\25\1\2\1\11\1\3\1\12\1\13\2"+
            "\25\1\14\2\25\1\21\1\22\1\4\1\5\1\25\1\15\1\10\1\16\1\17\1\1"+
            "\4\25\45\uffff\140\25",
            "\1\25\63\uffff\16\25\1\26\13\25\45\uffff\140\25",
            "\1\25\63\uffff\16\25\1\27\13\25\45\uffff\140\25",
            "\1\25\63\uffff\14\25\1\31\1\32\5\25\1\30\6\25\45\uffff\140"+
            "\25",
            "\1\25\63\uffff\2\25\1\34\21\25\1\33\5\25\45\uffff\140\25",
            "\1\25\63\uffff\1\35\12\25\1\37\5\25\1\40\2\25\1\36\5\25\45"+
            "\uffff\140\25",
            "\1\25\63\uffff\5\25\1\41\10\25\1\45\2\25\1\42\2\25\1\43\1\44"+
            "\4\25\45\uffff\140\25",
            "",
            "\1\25\63\uffff\4\25\1\47\16\25\1\46\6\25\45\uffff\140\25",
            "\1\25\63\uffff\1\50\31\25\45\uffff\111\25\1\51\26\25",
            "\1\25\63\uffff\16\25\1\52\13\25\45\uffff\111\25\1\53\26\25",
            "\1\25\63\uffff\21\25\1\54\10\25\45\uffff\140\25",
            "\1\25\63\uffff\1\56\15\25\1\55\5\25\1\57\5\25\45\uffff\140"+
            "\25",
            "\1\25\63\uffff\1\60\3\25\1\61\25\25\45\uffff\140\25",
            "\1\25\63\uffff\7\25\1\62\22\25\45\uffff\140\25",
            "\1\25\63\uffff\15\25\1\63\14\25\45\uffff\140\25",
            "",
            "\1\25\63\uffff\1\64\15\25\1\65\13\25\45\uffff\140\25",
            "\1\25\63\uffff\16\25\1\66\13\25\45\uffff\140\25",
            "",
            "",
            "",
            "\1\70\13\uffff\1\67",
            "\1\71",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\73",
            "\1\74",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\76",
            "\1\100\12\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\130\10\uffff\1\127",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165\1\uffff\1\164",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\172",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u0086",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "",
            "\1\u00a3",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u00a5",
            "",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\1\u00b0",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u00b3",
            "\1\u00b4",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "",
            "\1\u00bc",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\u00be",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "",
            "",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "",
            "\1\u00c2",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "",
            "",
            "",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
            "\1\25\63\uffff\32\25\45\uffff\140\25",
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
            return "1:1: Tokens : ( SELECT | COMBIEN | ET | OU | PARLER | SOURCE | WS | ARTICLE | AUTEUR | DATE | EMAIL | FOCUS | GROSTITRES | JOURS | PAGE | PUBLIE | RAPPELS | RESUME | THEME | UNE | VOIRAUSSI | AT | ENTRE | MOIS | MOT | NB | PLUS | PREMIER | POINT | VAR );";
        }
    }
 

}