package antlr.output;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g 2013-11-17 01:28:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_sqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "ARTICLE", "PAGE", "CONJ", "POINT", "MOT", "WS", "VAR"
    };
    public static final int WS=10;
    public static final int PAGE=6;
    public static final int POINT=8;
    public static final int CONJ=7;
    public static final int VAR=11;
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int MOT=9;
    public static final int ARTICLE=5;

    // delegates
    // delegators


        public Tal_sqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Tal_sqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Tal_sqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g"; }



    // $ANTLR start "listerequetes"
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:27:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;


        Arbre lr_arbre;
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:28:25: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:29:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes158);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes160); 

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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | PAGE ) MOT ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;


        Arbre ps_arbre;
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:37:26: ( SELECT ( ARTICLE | PAGE ) MOT ps= params )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:38:3: SELECT ( ARTICLE | PAGE ) MOT ps= params
            {
            match(input,SELECT,FOLLOW_SELECT_in_requete187); 

            				req_arbre.ajouteFils(new Arbre("","select distinct"));
            			
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:42:3: ( ARTICLE | PAGE )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ARTICLE) ) {
                alt1=1;
            }
            else if ( (LA1_0==PAGE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:42:4: ARTICLE
                    {
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete199); 

                    			req_arbre.ajouteFils(new Arbre("","article"));
                    			

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:46:6: PAGE
                    {
                    match(input,PAGE,FOLLOW_PAGE_in_requete211); 

                    			req_arbre.ajouteFils(new Arbre("","page"));
                    			

                    }
                    break;

            }

            match(input,MOT,FOLLOW_MOT_in_requete221); 

            				req_arbre.ajouteFils(new Arbre("","from titreresume"));
            				req_arbre.ajouteFils(new Arbre("","where"));
            			
            pushFollow(FOLLOW_params_in_requete234);
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:62:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJ par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre par2 = null;


        Arbre par1_arbre, par2_arbre;
        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:63:40: (par1= param ( CONJ par2= param )* )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:64:3: par1= param ( CONJ par2= param )*
            {
            pushFollow(FOLLOW_param_in_params266);
            par1=param();

            state._fsp--;


            				par1_arbre = par1;
            				les_pars_arbre.ajouteFils(par1_arbre);
            			
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:69:3: ( CONJ par2= param )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CONJ) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:69:4: CONJ par2= param
            	    {
            	    match(input,CONJ,FOLLOW_CONJ_in_params277); 
            	    pushFollow(FOLLOW_param_in_params283);
            	    par2=param();

            	    state._fsp--;


            	    				par2_arbre = par2;
            	    				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
            	    				les_pars_arbre.ajouteFils(par2_arbre);
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:78:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:78:51: (a= VAR )
            // /home/jehu/Documents/git/lo17/lo17_tp04/src/antlr/Tal_sql.g:79:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param311); 
             lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));

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


 

    public static final BitSet FOLLOW_requete_in_listerequetes158 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_POINT_in_listerequetes160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete187 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ARTICLE_in_requete199 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAGE_in_requete211 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MOT_in_requete221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_params_in_requete234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params266 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_CONJ_in_params277 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_param_in_params283 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_VAR_in_param311 = new BitSet(new long[]{0x0000000000000002L});

}