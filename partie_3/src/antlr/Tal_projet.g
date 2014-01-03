grammar Tal_projet;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_projet.g
 */

@lexer::header {
package antlr.output;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_projetLexer.java
 */
}

@parser::header {
package antlr.output;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_projetParser.java
 */
}

SELECT : 'vouloir';
COMBIEN : 'combien';
ET : 'et';
OU : 'ou';
PARLER : 'parler';
SOURCE : 'afp';
WS : (' ' |'\t' | '\r' | 'stop') { skip(); } | '\n';

ARTICLE : 'article';
AUTEUR : 'auteur';
DATE : 'date';
EMAIL : 'email';
FOCUS : 'focus';
GROSTITRES : 'gros titre';
JOURS : 'jours';
PAGE : 'page';
PUBLIE : 'publie';
RAPPELS : 'rappels';
RESUME : 'resume';
THEME : 'theme';
UNE : 'une';
VOIRAUSSI : 'voiraussi';

AT : '@';
ENTRE : 'entre';
MOIS : 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'sept' | 'octobre' | 'novembre' | 'décembre';
MOT : 'mot';
NB : ('0'..'9')+;
PLUS : 'plus';
PREMIER : 'premier';

POINT : '.';
VAR : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|'-'|('\u00a0'..'\u00ff'))+;


requete returns [Arbre req_arbre = new Arbre("")]
	@init {
		Arbre ps_arbre, d_arbre;
	} :
		 ARTICLE d = dat PARLER a1 = NB a2 = MOIS {
			req_arbre.ajouteFils(new Arbre("", "select distinct"));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND mot = '" + a1.getText() + "' AND mot = '" + a2.getText() + "'"));
		}
		| COMBIEN ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN ARTICLE PARLER ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| COMBIEN ARTICLE PARLER THEME ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN ARTICLE SOURCE {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp'"));
		}
		| COMBIEN ARTICLE SOURCE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN AUTEUR EMAIL a1 = VAR AT a2 = VAR b = NB c = POINT a3 = VAR PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where email = '"));
			req_arbre.ajouteFils(new Arbre("", a1.getText() + "@" + a2.getText() + b.getText() + c.getText() + a3.getText()));
			req_arbre.ajouteFils(new Arbre("", "' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN AUTEUR EMAIL AT a = VAR b = NB c = POINT ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where email = '@" + a.getText() + b.getText() + c.getText()));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN AUTEUR PARLER ARTICLE d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| COMBIEN AUTEUR PARLER ARTICLE ENTRE d1 = jour ET d2 = jour {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
			req_arbre.ajouteFils(new Arbre("", "AND public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", " AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| COMBIEN AUTEUR PARLER ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN FOCUS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN GROSTITRES  ps = params  {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN GROSTITRES PARLER  ps = params  {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN GROSTITRES PARLER ps = params ENTRE d1 = jour ET d2 = jour {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = 'grostitre' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| COMBIEN JOURS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "jour) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN MOT ps = params RAPPELS {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "mot) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN MOT ps = params ET SELECT ARTICLE {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "mot)"));
			req_arbre.ajouteFils(new Arbre("", ", article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN PAGE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "page) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN RAPPELS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN SELECT ARTICLE AUTEUR ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN SELECT ARTICLE THEME ps1 = params PARLER ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN SELECT PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN SELECT THEME {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "mot) "));
			req_arbre.ajouteFils(new Arbre("", "from public.theme "));
		}
		| COMBIEN UNE ENTRE d1 = jour ET d2 = jour PARLER PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = 'une' "));
			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN UNE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN VOIRAUSSI PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| PREMIER SELECT DATE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct jour "));
			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE AUTEUR ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE AUTEUR AUTEUR EMAIL a1 = VAR AT a2 = VAR POINT ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '" + a1.getText() + "@" + a2.getText() + "."));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE PARLER THEME ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND public.theme.mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| SELECT ARTICLE a1 = VAR a2 = VAR  THEME ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.theme, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article AND "));
			req_arbre.ajouteFils(new Arbre("", "public.titre.mot = '" + a1.getText() + "' AND mot = '" + a2.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT AUTEUR ARTICLE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "etiquette "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.theme.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT AUTEUR PLUS PUBLIE {
			req_arbre.ajouteFils(new Arbre("", "select etiquette, count(article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "group by etiquette desc"));
		}
		| SELECT COMBIEN ARTICLE ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.datearticle.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| SELECT DATE PLUS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "annee "));
			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.theme.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT EMAIL AUTEUR a1 = VAR a2 = VAR {
			req_arbre.ajouteFils(new Arbre("", "select distinct email "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '" + a1.getText() + " " + a2.getText() + "'"));
		}
		| SELECT FOCUS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT GROSTITRES PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT PAGE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "page "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT RAPPELS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT RESUME PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titreresume "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT UNE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT VOIRAUSSI PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		};

listerequetes returns [String sql = ""]
	@init {
		Arbre lr_arbre;
	} :
		r = requete POINT {
			lr_arbre = $r.req_arbre;
			sql = lr_arbre.sortArbre();
		};



params returns [Arbre les_pars_arbre = new Arbre("")]
	@init {
		Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
	} :
		par1 = param {
			par1_arbre = $par1.lepar_arbre;
			les_pars_arbre.ajouteFils(par1_arbre);
		}
		(c = conj par2 = param {
			conj_arbre = $c.conj_arbre;
			par2_arbre = $par2.lepar_arbre;
			les_pars_arbre.ajouteFils(conj_arbre);
			les_pars_arbre.ajouteFils(new Arbre("", "mot = '"));
			les_pars_arbre.ajouteFils(par2_arbre);
		})*;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
	}
	| a1 = VAR a2 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' AND mot = '" + a2.getText() + "'"));
	}
	| a1 = VAR a2 = VAR a3 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' AND mot = '" + a2.getText() + "' AND mot = '" + a3.getText() + "'"));
	};

conj returns [Arbre conj_arbre = new Arbre("")] :
	ET {
		conj_arbre.ajouteFils(new Arbre("", "AND "));
	}
	| OU {
		conj_arbre.ajouteFils(new Arbre("", "OR "));
	};

dat returns [Arbre les_pars_arbre = new Arbre("")] :
	a = NB {
		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "'"));
	}
	| m = MOIS a = NB {
		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' AND annee = '" + a.getText() + "'"));
	}
	| j = NB m = MOIS a = NB {
		les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' AND mois = '" + m.getText() + "' AND annee = '" + a.getText() + "'"));
	};

jour returns [Arbre les_pars_arbre = new Arbre("")] :
	 j = NB m = MOIS a = NB {
		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + a.getText() + "'"));
	}
	|  j = NB m = MOIS {
		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + "'"));
	};

