package tp04;

import java.util.Set;
import java.util.StringTokenizer;

/* UV : LO17 - TP04
 * Analyse Syntaxique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tp04.java
 */

public class Tp04 {

	public static void main(String[] args) {

		String str, tr;
		Set<String> resultP, resultL;

		/* Récupération du lexique. */
		Lexique lexique = new Lexique("lexicA12.txt");

		/* Récupération du pivot. */
		Lexique pivot = new Lexique("pivot.txt");
		
		/* Récupération de la stoplist. */
		Lexique stop = new Lexique("stoplist.txt");
		
		/* Récupération du corpus de questions. */
		Cat q = new Cat("corpusQuestionA09.txt");

		
		while ((str = q.getChaine()) != null) {
			//System.out.println(str);
		}
		
		str = "je voudrais articles parlent irak?";
		System.out.println("question : " + str);
		StringTokenizer st = new StringTokenizer(str);
		String result = "";

		while (st.hasMoreTokens()) {

			tr = st.nextToken();

			if (stop.getValue(tr) != null) {
				result = result.concat("");
			} else {
				if (pivot.getValue(tr) != null) {
					result = result.concat(pivot.getValue(tr) + " ");
				} else {
					if (lexique.getValue(tr) != null) {
						result = result.concat(lexique.getValue(tr) + " ");
					} else {
						resultP = lexique.getPrefix(tr);
						if (resultP.isEmpty()) {
							resultL = lexique.getLevenshtein(str);
							if (resultL.isEmpty()) {
								result = result.concat(tr + " ");
							} else {
								result = result.concat(resultL.toString() + " ");
							}
						} else {
							result = result.concat(resultP.toString() + " ");
						}
					}
				}
			}
		}
		System.out.println("resultat : " + result);

/*		while (!s.equals("*")) {
			try {
				Tal_tp04Lexer lexer = new Tal_tp04Lexer(new ANTLRReaderStream(new StringReader(str)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				Tal_tp04Parser parser = new Tal_tp04Parser(tokens);
				String arbre = parser.listerequetes();
				System.out.println(arbre);
			} catch(Exception e) {  }
			System.out.print("Texte : ");
			//s = scanner.nextLine();
		}
*/
	}
}
