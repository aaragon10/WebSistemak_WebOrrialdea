package fvp;

import java.sql.*;

public class MySQLdb {
	private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root"; 
    private String passwd = "euiti";
	private String driver = "com.mysql.jdbc.Driver";
	
    private Connection conn;
	
	public MySQLdb() {
		try {
        	Class.forName(this.driver).newInstance();
        	this.conn = DriverManager.getConnection(this.url,this.user,this.passwd);
    	} catch(Exception e) {
        	System.out.println("Exception: " + e.getMessage());
    	}
	}

	public void setUserInfo(String user, String pass, String izena, String kalea, String zenbakia, String solairua, 
			String letra, String postaKode, String hiria, String email, String telefonoa) {
		String query = "INSERT INTO fvp.users VALUES ('" + user + "', '" + pass + "', '" + izena + "', '" + 
			kalea + "', '" + zenbakia + "', '" + solairua + "', '" + letra + "', '" + postaKode + "', '" + hiria + "', '"
					+ email + "', '" + telefonoa + "', 'null');"; //null = lizentzia
		System.out.println("     DB query: " + query);
    	try {
	    	Statement st = this.conn.createStatement();
	    	st.executeUpdate(query);  	
        } catch(Exception e) {
        	System.out.println("Exception: " + e.getMessage());
    	}
	}
	
	
	public void lizentziaAldatu(String user, String pass, String lizentzia){
		String query = "UPDATE users SET lizentzia='" + lizentzia + "' WHERE user='" + user + "' AND pass='" + pass + "';";
		System.out.println("     DB query: " + query);
    	try {
	    	Statement st = this.conn.createStatement();
	    	ResultSet res = st.executeQuery(query); 	
        } catch(Exception e) {
        	System.out.println("Exception: " + e.getMessage());
    	}
	}
	
	
	public void passAldatu(String user, String pass, String newPass){
		String query = "UPDATE users SET pass='" + newPass + "' WHERE user='" + user + "' AND pass='" + pass + "';";
		System.out.println("     DB query: " + query);
    	try {
	    	Statement st = this.conn.createStatement();
	    	ResultSet res = st.executeQuery(query); 	
        } catch(Exception e) {
        	System.out.println("Exception: " + e.getMessage());
    	}
	}
	
	
	
	
	
	
//	public String getUserInfo(String user, String password) {
//		String query = "SELECT * FROM fvp.users WHERE user='" + user + "' AND password='" + password + "';";
//		System.out.println("     DB query: " + query);
//		String username = null;
//    	try {
//	    	Statement st = this.conn.createStatement();
//	    	ResultSet res = st.executeQuery(query); 
//	    	while(res.next()) {
//	    		username = res.getString("username");
//        	}
//        } catch(Exception e) {
//        	System.out.println("Exception: " + e.getMessage());
//    	}
//    	return username;
//	}
//	
//
//	public String getUsername(String email, String password) {
//		String query = "SELECT username FROM fvp.users WHERE user='" + user + "' AND password='" + password + "';";
//		System.out.println("     DB query: " + query);
//		String username = null;
//    	try {
//	    	Statement st = this.conn.createStatement();
//	    	ResultSet res = st.executeQuery(query); 
//	    	while(res.next()) {
//	    		username = res.getString("username");
//        	}
//        } catch(Exception e) {
//        	System.out.println("Exception: " + e.getMessage());
//    	}
//    	return username;
//	}
//	

	
}
