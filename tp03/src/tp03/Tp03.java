package tp03;

/* UV : LO17 - TP03
 * Correcteur orthographique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tp03.java
 */

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Tp03 {

	public static void main(String[] args){

		Set<String> result1, result2;
		Scanner sc;
		StringTokenizer st;
		String str;
		Lexique l;
		
		l = new Lexique("lexiquetest.txt");
		
		sc = new Scanner(System.in);
		System.out.print("Saisir une phrase : ");
		str = sc.nextLine();
		str = str.toLowerCase();
		st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//result1 = l.getPrefix(str);
		//result2 = l.levenshtein(str);

		//System.out.println("getPrefix de " + str + " : " + result1.toString());
		//System.out.println("levenshtein de " + str + " : " + result2.toString());
		
		sc.close();
	}
}
