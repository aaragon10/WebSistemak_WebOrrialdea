package shareinfo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import helper.db.MySQLdb;



public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MySQLdb mySQLdb;
	
	public void init(ServletConfig config) {
		System.out.println("---> Entering init() LoginServlet");
		
		mySQLdb = new MySQLdb();
		
		System.out.println("---> Exiting init() LoginServlet");
	}
 
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	System.out.println("---> Entering doGet() LoginServlet");
    	
    	response.setHeader("Cache-Control", "no-cache");
    	
    	String user = request.getParameter("user");
		String password = request.getParameter("password");
//		String email = request.getParameter("email");
//		String user = mySQLdb.getUsername(email, password);
		System.out.println("     Extracting request parameters: " + user + " " + password);

		if(user == null) {
			System.out.println("     Login error: redirecting the user to loginForm.jsp");
			boolean loginerror = true;
			request.setAttribute("login error", loginerror);
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/loginForm.jsp");
			rd.forward(request, response);
		} else {
			HttpSession session = request.getSession(true);
			session.setAttribute("user",  user);
			String sessionID = session.getId();
			System.out.println("     User session for " + user + ": " + sessionID);
			System.out.print("     Getting loggedin userlist from servlet context: ");
			ServletContext context = request.getServletContext();
			System.out.println("     Redirecting the user to MainServlet");
			RequestDispatcher rd = context.getNamedDispatcher("MainServlet");
			rd.forward(request, response);
		}
		System.out.println("---> Exiting doGet() LoginServlet");
    }
}


