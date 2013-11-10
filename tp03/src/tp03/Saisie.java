package tp03;

/* UV : LO17 - TP03
 * Correcteur orthographique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Saisie.java
 */

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Saisie {

	public static void main(String[] args) {

		BufferedReader br = null;
		String chaine;

		try {

			try {

				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				chaine = br.readLine();
				System.out.println("j'ai saisi " + chaine);
			} catch(EOFException e) {
				br.close();
			}
		} catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
}
