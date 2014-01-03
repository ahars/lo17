// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g 2014-01-03 15:36:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COMBIEN", "ET", "OU", "PARLER", "SOURCE", "WS", "ARTICLE", "AUTEUR", "DATE", "EMAIL", "FOCUS", "GROSTITRES", "PAGE", "PUBLIE", "RAPPELS", "THEME", "UNE", "VOIRAUSSI", "AT", "PLUS", "NB", "POINT", "VAR"
    };
    public static final int FOCUS=15;
    public static final int UNE=21;
    public static final int VOIRAUSSI=22;
    public static final int POINT=26;
    public static final int THEME=20;
    public static final int COMBIEN=5;
    public static final int SOURCE=9;
    public static final int EOF=-1;
    public static final int EMAIL=14;
    public static final int RAPPELS=19;
    public static final int AUTEUR=12;
    public static final int AT=23;
    public static final int WS=10;
    public static final int PAGE=17;
    public static final int PARLER=8;
    public static final int OU=7;
    public static final int PLUS=24;
    public static final int VAR=27;
    public static final int ET=6;
    public static final int DATE=13;
    public static final int PUBLIE=18;
    public static final int SELECT=4;
    public static final int NB=25;
    public static final int ARTICLE=11;
    public static final int GROSTITRES=16;

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:56:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:59:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:60:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes272);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes274); 

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:65:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE PARLER ps= params d= dat | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT ARTICLE PARLER THEME ps= params d= dat | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT AUTEUR PLUS PUBLIE );
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Token a1=null;
        Token a2=null;
        Token a=null;
        Token b=null;
        Token c=null;
        Arbre ps = null;

        Arbre d = null;



        		Arbre ps_arbre, d_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:68:4: ( ( SELECT ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE PARLER ps= params d= dat | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT ARTICLE PARLER THEME ps= params d= dat | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT AUTEUR PLUS PUBLIE )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:69:3: ( SELECT ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params
                    {
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:69:3: ( SELECT ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) )
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
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:69:4: SELECT ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER )
                            {
                            match(input,SELECT,FOLLOW_SELECT_in_requete297); 

                            			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                            		
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:72:3: ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER )
                            int alt1=11;
                            alt1 = dfa1.predict(input);
                            switch (alt1) {
                                case 1 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:72:4: ARTICLE PARLER
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete304); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete306); 

                                    			req_arbre.ajouteFils(new Arbre("", "article "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 2 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:77:5: ARTICLE AUTEUR
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete314); 
                                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete316); 

                                    			req_arbre.ajouteFils(new Arbre("", "article "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
                                    		

                                    }
                                    break;
                                case 3 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:82:5: AUTEUR ARTICLE
                                    {
                                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete324); 
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete326); 

                                    			req_arbre.ajouteFils(new Arbre("", "etiquette "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
                                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.theme.article AND mot = '"));
                                    		

                                    }
                                    break;
                                case 4 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:87:5: ARTICLE a1= VAR a2= VAR THEME
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete334); 
                                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_requete340); 
                                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_requete346); 
                                    match(input,THEME,FOLLOW_THEME_in_requete349); 

                                    			req_arbre.ajouteFils(new Arbre("", "article "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.theme, public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND "));
                                    			req_arbre.ajouteFils(new Arbre("", "public.titre.mot = '" + a1.getText() + "' AND mot = '" + a2.getText() + "' "));
                                    			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
                                    		

                                    }
                                    break;
                                case 5 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:94:5: PAGE PARLER
                                    {
                                    match(input,PAGE,FOLLOW_PAGE_in_requete357); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete359); 

                                    			req_arbre.ajouteFils(new Arbre("", "page "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 6 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:99:5: UNE PARLER
                                    {
                                    match(input,UNE,FOLLOW_UNE_in_requete366); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete368); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 7 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:104:5: VOIRAUSSI PARLER
                                    {
                                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete376); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete378); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 8 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:109:5: FOCUS PARLER
                                    {
                                    match(input,FOCUS,FOLLOW_FOCUS_in_requete386); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete388); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 9 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:114:5: RAPPELS PARLER
                                    {
                                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete396); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete398); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 10 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:119:5: GROSTITRES PARLER
                                    {
                                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete406); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete408); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 11 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:124:5: DATE PLUS PARLER
                                    {
                                    match(input,DATE,FOLLOW_DATE_in_requete416); 
                                    match(input,PLUS,FOLLOW_PLUS_in_requete418); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete420); 

                                    			req_arbre.ajouteFils(new Arbre("", "annee "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.theme "));
                                    			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.theme.article AND mot = '"));
                                    		

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:129:5: ( COMBIEN ) ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER )
                            {
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:129:5: ( COMBIEN )
                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:129:7: COMBIEN
                            {
                            match(input,COMBIEN,FOLLOW_COMBIEN_in_requete431); 

                            			req_arbre.ajouteFils(new Arbre("", "select count("));
                            		

                            }

                            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:132:3: ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER )
                            int alt2=10;
                            alt2 = dfa2.predict(input);
                            switch (alt2) {
                                case 1 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:132:4: ARTICLE PARLER
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete439); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete441); 

                                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 2 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:137:5: ARTICLE PARLER THEME
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete449); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete451); 
                                    match(input,THEME,FOLLOW_THEME_in_requete453); 

                                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
                                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND mot = '"));
                                    		

                                    }
                                    break;
                                case 3 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:142:5: PAGE PARLER
                                    {
                                    match(input,PAGE,FOLLOW_PAGE_in_requete461); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete463); 

                                    			req_arbre.ajouteFils(new Arbre("", "page) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                                    		

                                    }
                                    break;
                                case 4 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:147:5: UNE PARLER
                                    {
                                    match(input,UNE,FOLLOW_UNE_in_requete470); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete472); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 5 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:152:5: VOIRAUSSI PARLER
                                    {
                                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete480); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete482); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 6 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:157:5: FOCUS PARLER
                                    {
                                    match(input,FOCUS,FOLLOW_FOCUS_in_requete490); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete492); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 7 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:162:5: RAPPELS PARLER
                                    {
                                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete500); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete502); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 8 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:167:5: AUTEUR EMAIL AT a= VAR b= NB c= POINT
                                    {
                                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete510); 
                                    match(input,EMAIL,FOLLOW_EMAIL_in_requete512); 
                                    match(input,AT,FOLLOW_AT_in_requete514); 
                                    a=(Token)match(input,VAR,FOLLOW_VAR_in_requete520); 
                                    b=(Token)match(input,NB,FOLLOW_NB_in_requete526); 
                                    c=(Token)match(input,POINT,FOLLOW_POINT_in_requete532); 

                                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                                    			req_arbre.ajouteFils(new Arbre("", "where email = '@" + a.getText() + b.getText() + c.getText()));
                                    		

                                    }
                                    break;
                                case 9 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:172:5: ARTICLE SOURCE PARLER
                                    {
                                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete540); 
                                    match(input,SOURCE,FOLLOW_SOURCE_in_requete542); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete544); 

                                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp' AND mot = '"));
                                    		

                                    }
                                    break;
                                case 10 :
                                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:177:5: GROSTITRES PARLER
                                    {
                                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete552); 
                                    match(input,PARLER,FOLLOW_PARLER_in_requete554); 

                                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
                                    		

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_params_in_requete566);
                    ps=params();

                    state._fsp--;


                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:186:5: COMBIEN ARTICLE SOURCE
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete574); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete576); 
                    match(input,SOURCE,FOLLOW_SOURCE_in_requete578); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp'"));
                    		

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:192:5: COMBIEN ARTICLE PARLER ps= params d= dat
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete586); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete588); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete590); 
                    pushFollow(FOLLOW_params_in_requete596);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete602);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:203:5: SELECT EMAIL AUTEUR a1= VAR a2= VAR
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete610); 
                    match(input,EMAIL,FOLLOW_EMAIL_in_requete612); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete614); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_requete620); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_requete626); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct email "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '" + a1.getText() + " " + a2.getText() + "'"));
                    		

                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:208:5: SELECT ARTICLE PARLER THEME ps= params d= dat
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete634); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete636); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete638); 
                    match(input,THEME,FOLLOW_THEME_in_requete640); 
                    pushFollow(FOLLOW_params_in_requete646);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete652);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND public.theme.mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 6 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:219:5: SELECT COMBIEN ARTICLE ps= params d= dat
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete660); 
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete662); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete664); 
                    pushFollow(FOLLOW_params_in_requete670);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete676);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.datearticle.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 7 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:230:5: SELECT AUTEUR PLUS PUBLIE
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete684); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete686); 
                    match(input,PLUS,FOLLOW_PLUS_in_requete688); 
                    match(input,PUBLIE,FOLLOW_PUBLIE_in_requete690); 

                    			req_arbre.ajouteFils(new Arbre("", "select etiquette, count(article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "group by etiquette desc"));
                    		

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:236:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:239:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:240:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params716);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:244:3: (c= conj par2= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ET && LA5_0<=OU)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:244:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params727);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params733);
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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:252:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR );
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:252:51: (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR )
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:253:2: a= VAR
                    {
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_param754); 

                    		lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:256:4: a1= VAR a2= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param765); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param771); 

                    		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' AND mot = '" + a2.getText() + "'"));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:259:4: a1= VAR a2= VAR a3= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param782); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param788); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_param794); 

                    		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' AND mot = '" + a2.getText() + "' AND mot = '" + a3.getText() + "'"));
                    	

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:263:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:263:49: ( ET | OU )
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:264:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj809); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:267:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj816); 

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


    // $ANTLR start "dat"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:271:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NB | m= NB a= NB | j= NB m= NB a= NB );
    public final Arbre dat() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Token a=null;
        Token m=null;
        Token j=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:271:52: (a= NB | m= NB a= NB | j= NB m= NB a= NB )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NB) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==NB) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==NB) ) {
                        alt8=3;
                    }
                    else if ( (LA8_2==POINT) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==POINT) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:272:2: a= NB
                    {
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat835); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "'"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:275:4: m= NB a= NB
                    {
                    m=(Token)match(input,NB,FOLLOW_NB_in_dat846); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat852); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' AND annee = '" + a.getText() + "'"));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:278:4: j= NB m= NB a= NB
                    {
                    j=(Token)match(input,NB,FOLLOW_NB_in_dat863); 
                    m=(Token)match(input,NB,FOLLOW_NB_in_dat869); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat875); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "jour = '" + j.getText() + m.getText() + a.getText() + "'"));
                    	

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
        return les_pars_arbre;
    }
    // $ANTLR end "dat"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA4_eotS =
        "\30\uffff";
    static final String DFA4_eofS =
        "\30\uffff";
    static final String DFA4_minS =
        "\1\4\1\5\1\13\1\uffff\1\10\1\uffff\1\13\1\uffff\1\10\1\24\1\uffff"+
        "\1\10\1\24\2\uffff\2\6\2\33\1\uffff\4\6";
    static final String DFA4_maxS =
        "\1\5\2\26\1\uffff\1\33\1\uffff\1\30\1\uffff\1\11\1\33\1\uffff\1"+
        "\32\1\33\2\uffff\4\33\1\uffff\1\32\2\33\1\32";
    static final String DFA4_acceptS =
        "\3\uffff\1\4\1\uffff\1\6\1\uffff\1\1\2\uffff\1\7\2\uffff\1\5\1\2"+
        "\4\uffff\1\3\4\uffff";
    static final String DFA4_specialS =
        "\30\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2",
            "\1\5\5\uffff\1\4\1\6\1\7\1\3\3\7\1\uffff\1\7\1\uffff\2\7",
            "\1\10\1\7\2\uffff\3\7\1\uffff\1\7\1\uffff\2\7",
            "",
            "\1\11\3\uffff\1\7\16\uffff\1\7",
            "",
            "\1\7\14\uffff\1\12",
            "",
            "\1\14\1\13",
            "\1\15\6\uffff\1\7",
            "",
            "\1\7\21\uffff\1\16",
            "\1\7\6\uffff\1\17",
            "",
            "",
            "\1\21\1\22\21\uffff\1\23\1\7\1\20",
            "\1\21\1\22\21\uffff\1\23\1\7\1\24",
            "\1\25",
            "\1\25",
            "",
            "\1\21\1\22\21\uffff\1\23\1\7",
            "\1\21\1\22\21\uffff\1\23\1\7\1\26",
            "\1\21\1\22\21\uffff\1\23\1\7\1\27",
            "\1\21\1\22\21\uffff\1\23\1\7"
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
            return "65:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER ) | ( COMBIEN ) ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER ) ) ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE PARLER ps= params d= dat | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT ARTICLE PARLER THEME ps= params d= dat | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT AUTEUR PLUS PUBLIE );";
        }
    }
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\13\1\10\13\uffff";
    static final String DFA1_maxS =
        "\1\26\1\33\13\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\1\1\2\1\4";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\1\11\1\uffff\1\6\1\10\1\3\1\uffff\1\7\1\uffff\1\4\1"+
            "\5",
            "\1\12\3\uffff\1\13\16\uffff\1\14",
            "",
            "",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "72:3: ( ARTICLE PARLER | ARTICLE AUTEUR | AUTEUR ARTICLE | ARTICLE a1= VAR a2= VAR THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | GROSTITRES PARLER | DATE PLUS PARLER )";
        }
    }
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\13\1\10\7\uffff\1\24\3\uffff";
    static final String DFA2_maxS =
        "\1\26\1\11\7\uffff\1\33\3\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\uffff\1\11\1\2\1\1";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\7\2\uffff\1\5\1\10\1\2\1\uffff\1\6\1\uffff\1\3\1\4",
            "\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\6\uffff\1\14",
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
            return "132:3: ( ARTICLE PARLER | ARTICLE PARLER THEME | PAGE PARLER | UNE PARLER | VOIRAUSSI PARLER | FOCUS PARLER | RAPPELS PARLER | AUTEUR EMAIL AT a= VAR b= NB c= POINT | ARTICLE SOURCE PARLER | GROSTITRES PARLER )";
        }
    }
 

    public static final BitSet FOLLOW_requete_in_listerequetes272 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete297 = new BitSet(new long[]{0x00000000006BB800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete304 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete306 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete314 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete316 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete326 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete334 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_requete340 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_requete346 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_THEME_in_requete349 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PAGE_in_requete357 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete359 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_UNE_in_requete366 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete368 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete376 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete378 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FOCUS_in_requete386 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete388 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete396 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete398 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete406 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete408 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DATE_in_requete416 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_PLUS_in_requete418 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete420 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COMBIEN_in_requete431 = new BitSet(new long[]{0x00000000006B9800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete439 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete441 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete449 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete451 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_THEME_in_requete453 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PAGE_in_requete461 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete463 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_UNE_in_requete470 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete472 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete480 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete482 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FOCUS_in_requete490 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete492 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete500 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete502 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EMAIL_in_requete512 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_AT_in_requete514 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_requete520 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NB_in_requete526 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_POINT_in_requete532 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ARTICLE_in_requete540 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SOURCE_in_requete542 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete544 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete552 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete554 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_requete566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete574 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete576 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SOURCE_in_requete578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete586 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete590 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_requete596 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dat_in_requete602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete610 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EMAIL_in_requete612 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete614 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_requete620 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_requete626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete634 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete636 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete638 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_THEME_in_requete640 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_requete646 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dat_in_requete652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMBIEN_in_requete662 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete664 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_requete670 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_dat_in_requete676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete686 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_PLUS_in_requete688 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PUBLIE_in_requete690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params716 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_conj_in_params727 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_param_in_params733 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_VAR_in_param754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param765 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_param771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param782 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_param788 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_param794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_dat835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_dat846 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NB_in_dat852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_dat863 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NB_in_dat869 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NB_in_dat875 = new BitSet(new long[]{0x0000000000000002L});

}