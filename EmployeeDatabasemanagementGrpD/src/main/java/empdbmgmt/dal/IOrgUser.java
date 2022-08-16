package empdbmgmt.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import empdbmgmt.model.EmployeeDetails;

public interface IOrgUser {

	ResultSet fetchData(EmployeeDetails ed) throws ClassNotFoundException, SQLException;
}