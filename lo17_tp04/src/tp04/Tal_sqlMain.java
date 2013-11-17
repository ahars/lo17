package tp04;

import java.io.StringReader;
import java.util.Scanner;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.Tal_sqlLexer;
import antlr.output.Tal_sqlParser;

public class Tal_sqlMain {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Texte : ");
		String s = scanner.nextLine();
		System.out.println(s);

		while (!s.equals("*")) {
			try {
				Tal_sqlLexer lexer = new Tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				Tal_sqlParser parser = new Tal_sqlParser(tokens);
				String arbre = parser.listerequetes();
				System.out.println(arbre);
			} catch(Exception e) {  }
			System.out.print("Texte : ");
			s = scanner.nextLine();
		}
	}
}
