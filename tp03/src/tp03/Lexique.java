package tp03;

/* UV : LO17 - TP03
 * Correcteur orthographique
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Lexique.java
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Lexique {

	private Hashtable<String, String> lexiq; 
	private String fichier;
	private final int SEUILMIN = 3;
	private final int SEUILMAX = 4;
	private final int SEUILPROX = 50;
	private final int SEUILLEVENSHTEIN = 5;

	public Lexique(String f) {

		this.lexiq = new Hashtable<String, String>();
		this.fichier = new String(f);

		try {

			BufferedReader buff = new BufferedReader(new FileReader(fichier));
			Scanner scanner = null;

			try {

				String line;

				while ((line = buff.readLine()) != null) {

					scanner = new Scanner(line).useDelimiter((Pattern.compile("[\t\n]")));
					String champ1, champ2;
					while (scanner.hasNext()) {
					    champ1 = scanner.next();
					    champ2 = scanner.next();
					    
					    this.lexiq.put(champ1, champ2);
					}
				}
			} finally {
				buff.close();
				scanner.close();
			}
		} catch (Exception e) {

			System.out.println("Oups, y a un pb scanner Dany !!!");
		}
	}

	public String get(String key){
		
		return this.lexiq.get(key);
	}
	
	public Set<String> getPrefix(String mot) {
		
		Set<String> tableKeys = lexiq.keySet();
		Set<String> lemmeCandidats = new HashSet<String>();;
		
		Iterator<String> it = tableKeys.iterator();
		
		String word = new String();
		int argSize = mot.length();
		int wordSize;
		float prox = 0;
		int i = 0;

		while (it.hasNext()){
		
			word = it.next().toString();
			wordSize = word.length();
		
			if (Math.abs(argSize) < SEUILMIN || Math.abs(wordSize) < SEUILMIN) {
				prox = 0;
			} else {
				if (Math.abs(Math.abs(argSize) - Math.abs(wordSize)) > SEUILMAX) {
					prox = 0;
				} else {
					i = 1;
					while ((i < Math.min(Math.abs(argSize), Math.abs(wordSize))) && (mot.charAt(i) == word.charAt(i))) {
						i++;
					}
					prox = (i / Math.max(Math.abs(argSize), Math.abs(wordSize))) * 100;
				}
			}
			
			if (prox < SEUILPROX) {
				lemmeCandidats.add(lexiq.get(word));
			}
		}
		return lemmeCandidats;
	}

	public Set<String> levenshtein(String mot) {
		
		Set<String> tableKeys = lexiq.keySet();
		Set<String> lemmeCandidats = new HashSet<String>();;
		
		Iterator<String> it = tableKeys.iterator();
		
		String word = new String();
		int argSize = mot.length();
		int wordSize, d1, d2, d3, distance;
		
		while (it.hasNext()){

			word = it.next().toString();
			wordSize = word.length();

			int[][] dist = new int[argSize][wordSize];
			dist[0][0] = 0;
			
			// Initialisation de la première colonne
			for (int i = 1; i < Math.abs(argSize); i++) {
				dist[i][0] = dist[i - 1][0] + cout(mot.charAt(i),'\0');
			}
			
			// Initialisation de la première ligne
			for (int j = 1; j < Math.abs(wordSize); j++) {
				dist[0][j] = dist[0][j - 1] + cout('\0', word.charAt(j));
			}
			
			// Calcul de la distance de Levenshtein
			for (int i = 1; i < Math.abs(argSize); i++) {
				
				for (int j = 1; j < Math.abs(wordSize); j++) {
					
					d1 = dist[i -1][j - 1] + cout(mot.charAt(i), word.charAt(j));
					d2 = dist[i -1][j] + cout(mot.charAt(i), '\0');
					d3 = dist[i][j - 1] + cout('\0', word.charAt(j));
					// System.out.println("d1 = " + d1 + " d2 = " + d2 + " d3 = " + d3);
					
					d1 = Math.min(d1, d2);
					dist[i][j] = Math.min(d1, d3);
				}
			}
			
			distance = dist[argSize - 1][wordSize - 1];
			// System.out.println("Distance de " + word + " = " + distance);
			if (distance < SEUILLEVENSHTEIN) {
				lemmeCandidats.add(lexiq.get(word));
			}
		}
		return lemmeCandidats;
	}
	
	private int cout(char a, char b) {
		
		if (a == '\0' || b == '\0'){
			return 1;
		} else {
			if(a == b){
				return 0;
			}
		}
		return 0;
	}
}
