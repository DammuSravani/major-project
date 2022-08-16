package empdbmgmt.dal;

import java.sql.*;

import empdbmgmt.model.LoginDetails;

public class LoginDAO {
	String username = "root";
	String password="Sravs@113";
	String url = "jdbc:mysql://localhost:3306/EmployeeDatabaseManagementGrpD";
	
	public Connection GetConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	
	public boolean ValidateLogin(String Username, String pw) {
		try {
			String query = "SELECT Password FROM EmployeeDatabaseManagementGrpD.Login WHERE Username='"+Username+"';";
			Connection con = GetConnection();
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			result.next();
			if(pw.equals(result.getString("Password"))) return true;
			else return false;

		} catch (Exception e) {

			System.out.println("Data doesn't exist "+Username +" "+pw+" "+e.toString());
			return false;
		}
	}
	 
	public boolean ValidateAdmin(String username, String pw) throws ClassNotFoundException, SQLException {
		boolean loginExists = ValidateLogin(username, pw);
		if(loginExists) {
			String query = "SELECT DepId FROM EmployeeDatabaseManagementGrpD.EmployeeDetails WHERE Username='"+username+"' AND (DepId='DE1003' OR DepId='DE1004');";
			Connection con = GetConnection();
			java.sql.Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			result.next();
			System.out.println(result.getString("DepId"));
			return true;
		}
		else {
		return false;
		}
	}
	  
	public void AddLogin(LoginDetails ld) throws SQLException, ClassNotFoundException {
		
		String INSERT_QUERY="INSERT INTO EmployeeDatabaseManagementGrpD.Login(Username,Password) values (?,?)";
		
		PreparedStatement pst;
		Connection con = GetConnection();
		pst=con.prepareStatement(INSERT_QUERY);
		pst.setString(1, ld.getUsername());
		pst.setString(2, ld.getPassword());
		
		pst.executeUpdate();
		int count = pst.executeUpdate();
		
		System.out.println(count + "row/rows affected.");
		con.close();
	}
	public String getUsername(String username) throws ClassNotFoundException, SQLException {
		String SELECT_QUERY ="Select * from EmployeeDatabaseManagementGrpD.Login where Username='"+username+"';";
		Connection con = GetConnection();
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(SELECT_QUERY);
		result.next();
		return result.getString("Username");
	}
}
