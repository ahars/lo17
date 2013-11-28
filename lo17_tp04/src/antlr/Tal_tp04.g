grammar Tal_tp04;

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
CONJ : 'et' | 'ou';
CONTENIR : 'contenir' | 'parler';
POINT : '.'|'?';
WS : (' ' |'\t' | '\r' | 'stop' | 'qui' | 'dont') { skip(); } | '\n';
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
		}
		| PAGE {
			req_arbre.ajouteFils(new Arbre("", "page"));
		}
		| UNE {
			req_arbre.ajouteFils(new Arbre("", "une"));
		}
		| VOIRAUSSI {
			req_arbre.ajouteFils(new Arbre("", "voiraussi"));
		}
		| FOCUS {
			req_arbre.ajouteFils(new Arbre("", "focus"));
		}
		| RAPPELS {
			req_arbre.ajouteFils(new Arbre("", "rappels"));
		}
		|GROSTITRES {
			req_arbre.ajouteFils(new Arbre("", "grostitres"));
		})
		|COMBIEN {
			req_arbre.ajouteFils(new Arbre("", "select count("));
		}
		((ARTICLE {
			req_arbre.ajouteFils(new Arbre("", "article)"));
		})
		| PAGE {
			req_arbre.ajouteFils(new Arbre("", "page)"));
		}
		| UNE {
			req_arbre.ajouteFils(new Arbre("", "une)"));
		}
		| VOIRAUSSI {
			req_arbre.ajouteFils(new Arbre("", "voiraussi)"));
		}
		| FOCUS {
			req_arbre.ajouteFils(new Arbre("", "focus)"));
		}
		| RAPPELS {
			req_arbre.ajouteFils(new Arbre("", "rappels)"));
		}
		|GROSTITRES {
			req_arbre.ajouteFils(new Arbre("", "grostitres)"));
		})) 
		(CONTENIR {
			req_arbre.ajouteFils(new Arbre("", "from titreresume"));
			req_arbre.ajouteFils(new Arbre("", "where "));
		}| AUTEUR {
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
		})
		ps = params {
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		};

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init {
		Arbre par1_arbre, par2_arbre;
	} :
		par1 = param {
			par1_arbre = $par1.lepar_arbre;
			les_pars_arbre.ajouteFils(par1_arbre);
		}
		(CONJ par2 = param {
			par2_arbre = $par2.lepar_arbre;
			les_pars_arbre.ajouteFils(new Arbre("", "OR"));
			les_pars_arbre.ajouteFils(par2_arbre);
		})*;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR {
		lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a.getText() + "'"));
	};

