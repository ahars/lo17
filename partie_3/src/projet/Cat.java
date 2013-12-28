package projet;

/* UV : LO17 - partie 3
 * Interrogation base de données SQL
 * Fichier : Cat.java
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cat {

	private BufferedReader br;
	private String chaine;

	public Cat(String fichier) {

		br = null;
		chaine = null;

		try {
			br = new BufferedReader(new FileReader(fichier));
		} catch (FileNotFoundException e) {
			System.out.println("fichier inconnu : " + fichier);
		}
	}
	
	public String getChaine() {

		try {
			if ((chaine = br.readLine()) != null)
				return chaine;
			else {
				br.close();
				chaine = null;
			}
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		return chaine;
	}

	public BufferedReader getBF() {
		return br;
	}
}

