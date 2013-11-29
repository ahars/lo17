// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g 2013-11-29 01:47:48
package antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_tp04Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COMBIEN", "ARTICLE", "PAGE", "UNE", "FOCUS", "RAPPELS", "VOIRAUSSI", "GROSTITRES", "AUTEUR", "ET", "OU", "PARLER", "POINT", "WS", "VAR"
    };
    public static final int FOCUS=9;
    public static final int UNE=8;
    public static final int VOIRAUSSI=11;
    public static final int POINT=17;
    public static final int COMBIEN=5;
    public static final int EOF=-1;
    public static final int RAPPELS=10;
    public static final int AUTEUR=13;
    public static final int PAGE=7;
    public static final int WS=18;
    public static final int PARLER=16;
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:29:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:32:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:33:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes214);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes216); 

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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:38:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) PARLER ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;



        		Arbre ps_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:41:4: ( ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) PARLER ps= params )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:42:3: ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) PARLER ps= params
            {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:42:3: ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) )
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
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:42:4: SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete239); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct"));
                    		
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:45:3: ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
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
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:45:4: ARTICLE
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete246); 

                            			req_arbre.ajouteFils(new Arbre("", "article"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:49:5: PAGE
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete254); 

                            			req_arbre.ajouteFils(new Arbre("", "page"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:53:5: UNE
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete262); 

                            			req_arbre.ajouteFils(new Arbre("", "une"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:57:5: VOIRAUSSI
                            {
                            match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete270); 

                            			req_arbre.ajouteFils(new Arbre("", "voiraussi"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:61:5: FOCUS
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete278); 

                            			req_arbre.ajouteFils(new Arbre("", "focus"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:65:5: RAPPELS
                            {
                            match(input,RAPPELS,FOLLOW_RAPPELS_in_requete286); 

                            			req_arbre.ajouteFils(new Arbre("", "rappels"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 7 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:69:4: GROSTITRES
                            {
                            match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete293); 

                            			req_arbre.ajouteFils(new Arbre("", "grostitres"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:73:4: COMBIEN ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete301); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    		
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:76:3: ( ( ARTICLE ) | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
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
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:76:4: ( ARTICLE )
                            {
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:76:4: ( ARTICLE )
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:76:5: ARTICLE
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete309); 

                            			req_arbre.ajouteFils(new Arbre("", "article)"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }


                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:80:5: PAGE
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete318); 

                            			req_arbre.ajouteFils(new Arbre("", "page)"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:84:5: UNE
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete326); 

                            			req_arbre.ajouteFils(new Arbre("", "une)"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:88:5: VOIRAUSSI
                            {
                            match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete334); 

                            			req_arbre.ajouteFils(new Arbre("", "voiraussi)"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:92:5: FOCUS
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete342); 

                            			req_arbre.ajouteFils(new Arbre("", "focus)"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:96:5: RAPPELS
                            {
                            match(input,RAPPELS,FOLLOW_RAPPELS_in_requete350); 

                            			req_arbre.ajouteFils(new Arbre("", "rappels)"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;
                        case 7 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:100:4: GROSTITRES
                            {
                            match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete357); 

                            			req_arbre.ajouteFils(new Arbre("", "grostitres)"));
                            			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
                            		

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,PARLER,FOLLOW_PARLER_in_requete366); 

            			req_arbre.ajouteFils(new Arbre("", "where "));
            		
            pushFollow(FOLLOW_params_in_requete376);
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:112:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:115:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:116:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params402);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:120:3: (c= conj par2= param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=ET && LA4_0<=OU)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:120:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params413);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params419);
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:127:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | a1= VAR a2= VAR );
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;
        Token a1=null;
        Token a2=null;

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:127:51: (a= VAR | a1= VAR a2= VAR )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==VAR) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==VAR) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=ET && LA5_1<=OU)||LA5_1==POINT) ) {
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
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:128:2: a= VAR
                    {
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_param440); 

                    		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a.getText() + "'"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:131:4: a1= VAR a2= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param451); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param457); 

                    		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a1.getText() + " " + a2.getText() + "'"));
                    	

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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:135:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:135:49: ( ET | OU )
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
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:136:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj472); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:139:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj479); 

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


 

    public static final BitSet FOLLOW_requete_in_listerequetes214 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete239 = new BitSet(new long[]{0x0000000000001FC0L});
    public static final BitSet FOLLOW_ARTICLE_in_requete246 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PAGE_in_requete254 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_UNE_in_requete262 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete270 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FOCUS_in_requete278 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete286 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete293 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COMBIEN_in_requete301 = new BitSet(new long[]{0x0000000000001FC0L});
    public static final BitSet FOLLOW_ARTICLE_in_requete309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PAGE_in_requete318 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_UNE_in_requete326 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_FOCUS_in_requete342 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete350 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete357 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PARLER_in_requete366 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params402 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_conj_in_params413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_param_in_params419 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_VAR_in_param440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param451 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_VAR_in_param457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj479 = new BitSet(new long[]{0x0000000000000002L});

}