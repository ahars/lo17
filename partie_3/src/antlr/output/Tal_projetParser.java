// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g 2014-01-02 21:14:26

package antlr.output;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_projetParser.java
 */


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tal_projetParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COMBIEN", "ET", "OU", "PARLER", "SOURCE", "TEMPS", "WS", "ARTICLE", "AUTEUR", "DATE", "EMAIL", "FOCUS", "GROSTITRES", "PAGE", "RAPPELS", "UNE", "VOIRAUSSI", "AT", "NB", "POINT", "VAR"
    };
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
    public static final int TEMPS=10;
    public static final int GROSTITRES=17;

    // delegates
    // delegators


        public Tal_projetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Tal_projetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Tal_projetParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g"; }



    // $ANTLR start "listerequetes"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:54:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:57:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:58:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes258);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes260); 

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:63:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE PARLER ps= params d= NB );
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Token a=null;
        Token b=null;
        Token c=null;
        Token d=null;
        Arbre ps = null;



        		Arbre ps_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:66:4: ( ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE PARLER ps= params d= NB )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:67:3: ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params
                    {
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:67:3: ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) )
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
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:67:4: SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER )
                            {
                            match(input,SELECT,FOLLOW_SELECT_in_requete283); 

                            			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                            		
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:70:3: ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER )
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
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:70:4: ARTICLE PARLER
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete290); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete292); 

                                    			req_arbre.ajouteFils(new Arbre("", "article "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 2 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:75:5: PAGE PARLER
                                    {
                                    match(input,PAGE,FOLLOW_PAGE_in_requete300); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete302); 

                                    			req_arbre.ajouteFils(new Arbre("", "page "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 3 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:80:5: UNE PARLER
                                    {
                                    match(input,UNE,FOLLOW_UNE_in_requete309); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete311); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 4 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:85:5: VOIRAUSSI PARLER
                                    {
                                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete319); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete321); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 5 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:90:5: FOCUS PARLER
                                    {
                                    match(input,FOCUS,FOLLOW_FOCUS_in_requete329); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete331); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 6 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:95:5: RAPPELS PARLER
                                    {
                                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete339); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete341); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 7 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:100:5: GROSTITRES PARLER
                                    {
                                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete349); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete351); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
                                    		

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:105:5: ( COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER )
                            {
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:105:5: ( COMBIEN )
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:105:7: COMBIEN
                            {
                            match(input,COMBIEN,FOLLOW_COMBIEN_in_requete362); 

                            			req_arbre.ajouteFils(new Arbre("", "select count("));
                            		

                            }

                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:108:3: ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER )
                            int alt2=9;
                            alt2 = dfa2.predict(input);
                            switch (alt2) {
                                case 1 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:108:4: ARTICLE PARLER
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete370); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete372); 

                                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 2 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:113:5: PAGE PARLER
                                    {
                                    match(input,PAGE,FOLLOW_PAGE_in_requete380); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete382); 

                                    			req_arbre.ajouteFils(new Arbre("", "page) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 3 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:118:5: UNE PARLER
                                    {
                                    match(input,UNE,FOLLOW_UNE_in_requete389); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete391); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 4 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:123:5: VOIRAUSSI PARLER
                                    {
                                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete399); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete401); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 5 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:128:5: FOCUS PARLER
                                    {
                                    match(input,FOCUS,FOLLOW_FOCUS_in_requete409); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete411); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 6 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:133:5: RAPPELS PARLER
                                    {
                                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete419); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete421); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 7 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:138:5: AUTEUR EMAIL AT a= VAR b= NB c= POINT
                                    {
                                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete429); 
                                    match(input,EMAIL,FOLLOW_EMAIL_in_requete431); 
                                    match(input,AT,FOLLOW_AT_in_requete433); 
                                    a=(Token)match(input,VAR,FOLLOW_VAR_in_requete439); 
                                    b=(Token)match(input,NB,FOLLOW_NB_in_requete445); 
                                    c=(Token)match(input,POINT,FOLLOW_POINT_in_requete451); 

                                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                                    			req_arbre.ajouteFils(new Arbre("", "where email = '@" + a.getText() + b.getText() + c.getText()));
                                    		

                                    }
                                    break;
                                case 8 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:143:5: ARTICLE SOURCE PARLER
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete459); 
                                    match(input,SOURCE,FOLLOW_SOURCE_in_requete461); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete463); 

                                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 9 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:148:5: GROSTITRES PARLER
                                    {
                                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete471); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete473); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
                                    		

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_params_in_requete485);
                    ps=params();

                    state._fsp--;


                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:157:5: COMBIEN ARTICLE SOURCE
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete493); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete495); 
                    match(input,SOURCE,FOLLOW_SOURCE_in_requete497); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp'"));
                    		

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:163:5: COMBIEN ARTICLE PARLER ps= params d= NB
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete505); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete507); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete509); 
                    pushFollow(FOLLOW_params_in_requete515);
                    ps=params();

                    state._fsp--;

                    d=(Token)match(input,NB,FOLLOW_NB_in_requete521); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND annee = " + d.getText()));
                    		

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
        return req_arbre;
    }
    // $ANTLR end "requete"


    // $ANTLR start "params"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:173:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:176:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:177:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params546);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:181:3: (c= conj par2= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ET && LA5_0<=OU)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:181:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params557);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params563);
            	    par2=param();

            	    state._fsp--;


            	    			conj_arbre = c;
            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(conj_arbre);
            	    			les_pars_arbre.ajouteFils(new Arbre("", "mot = '"));
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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:189:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR );
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:189:51: (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VAR) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==VAR) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==VAR) ) {
                        alt6=3;
                    }
                    else if ( ((LA6_2>=ET && LA6_2<=OU)||(LA6_2>=NB && LA6_2<=POINT)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA6_1>=ET && LA6_1<=OU)||(LA6_1>=NB && LA6_1<=POINT)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:190:2: a= VAR
                    {
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_param584); 

                    		lepar_arbre.ajouteFils(new Arbre(a.getText() + "' "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:193:4: a1= VAR a2= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param595); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param601); 

                    		lepar_arbre.ajouteFils(new Arbre(a1.getText() + "' AND mot = '" + a2.getText() + "'"));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:196:4: a1= VAR a2= VAR a3= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param612); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param618); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_param624); 

                    		lepar_arbre.ajouteFils(new Arbre(a1.getText() + "' AND mot = '" + a2.getText() + "' AND mot = '" + a3.getText() + "'"));
                    	

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:200:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:200:49: ( ET | OU )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ET) ) {
                alt7=1;
            }
            else if ( (LA7_0==OU) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:201:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj639); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:204:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj646); 

                    		conj_arbre.ajouteFils(new Arbre("", "OR "));
                    	

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\1\14\2\10\1\31\1\uffff\2\6\2\31\1\uffff\4\6";
    static final String DFA4_maxS =
        "\1\5\1\uffff\1\25\1\11\1\30\1\31\1\uffff\4\31\1\uffff\1\30\2\31"+
        "\1\30";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\4\uffff\1\3\4\uffff";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2",
            "",
            "\1\3\1\1\2\uffff\6\1",
            "\1\5\1\4",
            "\1\1\17\uffff\1\6",
            "\1\7",
            "",
            "\1\11\1\12\17\uffff\1\13\1\1\1\10",
            "\1\11\1\12\17\uffff\1\13\1\1\1\14",
            "\1\15",
            "\1\15",
            "",
            "\1\11\1\12\17\uffff\1\13\1\1",
            "\1\11\1\12\17\uffff\1\13\1\1\1\16",
            "\1\11\1\12\17\uffff\1\13\1\1\1\17",
            "\1\11\1\12\17\uffff\1\13\1\1"
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
            return "63:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE PARLER ps= params d= NB );";
        }
    }
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\13\uffff";
    static final String DFA2_minS =
        "\1\14\1\10\11\uffff";
    static final String DFA2_maxS =
        "\1\25\1\11\11\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\1\1\10";
    static final String DFA2_specialS =
        "\13\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\7\2\uffff\1\5\1\10\1\2\1\6\1\3\1\4",
            "\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "108:3: ( ARTICLE PARLER | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER )";
        }
    }
 

    public static final BitSet FOLLOW_requete_in_listerequetes258 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete283 = new BitSet(new long[]{0x00000000003F1000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete290 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete292 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PAGE_in_requete300 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete302 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_UNE_in_requete309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete311 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete319 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete321 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FOCUS_in_requete329 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete331 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete339 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete341 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete349 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete351 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMBIEN_in_requete362 = new BitSet(new long[]{0x00000000003F3000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete370 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete372 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PAGE_in_requete380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete382 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_UNE_in_requete389 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete391 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete401 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FOCUS_in_requete409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete411 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete419 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete421 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EMAIL_in_requete431 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_AT_in_requete433 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VAR_in_requete439 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NB_in_requete445 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_POINT_in_requete451 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete459 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SOURCE_in_requete461 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete463 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete471 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete473 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_params_in_requete485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete493 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete495 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SOURCE_in_requete497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete505 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete509 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_params_in_requete515 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NB_in_requete521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params546 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_conj_in_params557 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_param_in_params563 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_VAR_in_param584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param595 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VAR_in_param601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param612 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VAR_in_param618 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VAR_in_param624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj646 = new BitSet(new long[]{0x0000000000000002L});

}