package shareinfo;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import helper.db.MySQLdb;


public class MainServlet extends HttpServlet{

	private MySQLdb mySQLdb;
	
	public void init(ServletConfig config) {
		System.out.println("---> Entering init() MainServlet");
		
		mySQLdb = new MySQLdb();
		
		System.out.println("---> Exiting init() MainServlet");
	}
	
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        System.out.println("---> Entering doGet() MainServlet");
    		
        doPost(request, response);
        	
        System.out.println("---> Exiting doGet() MainServlet");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	System.out.println("---> Entering doPost() MainServlet");
    	
    	response.setHeader("Cache-Control", "no-cache");
		
    	if(request.getSession(false) == null) {
    		System.out.println("     User is not logged in");
    		
    		System.out.println("     Redirecting the user to loginForm.html");
			RequestDispatcher rd = request.getRequestDispatcher("/html/loginForm.html");
			rd.forward(request, response);
    	} else {
    		System.out.println("     User is logged in");
    		
    		String action = request.getParameter("action");
    		if(action != null) {
    			HttpSession session = request.getSession();
    		    session.invalidate();
    		    System.out.println("     Login error: redirecting the user to loginForm.html");
        		RequestDispatcher rd = request.getRequestDispatcher("/html/loginForm.html");
    			rd.forward(request, response);
    		} else {
//    			String message = request.getParameter("username");
//    			if(message != null) {
//    				HttpSession session = request.getSession();
//    				String username = (String) session.getAttribute("username");
//    				mySQLdb.setUserInfo(message, username);
//    			}
//    		
//    			ArrayList<PerfilInfo> userList = mySQLdb.getAllMessages();
//    			request.setAttribute("messageList", messageList);
    		
    			System.out.println("     Redirecting the user to logeatutakoAukerak.jsp");
    			RequestDispatcher rd = request.getRequestDispatcher("/html/logeatutakoAukerak.html");
    			rd.forward(request, response);
    		}
    	}
    	
        System.out.println("---> Exiting doPost() MainServlet");
    }
    
}


