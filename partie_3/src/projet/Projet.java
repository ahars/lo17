package projet;

import java.io.StringReader;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.Tal_projetLexer;
import antlr.output.Tal_projetParser;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Projet.java
 */

public class Projet {

	public static void main(String[] args) {

		String str, tr, result, temp;
		StringTokenizer st;
		Set<String> resultP, resultL;

		Lexique lexique = new Lexique("lexicA12.txt");
		Lexique pivot = new Lexique("pivot.txt");
		Lexique stop = new Lexique("stoplist.txt");

//		Cat q = new Cat("corpusQuestionA09.txt");
		Cat q = new Cat("questions.txt");
//		q = new Cat("questions_traitees.txt");

		while ((str = q.getChaine()) != null) {

			if (!str.isEmpty()) {

				System.out.println("question : " + str);
				str = str.toLowerCase();
				
				// Suppression du ? ou du .
				StringBuffer sb = new StringBuffer(str);
				sb.setCharAt(str.length() - 1, ' ');
				str = sb.toString();
				
				st = new StringTokenizer(str);
				result = "";

				while (st.hasMoreTokens()) {

					tr = st.nextToken();

					if ((tr.charAt(0) == 'd') && (tr.charAt(1) == '\'')) {
						tr = tr.replaceAll("d'", "");
					}

					if ((tr.charAt(0) == 'l') && (tr.charAt(1) == '\'')) {
						tr = tr.replaceAll("l'", "");
					}
					
					tr = tr.replaceAll("\"", "");

					if (stop.getValue(tr) != null) {
						result = result.concat(stop.getValue(tr) + " ");
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
										// TODO : choix du mot
										temp = resultL.iterator().next().toString();
										result = result.concat(temp + " ");
									}
								} else {
									// TODO : choix du mot
									temp = resultP.iterator().next().toString();
									result = result.concat(temp + " ");
								}
							}
						}
					}
				}
				result = result.concat(".");
				System.out.println("resultat : " + result);

				try {
					Tal_projetLexer lexer = new Tal_projetLexer(new ANTLRReaderStream(new StringReader(result)));
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					Tal_projetParser parser = new Tal_projetParser(tokens);
					String arbre = parser.listerequetes();
					System.out.println("arbre : " + arbre + "\n");
				} catch(Exception e) {  }
			}
		}
	}
}

