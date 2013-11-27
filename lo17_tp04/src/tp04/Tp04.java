package tp04;

import java.io.StringReader;
import java.util.Set;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.Tal_tp04Lexer;
import antlr.output.Tal_tp04Parser;

/* UV : LO17 - TP04
 * Analyse Syntaxique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tp04.java
 */

public class Tp04 {

	public static void main(String[] args) {

		String str, tr, result;
		Set<String> resultP, resultL;
		StringTokenizer st;

		Lexique lexique = new Lexique("lexicA12.txt");
		Lexique pivot = new Lexique("pivot.txt");
		Lexique stop = new Lexique("stoplist.txt");
		Cat q = new Cat("corpusQuestionA09Sort.txt");

//		while ((str = q.getChaine()) != null) {

			str = "je voudrais des articles parlent irak?";
			
			if (!str.isEmpty()) {
				
				System.out.println("question : " + str);
				st = new StringTokenizer(str);
				result = "";
		
				while (st.hasMoreTokens()) {
		
					tr = st.nextToken();
		
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

				try {
					Tal_tp04Lexer lexer = new Tal_tp04Lexer(new ANTLRReaderStream(new StringReader(result)));
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					Tal_tp04Parser parser = new Tal_tp04Parser(tokens);
					String arbre = parser.listerequetes();
					System.out.println("arbre : " + arbre);
				} catch(Exception e) {  }
			}
//		}
	}
}
