package empdbmgmt.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import empdbmgmt.model.EmployeeDetails;

public interface IAdmin extends IOrgUser {
	ResultSet fetchData(EmployeeDetails ed) throws ClassNotFoundException, SQLException;
	int createData(EmployeeDetails ed) throws ClassNotFoundException, SQLException;
	int updateData(EmployeeDetails ed) throws ClassNotFoundException, SQLException;
	int deleteData(EmployeeDetails ed) throws ClassNotFoundException, SQLException;
}