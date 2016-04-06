package fvp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SignupServlet extends HttpServlet{
	
	private MySQLdb mySQLdb;
	
	public void init(final ServletConfig config) {
		System.out.println("---> Entering init() SignupServlet");
		
		mySQLdb = new MySQLdb();
		
		System.out.println("---> Exiting init() SignupServlet");
	}

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	System.out.println("---> Entering doPost() SignupServlet");
    	
    	String username = request.getParameter("user");
    	String password = request.getParameter("password");
    	String izenOsoa = request.getParameter("name");
    	String kalea = request.getParameter("street");
    	String zenbakia = request.getParameter("number");
    	String solairua = request.getParameter("floor");
    	String letra = request.getParameter("side");
    	String postaKode = request.getParameter("postcode");
    	String hiria = request.getParameter("city");
    	String email = request.getParameter("mail");
    	String telefonoa = request.getParameter("telephone");
		
		
		
		System.out.println("     Extracting request parameters: " + username + " " + password + " " + izenOsoa + " " + kalea + " " +
		zenbakia + " " + solairua + " " + letra );
		
		mySQLdb.setUserInfo(username, password, izenOsoa, kalea, zenbakia, solairua, letra, postaKode, hiria, email, telefonoa);
		System.out.println("     Updating users table in the database");
		
		System.out.println("     Redirecting the user to loginForm.html");
		response.sendRedirect("/html/loginForm.html");
		
        System.out.println("---> Exiting doPost() SignupServlet");
    }
}
