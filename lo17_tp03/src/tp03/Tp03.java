package tp03;

/* UV : LO17 - TP03
 * Correcteur orthographique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tp03.java
 */

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Tp03 {

	public static void main(String[] args){

		String str = null, result = "";
		Set<String> resultP, resultL, error = new HashSet<String>();

		/* Récupération de la phrase. */
		//Saisie s = new Saisie();
		Saisie s = new Saisie("ACCEPTER AFFIRMENT AFFAIeRes ACCOMPAGNATeur Danyyyyyyy larges");
		System.out.println("saisie : " + s.getChaine() + "\n");
		StringTokenizer st = new StringTokenizer(s.getChaine());

		/* Récupération du lexique. */
		Lexique l = new Lexique("lexicA12.txt");
		//Lexique l = new Lexique("lexiquetest.txt");

		while (st.hasMoreTokens()) {

			str = st.nextToken();
			
			/* Le mot est dans le lexique. */
			if (l.getValue(str) != null) {

				System.out.println(str + " : get");
				result = result.concat(l.getValue(str) + " ");
			} else {

				resultP = l.getPrefix(str); // Application de l'algorithme de recherche par préfixe.

				if (resultP.isEmpty()) {
					resultL = l.getLevenshtein(str); /* Application de l'algorithme du calcul des distances de Levenshtein. */
					
					if (resultL.isEmpty()) {
						System.out.println(str + " : error");
						error.add(str);
					} else {
						System.out.println(str + " : levenshtein");
						result = result.concat(resultL.toString() + " ");
					}
				} else {
					System.out.println(str + " : prefixe");
					result = result.concat(resultP.toString() + " ");
				}
			}
		}
		System.out.println("\nRESULT : " + result);
		System.out.println("Aucun lemme trouvé pour : " + error);
	}
}
