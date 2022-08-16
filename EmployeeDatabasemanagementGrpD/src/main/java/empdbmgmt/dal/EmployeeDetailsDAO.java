package empdbmgmt.dal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import empdbmgmt.model.EmployeeDetails;
import empdbmgmt.utility.DBCon;

public class EmployeeDetailsDAO {
	String username = "root";
	String password="Sravs@113";
	String url = "jdbc:mysql://localhost:3306/EmployeeDatabaseManagementGrpD";

	public Connection GetConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

	public String fetchDepartmentById(String username) throws ClassNotFoundException, SQLException {
		String FETCH_QUERY = "SELECT * FROM EmployeeDatabaseManagementGrpD.EmployeeDetails WHERE Username='"+username+"';";

		Connection con = GetConnection();
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(FETCH_QUERY);
		result.next();
		System.out.println(result.getString("DepId"));
		return result.getString("DepId");
	}

	public ResultSet getEmpDetailsByDepId(String id) throws ClassNotFoundException, SQLException {
		String FETCH_QUERY = "SELECT * FROM EmployeeDatabaseManagementGrpD.EmployeeDetails WHERE DepId='"+id+"';";

		Connection con = GetConnection();
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(FETCH_QUERY);
		return result;
	}
	
	public ResultSet fetchEmpData(String id, String name) throws ClassNotFoundException, SQLException {
		String FETCH_QUERY = "SELECT * FROM EmployeeDatabaseManagementGrpD.EmployeeDetails WHERE "+name+"='"+id+"';";
		System.out.println(FETCH_QUERY);
		Connection con = GetConnection();
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(FETCH_QUERY);
		return result;
	}
	
	
	
	public ResultSet fetchDataByempName(String name) throws ClassNotFoundException, SQLException {
		String FETCH_QUERY = "SELECT * FROM EmployeeDetails WHERE EmpName='"+name+"';";

		Connection con = GetConnection();
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(FETCH_QUERY);
		result.next();
		return result;
	}
	
	public ResultSet fetchDataByemailId(String id) throws ClassNotFoundException, SQLException {
		String FETCH_QUERY = "SELECT * FROM EmployeeDetails WHERE EmailId='"+id+"';";

		Connection con = GetConnection();
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(FETCH_QUERY);
		result.next();
		return result;
	}
	
	public ResultSet fetchData() throws ClassNotFoundException, SQLException {
		String FETCH_QUERY = "SELECT * FROM EmployeeDetails";

		Connection con = GetConnection();
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(FETCH_QUERY);
		
		return result;
	}
	
	public boolean dataExists(String id) throws SQLException {
		String query = "SELECT * FROM EmployeeDetails WHERE EmpId='"+id+"';";
		
		Connection con = DBCon.getCon();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		return rs.next();
	}

	public void createData(EmployeeDetails emp) throws ClassNotFoundException, SQLException {
		String INSERT_QUERY="INSERT INTO EmployeeDetails values(?,?,?,?,?,?,?,?,?,?);";
		
		PreparedStatement pst;
		Connection con = GetConnection();
		pst=con.prepareStatement(INSERT_QUERY);
		pst.setString(1, emp.getEmpId());
		pst.setString(2, emp.getEmpName());
		pst.setString(3, emp.getEmailId());
		pst.setString(4, emp.getAddress());
		pst.setString(5, emp.getPhoneNO());
		pst.setString(6, emp.getDepId());
		pst.setString(7, emp.getDateOfJoining());
		pst.setString(8, emp.getDateOfResignation());
		pst.setString(9, emp.getLocationId());
		pst.setString(10, emp.getUsername());
		pst.executeUpdate();
		//con.close();
		//return count;
	}

	public int deleteData(String empId) throws ClassNotFoundException, SQLException {
		String DELETE_QUERY="DELETE FROM EmployeeDatabaseManagementGrpD.EmployeeDetails WHERE EmpId='"+empId+"';";

		Connection con = GetConnection();
		Statement st = con.createStatement();
		int count = st.executeUpdate(DELETE_QUERY);
		return count;
	}

	public void updateData(EmployeeDetails emp) throws ClassNotFoundException, SQLException {
		String UPDATE_QUERY="UPDATE EmployeeDetails"
					 	  + " SET EmpName=?,EmailId=?,Address=?,PhoneNO=?,DepId=?,DateOfJoining=?,DateOfResignation=?,LocationId=?"
					 	  + " WHERE EmpId=?;";
		PreparedStatement pst;
		Connection con = GetConnection();

		pst = con.prepareStatement(UPDATE_QUERY);
		pst.setString(1, emp.getEmpName());
		pst.setString(2, emp.getEmailId());
		pst.setString(3, emp.getAddress());
		pst.setString(4, emp.getPhoneNO());
		pst.setString(5, emp.getDepId());
		pst.setString(6, emp.getDateOfJoining());
		pst.setString(7, emp.getDateOfResignation());
		pst.setString(8, emp.getLocationId());
		pst.setString(9, emp.getEmpId());
		pst.executeUpdate();

		//return count;
	}

}


