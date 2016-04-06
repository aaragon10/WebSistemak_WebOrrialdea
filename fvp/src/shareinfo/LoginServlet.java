package shareinfo;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import helper.db.MySQLdb;



public class LoginServlet extends HttpServlet{

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
		System.out.println("     Extracting request parameters: " + user + " " + password);

		//String username = mySQLdb.getUsername(email, password);
		if(user == null) {
			System.out.println("     Login error: redirecting the user to loginForm.html");
			boolean loginerror = true;
			request.setAttribute("loggin error", loginerror);
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/loginForm.jsp");
			rd.forward(request, response);
		} else {
			HttpSession session = request.getSession(true);
			session.setAttribute("username",  user);
			String sessionID = session.getId();
			System.out.println("     User session for " + user + ": " + sessionID);
			System.out.print("     Getting loggedin userlist from servlet context: ");
			ServletContext context = request.getServletContext();
			HashMap<String, String> loggedinUsers = (HashMap) context.getAttribute("loggedin_users");
			if(loggedinUsers == null) {
				System.out.println("list is empty");
				loggedinUsers = new HashMap();
				loggedinUsers.put(user, sessionID);
			} else {
				if(!loggedinUsers.containsKey(user)) {
					System.out.println(user + " is not in the list");
					loggedinUsers.put(user, sessionID);
				} else {
					System.out.println(user + " is already in the list");
				}
			}
			context.setAttribute("loggedin_users", loggedinUsers);
			System.out.println("     Loggedin users: " + loggedinUsers.toString());
			
			System.out.println("     Redirecting the user to MainServlet");
			RequestDispatcher rd = context.getNamedDispatcher("MainServlet");
			rd.forward(request, response);
		}
		
		System.out.println("---> Exiting doGet() LoginServlet");
    }
}


