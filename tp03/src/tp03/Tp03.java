package tp03;

/* UV : LO17 - TP03
 * Correcteur orthographique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tp03.java
 */

import java.util.Set;
import java.util.StringTokenizer;

public class Tp03 {

	public static void main(String[] args){

		String str = null;
		Set<String> result1, result2;
		
		/* Récupération de la phrase. */
		//Saisie s = new Saisie();
		Saisie s = new Saisie("ACCEPTER AFFIRMENT AFFAIRES ACCOMPAGNATEURS");
		System.out.println("saisie : " + s.getChaine());
		StringTokenizer st = new StringTokenizer(s.getChaine());
		
		/* Récupération du lexique. */
		Lexique l = new Lexique("lexiquetest.txt");
		
		while (st.hasMoreTokens()) {
			str = st.nextToken();
			
			result1 = l.getPrefix(str);
			result2 = l.levenshtein(str);

			System.out.println("getPrefix de " + str + " : " + result1.toString());
			System.out.println("levenshtein de " + str + " : " + result2.toString());
		}
	}
}
