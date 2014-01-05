// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g 2014-01-05 18:56:22

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
    public static final int POINT=29;
    public static final int THEME=18;
    public static final int COMBIEN=5;
    public static final int EOF=-1;
    public static final int EMAIL=13;
    public static final int MOT=25;
    public static final int JOURS=14;
    public static final int AUTEUR=11;
    public static final int AT=22;
    public static final int AUJOURDHUI=21;
    public static final int RESUME=17;
    public static final int WS=9;
    public static final int PAGE=15;
    public static final int RUBRIQUE=20;
    public static final int PARLER=8;
    public static final int OU=7;
    public static final int MOIS=24;
    public static final int PLUS=27;
    public static final int ET=6;
    public static final int VAR=30;
    public static final int PUBLIE=16;
    public static final int DATE=12;
    public static final int TITRE=19;
    public static final int SELECT=4;
    public static final int NB=26;
    public static final int ARTICLE=10;
    public static final int ENTRE=23;
    public static final int PREMIER=28;

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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:4: ( ( ' ' | '\\t' | '\\r' | 'stop' ) | '\\n' )
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:6: ( ' ' | '\\t' | '\\r' | 'stop' )
                    {
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:6: ( ' ' | '\\t' | '\\r' | 'stop' )
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
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:7: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:13: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:20: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:27: 'stop'
                            {
                            match("stop"); 


                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:34:49: '\\n'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:9: ( 'article' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:36:11: 'article'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:37:8: ( 'auteur' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:37:10: 'auteur'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:38:6: ( 'date' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:38:8: 'date'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:39:7: ( 'email' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:39:9: 'email'
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

    // $ANTLR start "JOURS"
    public final void mJOURS() throws RecognitionException {
        try {
            int _type = JOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:40:7: ( 'jours' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:40:9: 'jours'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:41:6: ( 'page' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:41:8: 'page'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:42:8: ( 'publie' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:42:10: 'publie'
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

    // $ANTLR start "RESUME"
    public final void mRESUME() throws RecognitionException {
        try {
            int _type = RESUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:43:8: ( 'resume' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:43:10: 'resume'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:44:7: ( 'theme' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:44:9: 'theme'
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

    // $ANTLR start "TITRE"
    public final void mTITRE() throws RecognitionException {
        try {
            int _type = TITRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:45:7: ( 'titre' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:45:9: 'titre'
            {
            match("titre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TITRE"

    // $ANTLR start "RUBRIQUE"
    public final void mRUBRIQUE() throws RecognitionException {
        try {
            int _type = RUBRIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:10: ( 'une' | 'gros titre' | 'focus' | 'rappels' | 'voiraussi' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 'u':
                {
                alt3=1;
                }
                break;
            case 'g':
                {
                alt3=2;
                }
                break;
            case 'f':
                {
                alt3=3;
                }
                break;
            case 'r':
                {
                alt3=4;
                }
                break;
            case 'v':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:12: 'une'
                    {
                    match("une"); 


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:20: 'gros titre'
                    {
                    match("gros titre"); 


                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:35: 'focus'
                    {
                    match("focus"); 


                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:45: 'rappels'
                    {
                    match("rappels"); 


                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:46:57: 'voiraussi'
                    {
                    match("voiraussi"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RUBRIQUE"

    // $ANTLR start "AUJOURDHUI"
    public final void mAUJOURDHUI() throws RecognitionException {
        try {
            int _type = AUJOURDHUI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:48:12: ( 'aujourd' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:48:14: 'aujourd'
            {
            match("aujourd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUJOURDHUI"

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

    // $ANTLR start "ENTRE"
    public final void mENTRE() throws RecognitionException {
        try {
            int _type = ENTRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:7: ( 'entre' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:50:9: 'entre'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:6: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'sept' | 'octobre' | 'novembre' | 'décembre' )
            int alt4=12;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:8: 'janvier'
                    {
                    match("janvier"); 


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:20: 'février'
                    {
                    match("février"); 


                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:32: 'mars'
                    {
                    match("mars"); 


                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:41: 'avril'
                    {
                    match("avril"); 


                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:51: 'mai'
                    {
                    match("mai"); 


                    }
                    break;
                case 6 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:59: 'juin'
                    {
                    match("juin"); 


                    }
                    break;
                case 7 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:68: 'juillet'
                    {
                    match("juillet"); 


                    }
                    break;
                case 8 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:80: 'août'
                    {
                    match("août"); 


                    }
                    break;
                case 9 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:89: 'sept'
                    {
                    match("sept"); 


                    }
                    break;
                case 10 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:98: 'octobre'
                    {
                    match("octobre"); 


                    }
                    break;
                case 11 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:110: 'novembre'
                    {
                    match("novembre"); 


                    }
                    break;
                case 12 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:51:123: 'décembre'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:5: ( 'mot' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:52:7: 'mot'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:53:4: ( ( '0' .. '9' )+ )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:53:6: ( '0' .. '9' )+
            {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:53:6: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:53:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "NB"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:6: ( 'plus' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:8: 'plus'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:55:9: ( 'premier' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:55:11: 'premier'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:57:7: ( '.' )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:57:9: '.'
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
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00A0' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:49: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=5;
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
                    alt6=1;
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
                    alt6=2;
                    }
                    break;
                case '-':
                    {
                    alt6=3;
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
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:50: ( 'a' .. 'z' )
            	    {
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:50: ( 'a' .. 'z' )
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:51: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:63: ( '0' .. '9' )
            	    {
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:63: ( '0' .. '9' )
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:64: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:76: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 4 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:82: ( '\\u00a0' .. '\\u00ff' )
            	    {
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:82: ( '\\u00a0' .. '\\u00ff' )
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:83: '\\u00a0' .. '\\u00ff'
            	    {
            	    matchRange('\u00A0','\u00FF'); 

            	    }


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
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:8: ( SELECT | COMBIEN | ET | OU | PARLER | WS | ARTICLE | AUTEUR | DATE | EMAIL | JOURS | PAGE | PUBLIE | RESUME | THEME | TITRE | RUBRIQUE | AUJOURDHUI | AT | ENTRE | MOIS | MOT | NB | PLUS | PREMIER | POINT | VAR )
        int alt7=27;
        alt7 = dfa7.predict(input);
        switch (alt7) {
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
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:38: WS
                {
                mWS(); 

                }
                break;
            case 7 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:41: ARTICLE
                {
                mARTICLE(); 

                }
                break;
            case 8 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:49: AUTEUR
                {
                mAUTEUR(); 

                }
                break;
            case 9 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:56: DATE
                {
                mDATE(); 

                }
                break;
            case 10 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:61: EMAIL
                {
                mEMAIL(); 

                }
                break;
            case 11 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:67: JOURS
                {
                mJOURS(); 

                }
                break;
            case 12 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:73: PAGE
                {
                mPAGE(); 

                }
                break;
            case 13 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:78: PUBLIE
                {
                mPUBLIE(); 

                }
                break;
            case 14 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:85: RESUME
                {
                mRESUME(); 

                }
                break;
            case 15 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:92: THEME
                {
                mTHEME(); 

                }
                break;
            case 16 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:98: TITRE
                {
                mTITRE(); 

                }
                break;
            case 17 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:104: RUBRIQUE
                {
                mRUBRIQUE(); 

                }
                break;
            case 18 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:113: AUJOURDHUI
                {
                mAUJOURDHUI(); 

                }
                break;
            case 19 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:124: AT
                {
                mAT(); 

                }
                break;
            case 20 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:127: ENTRE
                {
                mENTRE(); 

                }
                break;
            case 21 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:133: MOIS
                {
                mMOIS(); 

                }
                break;
            case 22 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:138: MOT
                {
                mMOT(); 

                }
                break;
            case 23 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:142: NB
                {
                mNB(); 

                }
                break;
            case 24 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:145: PLUS
                {
                mPLUS(); 

                }
                break;
            case 25 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:150: PREMIER
                {
                mPREMIER(); 

                }
                break;
            case 26 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:158: POINT
                {
                mPOINT(); 

                }
                break;
            case 27 :
                // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:1:164: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA4_eotS =
        "\23\uffff";
    static final String DFA4_eofS =
        "\23\uffff";
    static final String DFA4_minS =
        "\2\141\1\uffff\1\141\1\157\5\uffff\2\151\2\uffff\1\154\4\uffff";
    static final String DFA4_maxS =
        "\1\163\1\165\1\uffff\1\141\1\166\5\uffff\1\151\1\162\2\uffff\1\156"+
        "\4\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\2\uffff\1\11\1\12\1\13\1\14\1\1\2\uffff\1\4\1\10\1"+
        "\uffff\1\3\1\5\1\6\1\7";
    static final String DFA4_specialS =
        "\23\uffff}>";
    static final String[] DFA4_transitionS = {
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "51:1: MOIS : ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'sept' | 'octobre' | 'novembre' | 'décembre' );";
        }
    }
    static final String DFA7_eotS =
        "\26\uffff\2\25\1\72\2\25\1\75\36\25\1\uffff\2\25\1\uffff\26\25\1"+
        "\170\4\25\1\175\1\176\10\25\1\u0087\1\25\1\u0089\1\25\1\6\1\175"+
        "\4\25\1\175\1\u008f\3\25\1\175\5\25\1\uffff\3\25\1\175\2\uffff\4"+
        "\25\1\u009e\1\u009f\2\25\1\uffff\1\25\1\uffff\4\25\1\175\1\uffff"+
        "\1\25\1\u00a8\4\25\1\u00ad\1\u00ae\1\170\5\25\2\uffff\1\25\1\u00b5"+
        "\1\u00b6\2\25\1\u00b9\2\25\1\uffff\2\25\1\u00be\1\25\2\uffff\2\25"+
        "\1\u00c2\1\25\1\u00c4\1\175\2\uffff\1\u00c5\1\u00c6\1\uffff\1\u00c7"+
        "\1\25\2\175\1\uffff\1\170\1\175\1\25\1\uffff\1\25\4\uffff\2\175"+
        "\1\170";
    static final String DFA7_eofS =
        "\u00cb\uffff";
    static final String DFA7_minS =
        "\1\11\5\55\1\uffff\11\55\1\uffff\2\55\3\uffff\1\151\1\155\1\55\1"+
        "\141\1\164\1\55\1\164\1\147\1\142\1\165\1\145\1\157\1\160\1\164"+
        "\1\152\1\162\1\u00fb\1\164\1\143\1\165\1\156\1\151\1\163\1\160\1"+
        "\145\1\164\1\145\1\157\1\143\1\166\1\151\1\164\1\166\1\154\1\162"+
        "\1\142\1\uffff\1\151\1\162\1\uffff\1\157\1\154\1\145\1\154\1\163"+
        "\1\155\1\160\1\164\1\151\1\145\1\157\1\151\1\164\2\145\1\162\1\166"+
        "\1\154\1\165\1\160\1\155\1\162\1\55\1\163\1\165\1\162\1\163\2\55"+
        "\1\145\1\157\1\141\1\151\1\154\1\145\1\142\1\145\1\55\1\151\1\55"+
        "\1\151\2\55\1\143\2\165\1\154\2\55\1\155\1\163\1\151\1\55\1\154"+
        "\1\155\3\145\1\uffff\1\40\1\163\1\151\1\55\2\uffff\1\155\1\151\1"+
        "\165\1\145\2\55\2\162\1\uffff\1\145\1\uffff\1\145\1\154\2\162\1"+
        "\55\1\uffff\1\142\1\55\3\145\1\154\3\55\1\145\1\142\1\162\1\163"+
        "\1\156\2\uffff\1\145\2\55\1\162\1\145\1\55\1\144\1\162\1\uffff\1"+
        "\162\1\164\1\55\1\163\2\uffff\2\162\1\55\1\163\2\55\2\uffff\2\55"+
        "\1\uffff\1\55\1\145\2\55\1\uffff\2\55\1\145\1\uffff\1\151\4\uffff"+
        "\3\55";
    static final String DFA7_maxS =
        "\6\u00ff\1\uffff\11\u00ff\1\uffff\2\u00ff\3\uffff\1\165\1\155\1"+
        "\u00ff\1\141\1\164\1\u00ff\1\164\1\162\1\142\1\165\1\145\1\157\1"+
        "\160\2\164\1\162\1\u00fb\1\164\1\143\1\165\1\156\1\151\1\163\1\160"+
        "\1\145\1\164\1\145\1\157\1\143\1\166\1\162\1\164\1\166\1\154\1\162"+
        "\1\142\1\uffff\1\151\1\162\1\uffff\1\157\1\154\1\145\1\154\1\163"+
        "\1\155\1\160\1\164\1\151\1\145\1\157\1\151\1\164\2\145\1\162\1\166"+
        "\1\156\1\165\1\160\1\155\1\162\1\u00ff\1\163\1\165\1\162\1\163\2"+
        "\u00ff\1\145\1\157\1\141\1\151\1\154\1\145\1\142\1\145\1\u00ff\1"+
        "\151\1\u00ff\1\151\2\u00ff\1\143\2\165\1\154\2\u00ff\1\155\1\163"+
        "\1\151\1\u00ff\1\154\1\155\3\145\1\uffff\1\40\1\163\1\151\1\u00ff"+
        "\2\uffff\1\155\1\151\1\165\1\145\2\u00ff\2\162\1\uffff\1\145\1\uffff"+
        "\1\145\1\154\2\162\1\u00ff\1\uffff\1\142\1\u00ff\3\145\1\154\3\u00ff"+
        "\1\145\1\142\1\162\1\163\1\156\2\uffff\1\145\2\u00ff\1\162\1\145"+
        "\1\u00ff\1\144\1\162\1\uffff\1\162\1\164\1\u00ff\1\163\2\uffff\2"+
        "\162\1\u00ff\1\163\2\u00ff\2\uffff\2\u00ff\1\uffff\1\u00ff\1\145"+
        "\2\u00ff\1\uffff\2\u00ff\1\145\1\uffff\1\151\4\uffff\3\u00ff";
    static final String DFA7_acceptS =
        "\6\uffff\1\6\11\uffff\1\23\2\uffff\1\27\1\32\1\33\44\uffff\1\3\2"+
        "\uffff\1\4\72\uffff\1\21\4\uffff\1\25\1\26\10\uffff\1\14\1\uffff"+
        "\1\30\5\uffff\1\11\16\uffff\1\12\1\24\10\uffff\1\13\4\uffff\1\17"+
        "\1\20\6\uffff\1\5\1\15\2\uffff\1\10\4\uffff\1\16\3\uffff\1\1\1\uffff"+
        "\1\2\1\31\1\7\1\22\3\uffff";
    static final String DFA7_specialS =
        "\u00cb\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\15\uffff\1\24\1\uffff\12\23\6"+
            "\uffff\1\20\32\25\6\uffff\1\10\1\25\1\2\1\11\1\3\1\17\1\16\2"+
            "\25\1\12\2\25\1\21\1\22\1\4\1\5\1\25\1\13\1\7\1\14\1\15\1\1"+
            "\4\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\16\25\1\26\13\25\45\uffff\140"+
            "\25",
            "\1\25\2\uffff\12\25\47\uffff\16\25\1\27\13\25\45\uffff\140"+
            "\25",
            "\1\25\2\uffff\12\25\47\uffff\14\25\1\31\1\32\5\25\1\30\6\25"+
            "\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\2\25\1\34\21\25\1\33\5\25\45\uffff"+
            "\140\25",
            "\1\25\2\uffff\12\25\47\uffff\1\35\12\25\1\37\5\25\1\40\2\25"+
            "\1\36\5\25\45\uffff\140\25",
            "",
            "\1\25\2\uffff\12\25\47\uffff\4\25\1\42\16\25\1\41\6\25\45\uffff"+
            "\140\25",
            "\1\25\2\uffff\12\25\47\uffff\16\25\1\46\2\25\1\43\2\25\1\44"+
            "\1\45\4\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\1\47\31\25\45\uffff\111\25\1\50"+
            "\26\25",
            "\1\25\2\uffff\12\25\47\uffff\1\52\15\25\1\51\5\25\1\53\5\25"+
            "\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\1\55\3\25\1\54\25\25\45\uffff"+
            "\140\25",
            "\1\25\2\uffff\12\25\47\uffff\7\25\1\56\1\57\21\25\45\uffff"+
            "\140\25",
            "\1\25\2\uffff\12\25\47\uffff\15\25\1\60\14\25\45\uffff\140"+
            "\25",
            "\1\25\2\uffff\12\25\47\uffff\21\25\1\61\10\25\45\uffff\140"+
            "\25",
            "\1\25\2\uffff\12\25\47\uffff\16\25\1\62\13\25\45\uffff\111"+
            "\25\1\63\26\25",
            "",
            "\1\25\2\uffff\12\25\47\uffff\1\64\15\25\1\65\13\25\45\uffff"+
            "\140\25",
            "\1\25\2\uffff\12\25\47\uffff\16\25\1\66\13\25\45\uffff\140"+
            "\25",
            "",
            "",
            "",
            "\1\70\13\uffff\1\67",
            "\1\71",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\73",
            "\1\74",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\76",
            "\1\100\12\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\110\11\uffff\1\107",
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
            "\1\127",
            "\1\131\10\uffff\1\130",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
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
            "\1\163\1\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u0088",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u008a",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\170",
            "\1\u0098",
            "\1\u0099",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "",
            "\1\u00a7",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00b7",
            "\1\u00b8",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00bf",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00c3",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "",
            "",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00c8",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "",
            "",
            "",
            "",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25",
            "\1\25\2\uffff\12\25\47\uffff\32\25\45\uffff\140\25"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | COMBIEN | ET | OU | PARLER | WS | ARTICLE | AUTEUR | DATE | EMAIL | JOURS | PAGE | PUBLIE | RESUME | THEME | TITRE | RUBRIQUE | AUJOURDHUI | AT | ENTRE | MOIS | MOT | NB | PLUS | PREMIER | POINT | VAR );";
        }
    }
 

}