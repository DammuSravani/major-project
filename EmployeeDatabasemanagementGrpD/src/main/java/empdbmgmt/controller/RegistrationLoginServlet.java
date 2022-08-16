package empdbmgmt.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empdbmgmt.dal.LoginDAO;



/**
 * Servlet implementation class AdminRegistration
 */
@WebServlet("/RegistrationLoginServlet")
public class RegistrationLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationLoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("Username");
		String pw = request.getParameter("Password");
		
		LoginDAO data = new LoginDAO();
		
		try {
			if(data.ValidateAdmin(username, pw)) {
				response.sendRedirect("successful.jsp");
			}
			else {
				response.sendRedirect("Error.jsp");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

}
