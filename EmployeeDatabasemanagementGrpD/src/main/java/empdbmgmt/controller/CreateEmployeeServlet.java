package empdbmgmt.controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empdbmgmt.dal.EmployeeDetailsDAO;
import empdbmgmt.model.EmployeeDetails;

/**
 * Servlet implementation class CreateEmployeeServlet
 */
@WebServlet("/CreateEmployeeServlet")
public class CreateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateEmployeeServlet() {
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
		
	EmployeeDetails ed = new EmployeeDetails();
	ed.setEmpId(request.getParameter("EmpId"));
	ed.setEmpName(request.getParameter("EmpName"));
	ed.setEmailId(request.getParameter("EmailId"));
	ed.setAddress(request.getParameter("Address"));
	ed.setPhoneNO(request.getParameter("PhoneNO"));
	ed.setDepId(request.getParameter("department"));
	ed.setDateOfJoining(request.getParameter("DateOfJoining"));
	ed.setDateOfResignation(request.getParameter("DateOfResignation"));
	ed.setLocationId(request.getParameter("location"));
	ed.setUsername(request.getParameter("Username"));
	
	EmployeeDetailsDAO data = new EmployeeDetailsDAO();
	try {
		data.createData(ed);
		response.sendRedirect("successful.jsp");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		response.sendRedirect("error.jsp");
		
	}
	
	}

}
