package empdbmgmt.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	 private static Connection con;

	    public static Connection getCon() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demographicsdb","root","Sravs@113");
	        }catch (ClassNotFoundException | SQLException ex) {
	            System.out.println(ex.getLocalizedMessage());
	        	ex.printStackTrace();
	        } 
	        return con;
	    }

}
