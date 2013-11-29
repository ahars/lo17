grammar Tal_tp04;

/* UV : LO17 - TP04
 * Analyse Syntaxique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_tp04.g
 */

@lexer::header{package antlr.output;}
@parser::header{package antlr.output;}

ARTICLE : 'article';
AUTEUR : 'auteur';
COMBIEN : 'combien';
DATE : 'date';
ET : 'et';
FOCUS : 'focus';
GROSTITRES : 'gros titre';
OU : 'ou';
PAGE : 'page';
PARLER : 'parler';
POINT : '.'|'?';
RAPPELS : 'rappels';
SELECT : 'vouloir';
UNE : 'une';
VOIRAUSSI : 'voiraussi';

WS : (' ' |'\t' | '\r' | 'stop') { skip(); } | '\n';
VAR : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+;

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
			req_arbre.ajouteFils(new Arbre("", "select distinct"));
		}
		| COMBIEN {
			req_arbre.ajouteFils(new Arbre("", "select count("));
		})
		(ARTICLE PARLER {
			req_arbre.ajouteFils(new Arbre("", "article)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
			req_arbre.ajouteFils(new Arbre("", "where"));
		}
		| PAGE PARLER{
			req_arbre.ajouteFils(new Arbre("", "page)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
			req_arbre.ajouteFils(new Arbre("", "where"));
		}
		| UNE PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'une' AND"));
		}
		| VOIRAUSSI PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'voiraussi' AND"));
		}
		| FOCUS PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'focus' AND"));
		}
		| RAPPELS PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'rappels' AND"));
		}
		| GROSTITRES PARLER {
			req_arbre.ajouteFils(new Arbre("", "rubrique)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = 'grostitre' AND"));
		})
		ps = params {
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
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
			les_pars_arbre.ajouteFils(par2_arbre);
		})*;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR {
		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a.getText() + "'"));
	}
	| a1 = VAR a2 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", "mot = '" + a1.getText() + "' AND mot = '" + a2.getText() + "'"));
	};

conj returns [Arbre conj_arbre = new Arbre("")] :
	ET {
		conj_arbre.ajouteFils(new Arbre("", "AND"));
	}
	| OU {
		conj_arbre.ajouteFils(new Arbre("", "OR"));
	};
