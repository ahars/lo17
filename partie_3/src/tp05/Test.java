package tp05;

import java.util.StringTokenizer;

public class Test {
	
	private String requete;
	
	public Test() {
	
	}
	
	public void exec_sql() {

		String str;
		StringTokenizer st;
		st = affich(requete);
	
		while (st.hasMoreTokens()) {
				
			str = st.nextToken();
			System.out.print(str + "\t");
		}
		System.out.println();
	}
	
	public void setRequete(String re) {
		requete = re;
	}
	
	public String getRequete() {
		return requete;
	}
	
	public StringTokenizer affich(String req) {
		
		String tr, tmp = "";
		StringTokenizer st = new StringTokenizer(req);
		int i = 0;
		
		while (st.hasMoreTokens()) {

			tr = st.nextToken();
			tr = tr.replace(",", "");
			
			if (tr.compareTo("from") == 0) {
				i = 0;
			}
			
			if (i == 1) {
				if (tr.contains("count(") == true) {
					tmp = tmp.concat("count ");
				} else {
					tmp = tmp.concat(tr + " ");
				}
			}
			
			if (tr.compareTo("select") == 0) {
				i = 1;
			}
		}
		st = new StringTokenizer(tmp);
		
		return st;
	}
}