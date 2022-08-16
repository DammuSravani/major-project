package empdbmgmt.controller;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empdbmgmt.model.EmployeeDetails;
import empdbmgmt.service.Helper;


@WebServlet("/FetchEmployeeServlet")
public class FetchEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Helper helper = new Helper();
       
    
    public FetchEmployeeServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ArrayList<EmployeeDetails> employees = new ArrayList<>();
		
		String empId = request.getParameter("EmpId");
		String emailId = request.getParameter("EmailId");
		String empName = request.getParameter("EmpName");
		
		try {
			if(empId != null) {
				employees = null;
				employees = helper.fetchTable(empId, "EmpId");
			}
			
			else if(emailId != null) {
				employees = null;
				employees = helper.fetchTable(emailId, "EmailId");
			}
			
			else if(empName != null) {
				employees = null;
				employees = helper.fetchTable(empName, "EmpName");
			}
			request.setAttribute("emp", employees);
			request.getRequestDispatcher("/table.jsp").forward(request, response);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}	
	

}
