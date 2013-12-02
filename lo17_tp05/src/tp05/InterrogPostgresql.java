package tp05;

/* UV : LO17 - TP05
 * Interrogation base de données SQL
 * Auteurs : Dany Ferreira - Antoine Hars
 * Fichier : InterrogPostgresql.java
 */

import java.sql.*;

public class InterrogPostgresql {
	
	private String username;
	private String password;
	private String url;
	private String requete;
	
	public InterrogPostgresql() {
	
		// ---- configure START
		username = "lo17xxx";
		password = "dblo17";
	
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME
		url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	}
	
	public void exec_sql() {
		// INSTALL/load the Driver (Vendor specific Code)
				try {
					Class.forName("org.postgresql.Driver");
				} catch(java.lang.ClassNotFoundException e) {
					System.err.print("ClassNotFoundException: ");
					System.err.println(e.getMessage());
				}

				try {
					Connection con;
					Statement stmt;
			    
					// Establish Connection to the database at URL with usename and password
					con = DriverManager.getConnection(url, username, password);
					stmt = con.createStatement();
					// Send the query and bind to the result set
					ResultSet rs = stmt.executeQuery(requete);
					while (rs.next()) {
						//String s = rs.getString("count");
						//System.out.print(s);
						String s = rs.getString("page");
						System.out.print(s);
						System.out.print("\t");
						s = rs.getString("rubrique");
						System.out.print(s);
						System.out.println();
					}
					// Close resources
					stmt.close();
					con.close();
				}
				// print out decent erreur messages
				catch(SQLException ex) {

					System.err.println("==> SQLException: ");
					while (ex != null) {
						System.out.println("Message:   " + ex.getMessage());
						System.out.println("SQLState:  " + ex.getSQLState());
						System.out.println("ErrorCode: " + ex.getErrorCode());
						ex = ex.getNextException();
						System.out.println("");
					}
				}
	}
	
	public void setRequete(String re) {
		requete = re;
	}
	
	public String getRequete() {
		return requete;
	}
}