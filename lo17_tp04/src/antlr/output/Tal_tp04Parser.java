// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g 2013-11-29 01:02:13
package antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_tp04Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COMBIEN", "ARTICLE", "PAGE", "UNE", "FOCUS", "RAPPELS", "VOIRAUSSI", "GROSTITRES", "AUTEUR", "ET", "OU", "CONTENIR", "POINT", "WS", "VAR"
    };
    public static final int FOCUS=9;
    public static final int UNE=8;
    public static final int VOIRAUSSI=11;
    public static final int POINT=17;
    public static final int COMBIEN=5;
    public static final int CONTENIR=16;
    public static final int EOF=-1;
    public static final int RAPPELS=10;
    public static final int AUTEUR=13;
    public static final int PAGE=7;
    public static final int WS=18;
    public static final int OU=15;
    public static final int VAR=19;
    public static final int ET=14;
    public static final int SELECT=4;
    public static final int ARTICLE=6;
    public static final int GROSTITRES=12;

    // delegates
    // delegators


        public Tal_tp04Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Tal_tp04Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Tal_tp04Parser.tokenNames; }
    public String getGrammarFileName() { return "/home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g"; }



    // $ANTLR start "listerequetes"
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:23:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:26:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:27:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes215);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes217); 

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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:32:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) ( CONTENIR | AUTEUR ) ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;



        		Arbre ps_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:35:4: ( ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) ( CONTENIR | AUTEUR ) ps= params )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:36:3: ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) ( CONTENIR | AUTEUR ) ps= params
            {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:36:3: ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SELECT) ) {
                alt3=1;
            }
            else if ( (LA3_0==COMBIEN) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:36:4: SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete240); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct"));
                    		
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:39:3: ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
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
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:39:4: ARTICLE
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete247); 

                            			req_arbre.ajouteFils(new Arbre("", "article"));
                            		

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:42:5: PAGE
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete255); 

                            			req_arbre.ajouteFils(new Arbre("", "page"));
                            		

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:45:5: UNE
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete263); 

                            			req_arbre.ajouteFils(new Arbre("", "une"));
                            		

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:48:5: VOIRAUSSI
                            {
                            match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete271); 

                            			req_arbre.ajouteFils(new Arbre("", "voiraussi"));
                            		

                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:51:5: FOCUS
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete279); 

                            			req_arbre.ajouteFils(new Arbre("", "focus"));
                            		

                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:54:5: RAPPELS
                            {
                            match(input,RAPPELS,FOLLOW_RAPPELS_in_requete287); 

                            			req_arbre.ajouteFils(new Arbre("", "rappels"));
                            		

                            }
                            break;
                        case 7 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:57:4: GROSTITRES
                            {
                            match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete294); 

                            			req_arbre.ajouteFils(new Arbre("", "grostitres"));
                            		

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:60:4: COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete302); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    		
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:63:3: ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
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
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:63:4: ( ARTICLE )
                            {
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:63:4: ( ARTICLE )
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:63:5: ARTICLE
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete310); 

                            			req_arbre.ajouteFils(new Arbre("", "article)"));
                            		

                            }


                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:66:5: PAGE
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete319); 

                            			req_arbre.ajouteFils(new Arbre("", "page)"));
                            		

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:69:5: UNE
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete327); 

                            			req_arbre.ajouteFils(new Arbre("", "une)"));
                            		

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:72:5: VOIRAUSSI
                            {
                            match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete335); 

                            			req_arbre.ajouteFils(new Arbre("", "voiraussi)"));
                            		

                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:75:5: FOCUS
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete343); 

                            			req_arbre.ajouteFils(new Arbre("", "focus)"));
                            		

                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:78:5: RAPPELS
                            {
                            match(input,RAPPELS,FOLLOW_RAPPELS_in_requete351); 

                            			req_arbre.ajouteFils(new Arbre("", "rappels)"));
                            		

                            }
                            break;
                        case 7 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:81:4: GROSTITRES
                            {
                            match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete358); 

                            			req_arbre.ajouteFils(new Arbre("", "grostitres)"));
                            		

                            }
                            break;

                    }


                    }
                    break;

            }

            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:84:3: ( CONTENIR | AUTEUR )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CONTENIR) ) {
                alt4=1;
            }
            else if ( (LA4_0==AUTEUR) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:84:4: CONTENIR
                    {
                    match(input,CONTENIR,FOLLOW_CONTENIR_in_requete368); 

                    			req_arbre.ajouteFils(new Arbre("", "from titreresume"));
                    			req_arbre.ajouteFils(new Arbre("", "where "));
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:87:6: AUTEUR
                    {
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete373); 

                    			req_arbre.ajouteFils(new Arbre("", "from "));
                    			req_arbre.ajouteFils(new Arbre("", "where "));
                    		

                    }
                    break;

            }

            pushFollow(FOLLOW_params_in_requete384);
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:96:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:99:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:100:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params410);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:104:3: (c= conj par2= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ET && LA5_0<=OU)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:104:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params421);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params427);
            	    par2=param();

            	    state._fsp--;


            	    			conj_arbre = c;
            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(conj_arbre);
            	    			les_pars_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:111:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:111:51: (a= VAR )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:112:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param448); 

            		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a.getText() + "'"));
            	

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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:116:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:116:49: ( ET | OU )
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
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:117:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj463); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:120:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj470); 

                    		conj_arbre.ajouteFils( new Arbre("", "OR"));
                    	

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


 

    public static final BitSet FOLLOW_requete_in_listerequetes215 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete240 = new BitSet(new long[]{0x0000000000001FC0L});
    public static final BitSet FOLLOW_ARTICLE_in_requete247 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_PAGE_in_requete255 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_UNE_in_requete263 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete271 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_FOCUS_in_requete279 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete287 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete294 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_COMBIEN_in_requete302 = new BitSet(new long[]{0x0000000000001FC0L});
    public static final BitSet FOLLOW_ARTICLE_in_requete310 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_PAGE_in_requete319 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_UNE_in_requete327 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete335 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_FOCUS_in_requete343 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete351 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete358 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_CONTENIR_in_requete368 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete373 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params410 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_conj_in_params421 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_param_in_params427 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_VAR_in_param448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj470 = new BitSet(new long[]{0x0000000000000002L});

}