package empdbmgmt.dal;

import java.sql.Connection;
import java.util.List;


public interface ILocation {
	
	String fetchData();
	String createData();
	
	int updateData();

	boolean deleteData();


}


