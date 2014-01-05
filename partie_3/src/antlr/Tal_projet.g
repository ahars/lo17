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
WS : (' ' | '\t' | '\r' | 'stop') { skip(); } | '\n';

ARTICLE : 'article';
AUTEUR : 'auteur';
DATE : 'date';
EMAIL : 'email';
JOURS : 'jours';
PAGE : 'page';
PUBLIE : 'publie';
RESUME : 'resume';
THEME : 'theme';
TITRE : 'titre';
RUBRIQUE : 'une' | 'gros titre' | 'focus' | 'rappels' | 'voiraussi';

AUJOURDHUI : 'aujourd';
AT : '@';
ENTRE : 'entre';
MOIS : 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'sept' | 'octobre' | 'novembre' | 'décembre';
MOT : 'mot';
NB : ('0'..'9')+;
PLUS : 'plus';
PREMIER : 'premier';

POINT : '.';
VAR : ('A'..'Z' | 'a'..'z' | '\u00a0'..'\u00ff')(('a'..'z') | ('0'..'9') | '-' | ('\u00a0'..'\u00ff'))+;


requete returns [Arbre req_arbre = new Arbre("")]
	@init {
		Arbre ps_arbre, d_arbre;
	} :
		 ARTICLE d = dat PARLER a1 = NB a2 = MOIS {
			req_arbre.ajouteFils(new Arbre("", "select distinct"));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND mot = '" + a1.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "'"));
		}
		| COMBIEN ARTICLE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
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
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
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
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN ARTICLE ps1 = params PARLER ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN AUTEUR e = email PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN AUTEUR PARLER ARTICLE d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
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
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN JOURS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "jour) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN MOT ps = params r = RUBRIQUE {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "mot) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
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
		| COMBIEN PAGE PARLER ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "page) "));
			req_arbre.ajouteFils(new Arbre("", "from public.pagearticle, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.pagearticle.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| COMBIEN r = RUBRIQUE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN r = RUBRIQUE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN r = RUBRIQUE PARLER ps = params ENTRE d1 = jour ET d2 = jour {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| COMBIEN r = RUBRIQUE ENTRE d1 = jour ET d2 = jour PARLER PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
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
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN SELECT THEME {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "mot) "));
			req_arbre.ajouteFils(new Arbre("", "from public.theme "));
		}
		| ENTRE d1 = jour ET d2 = jour r = RUBRIQUE COMBIEN ARTICLE PARLER AUTEUR ps1 = params ET PARLER ps2 = param {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
			req_arbre.ajouteFils(new Arbre("", "AND public.datearticle = public.titre.article "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND etiquette = '"));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND mot = "));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| PREMIER SELECT DATE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct jour "));
			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE AUTEUR e = email ET PARLER r = RUBRIQUE {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.titre.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
		}
		| SELECT ARTICLE AUTEUR ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE AUTEUR AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE d = dat AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE PARLER ps = params DATE d = dat{
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $d.les_pars_arbre;
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
		| SELECT ARTICLE ps1 = params THEME ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE THEME ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE ps1 = params AUTEUR ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND etiquette = '"));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT ARTICLE THEME ps = params ENTRE d1 = jour ET d2 = jour {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article, mot "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.theme, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND public.titre.article = public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "AND public.theme.mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| SELECT AUTEUR ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "etiquette "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT AUTEUR ARTICLE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "etiquette "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT AUTEUR ET EMAIL ARTICLE AUJOURDHUI {
			req_arbre.ajouteFils(new Arbre("", "select etiquette, email "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.auteur.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND jour = CURRENT DATE "));
		}
		| SELECT AUTEUR PLUS PUBLIE {
			req_arbre.ajouteFils(new Arbre("", "select etiquette, count(article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "group by etiquette desc"));
		}
		| SELECT COMBIEN ARTICLE ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| SELECT COMBIEN r = RUBRIQUE ps = params AUTEUR DATE {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "rubrique), jour "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT DATE ARTICLE AUTEUR ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "annee, article "));
			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.auteur.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot ='"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT DATE ARTICLE RUBRIQUE e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "annee, article "));
			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.theme, public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND public.auteur.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT DATE ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "jour "));
			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.titre.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT DATE PLUS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "annee "));
			req_arbre.ajouteFils(new Arbre("", "from public.datearticle, public.theme "));
			req_arbre.ajouteFils(new Arbre("", "where public.datearticle.article = public.theme.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT EMAIL AUTEUR a1 = VAR a2 = VAR {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "email "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = '" + a1.getText() + " " + a2.getText() + "'"));
		}
		| SELECT PAGE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "page "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT PAGE ARTICLE AUTEUR AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "page "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.auteur.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $e.les_pars_arbre;
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
		| SELECT r = RUBRIQUE ENTRE d1 = jour ET d2 = jour {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		| SELECT r = RUBRIQUE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT r1 = RUBRIQUE ET r2 = RUBRIQUE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r1.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "OR rubrique = '" + r2.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT TITRE ET DATE ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "titre, jour "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| SELECT TITRE PARLER  ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "titre "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
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
		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
	}
	| m = MOIS a = NB {
		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	}
	| j = NB m = MOIS a = NB {
		les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	};

email returns [Arbre les_pars_arbre = new Arbre("")] :
	a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL AUTEUR a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL a = AT a1 = VAR p = POINT a2 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a.getText() + a1.getText() + p.getText() + a2.getText() + "' "));
	};

jour returns [Arbre les_pars_arbre = new Arbre("")] :
	 j = NB m = MOIS a = NB {
		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + a.getText() + "' "));
	}
	|  j = NB m = MOIS {
		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + "' "));
	};

listerequetes returns [String sql = ""]
	@init {
		Arbre lr_arbre;
	} :
		r = requete POINT {
			lr_arbre = $r.req_arbre;
			sql = lr_arbre.sortArbre();
		};

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
	}
	| a1 = VAR a2 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
	}
	| a1 = VAR a2 = VAR a3 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a3.getText() + "' "));
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
