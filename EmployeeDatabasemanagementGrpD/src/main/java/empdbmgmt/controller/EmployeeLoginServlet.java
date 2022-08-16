package empdbmgmt.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empdbmgmt.dal.LoginDAO;
import empdbmgmt.model.EmployeeDetails;
import empdbmgmt.service.Helper;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLoginServlet")
public class EmployeeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Helper helper = new Helper();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<EmployeeDetails> employees = new ArrayList<>();
		
		String username = request.getParameter("Username");
		String pw = request.getParameter("Password");
		
		LoginDAO data = new LoginDAO();
		Helper h = new Helper();
		try {
			if(data.ValidateLogin(username, pw)) {
				String depId = h.getDepartmentId(username);
				ResultSet rs = h.getEmpDetailsByDepId(depId);
				while(rs.next()) {
					EmployeeDetails employee = new EmployeeDetails();
					employee.setEmpId(rs.getString("EmpId"));
					employee.setEmpName(rs.getString("EmpName"));
					employee.setEmailId(rs.getString("EmailId"));
					employee.setAddress(rs.getString("Address"));
					employee.setPhoneNO(rs.getString("PhoneNO"));
					employee.setDepId(rs.getString("DepId"));
					employee.setDateOfJoining(rs.getString("DateOfJoining"));
					employee.setDateOfResignation(rs.getString("DateOfResignation"));
					employee.setLocationId(rs.getString("LocationId"));
					employees.add(employee);
				}
				System.out.println(employees);
				request.setAttribute("emp", employees);
				request.getRequestDispatcher("/table.jsp").forward(request, response);
			}
			else response.sendRedirect("error.jsp");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
