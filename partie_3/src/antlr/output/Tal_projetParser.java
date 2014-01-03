// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g 2014-01-04 00:43:48

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COMBIEN", "ET", "OU", "PARLER", "SOURCE", "WS", "ARTICLE", "AUTEUR", "DATE", "EMAIL", "FOCUS", "GROSTITRES", "JOURS", "PAGE", "PUBLIE", "RAPPELS", "RESUME", "THEME", "UNE", "VOIRAUSSI", "AT", "ENTRE", "MOIS", "MOT", "NB", "PLUS", "PREMIER", "POINT", "VAR"
    };
    public static final int FOCUS=15;
    public static final int UNE=23;
    public static final int VOIRAUSSI=24;
    public static final int POINT=32;
    public static final int THEME=22;
    public static final int COMBIEN=5;
    public static final int SOURCE=9;
    public static final int EOF=-1;
    public static final int EMAIL=14;
    public static final int MOT=28;
    public static final int RAPPELS=20;
    public static final int JOURS=17;
    public static final int AUTEUR=12;
    public static final int AT=25;
    public static final int RESUME=21;
    public static final int WS=10;
    public static final int PAGE=18;
    public static final int PARLER=8;
    public static final int OU=7;
    public static final int MOIS=27;
    public static final int PLUS=30;
    public static final int VAR=33;
    public static final int ET=6;
    public static final int DATE=13;
    public static final int PUBLIE=19;
    public static final int SELECT=4;
    public static final int NB=29;
    public static final int ARTICLE=11;
    public static final int GROSTITRES=16;
    public static final int PREMIER=31;
    public static final int ENTRE=26;

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:64:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER a1= NB a2= MOIS | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN ARTICLE PARLER THEME ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE SOURCE PARLER ps= params | COMBIEN AUTEUR EMAIL a1= VAR AT a2= VAR b= NB c= POINT a3= VAR PARLER ps= params | COMBIEN AUTEUR EMAIL AT a= VAR b= NB c= POINT ps= params | COMBIEN AUTEUR PARLER ARTICLE d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN FOCUS PARLER ps= params | COMBIEN GROSTITRES ps= params | COMBIEN GROSTITRES PARLER ps= params | COMBIEN GROSTITRES PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params RAPPELS | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN PAGE PARLER ps= params | COMBIEN RAPPELS PARLER ps= params | COMBIEN SELECT ARTICLE AUTEUR ps= params | COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params | COMBIEN SELECT PARLER ps= params | COMBIEN SELECT THEME | COMBIEN UNE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params | COMBIEN UNE PARLER ps= params | COMBIEN VOIRAUSSI PARLER ps= params | PREMIER SELECT DATE PARLER ps= params | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR AUTEUR EMAIL a1= VAR AT a2= VAR POINT ps= params | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE PARLER THEME ps= params d= dat | SELECT ARTICLE a1= VAR a2= VAR THEME ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR PLUS PUBLIE | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT DATE PLUS PARLER ps= params | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT FOCUS PARLER ps= params | SELECT GROSTITRES PARLER ps= params | SELECT PAGE PARLER ps= params | SELECT RAPPELS PARLER ps= params | SELECT RESUME PARLER ps= params | SELECT UNE PARLER ps= params | SELECT VOIRAUSSI PARLER ps= params );
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Token a1=null;
        Token a2=null;
        Token b=null;
        Token c=null;
        Token a3=null;
        Token a=null;
        Arbre d = null;

        Arbre ps = null;

        Arbre d1 = null;

        Arbre d2 = null;

        Arbre ps1 = null;

        Arbre ps2 = null;



        		Arbre ps_arbre, d_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:67:4: ( ARTICLE d= dat PARLER a1= NB a2= MOIS | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN ARTICLE PARLER THEME ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE SOURCE PARLER ps= params | COMBIEN AUTEUR EMAIL a1= VAR AT a2= VAR b= NB c= POINT a3= VAR PARLER ps= params | COMBIEN AUTEUR EMAIL AT a= VAR b= NB c= POINT ps= params | COMBIEN AUTEUR PARLER ARTICLE d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN FOCUS PARLER ps= params | COMBIEN GROSTITRES ps= params | COMBIEN GROSTITRES PARLER ps= params | COMBIEN GROSTITRES PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params RAPPELS | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN PAGE PARLER ps= params | COMBIEN RAPPELS PARLER ps= params | COMBIEN SELECT ARTICLE AUTEUR ps= params | COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params | COMBIEN SELECT PARLER ps= params | COMBIEN SELECT THEME | COMBIEN UNE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params | COMBIEN UNE PARLER ps= params | COMBIEN VOIRAUSSI PARLER ps= params | PREMIER SELECT DATE PARLER ps= params | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR AUTEUR EMAIL a1= VAR AT a2= VAR POINT ps= params | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE PARLER THEME ps= params d= dat | SELECT ARTICLE a1= VAR a2= VAR THEME ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR PLUS PUBLIE | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT DATE PLUS PARLER ps= params | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT FOCUS PARLER ps= params | SELECT GROSTITRES PARLER ps= params | SELECT PAGE PARLER ps= params | SELECT RAPPELS PARLER ps= params | SELECT RESUME PARLER ps= params | SELECT UNE PARLER ps= params | SELECT VOIRAUSSI PARLER ps= params )
            int alt1=45;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:68:4: ARTICLE d= dat PARLER a1= NB a2= MOIS
                    {
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete357); 
                    pushFollow(FOLLOW_dat_in_requete363);
                    d=dat();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete365); 
                    a1=(Token)match(input,NB,FOLLOW_NB_in_requete371); 
                    a2=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete377); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct"));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    			req_arbre.ajouteFils(new Arbre("", " AND mot = '" + a1.getText() + "' AND mot = '" + a2.getText() + "'"));
                    		

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:77:5: COMBIEN ARTICLE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete385); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete387); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete389); 
                    pushFollow(FOLLOW_params_in_requete395);
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
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:85:5: COMBIEN ARTICLE PARLER ps= params d= dat
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete403); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete405); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete407); 
                    pushFollow(FOLLOW_params_in_requete413);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete419);
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:96:5: COMBIEN ARTICLE PARLER THEME ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete427); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete429); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete431); 
                    match(input,THEME,FOLLOW_THEME_in_requete433); 
                    pushFollow(FOLLOW_params_in_requete439);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 5 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:104:5: COMBIEN ARTICLE SOURCE
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete447); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete449); 
                    match(input,SOURCE,FOLLOW_SOURCE_in_requete451); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp'"));
                    		

                    }
                    break;
                case 6 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:110:5: COMBIEN ARTICLE SOURCE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete459); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete461); 
                    match(input,SOURCE,FOLLOW_SOURCE_in_requete463); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete465); 
                    pushFollow(FOLLOW_params_in_requete471);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 7 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:118:5: COMBIEN AUTEUR EMAIL a1= VAR AT a2= VAR b= NB c= POINT a3= VAR PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete479); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete481); 
                    match(input,EMAIL,FOLLOW_EMAIL_in_requete483); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_requete489); 
                    match(input,AT,FOLLOW_AT_in_requete491); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_requete497); 
                    b=(Token)match(input,NB,FOLLOW_NB_in_requete503); 
                    c=(Token)match(input,POINT,FOLLOW_POINT_in_requete509); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_requete515); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete517); 
                    pushFollow(FOLLOW_params_in_requete523);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where email = '"));
                    			req_arbre.ajouteFils(new Arbre("", a1.getText() + "@" + a2.getText() + b.getText() + c.getText() + a3.getText()));
                    			req_arbre.ajouteFils(new Arbre("", "' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 8 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:128:5: COMBIEN AUTEUR EMAIL AT a= VAR b= NB c= POINT ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete531); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete533); 
                    match(input,EMAIL,FOLLOW_EMAIL_in_requete535); 
                    match(input,AT,FOLLOW_AT_in_requete537); 
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_requete543); 
                    b=(Token)match(input,NB,FOLLOW_NB_in_requete549); 
                    c=(Token)match(input,POINT,FOLLOW_POINT_in_requete555); 
                    pushFollow(FOLLOW_params_in_requete561);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where email = '@" + a.getText() + b.getText() + c.getText()));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 9 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:136:5: COMBIEN AUTEUR PARLER ARTICLE d= dat
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete569); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete571); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete573); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete575); 
                    pushFollow(FOLLOW_dat_in_requete581);
                    d=dat();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article AND "));
                    			d_arbre = d;
                    			req_arbre.ajouteFils(d_arbre);
                    		

                    }
                    break;
                case 10 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:144:5: COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete589); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete591); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete593); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete595); 
                    match(input,ENTRE,FOLLOW_ENTRE_in_requete597); 
                    pushFollow(FOLLOW_jour_in_requete603);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete605); 
                    pushFollow(FOLLOW_jour_in_requete611);
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:157:5: COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete619); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete621); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete623); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete625); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete627); 
                    pushFollow(FOLLOW_params_in_requete633);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 12 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:165:5: COMBIEN FOCUS PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete641); 
                    match(input,FOCUS,FOLLOW_FOCUS_in_requete643); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete645); 
                    pushFollow(FOLLOW_params_in_requete651);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 13 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:173:5: COMBIEN GROSTITRES ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete659); 
                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete661); 
                    pushFollow(FOLLOW_params_in_requete668);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 14 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:181:5: COMBIEN GROSTITRES PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete677); 
                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete679); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete681); 
                    pushFollow(FOLLOW_params_in_requete688);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 15 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:189:5: COMBIEN GROSTITRES PARLER ps= params ENTRE d1= jour ET d2= jour
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete697); 
                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete699); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete701); 
                    pushFollow(FOLLOW_params_in_requete707);
                    ps=params();

                    state._fsp--;

                    match(input,ENTRE,FOLLOW_ENTRE_in_requete709); 
                    pushFollow(FOLLOW_jour_in_requete715);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete717); 
                    pushFollow(FOLLOW_jour_in_requete723);
                    d2=jour();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND rubrique = 'grostitre' AND mot = '"));
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
                case 16 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:204:5: COMBIEN JOURS PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete731); 
                    match(input,JOURS,FOLLOW_JOURS_in_requete733); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete735); 
                    pushFollow(FOLLOW_params_in_requete741);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "jour) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 17 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:212:5: COMBIEN MOT ps= params RAPPELS
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete749); 
                    match(input,MOT,FOLLOW_MOT_in_requete751); 
                    pushFollow(FOLLOW_params_in_requete757);
                    ps=params();

                    state._fsp--;

                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete759); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "mot) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 18 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:220:5: COMBIEN MOT ps= params ET SELECT ARTICLE
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete767); 
                    match(input,MOT,FOLLOW_MOT_in_requete769); 
                    pushFollow(FOLLOW_params_in_requete775);
                    ps=params();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete777); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete779); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete781); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "mot)"));
                    			req_arbre.ajouteFils(new Arbre("", ", article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 19 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:229:5: COMBIEN PAGE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete789); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete791); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete793); 
                    pushFollow(FOLLOW_params_in_requete799);
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
                case 20 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:237:5: COMBIEN RAPPELS PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete807); 
                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete809); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete811); 
                    pushFollow(FOLLOW_params_in_requete817);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 21 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:245:5: COMBIEN SELECT ARTICLE AUTEUR ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete825); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete827); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete829); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete831); 
                    pushFollow(FOLLOW_params_in_requete837);
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:253:5: COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete845); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete847); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete849); 
                    match(input,THEME,FOLLOW_THEME_in_requete851); 
                    pushFollow(FOLLOW_params_in_requete857);
                    ps1=params();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete859); 
                    pushFollow(FOLLOW_params_in_requete865);
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:264:5: COMBIEN SELECT PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete873); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete875); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete877); 
                    pushFollow(FOLLOW_params_in_requete883);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 24 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:272:5: COMBIEN SELECT THEME
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete891); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete893); 
                    match(input,THEME,FOLLOW_THEME_in_requete895); 

                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "mot) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.theme "));
                    		

                    }
                    break;
                case 25 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:277:5: COMBIEN UNE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete903); 
                    match(input,UNE,FOLLOW_UNE_in_requete905); 
                    match(input,ENTRE,FOLLOW_ENTRE_in_requete907); 
                    pushFollow(FOLLOW_jour_in_requete913);
                    d1=jour();

                    state._fsp--;

                    match(input,ET,FOLLOW_ET_in_requete915); 
                    pushFollow(FOLLOW_jour_in_requete921);
                    d2=jour();

                    state._fsp--;

                    match(input,PARLER,FOLLOW_PARLER_in_requete923); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete925); 
                    pushFollow(FOLLOW_params_in_requete931);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
                    			req_arbre.ajouteFils(new Arbre("", "AND rubrique = 'une' "));
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
                case 26 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:293:5: COMBIEN UNE PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete939); 
                    match(input,UNE,FOLLOW_UNE_in_requete941); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete943); 
                    pushFollow(FOLLOW_params_in_requete949);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 27 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:301:5: COMBIEN VOIRAUSSI PARLER ps= params
                    {
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete957); 
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete959); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete961); 
                    pushFollow(FOLLOW_params_in_requete967);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select count("));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 28 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:309:5: PREMIER SELECT DATE PARLER ps= params
                    {
                    match(input,PREMIER,FOLLOW_PREMIER_in_requete975); 
                    match(input,SELECT,FOLLOW_SELECT_in_requete977); 
                    match(input,DATE,FOLLOW_DATE_in_requete979); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete981); 
                    pushFollow(FOLLOW_params_in_requete987);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct jour "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 29 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:316:5: SELECT ARTICLE AUTEUR ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete995); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete997); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete999); 
                    pushFollow(FOLLOW_params_in_requete1005);
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
                case 30 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:324:5: SELECT ARTICLE AUTEUR AUTEUR EMAIL a1= VAR AT a2= VAR POINT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1013); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1015); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1017); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1019); 
                    match(input,EMAIL,FOLLOW_EMAIL_in_requete1021); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_requete1027); 
                    match(input,AT,FOLLOW_AT_in_requete1029); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_requete1035); 
                    match(input,POINT,FOLLOW_POINT_in_requete1037); 
                    pushFollow(FOLLOW_params_in_requete1043);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '" + a1.getText() + "@" + a2.getText() + "."));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 31 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:332:5: SELECT ARTICLE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1051); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1053); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1055); 
                    pushFollow(FOLLOW_params_in_requete1061);
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
                case 32 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:340:5: SELECT ARTICLE PARLER THEME ps= params d= dat
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1069); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1071); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1073); 
                    match(input,THEME,FOLLOW_THEME_in_requete1075); 
                    pushFollow(FOLLOW_params_in_requete1081);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete1087);
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
                case 33 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:351:5: SELECT ARTICLE a1= VAR a2= VAR THEME ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1095); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1097); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_requete1103); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_requete1109); 
                    match(input,THEME,FOLLOW_THEME_in_requete1112); 
                    pushFollow(FOLLOW_params_in_requete1118);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "article "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.theme, public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND "));
                    			req_arbre.ajouteFils(new Arbre("", "public.titre.mot = '" + a1.getText() + "' AND mot = '" + a2.getText() + "' "));
                    			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 34 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:361:5: SELECT AUTEUR ARTICLE ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1126); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1128); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1130); 
                    pushFollow(FOLLOW_params_in_requete1136);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "etiquette "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.theme.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 35 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:369:5: SELECT AUTEUR PLUS PUBLIE
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1144); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1146); 
                    match(input,PLUS,FOLLOW_PLUS_in_requete1148); 
                    match(input,PUBLIE,FOLLOW_PUBLIE_in_requete1150); 

                    			req_arbre.ajouteFils(new Arbre("", "select etiquette, count(article) "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "group by etiquette desc"));
                    		

                    }
                    break;
                case 36 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:374:5: SELECT COMBIEN ARTICLE ps= params d= dat
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1158); 
                    match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1160); 
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1162); 
                    pushFollow(FOLLOW_params_in_requete1168);
                    ps=params();

                    state._fsp--;

                    pushFollow(FOLLOW_dat_in_requete1174);
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
                case 37 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:385:5: SELECT DATE PLUS PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1182); 
                    match(input,DATE,FOLLOW_DATE_in_requete1184); 
                    match(input,PLUS,FOLLOW_PLUS_in_requete1186); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1188); 
                    pushFollow(FOLLOW_params_in_requete1194);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "annee "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.theme "));
                    			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.theme.article AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 38 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:393:5: SELECT EMAIL AUTEUR a1= VAR a2= VAR
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1202); 
                    match(input,EMAIL,FOLLOW_EMAIL_in_requete1204); 
                    match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1206); 
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_requete1212); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_requete1218); 

                    			req_arbre.ajouteFils(new Arbre("", "select distinct email "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
                    			req_arbre.ajouteFils(new Arbre("", "where etiquette = '" + a1.getText() + " " + a2.getText() + "'"));
                    		

                    }
                    break;
                case 39 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:398:5: SELECT FOCUS PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1226); 
                    match(input,FOCUS,FOLLOW_FOCUS_in_requete1228); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1230); 
                    pushFollow(FOLLOW_params_in_requete1236);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 40 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:406:5: SELECT GROSTITRES PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1244); 
                    match(input,GROSTITRES,FOLLOW_GROSTITRES_in_requete1246); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1248); 
                    pushFollow(FOLLOW_params_in_requete1254);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 41 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:414:5: SELECT PAGE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1262); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete1264); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1266); 
                    pushFollow(FOLLOW_params_in_requete1272);
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
                case 42 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:422:5: SELECT RAPPELS PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1280); 
                    match(input,RAPPELS,FOLLOW_RAPPELS_in_requete1282); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1284); 
                    pushFollow(FOLLOW_params_in_requete1290);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 43 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:430:5: SELECT RESUME PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1298); 
                    match(input,RESUME,FOLLOW_RESUME_in_requete1300); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1302); 
                    pushFollow(FOLLOW_params_in_requete1308);
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
                case 44 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:438:5: SELECT UNE PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1316); 
                    match(input,UNE,FOLLOW_UNE_in_requete1318); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1320); 
                    pushFollow(FOLLOW_params_in_requete1326);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 45 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:446:5: SELECT VOIRAUSSI PARLER ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete1334); 
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_requete1336); 
                    match(input,PARLER,FOLLOW_PARLER_in_requete1338); 
                    pushFollow(FOLLOW_params_in_requete1344);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("", "select distinct "));
                    			req_arbre.ajouteFils(new Arbre("", "rubrique "));
                    			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
                    			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
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


    // $ANTLR start "listerequetes"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:455:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;



        		Arbre lr_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:458:4: (r= requete POINT )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:459:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes1370);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes1372); 

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


    // $ANTLR start "params"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:466:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;



        		Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
        	
        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:469:4: (par1= param (c= conj par2= param )* )
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:470:3: par1= param (c= conj par2= param )*
            {
            pushFollow(FOLLOW_param_in_params1400);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:474:3: (c= conj par2= param )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ET) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==VAR) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==OU) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:474:4: c= conj par2= param
            	    {
            	    pushFollow(FOLLOW_conj_in_params1411);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params1417);
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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:482:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR );
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:482:51: (a= VAR | a1= VAR a2= VAR | a1= VAR a2= VAR a3= VAR )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VAR) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==VAR) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==VAR) ) {
                        alt3=3;
                    }
                    else if ( ((LA3_2>=ET && LA3_2<=PARLER)||LA3_2==RAPPELS||(LA3_2>=ENTRE && LA3_2<=MOIS)||LA3_2==NB||LA3_2==POINT) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_1>=ET && LA3_1<=PARLER)||LA3_1==RAPPELS||(LA3_1>=ENTRE && LA3_1<=MOIS)||LA3_1==NB||LA3_1==POINT) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:483:2: a= VAR
                    {
                    a=(Token)match(input,VAR,FOLLOW_VAR_in_param1438); 

                    		lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:486:4: a1= VAR a2= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1449); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1455); 

                    		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' AND mot = '" + a2.getText() + "'"));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:489:4: a1= VAR a2= VAR a3= VAR
                    {
                    a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1466); 
                    a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1472); 
                    a3=(Token)match(input,VAR,FOLLOW_VAR_in_param1478); 

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:493:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:493:49: ( ET | OU )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ET) ) {
                alt4=1;
            }
            else if ( (LA4_0==OU) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:494:2: ET
                    {
                    match(input,ET,FOLLOW_ET_in_conj1493); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND "));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:497:4: OU
                    {
                    match(input,OU,FOLLOW_OU_in_conj1500); 

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
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:501:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NB | m= MOIS a= NB | j= NB m= MOIS a= NB );
    public final Arbre dat() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Token a=null;
        Token m=null;
        Token j=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:501:52: (a= NB | m= MOIS a= NB | j= NB m= MOIS a= NB )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NB) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==MOIS) ) {
                    alt5=3;
                }
                else if ( (LA5_1==PARLER||LA5_1==POINT) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==MOIS) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:502:2: a= NB
                    {
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat1519); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "'"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:505:4: m= MOIS a= NB
                    {
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1530); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat1536); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' AND annee = '" + a.getText() + "'"));
                    	

                    }
                    break;
                case 3 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:508:4: j= NB m= MOIS a= NB
                    {
                    j=(Token)match(input,NB,FOLLOW_NB_in_dat1547); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1553); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_dat1559); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' AND mois = '" + m.getText() + "' AND annee = '" + a.getText() + "'"));
                    	

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


    // $ANTLR start "jour"
    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:512:1: jour returns [Arbre les_pars_arbre = new Arbre(\"\")] : (j= NB m= MOIS a= NB | j= NB m= MOIS );
    public final Arbre jour() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Token j=null;
        Token m=null;
        Token a=null;

        try {
            // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:512:53: (j= NB m= MOIS a= NB | j= NB m= MOIS )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NB) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==MOIS) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==NB) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==ET||LA6_2==PARLER||LA6_2==POINT) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
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
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:513:3: j= NB m= MOIS a= NB
                    {
                    j=(Token)match(input,NB,FOLLOW_NB_in_jour1579); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_jour1585); 
                    a=(Token)match(input,NB,FOLLOW_NB_in_jour1591); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + a.getText() + "'"));
                    	

                    }
                    break;
                case 2 :
                    // /home/jehu/Documents/git/lo17/partie_3/src/antlr/Tal_projet.g:516:5: j= NB m= MOIS
                    {
                    j=(Token)match(input,NB,FOLLOW_NB_in_jour1603); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_jour1609); 

                    		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + "'"));
                    	

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\131\uffff";
    static final String DFA1_eofS =
        "\131\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\2\10\1\uffff\1\10\1\uffff\1\41\2\uffff"+
        "\2\10\1\uffff\1\10\1\13\12\uffff\1\26\1\10\1\31\1\13\1\41\1\uffff"+
        "\1\6\1\14\4\uffff\1\14\1\26\4\uffff\1\6\4\uffff\1\10\2\6\1\4\1\41"+
        "\7\uffff\1\6\2\41\5\uffff\1\6\2\41\2\uffff\1\6\1\uffff\13\6";
    static final String DFA1_maxS =
        "\1\37\1\uffff\1\34\1\uffff\1\30\1\11\1\16\1\uffff\1\41\1\uffff\1"+
        "\41\2\uffff\1\26\1\32\1\uffff\1\41\1\36\12\uffff\1\41\1\40\1\41"+
        "\1\13\1\41\1\uffff\1\41\1\26\4\uffff\2\41\4\uffff\1\41\4\uffff\1"+
        "\35\4\41\7\uffff\3\41\5\uffff\3\41\2\uffff\1\24\1\uffff\1\41\1\40"+
        "\1\41\1\40\4\41\1\24\2\40";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\34\3\uffff\1\14\1\uffff\1\20\1\uffff\1\23"+
        "\1\24\2\uffff\1\33\2\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1"+
        "\53\1\54\1\55\5\uffff\1\15\2\uffff\1\27\1\30\1\31\1\32\2\uffff\1"+
        "\41\1\42\1\43\1\4\1\uffff\1\6\1\5\1\7\1\10\5\uffff\1\21\1\25\1\26"+
        "\1\36\1\35\1\40\1\37\3\uffff\1\2\1\3\1\12\1\13\1\11\3\uffff\1\16"+
        "\1\17\1\uffff\1\22\13\uffff";
    static final String DFA1_specialS =
        "\131\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\1\2\5\uffff\1\1\23\uffff\1\3",
            "",
            "\1\15\6\uffff\1\5\1\6\2\uffff\1\7\1\10\1\11\1\13\1\uffff\1"+
            "\14\2\uffff\1\16\1\17\3\uffff\1\12",
            "",
            "\1\22\5\uffff\1\20\1\21\1\23\1\24\1\25\1\26\1\uffff\1\27\1"+
            "\uffff\1\30\1\31\1\uffff\1\32\1\33",
            "\1\34\1\35",
            "\1\37\5\uffff\1\36",
            "",
            "\1\40\30\uffff\1\41",
            "",
            "\1\42",
            "",
            "",
            "\1\44\2\uffff\1\43\12\uffff\1\45",
            "\1\47\21\uffff\1\46",
            "",
            "\1\51\3\uffff\1\50\24\uffff\1\52",
            "\1\53\22\uffff\1\54",
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
            "\1\55\12\uffff\1\56",
            "\1\57\27\uffff\1\60",
            "\1\62\7\uffff\1\61",
            "\1\63",
            "\1\64",
            "",
            "\1\66\1\67\14\uffff\1\70\14\uffff\1\65",
            "\1\71\11\uffff\1\72",
            "",
            "",
            "",
            "",
            "\1\73\24\uffff\1\74",
            "\1\75\12\uffff\1\76",
            "",
            "",
            "",
            "",
            "\1\100\1\101\23\uffff\1\103\1\uffff\1\103\2\uffff\1\102\1\77",
            "",
            "",
            "",
            "",
            "\1\105\21\uffff\1\104\1\106\1\uffff\1\106",
            "\1\110\1\111\22\uffff\1\113\5\uffff\1\112\1\107",
            "\1\66\1\67\14\uffff\1\70\14\uffff\1\114",
            "\1\115\34\uffff\1\116",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100\1\101\23\uffff\1\103\1\uffff\1\103\2\uffff\1\102\1\117",
            "\1\120",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "\1\110\1\111\22\uffff\1\113\5\uffff\1\112\1\121",
            "\1\122",
            "\1\122",
            "",
            "",
            "\1\66\1\67\14\uffff\1\70",
            "",
            "\1\66\1\67\14\uffff\1\70\14\uffff\1\123",
            "\1\100\1\101\23\uffff\1\103\1\uffff\1\103\2\uffff\1\102",
            "\1\100\1\101\23\uffff\1\103\1\uffff\1\103\2\uffff\1\102\1\124",
            "\1\110\1\111\22\uffff\1\113\5\uffff\1\112",
            "\1\110\1\111\22\uffff\1\113\5\uffff\1\112\1\125",
            "\1\66\1\67\14\uffff\1\70\14\uffff\1\126",
            "\1\100\1\101\23\uffff\1\103\1\uffff\1\103\2\uffff\1\102\1\127",
            "\1\110\1\111\22\uffff\1\113\5\uffff\1\112\1\130",
            "\1\66\1\67\14\uffff\1\70",
            "\1\100\1\101\23\uffff\1\103\1\uffff\1\103\2\uffff\1\102",
            "\1\110\1\111\22\uffff\1\113\5\uffff\1\112"
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
            return "64:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER a1= NB a2= MOIS | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN ARTICLE PARLER THEME ps= params | COMBIEN ARTICLE SOURCE | COMBIEN ARTICLE SOURCE PARLER ps= params | COMBIEN AUTEUR EMAIL a1= VAR AT a2= VAR b= NB c= POINT a3= VAR PARLER ps= params | COMBIEN AUTEUR EMAIL AT a= VAR b= NB c= POINT ps= params | COMBIEN AUTEUR PARLER ARTICLE d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= jour ET d2= jour | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN FOCUS PARLER ps= params | COMBIEN GROSTITRES ps= params | COMBIEN GROSTITRES PARLER ps= params | COMBIEN GROSTITRES PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params RAPPELS | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN PAGE PARLER ps= params | COMBIEN RAPPELS PARLER ps= params | COMBIEN SELECT ARTICLE AUTEUR ps= params | COMBIEN SELECT ARTICLE THEME ps1= params PARLER ps2= params | COMBIEN SELECT PARLER ps= params | COMBIEN SELECT THEME | COMBIEN UNE ENTRE d1= jour ET d2= jour PARLER PARLER ps= params | COMBIEN UNE PARLER ps= params | COMBIEN VOIRAUSSI PARLER ps= params | PREMIER SELECT DATE PARLER ps= params | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR AUTEUR EMAIL a1= VAR AT a2= VAR POINT ps= params | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE PARLER THEME ps= params d= dat | SELECT ARTICLE a1= VAR a2= VAR THEME ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR PLUS PUBLIE | SELECT COMBIEN ARTICLE ps= params d= dat | SELECT DATE PLUS PARLER ps= params | SELECT EMAIL AUTEUR a1= VAR a2= VAR | SELECT FOCUS PARLER ps= params | SELECT GROSTITRES PARLER ps= params | SELECT PAGE PARLER ps= params | SELECT RAPPELS PARLER ps= params | SELECT RESUME PARLER ps= params | SELECT UNE PARLER ps= params | SELECT VOIRAUSSI PARLER ps= params );";
        }
    }
 

    public static final BitSet FOLLOW_ARTICLE_in_requete357 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_dat_in_requete363 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete365 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NB_in_requete371 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_MOIS_in_requete377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete385 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete387 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete389 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete403 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete405 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete407 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete413 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_dat_in_requete419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete427 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete429 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete431 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_THEME_in_requete433 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete447 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete449 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SOURCE_in_requete451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete461 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SOURCE_in_requete463 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete465 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete479 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete481 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EMAIL_in_requete483 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete489 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AT_in_requete491 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete497 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NB_in_requete503 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_POINT_in_requete509 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete515 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete531 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EMAIL_in_requete535 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AT_in_requete537 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete543 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NB_in_requete549 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_POINT_in_requete555 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete569 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete573 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete575 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_dat_in_requete581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete591 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete593 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete595 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENTRE_in_requete597 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_jour_in_requete603 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete605 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_jour_in_requete611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete619 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete621 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete623 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete625 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete627 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FOCUS_in_requete643 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete645 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete659 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete661 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete677 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete681 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete697 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete699 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete701 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete707 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENTRE_in_requete709 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_jour_in_requete715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete717 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_jour_in_requete723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete731 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_JOURS_in_requete733 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete735 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete749 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_MOT_in_requete751 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete757 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete767 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_MOT_in_requete769 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete779 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete789 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PAGE_in_requete791 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete793 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete807 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete809 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete811 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete827 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete829 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete831 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete847 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete849 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_THEME_in_requete851 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete857 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete859 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete875 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete877 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete893 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_THEME_in_requete895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete903 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_UNE_in_requete905 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENTRE_in_requete907 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_jour_in_requete913 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ET_in_requete915 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_jour_in_requete921 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete923 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete925 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete939 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_UNE_in_requete941 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete943 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMBIEN_in_requete957 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete959 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete961 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREMIER_in_requete975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SELECT_in_requete977 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DATE_in_requete979 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete981 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete995 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete997 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete999 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1013 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1015 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1017 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1019 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EMAIL_in_requete1021 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete1027 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AT_in_requete1029 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete1035 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_POINT_in_requete1037 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1051 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1053 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1055 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1069 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1071 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1073 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_THEME_in_requete1075 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1081 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_dat_in_requete1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1095 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1097 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete1103 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete1109 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_THEME_in_requete1112 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1126 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1128 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1130 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1146 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PLUS_in_requete1148 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_PUBLIE_in_requete1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COMBIEN_in_requete1160 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ARTICLE_in_requete1162 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1168 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_dat_in_requete1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DATE_in_requete1184 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PLUS_in_requete1186 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1188 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1202 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EMAIL_in_requete1204 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AUTEUR_in_requete1206 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete1212 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_requete1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1226 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FOCUS_in_requete1228 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1230 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1244 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_GROSTITRES_in_requete1246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1248 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1262 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PAGE_in_requete1264 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1266 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1280 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RAPPELS_in_requete1282 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1284 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1298 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RESUME_in_requete1300 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1302 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1316 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_UNE_in_requete1318 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1320 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete1334 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_requete1336 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PARLER_in_requete1338 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_params_in_requete1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requete_in_listerequetes1370 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1400 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_conj_in_params1411 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_param_in_params1417 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_VAR_in_param1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param1449 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_param1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_param1466 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_param1472 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_in_param1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ET_in_conj1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OU_in_conj1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_dat1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOIS_in_dat1530 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NB_in_dat1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_dat1547 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_MOIS_in_dat1553 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NB_in_dat1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_jour1579 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_MOIS_in_jour1585 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NB_in_jour1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NB_in_jour1603 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_MOIS_in_jour1609 = new BitSet(new long[]{0x0000000000000002L});

}