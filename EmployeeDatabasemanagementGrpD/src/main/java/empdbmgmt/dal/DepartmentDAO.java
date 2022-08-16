package empdbmgmt.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empdbmgmt.model.Country;
import empdbmgmt.model.DepartmentDetails;
import empdbmgmt.utility.DBCon;

public class DepartmentDAO {

	String username = "root";
	String password="Sravs@113";
	String url = "jdbc:mysql://localhost:3306/EmployeeDatabaseManagementGrpD";
	
	
	public Connection GetConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	private static String FETCH_ALL_DEPARTMENT_ID = "select * from EmployeeDatabaseManagementGrpD.DepartmentDetails";
	public List<String> getDepartment() throws ClassNotFoundException, SQLException{
	 List<String> listDepartmentId  = new ArrayList<>();
     Connection con = GetConnection();
       Statement statement = con.createStatement();
       ResultSet result = statement.executeQuery(FETCH_ALL_DEPARTMENT_ID);
       while(result.next()){
       	String departmentId = result.getString("DepId");
       	String departmentname = result.getString("DepName");
          DepartmentDetails department = new DepartmentDetails(departmentId,departmentname);        
           listDepartmentId.add(departmentId);            
   }
   return listDepartmentId;
   }

	public void AddDepartment(DepartmentDetails dep) throws SQLException, ClassNotFoundException {
		
		String INSERT_QUERY="INSERT INTO Registration (values DepId,DepName) (?,?)";
		
		PreparedStatement pst;
		Connection con = GetConnection();
		pst=con.prepareStatement(INSERT_QUERY);
		pst.setString(1, dep.getDepartmentId());
		pst.setString(2, dep.getDepartmentName());
		
		int count = pst.executeUpdate();
		
		System.out.println(count + "row/rows affected.");
		con.close();
	}
}
