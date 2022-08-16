package empdbmgmt.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {
	String username = "root";
	String password="Sravs@113";
	String url = "jdbc:mysql://localhost:3306/";

	public Connection GetConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
