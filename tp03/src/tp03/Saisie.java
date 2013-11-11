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
	
	private String chaine;

	public Saisie () {

		BufferedReader br = null;
		chaine = null;

		try {

			try {

				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				chaine = br.readLine();
				
				
			} catch(EOFException e) {
				br.close();
			}
		} catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
	
	public Saisie (String phrase) {
		chaine = phrase;
	}
	
	public String getChaine() {
		return chaine.toLowerCase();
	}
}
