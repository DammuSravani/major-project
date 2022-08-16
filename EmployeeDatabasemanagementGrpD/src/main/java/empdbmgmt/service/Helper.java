package empdbmgmt.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import empdbmgmt.dal.EmployeeDetailsDAO;
import empdbmgmt.model.EmployeeDetails;

public class Helper {
	public static String empId, empName, emailId, address, phoneNo, depId, doj, dor, locId;
	
	
	public ArrayList<EmployeeDetails> fetchTable(String id, String columnName) throws ClassNotFoundException, SQLException {
		ArrayList<EmployeeDetails> employees = new ArrayList<>();
		EmployeeDetailsDAO employeedetailsDao = new EmployeeDetailsDAO();
				
		ResultSet rs = employeedetailsDao.fetchEmpData(id, columnName);
		while(rs.next()) {
			EmployeeDetails emp = new EmployeeDetails();
			emp.setEmpId(rs.getString("EmpId"));
			emp.setEmpName(rs.getString("EmpName"));
			emp.setEmailId(rs.getString("EmailId"));
			emp.setAddress(rs.getString("Address"));
			emp.setPhoneNO(rs.getString("PhoneNO"));
			emp.setDepId(rs.getString("DepId"));
			emp.setDateOfJoining(rs.getString("DateOfJoining"));
			emp.setDateOfResignation(rs.getString("DateOfResignation"));
			emp.setLocationId(rs.getString("LocationId"));
			employees.add(emp);
		}
		return employees;
	}
	public void fetchTable2(String id) {
		EmployeeDetailsDAO employeedetailsDao = new EmployeeDetailsDAO();
		
		clearData();
		try {
			ResultSet result = employeedetailsDao.fetchDataByemailId(id);
			empId = result.getString("EmpId");
			empName = result.getString("EmpName");
			emailId = result.getString("EmailId");
			address = result.getString("Address");
			phoneNo = result.getString("PhoneNO");
			depId = result.getString("DepId");
			doj = result.getString("DateOfJoining");
			dor = result.getString("DateOfResignation");
			locId = result.getString("LocationId");
			result.next();
		}
		catch (SQLException | ClassNotFoundException e) {
			System.out.println(emailId + " " + e);
		}
	}
	
	public void fetchTable3(String name) {
		EmployeeDetailsDAO employeedetailsDao = new EmployeeDetailsDAO();
		
		clearData();
		try {
			ResultSet result = employeedetailsDao.fetchDataByempName(name);
			empId = result.getString("EmpId");
			empName = result.getString("EmpName");
			emailId = result.getString("EmailId");
			address = result.getString("Address");
			phoneNo = result.getString("PhoneNO");
			depId = result.getString("DepId");
			doj = result.getString("DateOfJoining");
			dor = result.getString("DateOfResignation");
			locId = result.getString("LocationId");
			result.next();
		}
		catch (SQLException | ClassNotFoundException e) {
			System.out.println(empName + " " + e);
		}
	}
	public ResultSet fetchTable4() throws ClassNotFoundException, SQLException {
		EmployeeDetailsDAO employeedetailsDao = new EmployeeDetailsDAO();
		ResultSet result =  employeedetailsDao.fetchData();
		
		return result;
	}
	
	public String getDepartmentId(String username) throws ClassNotFoundException, SQLException {
		EmployeeDetailsDAO employeedetailsDao = new EmployeeDetailsDAO();
		String depId = employeedetailsDao.fetchDepartmentById(username);
		return depId;
	}
	
	public ResultSet getEmpDetailsByDepId(String id) throws ClassNotFoundException, SQLException {
		EmployeeDetailsDAO employeedetailsDao = new EmployeeDetailsDAO();
		ResultSet result = employeedetailsDao.getEmpDetailsByDepId(id);
		//System.out.println(result.getString("EmpId"));
		return result;
	}
	
	public void clearData() {
		empId = null;
		empName = null;
		emailId = null;
		address = null;
		phoneNo = null;
		depId = null;
		doj = null;
		dor = null;
		locId = null;
	}
	
}
