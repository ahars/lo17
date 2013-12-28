package projet;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : TableFields.java
 */

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.StringTokenizer;

public class TableFields {

	private Hashtable<String, String> bdd;
	
	public TableFields() {
		
		Set<String> fields = new HashSet<String>();
		this.bdd = new Hashtable<String, String>();
		
		// Table datearticle
		fields.add("jj");
		fields.add("mois");
		fields.add("annee");
		fields.add("page");
		fields.add("article");
		fields.add("rubrique");
		bdd.put("datearticle", fields.toString());
		fields.clear();
		
		// Table datepage
		fields.add("jour");
		fields.add("jj");
		fields.add("mois");
		fields.add("annee");
		fields.add("page");
		bdd.put("datepage", fields.toString());
		fields.clear();
		
		// Table theme
		fields.add("mot");
		fields.add("rubrique");
		fields.add("page");
		fields.add("article");
		bdd.put("theme", fields.toString());
		fields.clear();
		
		// Table titre
		fields.add("mot");
		fields.add("page");
		fields.add("rubrique");
		fields.add("article");
		bdd.put("titre", fields.toString());
		fields.clear();
	
		// Table titreresume
		fields.add("mot");
		fields.add("page");
		fields.add("rubrique");
		fields.add("article");
		bdd.put("titreresume", fields.toString());
		fields.clear();
		
		// Table email
		fields.add("email");
		fields.add("page");
		fields.add("rubrique");
		fields.add("article");
		bdd.put("email", fields.toString());
		fields.clear();
		
		// Table emailarticle
		fields.add("mot");
		fields.add("email");
		fields.add("article");
		fields.add("page");
		fields.add("rubrique");
		bdd.put("emailarticle", fields.toString());
		fields.clear();
	}
	
	public Hashtable<String, String> getBdd() {
		return bdd;
	}

	public StringTokenizer getValueOf(String key) {

		StringTokenizer st = new StringTokenizer(bdd.get(key));
		String tr, temp = "";
	
		while (st.hasMoreTokens()) {

			tr = st.nextToken();
			tr = tr.replace(",", "");
			tr = tr.replace("[", "");
			tr = tr.replace("]", "");
			temp = temp.concat(tr + " ");
		}
		st = new StringTokenizer(temp);
		
		return st;
	}
	
}

