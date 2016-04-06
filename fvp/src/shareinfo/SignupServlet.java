package shareinfo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import helper.db.MySQLdb;

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
    	String password = request.getParameter("pass");
    	String izenOsoa = request.getParameter("izena");
    	String kalea = request.getParameter("kalea");
    	String zenbakia = request.getParameter("zenbakia");
    	String solairua = request.getParameter("solairua");
    	String letra = request.getParameter("letra");
    	String postaKode = request.getParameter("postaKode");
    	String hiria = request.getParameter("hiria");
    	String email = request.getParameter("email");
    	String telefonoa = request.getParameter("telefonoa");
		
		
		
		System.out.println("     Extracting request parameters: " + username + " " + password + " " + izenOsoa + " " + kalea + " " +
		zenbakia + " " + solairua + " " + letra );
		
		mySQLdb.setUserInfo(username, password, izenOsoa, kalea, zenbakia, solairua, letra, postaKode, hiria, email, telefonoa);
		System.out.println("     Updating users table in the database");
		
		System.out.println("     Redirecting the user to loginForm.jsp");
		response.sendRedirect("/html/loginForm.jsp");
		
        System.out.println("---> Exiting doPost() SignupServlet");
    }
}
