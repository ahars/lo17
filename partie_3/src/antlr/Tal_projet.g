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
PAGE : 'page';
RAPPELS : 'rappels';
UNE : 'une';
VOIRAUSSI : 'voiraussi';

AT : '@';
NB : ('0'..'9')+;
POINT : '.';
VAR : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|'-'|('\u00a0'..'\u00ff'))+;

listerequetes returns [String sql = ""]
	@init {
		Arbre lr_arbre;
	} :
		r = requete POINT {
			lr_arbre = $r.req_arbre;
			sql = lr_arbre.sortArbre();
		};

requete returns [Arbre req_arbre = new Arbre("")]
	@init {
		Arbre ps_arbre;
	} :
		(SELECT {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
		}
		(ARTICLE PARLER {
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
		}
		| PAGE PARLER{
			req_arbre.ajouteFils(new Arbre("", "page "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
		}
		| UNE PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
		}
		| VOIRAUSSI PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
		}
		| FOCUS PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
		}
		| RAPPELS PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
		}
		| GROSTITRES PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
		})
		| ( COMBIEN {
			req_arbre.ajouteFils(new Arbre("", "select count("));
		})
		(ARTICLE PARLER {
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
		}
		| PAGE PARLER{
			req_arbre.ajouteFils(new Arbre("", "page) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
		}
		| UNE PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND mot = '"));
		}
		| VOIRAUSSI PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND mot = '"));
		}
		| FOCUS PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND mot = '"));
		}
		| RAPPELS PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND mot = '"));
		}
		| AUTEUR EMAIL AT a = VAR b = NB c = POINT {
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where email = '@" + a.getText() + b.getText() + c.getText()));
		}
		| ARTICLE SOURCE PARLER {
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp' AND mot = '"));
		}
		| GROSTITRES PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND mot = '"));
		}))
		ps = params {
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		| COMBIEN ARTICLE SOURCE {
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "etiquette) "));
			req_arbre.ajouteFils(new Arbre("", "from public.auteur "));
			req_arbre.ajouteFils(new Arbre("", "where etiquette = 'afp'"));
		}
		| COMBIEN ARTICLE PARLER ps = params d = NB{
			req_arbre.ajouteFils(new Arbre("", "select count("));
			req_arbre.ajouteFils(new Arbre("", "article) "));
			req_arbre.ajouteFils(new Arbre("", "from public.titre, public.datearticle "));
			req_arbre.ajouteFils(new Arbre("", "where public.titre.article = public.datearticle.article AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND annee = " + d.getText()));
		};

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init {
		Arbre par1_arbre, par2_arbre, conj_arbre;
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
		lepar_arbre.ajouteFils(new Arbre(a.getText() + "' "));
	}
	| a1 = VAR a2 = VAR {
		lepar_arbre.ajouteFils(new Arbre(a1.getText() + "' AND mot = '" + a2.getText() + "'"));
	}
	| a1 = VAR a2 = VAR a3 = VAR {
		lepar_arbre.ajouteFils(new Arbre(a1.getText() + "' AND mot = '" + a2.getText() + "' AND mot = '" + a3.getText() + "'"));
	};

conj returns [Arbre conj_arbre = new Arbre("")] :
	ET {
		conj_arbre.ajouteFils(new Arbre("", "AND "));
	}
	| OU {
		conj_arbre.ajouteFils(new Arbre("", "OR "));
	};
