package tp04;

/* UV : LO17 - TP04
 * Analyse Syntaxique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tp04.java
 */

import java.io.StringReader;
import java.util.Scanner;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import antlr.output.Tal_tp04Lexer;
import antlr.output.Tal_tp04Parser;

public class Tp04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Texte : ");
		String s = scanner.nextLine();
		System.out.println(s);

		while (!s.equals("*")) {
			try {
				Tal_tp04Lexer lexer = new Tal_tp04Lexer(new ANTLRReaderStream(new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				Tal_tp04Parser parser = new Tal_tp04Parser(tokens);
				String arbre = parser.listerequetes();
				System.out.println(arbre);
			} catch(Exception e) {  }
			System.out.print("Texte : ");
			s = scanner.nextLine();
		}
	}
}
