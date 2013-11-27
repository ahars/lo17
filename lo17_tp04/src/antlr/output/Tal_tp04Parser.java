package antlr.output;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g 2013-11-27 03:37:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_tp04Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COMBIEN", "ARTICLE", "PAGE", "UNE", "FOCUS", "RAPPELS", "VOIRAUSSI", "GROSTITRES", "AUTEUR", "CONJ", "CONTENIR", "POINT", "WS", "VAR"
    };
    public static final int FOCUS=9;
    public static final int WS=17;
    public static final int UNE=8;
    public static final int PAGE=7;
    public static final int VOIRAUSSI=11;
    public static final int POINT=16;
    public static final int CONTENIR=15;
    public static final int COMBIEN=5;
    public static final int CONJ=14;
    public static final int VAR=18;
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int RAPPELS=10;
    public static final int AUTEUR=13;
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:19:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:22:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:23:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes205);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes207); 

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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:28:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) ( CONTENIR | AUTEUR ) ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;



        		Arbre ps_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:31:4: ( ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) ( CONTENIR | AUTEUR ) ps= params )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:32:3: ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) ) ( CONTENIR | AUTEUR ) ps= params
            {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:32:3: ( SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) | COMBIEN ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES ) )
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
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:32:4: SELECT ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete230); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct"));
                    		
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:35:3: ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
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
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:35:4: ARTICLE
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete237); 

                            			req_arbre.ajouteFils(new Arbre("", "article"));
                            		

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:38:5: PAGE
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete245); 

                            			req_arbre.ajouteFils(new Arbre("", "page"));
                            		

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:41:5: UNE
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete253); 

                            			req_arbre.ajouteFils(new Arbre("", "une"));
                            		

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:44:5: VOIRAUSSI
                            {
                            match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete261); 

                            			req_arbre.ajouteFils(new Arbre("", "voiraussi"));
                            		

                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:47:5: FOCUS
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete269); 

                            			req_arbre.ajouteFils(new Arbre("", "focus"));
                            		

                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:50:5: RAPPELS
                            {
                            match(input,RAPPELS,FOLLOW_RAPPELS_in_requete277); 

                            			req_arbre.ajouteFils(new Arbre("", "rappels"));
                            		

                            }
                            break;
                        case 7 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:53:4: GROSTITRES
                            {
                            match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete284); 

                            			req_arbre.ajouteFils(new Arbre("", "grostitres"));
                            		

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:56:4: COMBIEN ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete292); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    		
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:59:3: ( ARTICLE | PAGE | UNE | VOIRAUSSI | FOCUS | RAPPELS | GROSTITRES )
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
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:59:4: ARTICLE
                            {
                            match(input,ARTICLE,FOLLOW_ARTICLE_in_requete299); 

                            			req_arbre.ajouteFils(new Arbre("", "article)"));
                            		

                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:62:5: PAGE
                            {
                            match(input,PAGE,FOLLOW_PAGE_in_requete307); 

                            			req_arbre.ajouteFils(new Arbre("", "page)"));
                            		

                            }
                            break;
                        case 3 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:65:5: UNE
                            {
                            match(input,UNE,FOLLOW_UNE_in_requete315); 

                            			req_arbre.ajouteFils(new Arbre("", "une)"));
                            		

                            }
                            break;
                        case 4 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:68:5: VOIRAUSSI
                            {
                            match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete323); 

                            			req_arbre.ajouteFils(new Arbre("", "voiraussi)"));
                            		

                            }
                            break;
                        case 5 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:71:5: FOCUS
                            {
                            match(input,FOCUS,FOLLOW_FOCUS_in_requete331); 

                            			req_arbre.ajouteFils(new Arbre("", "focus)"));
                            		

                            }
                            break;
                        case 6 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:74:5: RAPPELS
                            {
                            match(input,RAPPELS,FOLLOW_RAPPELS_in_requete339); 

                            			req_arbre.ajouteFils(new Arbre("", "rappels)"));
                            		

                            }
                            break;
                        case 7 :
                            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:77:4: GROSTITRES
                            {
                            match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete346); 

                            			req_arbre.ajouteFils(new Arbre("", "grostitres)"));
                            		

                            }
                            break;

                    }


                    }
                    break;

            }

            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:80:3: ( CONTENIR | AUTEUR )
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
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:80:4: CONTENIR
                    {
                    match(input,CONTENIR,FOLLOW_CONTENIR_in_requete356); 

                    			req_arbre.ajouteFils(new Arbre("", "from titreresume"));
                    			req_arbre.ajouteFils(new Arbre("", "where "));
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:83:6: AUTEUR
                    {
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete361); 

                    			req_arbre.ajouteFils(new Arbre("", "from "));
                    			req_arbre.ajouteFils(new Arbre("", "where "));
                    		

                    }
                    break;

            }

            pushFollow(FOLLOW_params_in_requete372);
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:92:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJ par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:95:4: (par1= param ( CONJ par2= param )* )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:96:3: par1= param ( CONJ par2= param )*
            {
            pushFollow(FOLLOW_param_in_params398);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:100:3: ( CONJ par2= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CONJ) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:100:4: CONJ par2= param
            	    {
            	    match(input,CONJ,FOLLOW_CONJ_in_params405); 
            	    pushFollow(FOLLOW_param_in_params411);
            	    par2=param();

            	    state._fsp--;


            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(new Arbre("", "OR"));
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:106:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:106:51: (a= VAR )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_tp04.g:107:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param432); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_requete_in_listerequetes205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete230 = new BitSet(new long[]{0x0000000000001FC0L});
    public static final BitSet FOLLOW_ARTICLE_in_requete237 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_PAGE_in_requete245 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_UNE_in_requete253 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete261 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_FOCUS_in_requete269 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete277 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete284 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_COMBIEN_in_requete292 = new BitSet(new long[]{0x0000000000001FC0L});
    public static final BitSet FOLLOW_ARTICLE_in_requete299 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_PAGE_in_requete307 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_UNE_in_requete315 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete323 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_FOCUS_in_requete331 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete339 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete346 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_CONTENIR_in_requete356 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete361 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_params_in_requete372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params398 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_CONJ_in_params405 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_param_in_params411 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_VAR_in_param432 = new BitSet(new long[]{0x0000000000000002L});

}