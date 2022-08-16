package empdbmgmt.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empdbmgmt.model.DepartmentDetails;
import empdbmgmt.model.LocationDetails;

public abstract class LocationDetailsDAO implements ILocation {
		String username = "root";
		String password="Sravs@113";
		String url = "jdbc:mysql://localhost:3306/EmployeeDatabaseManagementGrpD";
		
		private int count;
		
		
		public Connection GetConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			return con;
		}
		
		
		private static String FETCH_ALL_LOCATION_ID = "select * from EmployeeDatabaseManagementGrpD.LocationDetails";
		public List<String> getLocation() throws ClassNotFoundException, SQLException{
		 List<String> listLocationId  = new ArrayList<>();
	     Connection con = GetConnection();
	       Statement statement = con.createStatement();
	       ResultSet result = statement.executeQuery(FETCH_ALL_LOCATION_ID);
	       while(result.next()){
	       	String locationId = result.getString("LocationId");
	       	String locationname = result.getString("LocationName");
	          LocationDetails location = new LocationDetails(locationId,locationname);        
	           listLocationId.add(locationId);            
	   }
	   return listLocationId;
	   }

		  
		public void AddLocation(LocationDetails loc) throws SQLException, ClassNotFoundException {
			
			String INSERT_QUERY="INSERT INTO EmployeeDatabaseManagementGrpD.LocationDetails(LocationId,LocationName) values(?,?);";
			
			PreparedStatement pst;
			Connection con = GetConnection();
			pst=con.prepareStatement(INSERT_QUERY);
			pst.setString(1, loc.getLocationId());
			pst.setString(2, loc.getLocationName());
			int count = pst.executeUpdate();
			
			System.out.println(count + "row/rows affected.");
			con.close();
		}
		
		
		public int EditLocation(LocationDetails loc) throws ClassNotFoundException, SQLException {
		
			String UPDATE_QUERY="UPDATE EmployeeDatabaseManagementGrpD.LocationDetails SET LocationId = ?, LocationNamevalues =?";
			PreparedStatement pst;
			Connection con = GetConnection();
			try {
				pst = con.prepareStatement(UPDATE_QUERY);
				pst.setString(1, loc.getLocationId());
				pst.setString(2, loc.getLocationName());
				int count = pst.executeUpdate();

				System.out.println(count + "row/rows affected.");
				con.close();

			}catch(SQLException e) {
				e.printStackTrace();
			}
			return count;
		}
		
		public int RemoveLocation(LocationDetails loc) throws ClassNotFoundException, SQLException {
		
			String DELETE_QUERY="DELETE FROM EmployeeDatabaseManagementGrpD.LocationDetails WHERE LocationId=?";
			PreparedStatement pst;
			Connection con = GetConnection();
			try {
				pst = con.prepareStatement(DELETE_QUERY);
				pst.setString(1, loc.getLocationId());
				pst.setString(2, loc.getLocationName());
				int count = pst.executeUpdate();

				System.out.println(count + "row/rows affected.");
				con.close();

			}catch(SQLException e) {
				e.printStackTrace();
			}
			return count;
		}
		
		
		public int FetchLocation(LocationDetails loc) throws ClassNotFoundException, SQLException {
			
			String FETCH_QUERY="SELECT * FROM EmployeeDatabaseManagementGrpD.LocationDetails WHERE LocationId=?";
			PreparedStatement pst;
			Connection con = GetConnection();
			try {
				pst = con.prepareStatement(FETCH_QUERY);
				pst.setString(1, loc.getLocationId());
				pst.setString(2, loc.getLocationName());
				int count = pst.executeUpdate();

				System.out.println(count + "row/rows affected.");
				con.close();

			}catch(SQLException e) {
				e.printStackTrace();
			}
			return count;
		}
		
	
	}
