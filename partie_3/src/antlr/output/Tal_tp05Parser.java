// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g 2013-12-28 17:55:07

package antlr.output;

/* UV : LO17 - TP05
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_tp05Parser.java
 */


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_tp05Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "COMBIEN", "DATE", "ET", "FOCUS", "GROSTITRES", "OU", "PAGE", "PARLER", "POINT", "RAPPELS", "SELECT", "UNE", "VOIRAUSSI", "WS", "VAR"
    };
    public static final int FOCUS=9;
    public static final int UNE=17;
    public static final int VOIRAUSSI=18;
    public static final int POINT=14;
    public static final int COMBIEN=6;
    public static final int EOF=-1;
    public static final int RAPPELS=15;
    public static final int AUTEUR=5;
    public static final int WS=19;
    public static final int PAGE=12;
    public static final int PARLER=13;
    public static final int OU=11;
    public static final int VAR=20;
    public static final int ET=8;
    public static final int DATE=7;
    public static final int SELECT=16;
    public static final int ARTICLE=4;
    public static final int GROSTITRES=10;

    // delegates
    // delegators


        public Tal_tp05Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Tal_tp05Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Tal_tp05Parser.tokenNames; }
    public String getGrammarFileName() { return "/home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g"; }



    // $ANTLR start "listerequetes"
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:48:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:51:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:52:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes225);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes227); 

            			lr_arbre = r;
            			sql = lr_arbre.sortArbre();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sql;
    }
    // $ANTLR end "listerequetes"


    // $ANTLR start "requete"
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:57:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;



        		Arbre ps_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:60:4: ( ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) ps= params )
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:61:3: ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) ps= params
            {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:61:3: ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | COMBIEN )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SELECT) ) {
                alt2=1;
            }
            else if ( (LA2_0==COMBIEN) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:61:4: SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete250); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct"));
                    		
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:64:3: ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER )
                    int alt1=7;
                    switch ( input.LA(1) ) {
                    case ARTICLE:
                        {
                        alt1=1;
                        }
                        break;
                    case PAGE:
                        {
                        alt1=2;
                        }
                        break;
                    case UNE:
                        {
                        alt1=3;
                        }
                        break;
                    case VOIRAUSSI:
                        {
                        alt1=4;
                        }
                        break;
                    case FOCUS:
                        {
                        alt1=5;
                        }
                        break;
                    case RAPPELS:
                        {
                        alt1=6;
                        }
                        break;
                    case GROSTITRES:
                        {
                        alt1=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:64:4: ARTICLE PARLER
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete257); 
                            match(input,PARLER,FOLLOW_PARLER_in_requete259); 

                            			req_arbre.ajouteFils(new Arbre("", "article"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            			req_arbre.ajouteFils(new Arbre("", "where"));
                            		

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:69:5: PAGE PARLER
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete267); 
                            match(input,PARLER,FOLLOW_PARLER_in_requete269); 

                            			req_arbre.ajouteFils(new Arbre("", "page"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            			req_arbre.ajouteFils(new Arbre("", "where"));
                            		

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:74:5: UNE PARLER
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete276); 
                            match(input,PARLER,FOLLOW_PARLER_in_requete278); 

                            			req_arbre.ajouteFils(new Arbre("", "rubrique"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND"));
                            		

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:79:5: VOIRAUSSI PARLER
                            {
                            match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete286); 
                            match(input,PARLER,FOLLOW_PARLER_in_requete288); 

                            			req_arbre.ajouteFils(new Arbre("", "rubrique"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND"));
                            		

                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:84:5: FOCUS PARLER
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete296); 
                            match(input,PARLER,FOLLOW_PARLER_in_requete298); 

                            			req_arbre.ajouteFils(new Arbre("", "rubrique"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND"));
                            		

                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:89:5: RAPPELS PARLER
                            {
                            match(input,RAPPELS,FOLLOW_RAPPELS_in_requete306); 
                            match(input,PARLER,FOLLOW_PARLER_in_requete308); 

                            			req_arbre.ajouteFils(new Arbre("", "rubrique"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND"));
                            		

                            }
                            break;
                        case 7 :
                            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:94:5: GROSTITRES PARLER
                            {
                            match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete316); 
                            match(input,PARLER,FOLLOW_PARLER_in_requete318); 

                            			req_arbre.ajouteFils(new Arbre("", "rubrique"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND"));
                            		

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:99:5: COMBIEN
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete327); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    		

                    }
                    break;

            }

            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:102:3: ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER )
            int alt3=7;
            switch ( input.LA(1) ) {
            case ARTICLE:
                {
                alt3=1;
                }
                break;
            case PAGE:
                {
                alt3=2;
                }
                break;
            case UNE:
                {
                alt3=3;
                }
                break;
            case VOIRAUSSI:
                {
                alt3=4;
                }
                break;
            case FOCUS:
                {
                alt3=5;
                }
                break;
            case RAPPELS:
                {
                alt3=6;
                }
                break;
            case GROSTITRES:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:102:4: ARTICLE PARLER
                    {
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete335); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete337); 

                    			req_arbre.ajouteFils(new Arbre("", "article)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where"));
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:107:5: PAGE PARLER
                    {
                    match(input,PAGE,FOLLOW_PAGE_in_requete345); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete347); 

                    			req_arbre.ajouteFils(new Arbre("", "page)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where"));
                    		

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:112:5: UNE PARLER
                    {
                    match(input,UNE,FOLLOW_UNE_in_requete354); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete356); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND"));
                    		

                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:117:5: VOIRAUSSI PARLER
                    {
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete364); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete366); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND"));
                    		

                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:122:5: FOCUS PARLER
                    {
                    match(input,FOCUS,FOLLOW_FOCUS_in_requete374); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete376); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND"));
                    		

                    }
                    break;
                case 6 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:127:5: RAPPELS PARLER
                    {
                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete384); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete386); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND"));
                    		

                    }
                    break;
                case 7 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:132:5: GROSTITRES PARLER
                    {
                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete394); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete396); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND"));
                    		

                    }
                    break;

            }

            pushFollow(FOLLOW_params_in_requete407);
            ps=params();

            state._fsp--;


            			ps_arbre = ps;
            			req_arbre.ajouteFils(ps_arbre);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return req_arbre;
    }
    // $ANTLR end "requete"


    // $ANTLR start "params"
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:142:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:145:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:146:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params433);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:150:3: (c= conj par2= param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ET||LA4_0==OU) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:150:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params444);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params450);
            	    par2=param();

            	    state._fsp--;


            	    			conj_arbre = c;
            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(conj_arbre);
            	    			les_pars_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return les_pars_arbre;
    }
    // $ANTLR end "params"


    // $ANTLR start "param"
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:157:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | a1= VAR a2= VAR );
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;
        Token a1=null;
        Token a2=null;

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:157:51: (a= VAR | a1= VAR a2= VAR )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==VAR) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==VAR) ) {
                    alt5=2;
                }
                else if ( (LA5_1==ET||LA5_1==OU||LA5_1==POINT) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:158:2: a= VAR
                    {
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_param471); 

                    		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a.getText() + "'"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:161:4: a1= VAR a2= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param482); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param488); 

                    		lepar_arbre.ajouteFils(new Arbre("", "mot = '" + a1.getText() + "'AND mot = '" + a2.getText() + "'"));
                    	

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
        return lepar_arbre;
    }
    // $ANTLR end "param"


    // $ANTLR start "conj"
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:165:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:165:49: ( ET | OU )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ET) ) {
                alt6=1;
            }
            else if ( (LA6_0==OU) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:166:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj503); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:169:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj510); 

                    		conj_arbre.ajouteFils(new Arbre("", "OR"));
                    	

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
        return conj_arbre;
    }
    // $ANTLR end "conj"

    // Delegated rules


 

    public static final BitSet FOLLOW_requete_in_listerequetes225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete250 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_ARTICLE_in_requete257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete259 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_PAGE_in_requete267 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete269 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_UNE_in_requete276 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete278 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete286 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete288 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_FOCUS_in_requete296 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete298 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_RAPPELS_in_requete306 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete308 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete316 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete318 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_COMBIEN_in_requete327 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_ARTICLE_in_requete335 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete337 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PAGE_in_requete345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete347 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_UNE_in_requete354 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete356 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete364 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete366 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FOCUS_in_requete374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete376 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete384 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete386 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete396 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params433 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_conj_in_params444 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_param_in_params450 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_VAR_in_param471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param482 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_VAR_in_param488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj510 = new BitSet(new long[]{0x0000000000000002L});

}