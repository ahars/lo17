package tp05;

/* UV : LO17 - TP05
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : Tp05.java
 */

public class Tp05 {

	public static void main(String[] args) {
		
		String str;
		Cat q = new Cat("requetes.txt");
		InterrogPostgresql sql = new InterrogPostgresql();
		TableFields tf = new TableFields();
		System.out.println(tf.getBdd().toString());
		
/*		while ((str = q.getChaine()) != null) {
			System.out.println("str = " + str);
			sql.setRequete(str);
			sql.exec_sql();
		}
*/	}
}