// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g 2014-01-05 18:56:22

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COMBIEN", "ET", "OU", "PARLER", "WS", "ARTICLE", "AUTEUR", "DATE", "EMAIL", "JOURS", "PAGE", "PUBLIE", "RESUME", "THEME", "TITRE", "RUBRIQUE", "AUJOURDHUI", "AT", "ENTRE", "MOIS", "MOT", "NB", "PLUS", "PREMIER", "POINT", "VAR"
    };
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
    public static final int VAR=30;
    public static final int ET=6;
    public static final int TITRE=19;
    public static final int DATE=12;
    public static final int PUBLIE=16;
    public static final int SELECT=4;
    public static final int NB=26;
    public static final int ARTICLE=10;
    public static final int PREMIER=28;
    public static final int ENTRE=23;

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



    // $ANTLR start "requete"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:61:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER a1= NB a2= MOIS | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN ARTICLE PARLER THEME ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR PARLER ARTICLE d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE ps= params | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN r= RUBRIQUE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params | COMBIEN SELECT ARTICLE AUTEUR ps= params | COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params | COMBIEN SELECT PARLER ps= params | COMBIEN SELECT THEME | ENTRE d1= jour ET d2= jour r= RUBRIQUE COMBIEN ARTICLE PARLER AUTEUR ps1= params ET PARLER ps2= param | PREMIER SELECT DATE PARLER ps= params | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR AUTEUR e= email | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE ps1= params THEME ps2= params | SELECT ARTICLE THEME ps= params | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE THEME ps= params ENTRE d1= jour ET d2= jour | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR ET EMAIL ARTICLE AUJOURDHUI | SELECT AUTEUR PLUS PUBLIE | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE | SELECT DATE ARTICLE AUTEUR ps= params | SELECT DATE ARTICLE RUBRIQUE e= email | SELECT DATE ARTICLE PARLER ps= params | SELECT DATE PLUS PARLER ps= params | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT PAGE PARLER ps= params | SELECT PAGE ARTICLE AUTEUR AUTEUR e= email | SELECT RESUME PARLER ps= params | SELECT r= RUBRIQUE ENTRE d1= jour ET d2= jour | SELECT r= RUBRIQUE PARLER ps= params | SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params | SELECT TITRE ET DATE ARTICLE PARLER ps= params | SELECT TITRE PARLER ps= params );
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Token a1=null;
        Token a2=null;
        Token r=null;
        Token r1=null;
        Token r2=null;
        Arbre d = null;

        Arbre ps = null;

        Arbre ps1 = null;

        Arbre ps2 = null;

        Arbre e = null;

        Arbre d1 = null;

        Arbre d2 = null;



        		Arbre ps_arbre, d_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:64:4: ( ARTICLE d= dat PARLER a1= NB a2= MOIS | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN ARTICLE PARLER THEME ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR PARLER ARTICLE d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE ps= params | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN r= RUBRIQUE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params | COMBIEN SELECT ARTICLE AUTEUR ps= params | COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params | COMBIEN SELECT PARLER ps= params | COMBIEN SELECT THEME | ENTRE d1= jour ET d2= jour r= RUBRIQUE COMBIEN ARTICLE PARLER AUTEUR ps1= params ET PARLER ps2= param | PREMIER SELECT DATE PARLER ps= params | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR AUTEUR e= email | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE ps1= params THEME ps2= params | SELECT ARTICLE THEME ps= params | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE THEME ps= params ENTRE d1= jour ET d2= jour | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR ET EMAIL ARTICLE AUJOURDHUI | SELECT AUTEUR PLUS PUBLIE | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE | SELECT DATE ARTICLE AUTEUR ps= params | SELECT DATE ARTICLE RUBRIQUE e= email | SELECT DATE ARTICLE PARLER ps= params | SELECT DATE PLUS PARLER ps= params | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT PAGE PARLER ps= params | SELECT PAGE ARTICLE AUTEUR AUTEUR e= email | SELECT RESUME PARLER ps= params | SELECT r= RUBRIQUE ENTRE d1= jour ET d2= jour | SELECT r= RUBRIQUE PARLER ps= params | SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params | SELECT TITRE ET DATE ARTICLE PARLER ps= params | SELECT TITRE PARLER ps= params )
            int alt1=55;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:65:4: ARTICLE d= dat PARLER a1= NB a2= MOIS
                    {
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete367); 
                    pushFollow(FOLLOW_dat_in_requete373);
                    d=dat();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete375); 
                    a1=(Token)match(input,NB,FOLLOW_NB_in_requete381); 
                    a2=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete387); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct"));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND mot = '" + a1.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "'"));
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:76:5: COMBIEN ARTICLE ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete395); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete397); 
                    pushFollow(FOLLOW_params_in_requete403);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:84:5: COMBIEN ARTICLE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete411); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete413); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete415); 
                    pushFollow(FOLLOW_params_in_requete421);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:92:5: COMBIEN ARTICLE PARLER ps= params d= dat
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete429); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete431); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete433); 
                    pushFollow(FOLLOW_params_in_requete439);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete445);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:104:5: COMBIEN ARTICLE PARLER THEME ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete453); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete455); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete457); 
                    match(input,THEME,FOLLOW_THEME_in_requete459); 
                    pushFollow(FOLLOW_params_in_requete465);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 6 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:113:5: COMBIEN ARTICLE ps1= params PARLER ps2= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete473); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete475); 
                    pushFollow(FOLLOW_params_in_requete481);
                    ps1=params();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete483); 
                    pushFollow(FOLLOW_params_in_requete489);
                    ps2=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
                    			ps_arbre = ps1;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
                    			ps_arbre = ps2;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 7 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:124:5: COMBIEN AUTEUR e= email PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete497); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete499); 
                    pushFollow(FOLLOW_email_in_requete505);
                    e=email();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete507); 
                    pushFollow(FOLLOW_params_in_requete513);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where "));
                    			ps_arbre = e;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 8 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:135:5: COMBIEN AUTEUR e= email
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete521); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete523); 
                    pushFollow(FOLLOW_email_in_requete529);
                    e=email();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where "));
                    			ps_arbre = e;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 9 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:143:5: COMBIEN AUTEUR PARLER ARTICLE d= dat
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete537); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete539); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete541); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete543); 
                    pushFollow(FOLLOW_dat_in_requete549);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 10 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:152:5: COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete557); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete559); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete561); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete563); 
                    match(input,ENTRE,FOLLOW_ENTRE_in_requete565); 
                    pushFollow(FOLLOW_jour_in_requete571);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete573); 
                    pushFollow(FOLLOW_jour_in_requete579);
                    d2=jour();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", " AND jour >= "));
                    			d_arbre = d1;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
                    			d_arbre = d2;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 11 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:165:5: COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete587); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete589); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete591); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete593); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete595); 
                    pushFollow(FOLLOW_params_in_requete601);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 12 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:174:5: COMBIEN JOURS PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete609); 
                    match(input,JOURS,FOLLOW_JOURS_in_requete611); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete613); 
                    pushFollow(FOLLOW_params_in_requete619);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "jour) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 13 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:183:5: COMBIEN MOT ps= params r= RUBRIQUE
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete627); 
                    match(input,MOT,FOLLOW_MOT_in_requete629); 
                    pushFollow(FOLLOW_params_in_requete635);
                    ps=params();

                    state._fsp--;

                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete641); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "mot) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 14 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:192:5: COMBIEN MOT ps= params ET SELECT ARTICLE
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete649); 
                    match(input,MOT,FOLLOW_MOT_in_requete651); 
                    pushFollow(FOLLOW_params_in_requete657);
                    ps=params();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete659); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete661); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete663); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "mot)"));
                    			req_arbre.ajouteFils(new Arbre("", ", article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 15 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:201:5: COMBIEN PAGE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete671); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete673); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete675); 
                    pushFollow(FOLLOW_params_in_requete681);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "page) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 16 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:209:5: COMBIEN PAGE PARLER ps= params d= dat
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete689); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete691); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete693); 
                    pushFollow(FOLLOW_params_in_requete699);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete705);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "page) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.pagearticle, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.pagearticle.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 17 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:221:5: COMBIEN r= RUBRIQUE ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete713); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete719); 
                    pushFollow(FOLLOW_params_in_requete725);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 18 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:230:5: COMBIEN r= RUBRIQUE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete733); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete739); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete741); 
                    pushFollow(FOLLOW_params_in_requete747);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 19 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:239:5: COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete755); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete761); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete763); 
                    pushFollow(FOLLOW_params_in_requete769);
                    ps=params();

                    state._fsp--;

                    match(input,ENTRE,FOLLOW_ENTRE_in_requete771); 
                    pushFollow(FOLLOW_jour_in_requete777);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete779); 
                    pushFollow(FOLLOW_jour_in_requete785);
                    d2=jour();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND jour >= "));
                    			d_arbre = d1;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
                    			d_arbre = d2;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 20 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:255:5: COMBIEN r= RUBRIQUE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete793); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete799); 
                    match(input,ENTRE,FOLLOW_ENTRE_in_requete801); 
                    pushFollow(FOLLOW_jour_in_requete807);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete809); 
                    pushFollow(FOLLOW_jour_in_requete815);
                    d2=jour();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete817); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete819); 
                    pushFollow(FOLLOW_params_in_requete825);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
                    			d_arbre = d1;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
                    			d_arbre = d2;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 21 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:271:5: COMBIEN SELECT ARTICLE AUTEUR ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete833); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete835); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete837); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete839); 
                    pushFollow(FOLLOW_params_in_requete845);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 22 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:279:5: COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete853); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete855); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete857); 
                    match(input,THEME,FOLLOW_THEME_in_requete859); 
                    pushFollow(FOLLOW_params_in_requete865);
                    ps1=params();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete867); 
                    pushFollow(FOLLOW_params_in_requete873);
                    ps2=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps1;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps2;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 23 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:290:5: COMBIEN SELECT PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete881); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete883); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete885); 
                    pushFollow(FOLLOW_params_in_requete891);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 24 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:299:5: COMBIEN SELECT THEME
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete899); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete901); 
                    match(input,THEME,FOLLOW_THEME_in_requete903); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "mot) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.theme "));
                    		

                    }
                    break;
                case 25 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:304:5: ENTRE d1= jour ET d2= jour r= RUBRIQUE COMBIEN ARTICLE PARLER AUTEUR ps1= params ET PARLER ps2= param
                    {
                    match(input,ENTRE,FOLLOW_ENTRE_in_requete911); 
                    pushFollow(FOLLOW_jour_in_requete917);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete919); 
                    pushFollow(FOLLOW_jour_in_requete925);
                    d2=jour();

                    state._fsp--;

                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete931); 
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete933); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete935); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete937); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete939); 
                    pushFollow(FOLLOW_params_in_requete945);
                    ps1=params();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete947); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete949); 
                    pushFollow(FOLLOW_param_in_requete955);
                    ps2=param();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.datearticle = public.titre.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND etiquette = '"));
                    			ps_arbre = ps1;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = "));
                    			ps_arbre = ps2;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
                    			d_arbre = d1;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
                    			d_arbre = d2;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 26 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:324:5: PREMIER SELECT DATE PARLER ps= params
                    {
                    match(input,PREMIER,FOLLOW_PREMIER_in_requete963); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete965); 
                    match(input,DATE,FOLLOW_DATE_in_requete967); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete969); 
                    pushFollow(FOLLOW_params_in_requete975);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct jour "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 27 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:332:5: SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete983); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete985); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete987); 
                    pushFollow(FOLLOW_email_in_requete993);
                    e=email();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete995); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete997); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1003); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			ps_arbre = e;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
                    		

                    }
                    break;
                case 28 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:342:5: SELECT ARTICLE AUTEUR ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1011); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1013); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1015); 
                    pushFollow(FOLLOW_params_in_requete1021);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 29 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:350:5: SELECT ARTICLE AUTEUR AUTEUR e= email
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1029); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1031); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1033); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1035); 
                    pushFollow(FOLLOW_email_in_requete1041);
                    e=email();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where "));
                    			ps_arbre = e;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 30 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:358:5: SELECT ARTICLE d= dat AUTEUR e= email
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1049); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1051); 
                    pushFollow(FOLLOW_dat_in_requete1057);
                    d=dat();

                    state._fsp--;

                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1059); 
                    pushFollow(FOLLOW_email_in_requete1065);
                    e=email();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			ps_arbre = e;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			ps_arbre = d;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 31 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:370:5: SELECT ARTICLE PARLER ps= params DATE d= dat
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1073); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1075); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1077); 
                    pushFollow(FOLLOW_params_in_requete1083);
                    ps=params();

                    state._fsp--;

                    match(input,DATE,FOLLOW_DATE_in_requete1085); 
                    pushFollow(FOLLOW_dat_in_requete1091);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			ps_arbre = d;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 32 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:382:5: SELECT ARTICLE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1098); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1100); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1102); 
                    pushFollow(FOLLOW_params_in_requete1108);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 33 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:390:5: SELECT ARTICLE ps1= params THEME ps2= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1116); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1118); 
                    pushFollow(FOLLOW_params_in_requete1124);
                    ps1=params();

                    state._fsp--;

                    match(input,THEME,FOLLOW_THEME_in_requete1126); 
                    pushFollow(FOLLOW_params_in_requete1132);
                    ps2=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
                    			ps_arbre = ps2;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			ps_arbre = ps1;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 34 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:402:5: SELECT ARTICLE THEME ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1140); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1142); 
                    match(input,THEME,FOLLOW_THEME_in_requete1144); 
                    pushFollow(FOLLOW_params_in_requete1150);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 35 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:411:5: SELECT ARTICLE ps1= params AUTEUR ps2= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1158); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1160); 
                    pushFollow(FOLLOW_params_in_requete1166);
                    ps1=params();

                    state._fsp--;

                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1168); 
                    pushFollow(FOLLOW_params_in_requete1174);
                    ps2=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
                    			ps_arbre = ps1;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND etiquette = '"));
                    			ps_arbre = ps2;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 36 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:423:5: SELECT ARTICLE THEME ps= params ENTRE d1= jour ET d2= jour
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1182); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1184); 
                    match(input,THEME,FOLLOW_THEME_in_requete1186); 
                    pushFollow(FOLLOW_params_in_requete1192);
                    ps=params();

                    state._fsp--;

                    match(input,ENTRE,FOLLOW_ENTRE_in_requete1194); 
                    pushFollow(FOLLOW_jour_in_requete1200);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete1202); 
                    pushFollow(FOLLOW_jour_in_requete1208);
                    d2=jour();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article, mot "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.titre.article = public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
                    			d_arbre = d1;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
                    			d_arbre = d2;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 37 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:439:5: SELECT AUTEUR ARTICLE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1216); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1218); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1220); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1222); 
                    pushFollow(FOLLOW_params_in_requete1228);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 38 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:448:5: SELECT AUTEUR ARTICLE ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1236); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1238); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1240); 
                    pushFollow(FOLLOW_params_in_requete1246);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 39 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:457:5: SELECT AUTEUR ET EMAIL ARTICLE AUJOURDHUI
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1254); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1256); 
                    match(input,ET,FOLLOW_ET_in_requete1258); 
                    match(input,EMAIL,FOLLOW_EMAIL_in_requete1260); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1262); 
                    match(input,AUJOURDHUI,FOLLOW_AUJOURDHUI_in_requete1264); 

                    			req_arbre.ajouteFils(new Arbre("", "select etiquette, email "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND jour = CURRENT DATE "));
                    		

                    }
                    break;
                case 40 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:463:5: SELECT AUTEUR PLUS PUBLIE
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1272); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1274); 
                    match(input,PLUS,FOLLOW_PLUS_in_requete1276); 
                    match(input,PUBLIE,FOLLOW_PUBLIE_in_requete1278); 

                    			req_arbre.ajouteFils(new Arbre("", "select etiquette, count(article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "group by etiquette desc"));
                    		

                    }
                    break;
                case 41 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:468:5: SELECT COMBIEN ARTICLE ps= params d= dat
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1286); 
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1288); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1290); 
                    pushFollow(FOLLOW_params_in_requete1296);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete1302);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 42 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:480:5: SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1310); 
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1312); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1318); 
                    pushFollow(FOLLOW_params_in_requete1324);
                    ps=params();

                    state._fsp--;

                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1326); 
                    match(input,DATE,FOLLOW_DATE_in_requete1328); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique), jour "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 43 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:490:5: SELECT DATE ARTICLE AUTEUR ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1336); 
                    match(input,DATE,FOLLOW_DATE_in_requete1338); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1340); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1342); 
                    pushFollow(FOLLOW_params_in_requete1348);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "annee, article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.auteur.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot ='"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 44 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:499:5: SELECT DATE ARTICLE RUBRIQUE e= email
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1356); 
                    match(input,DATE,FOLLOW_DATE_in_requete1358); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1360); 
                    match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1362); 
                    pushFollow(FOLLOW_email_in_requete1368);
                    e=email();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "annee, article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.theme, public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.auteur.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			ps_arbre = e;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 45 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:509:5: SELECT DATE ARTICLE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1376); 
                    match(input,DATE,FOLLOW_DATE_in_requete1378); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1380); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1382); 
                    pushFollow(FOLLOW_params_in_requete1388);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "jour "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.titre.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 46 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:518:5: SELECT DATE PLUS PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1396); 
                    match(input,DATE,FOLLOW_DATE_in_requete1398); 
                    match(input,PLUS,FOLLOW_PLUS_in_requete1400); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1402); 
                    pushFollow(FOLLOW_params_in_requete1408);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "annee "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.theme.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 47 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:527:5: SELECT EMAIL AUTEUR a1= VAR a2= VAR
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1416); 
                    match(input,EMAIL,FOLLOW_EMAIL_in_requete1418); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1420); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_requete1426); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_requete1432); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "email "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '" + a1.getText() + " " + a2.getText() + "'"));
                    		

                    }
                    break;
                case 48 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:533:5: SELECT PAGE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1440); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete1442); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1444); 
                    pushFollow(FOLLOW_params_in_requete1450);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "page "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 49 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:541:5: SELECT PAGE ARTICLE AUTEUR AUTEUR e= email
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1458); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete1460); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1462); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1464); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1466); 
                    pushFollow(FOLLOW_email_in_requete1472);
                    e=email();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "page "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.auteur.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND "));
                    			ps_arbre = e;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 50 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:550:5: SELECT RESUME PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1480); 
                    match(input,RESUME,FOLLOW_RESUME_in_requete1482); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1484); 
                    pushFollow(FOLLOW_params_in_requete1490);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titreresume "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 51 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:558:5: SELECT r= RUBRIQUE ENTRE d1= jour ET d2= jour
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1498); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1504); 
                    match(input,ENTRE,FOLLOW_ENTRE_in_requete1506); 
                    pushFollow(FOLLOW_jour_in_requete1512);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete1514); 
                    pushFollow(FOLLOW_jour_in_requete1520);
                    d2=jour();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
                    			d_arbre = d1;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
                    			d_arbre = d2;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 52 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:570:5: SELECT r= RUBRIQUE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1528); 
                    r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1534); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1536); 
                    pushFollow(FOLLOW_params_in_requete1542);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 53 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:579:5: SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1550); 
                    r1=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1556); 
                    match(input,ET,FOLLOW_ET_in_requete1558); 
                    r2=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1564); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1566); 
                    pushFollow(FOLLOW_params_in_requete1572);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r1.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "OR rubrique = '" + r2.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 54 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:589:5: SELECT TITRE ET DATE ARTICLE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1580); 
                    match(input,TITRE,FOLLOW_TITRE_in_requete1582); 
                    match(input,ET,FOLLOW_ET_in_requete1584); 
                    match(input,DATE,FOLLOW_DATE_in_requete1586); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1588); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1590); 
                    pushFollow(FOLLOW_params_in_requete1596);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "titre, jour "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 55 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:598:5: SELECT TITRE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1604); 
                    match(input,TITRE,FOLLOW_TITRE_in_requete1606); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1608); 
                    pushFollow(FOLLOW_params_in_requete1615);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "titre "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

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


    // $ANTLR start "conj"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:607:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:607:49: ( ET | OU )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ET) ) {
                alt2=1;
            }
            else if ( (LA2_0==OU) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:608:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj1630); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:611:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj1637); 

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:615:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NB | m= MOIS a= NB | j= NB m= MOIS a= NB );
    public final Arbre dat() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Token a=null;
        Token m=null;
        Token j=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:615:52: (a= NB | m= MOIS a= NB | j= NB m= MOIS a= NB )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NB) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==MOIS) ) {
                    alt3=3;
                }
                else if ( (LA3_1==PARLER||LA3_1==AUTEUR||LA3_1==POINT) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==MOIS) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:616:2: a= NB
                    {
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat1656); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:619:4: m= MOIS a= NB
                    {
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1667); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat1673); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
                    		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:623:4: j= NB m= MOIS a= NB
                    {
                    j=(Token)match(input,NB,FOLLOW_NB_in_dat1684); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1690); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat1696); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
                    		les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
                    		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
                    	

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


    // $ANTLR start "email"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:629:1: email returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR );
    public final Arbre email() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Token a1=null;
        Token a=null;
        Token a2=null;
        Token p=null;
        Token a3=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:629:54: (a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            else if ( (LA4_0==EMAIL) ) {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt4=2;
                    }
                    break;
                case AUTEUR:
                    {
                    alt4=3;
                    }
                    break;
                case AT:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:630:2: a1= VAR a= AT a2= VAR p= POINT a3= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1715); 
                    a=(Token)match(input,AT,FOLLOW_AT_in_email1721); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1727); 
                    p=(Token)match(input,POINT,FOLLOW_POINT_in_email1733); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1739); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:633:4: EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR
                    {
                    match(input,EMAIL,FOLLOW_EMAIL_in_email1746); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1752); 
                    a=(Token)match(input,AT,FOLLOW_AT_in_email1758); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1764); 
                    p=(Token)match(input,POINT,FOLLOW_POINT_in_email1770); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1776); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:636:4: EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR
                    {
                    match(input,EMAIL,FOLLOW_EMAIL_in_email1783); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_email1785); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1791); 
                    a=(Token)match(input,AT,FOLLOW_AT_in_email1797); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1803); 
                    p=(Token)match(input,POINT,FOLLOW_POINT_in_email1809); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1815); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
                    	

                    }
                    break;
                case 4 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:639:4: EMAIL a= AT a1= VAR p= POINT a2= VAR
                    {
                    match(input,EMAIL,FOLLOW_EMAIL_in_email1822); 
                    a=(Token)match(input,AT,FOLLOW_AT_in_email1828); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1834); 
                    p=(Token)match(input,POINT,FOLLOW_POINT_in_email1840); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1846); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a.getText() + a1.getText() + p.getText() + a2.getText() + "' "));
                    	

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
    // $ANTLR end "email"


    // $ANTLR start "jour"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:643:1: jour returns [Arbre les_pars_arbre = new Arbre(\"\")] : (j= NB m= MOIS a= NB | j= NB m= MOIS );
    public final Arbre jour() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Token j=null;
        Token m=null;
        Token a=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:643:53: (j= NB m= MOIS a= NB | j= NB m= MOIS )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NB) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==MOIS) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==NB) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==ET||LA5_2==PARLER||LA5_2==RUBRIQUE||LA5_2==POINT) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:644:3: j= NB m= MOIS a= NB
                    {
                    j=(Token)match(input,NB,FOLLOW_NB_in_jour1866); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_jour1872); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_jour1878); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + a.getText() + "' "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:647:5: j= NB m= MOIS
                    {
                    j=(Token)match(input,NB,FOLLOW_NB_in_jour1890); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_jour1896); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + "' "));
                    	

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
    // $ANTLR end "jour"


    // $ANTLR start "listerequetes"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:651:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:654:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:655:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes1922);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes1924); 

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


    // $ANTLR start "param"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:660:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR );
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:660:51: (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VAR) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==VAR) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==VAR) ) {
                        alt6=3;
                    }
                    else if ( ((LA6_2>=ET && LA6_2<=PARLER)||(LA6_2>=AUTEUR && LA6_2<=DATE)||LA6_2==THEME||LA6_2==RUBRIQUE||(LA6_2>=ENTRE && LA6_2<=MOIS)||LA6_2==NB||LA6_2==POINT) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA6_1>=ET && LA6_1<=PARLER)||(LA6_1>=AUTEUR && LA6_1<=DATE)||LA6_1==THEME||LA6_1==RUBRIQUE||(LA6_1>=ENTRE && LA6_1<=MOIS)||LA6_1==NB||LA6_1==POINT) ) {
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:661:2: a= VAR
                    {
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_param1943); 

                    		lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:664:4: a1= VAR a2= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1954); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1960); 

                    		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
                    		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:668:4: a1= VAR a2= VAR a3= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1971); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1977); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_param1983); 

                    		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
                    		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
                    		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a3.getText() + "' "));
                    	

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


    // $ANTLR start "params"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:674:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:677:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:678:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params2009);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:682:3: (c= conj par2= param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ET) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==VAR) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==OU) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:682:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params2020);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params2026);
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
            	    break loop7;
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\u00a8\uffff";
    static final String DFA1_eofS =
        "\u00a8\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\4\2\uffff\1\5\2\10\1\uffff\1\36\4\10\1\6\2\12\1\uffff"+
        "\1\10\1\uffff\2\6\1\22\1\6\1\12\1\26\1\13\1\6\2\36\2\uffff\1\13"+
        "\2\uffff\1\13\2\36\1\6\1\uffff\1\10\4\uffff\1\10\11\uffff\2\6\2"+
        "\36\2\uffff\1\10\1\36\1\26\2\36\1\6\1\4\1\36\1\uffff\2\6\3\uffff"+
        "\1\6\1\uffff\3\6\2\36\7\uffff\1\6\2\36\2\uffff\2\6\3\uffff\1\35"+
        "\1\36\1\26\1\35\1\6\1\uffff\2\6\2\36\2\uffff\1\6\2\36\3\uffff\1"+
        "\6\2\36\2\uffff\1\6\2\36\2\uffff\5\6\1\36\1\35\2\36\14\6\1\10\1"+
        "\36\1\35\1\10\7\6\2\uffff\1\10\1\36\4\6\1\10";
    static final String DFA1_maxS =
        "\1\34\1\uffff\1\31\2\uffff\1\24\2\36\1\uffff\1\36\1\10\1\36\1\22"+
        "\1\36\1\33\1\24\1\33\1\uffff\1\12\1\uffff\1\27\1\10\2\36\1\12\1"+
        "\26\4\36\2\uffff\1\22\2\uffff\4\36\1\uffff\1\36\4\uffff\1\24\11"+
        "\uffff\4\36\2\uffff\1\32\1\36\1\26\5\36\1\uffff\2\36\3\uffff\1\36"+
        "\1\uffff\5\36\7\uffff\3\36\2\uffff\1\35\1\36\3\uffff\1\35\1\36\1"+
        "\26\1\35\1\24\1\uffff\4\36\2\uffff\3\36\3\uffff\3\36\2\uffff\3\36"+
        "\2\uffff\1\22\1\36\1\35\3\36\1\35\3\36\1\35\1\36\1\35\1\36\1\35"+
        "\1\36\1\35\3\36\2\35\1\36\2\35\1\24\4\36\1\22\1\35\2\uffff\1\35"+
        "\1\36\5\35";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\31\1\32\3\uffff\1\14\10\uffff\1\57\1\uffff"+
        "\1\62\12\uffff\1\24\1\21\1\uffff\1\27\1\30\4\uffff\1\36\1\uffff"+
        "\1\47\1\50\1\51\1\52\1\uffff\1\56\1\60\1\61\1\63\1\64\1\65\1\66"+
        "\1\67\1\5\4\uffff\1\6\1\2\10\uffff\1\15\2\uffff\1\25\1\26\1\35\1"+
        "\uffff\1\33\5\uffff\1\43\1\41\1\45\1\46\1\53\1\54\1\55\3\uffff\1"+
        "\4\1\3\2\uffff\1\12\1\13\1\11\5\uffff\1\16\4\uffff\1\17\1\20\3\uffff"+
        "\1\23\1\22\1\34\3\uffff\1\40\1\37\3\uffff\1\44\1\42\40\uffff\1\7"+
        "\1\10\7\uffff";
    static final String DFA1_specialS =
        "\u00a8\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\1\2\4\uffff\1\1\14\uffff\1\3\4\uffff\1\4",
            "",
            "\1\14\5\uffff\1\6\1\7\2\uffff\1\10\1\12\4\uffff\1\13\4\uffff"+
            "\1\11",
            "",
            "",
            "\1\17\4\uffff\1\15\1\16\1\20\1\21\1\uffff\1\22\1\uffff\1\23"+
            "\1\uffff\1\25\1\24",
            "\1\26\25\uffff\1\27",
            "\1\30\4\uffff\1\32\20\uffff\1\31",
            "",
            "\1\33",
            "\1\34",
            "\1\35\16\uffff\1\36\6\uffff\1\37",
            "\1\41\1\uffff\1\40\7\uffff\1\42",
            "\1\44\2\uffff\1\43\6\uffff\1\45\5\uffff\1\47\1\uffff\1\47\3"+
            "\uffff\1\46",
            "\1\51\3\uffff\1\50\20\uffff\1\52",
            "\1\53\11\uffff\1\54",
            "\1\55\20\uffff\1\56",
            "",
            "\1\57\1\uffff\1\60",
            "",
            "\1\63\1\uffff\1\62\16\uffff\1\61",
            "\1\64\1\uffff\1\65",
            "\1\66\13\uffff\1\67",
            "\1\71\1\72\1\73\24\uffff\1\74\1\70",
            "\1\75",
            "\1\76",
            "\1\100\12\uffff\1\101\7\uffff\1\77",
            "\1\103\1\104\14\uffff\1\105\11\uffff\1\102",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\110\6\uffff\1\111",
            "",
            "",
            "\1\112\1\uffff\1\114\20\uffff\1\113",
            "\1\115",
            "\1\116",
            "\1\120\1\121\3\uffff\1\122\6\uffff\1\123\13\uffff\1\117",
            "",
            "\1\124\25\uffff\1\125",
            "",
            "",
            "",
            "",
            "\1\130\2\uffff\1\126\10\uffff\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132\1\133\20\uffff\1\134\1\uffff\1\134\2\uffff\1\135\1\131",
            "\1\71\1\72\1\73\24\uffff\1\74\1\136",
            "\1\137",
            "\1\137",
            "",
            "",
            "\1\141\16\uffff\1\140\1\142\1\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\103\1\104\14\uffff\1\105\11\uffff\1\147",
            "\1\150\31\uffff\1\151",
            "\1\151",
            "",
            "\1\153\1\154\20\uffff\1\156\1\uffff\1\156\2\uffff\1\155\1\152",
            "\1\160\1\161\17\uffff\1\162\5\uffff\1\163\1\157",
            "",
            "",
            "",
            "\2\164\16\uffff\1\114\6\uffff\2\164",
            "",
            "\1\166\1\167\4\uffff\1\171\20\uffff\1\170\1\165",
            "\1\173\1\174\17\uffff\1\175\5\uffff\1\176\1\172",
            "\1\120\1\121\3\uffff\1\122\6\uffff\1\123\13\uffff\1\177",
            "\1\u0080",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132\1\133\20\uffff\1\134\1\uffff\1\134\2\uffff\1\135\1\u0081",
            "\1\u0082",
            "\1\u0082",
            "",
            "",
            "\1\71\1\72\1\73\24\uffff\1\74",
            "\1\71\1\72\1\73\24\uffff\1\74\1\u0083",
            "",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\103\1\104\14\uffff\1\105",
            "",
            "\1\103\1\104\14\uffff\1\105\11\uffff\1\u0088",
            "\1\153\1\154\20\uffff\1\156\1\uffff\1\156\2\uffff\1\155\1\u0089",
            "\1\u008a",
            "\1\u008a",
            "",
            "",
            "\1\160\1\161\17\uffff\1\162\5\uffff\1\163\1\u008b",
            "\1\u008c",
            "\1\u008c",
            "",
            "",
            "",
            "\1\166\1\167\4\uffff\1\171\20\uffff\1\170\1\u008d",
            "\1\u008e",
            "\1\u008e",
            "",
            "",
            "\1\173\1\174\17\uffff\1\175\5\uffff\1\176\1\u008f",
            "\1\u0090",
            "\1\u0090",
            "",
            "",
            "\1\120\1\121\3\uffff\1\122\6\uffff\1\123",
            "\1\120\1\121\3\uffff\1\122\6\uffff\1\123\13\uffff\1\u0091",
            "\1\132\1\133\20\uffff\1\134\1\uffff\1\134\2\uffff\1\135",
            "\1\132\1\133\20\uffff\1\134\1\uffff\1\134\2\uffff\1\135\1\u0092",
            "\1\71\1\72\1\73\24\uffff\1\74\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\103\1\104\14\uffff\1\105\11\uffff\1\u0098",
            "\1\153\1\154\20\uffff\1\156\1\uffff\1\156\2\uffff\1\155",
            "\1\153\1\154\20\uffff\1\156\1\uffff\1\156\2\uffff\1\155\1\u0099",
            "\1\160\1\161\17\uffff\1\162\5\uffff\1\163",
            "\1\160\1\161\17\uffff\1\162\5\uffff\1\163\1\u009a",
            "\1\166\1\167\4\uffff\1\171\20\uffff\1\170",
            "\1\166\1\167\4\uffff\1\171\20\uffff\1\170\1\u009b",
            "\1\173\1\174\17\uffff\1\175\5\uffff\1\176",
            "\1\173\1\174\17\uffff\1\175\5\uffff\1\176\1\u009c",
            "\1\120\1\121\3\uffff\1\122\6\uffff\1\123\13\uffff\1\u009d",
            "\1\132\1\133\20\uffff\1\134\1\uffff\1\134\2\uffff\1\135\1\u009e",
            "\1\71\1\72\1\73\24\uffff\1\74",
            "\1\u009f\24\uffff\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u009f\24\uffff\1\u00a0",
            "\1\103\1\104\14\uffff\1\105",
            "\1\153\1\154\20\uffff\1\156\1\uffff\1\156\2\uffff\1\155\1\u00a3",
            "\1\160\1\161\17\uffff\1\162\5\uffff\1\163\1\u00a4",
            "\1\166\1\167\4\uffff\1\171\20\uffff\1\170\1\u00a5",
            "\1\173\1\174\17\uffff\1\175\5\uffff\1\176\1\u00a6",
            "\1\120\1\121\3\uffff\1\122\6\uffff\1\123",
            "\1\132\1\133\20\uffff\1\134\1\uffff\1\134\2\uffff\1\135",
            "",
            "",
            "\1\u009f\24\uffff\1\u00a0",
            "\1\u00a7",
            "\1\153\1\154\20\uffff\1\156\1\uffff\1\156\2\uffff\1\155",
            "\1\160\1\161\17\uffff\1\162\5\uffff\1\163",
            "\1\166\1\167\4\uffff\1\171\20\uffff\1\170",
            "\1\173\1\174\17\uffff\1\175\5\uffff\1\176",
            "\1\u009f\24\uffff\1\u00a0"
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
            return "61:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER a1= NB a2= MOIS | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN ARTICLE PARLER THEME ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR PARLER ARTICLE d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE ps= params | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN r= RUBRIQUE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params | COMBIEN SELECT ARTICLE AUTEUR ps= params | COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params | COMBIEN SELECT PARLER ps= params | COMBIEN SELECT THEME | ENTRE d1= jour ET d2= jour r= RUBRIQUE COMBIEN ARTICLE PARLER AUTEUR ps1= params ET PARLER ps2= param | PREMIER SELECT DATE PARLER ps= params | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR AUTEUR e= email | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE ps1= params THEME ps2= params | SELECT ARTICLE THEME ps= params | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE THEME ps= params ENTRE d1= jour ET d2= jour | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR ET EMAIL ARTICLE AUJOURDHUI | SELECT AUTEUR PLUS PUBLIE | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE | SELECT DATE ARTICLE AUTEUR ps= params | SELECT DATE ARTICLE RUBRIQUE e= email | SELECT DATE ARTICLE PARLER ps= params | SELECT DATE PLUS PARLER ps= params | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT PAGE PARLER ps= params | SELECT PAGE ARTICLE AUTEUR AUTEUR e= email | SELECT RESUME PARLER ps= params | SELECT r= RUBRIQUE ENTRE d1= jour ET d2= jour | SELECT r= RUBRIQUE PARLER ps= params | SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params | SELECT TITRE ET DATE ARTICLE PARLER ps= params | SELECT TITRE PARLER ps= params );";
        }
    }
 

    public static final BitSet FOLLOW_ARTICLE_in_requete367 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_dat_in_requete373 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete375 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NB_in_requete381 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MOIS_in_requete387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete395 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete397 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete411 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete413 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete415 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete429 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete431 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete433 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete439 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_dat_in_requete445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete453 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete455 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_THEME_in_requete459 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete473 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete475 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete483 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete497 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete499 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_email_in_requete505 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete507 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete523 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_email_in_requete529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete537 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete539 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete541 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete543 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_dat_in_requete549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete557 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete559 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete561 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete563 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENTRE_in_requete565 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete571 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete573 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete587 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete589 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete591 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete593 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete595 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_JOURS_in_requete611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete613 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete627 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_MOT_in_requete629 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete635 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete649 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_MOT_in_requete651 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete661 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete671 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_PAGE_in_requete673 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete675 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete689 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_PAGE_in_requete691 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete693 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete699 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_dat_in_requete705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete713 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete719 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete733 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete739 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete741 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete755 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete761 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete763 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete769 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENTRE_in_requete771 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete777 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete779 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete793 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete799 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENTRE_in_requete801 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete807 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete809 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete815 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete817 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete819 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete835 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete837 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete839 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete855 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete857 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_THEME_in_requete859 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete865 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete867 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete883 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete885 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete901 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_THEME_in_requete903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTRE_in_requete911 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete917 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete919 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete925 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMBIEN_in_requete933 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete935 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete937 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete939 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete947 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete949 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_requete955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREMIER_in_requete963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete965 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete967 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete969 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete983 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete987 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_email_in_requete993 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete995 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete997 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1011 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1013 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1015 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1029 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1031 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1033 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1035 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_email_in_requete1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1049 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1051 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_dat_in_requete1057 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1059 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_email_in_requete1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1073 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1075 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1077 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1083 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete1085 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_dat_in_requete1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1098 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1100 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1102 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1116 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1118 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1124 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_THEME_in_requete1126 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1140 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1142 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_THEME_in_requete1144 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1158 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1160 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1168 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1182 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1184 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_THEME_in_requete1186 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1192 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENTRE_in_requete1194 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete1200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete1202 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1216 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1218 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1220 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1222 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1236 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1238 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1240 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete1258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EMAIL_in_requete1260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1262 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_AUJOURDHUI_in_requete1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1272 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1274 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PLUS_in_requete1276 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_PUBLIE_in_requete1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1286 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMBIEN_in_requete1288 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1290 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1296 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_dat_in_requete1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMBIEN_in_requete1312 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete1318 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1326 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1336 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete1338 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1340 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1342 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete1358 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete1362 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_email_in_requete1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1376 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete1378 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1382 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1396 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete1398 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PLUS_in_requete1400 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1402 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1416 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EMAIL_in_requete1418 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1420 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_requete1426 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_requete1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1440 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_PAGE_in_requete1442 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1444 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_PAGE_in_requete1460 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1462 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1464 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1466 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_email_in_requete1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1480 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RESUME_in_requete1482 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1484 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1498 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete1504 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENTRE_in_requete1506 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete1512 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete1514 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_jour_in_requete1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1528 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete1534 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1536 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1550 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete1556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete1558 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RUBRIQUE_in_requete1564 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1566 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1580 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_TITRE_in_requete1582 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete1584 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DATE_in_requete1586 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1590 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1604 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_TITRE_in_requete1606 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1608 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_requete1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_dat1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOIS_in_dat1667 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NB_in_dat1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_dat1684 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MOIS_in_dat1690 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NB_in_dat1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_email1715 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_AT_in_email1721 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1727 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_POINT_in_email1733 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMAIL_in_email1746 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1752 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_AT_in_email1758 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1764 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_POINT_in_email1770 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMAIL_in_email1783 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AUTEUR_in_email1785 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1791 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_AT_in_email1797 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1803 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_POINT_in_email1809 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMAIL_in_email1822 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_AT_in_email1828 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1834 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_POINT_in_email1840 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_email1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_jour1866 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MOIS_in_jour1872 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NB_in_jour1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_jour1890 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MOIS_in_jour1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requete_in_listerequetes1922 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param1954 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_param1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param1971 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_param1977 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_param1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params2009 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_conj_in_params2020 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_params2026 = new BitSet(new long[]{0x00000000000000C2L});

}