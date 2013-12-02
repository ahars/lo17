// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g 2013-12-02 14:06:17

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
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:57:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT | COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;



        		Arbre ps_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:60:4: ( ( SELECT | COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) ps= params )
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:61:3: ( SELECT | COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) ps= params
            {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:61:3: ( SELECT | COMBIEN )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SELECT) ) {
                alt1=1;
            }
            else if ( (LA1_0==COMBIEN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:61:4: SELECT
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete250); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct"));
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:64:5: COMBIEN
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete258); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    		

                    }
                    break;

            }

            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:67:3: ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER )
            int alt2=7;
            switch ( input.LA(1) ) {
            case ARTICLE:
                {
                alt2=1;
                }
                break;
            case PAGE:
                {
                alt2=2;
                }
                break;
            case UNE:
                {
                alt2=3;
                }
                break;
            case VOIRAUSSI:
                {
                alt2=4;
                }
                break;
            case FOCUS:
                {
                alt2=5;
                }
                break;
            case RAPPELS:
                {
                alt2=6;
                }
                break;
            case GROSTITRES:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:67:4: ARTICLE PARLER
                    {
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete266); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete268); 

                    			req_arbre.ajouteFils(new Arbre("", "article)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where"));
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:72:5: PAGE PARLER
                    {
                    match(input,PAGE,FOLLOW_PAGE_in_requete276); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete278); 

                    			req_arbre.ajouteFils(new Arbre("", "page)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where"));
                    		

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:77:5: UNE PARLER
                    {
                    match(input,UNE,FOLLOW_UNE_in_requete285); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete287); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND"));
                    		

                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:82:5: VOIRAUSSI PARLER
                    {
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete295); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete297); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND"));
                    		

                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:87:5: FOCUS PARLER
                    {
                    match(input,FOCUS,FOLLOW_FOCUS_in_requete305); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete307); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND"));
                    		

                    }
                    break;
                case 6 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:92:5: RAPPELS PARLER
                    {
                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete315); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete317); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND"));
                    		

                    }
                    break;
                case 7 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:97:5: GROSTITRES PARLER
                    {
                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete325); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete327); 

                    			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND"));
                    		

                    }
                    break;

            }

            pushFollow(FOLLOW_params_in_requete338);
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
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:107:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:110:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:111:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params364);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:115:3: (c= conj par2= param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ET||LA3_0==OU) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:115:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params375);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params381);
            	    par2=param();

            	    state._fsp--;


            	    			conj_arbre = c;
            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(conj_arbre);
            	    			les_pars_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:122:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | a1= VAR a2= VAR );
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;
        Token a1=null;
        Token a2=null;

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:122:51: (a= VAR | a1= VAR a2= VAR )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==VAR) ) {
                    alt4=2;
                }
                else if ( (LA4_1==ET||LA4_1==OU||LA4_1==POINT) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:123:2: a= VAR
                    {
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_param402); 

                    		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a.getText() + "'"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:126:4: a1= VAR a2= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param413); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param419); 

                    		lepar_arbre.ajouteFils(new Arbre("", "mot = '" + a1.getText() + "' AND mot = '" + a2.getText() + "'"));
                    	

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
    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:130:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:130:49: ( ET | OU )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ET) ) {
                alt5=1;
            }
            else if ( (LA5_0==OU) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:131:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj434); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp05/src/antlr/Tal_tp05.g:134:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj441); 

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
    public static final BitSet FOLLOW_COMBIEN_in_requete258 = new BitSet(new long[]{0x0000000000069610L});
    public static final BitSet FOLLOW_ARTICLE_in_requete266 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete268 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PAGE_in_requete276 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete278 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_UNE_in_requete285 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete295 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete297 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FOCUS_in_requete305 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete307 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete317 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARLER_in_requete327 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params364 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_conj_in_params375 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_param_in_params381 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_VAR_in_param402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param413 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_VAR_in_param419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj441 = new BitSet(new long[]{0x0000000000000002L});

}