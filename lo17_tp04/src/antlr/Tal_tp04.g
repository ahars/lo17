grammar Tal_tp04;

/* UV : LO17 - TP04
 * Analyse Syntaxique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tal_tp04.g
 */

@lexer::header{package antlr.output;}
@parser::header{package antlr.output;}

SELECT : 'vouloir';
COMBIEN : 'combien';
ARTICLE : 'article';
PAGE : 'page';
UNE : 'une';
FOCUS : 'focus';
RAPPELS : 'rappels';
VOIRAUSSI : 'voiraussi';
GROSTITRES : 'gros titre';
AUTEUR : 'auteur';
ET : 'et';
OU : 'ou';
PARLER : 'parler';
POINT : '.'|'?';
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
		(ARTICLE {
			req_arbre.ajouteFils(new Arbre("", "article"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| PAGE {
			req_arbre.ajouteFils(new Arbre("", "page"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| UNE {
			req_arbre.ajouteFils(new Arbre("", "une"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| VOIRAUSSI {
			req_arbre.ajouteFils(new Arbre("", "voiraussi"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| FOCUS {
			req_arbre.ajouteFils(new Arbre("", "focus"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| RAPPELS {
			req_arbre.ajouteFils(new Arbre("", "rappels"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		|GROSTITRES {
			req_arbre.ajouteFils(new Arbre("", "grostitres"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		})
		|COMBIEN {
			req_arbre.ajouteFils(new Arbre("", "select count("));
		}
		((ARTICLE {
			req_arbre.ajouteFils(new Arbre("", "article)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		})
		| PAGE {
			req_arbre.ajouteFils(new Arbre("", "page)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| UNE {
			req_arbre.ajouteFils(new Arbre("", "une)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| VOIRAUSSI {
			req_arbre.ajouteFils(new Arbre("", "voiraussi)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| FOCUS {
			req_arbre.ajouteFils(new Arbre("", "focus)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		| RAPPELS {
			req_arbre.ajouteFils(new Arbre("", "rappels)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		}
		|GROSTITRES {
			req_arbre.ajouteFils(new Arbre("", "grostitres)"));
			req_arbre.ajouteFils(new Arbre("", "from public.titre"));
		})) 
		PARLER {
			req_arbre.ajouteFils(new Arbre("", "where "));
		}
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
		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a1.getText() + " " + a2.getText() + "'"));
	};

conj returns [Arbre conj_arbre = new Arbre("")] :
	ET {
		conj_arbre.ajouteFils(new Arbre("", "AND"));
	}
	| OU {
		conj_arbre.ajouteFils( new Arbre("", "OR"));
	};
