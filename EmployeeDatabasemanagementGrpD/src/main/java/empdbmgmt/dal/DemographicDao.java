package empdbmgmt.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empdbmgmt.model.*;
import empdbmgmt.utility.DBCon;

public class DemographicDao {
	
	private Connection connection = null;
	private static String FETCH_ALL_COUNTRY_NAME = "select * from demographicsdb.country"; 
	private static String FETCH_ALL_STATE_NAME = "select * from demographicsdb.state";
	private static String FETCH_ALL_CITY_NAME = "select * from demographicsdb.city";
	 public List<String> getAllCountries() throws SQLException {
	        List<String> listCountryName  = new ArrayList<>();
	          this.connection = DBCon.getCon();
	            Statement statement = connection.createStatement();
	            ResultSet result = statement.executeQuery(FETCH_ALL_COUNTRY_NAME);
	            while(result.next()){
	            	String countrycode = result.getString("countrycode");
	            	String countryname = result.getString("countryname");
	                Country country = new Country(countrycode,countryname);        
	                listCountryName.add(countryname);            
	        }
	        return listCountryName;
	    }
	 public List<String> getAllStates() throws SQLException {
	        List<String> listStateName  = new ArrayList<>();
	          this.connection = DBCon.getCon();
	            Statement statement = connection.createStatement();
	            ResultSet result = statement.executeQuery(FETCH_ALL_STATE_NAME);
	            while(result.next()){
	            	String statecode = result.getString("statecode");
	            	String statename = result.getString("statename");
	            	String countrycode = result.getString("countrycode");
	                State state = new State(statecode,countrycode,statename);        
	                listStateName.add(statename);            
	        }
	        return listStateName;
	    }
	 public List<String> getAllCities() throws SQLException {
	        List<String> listCityName  = new ArrayList<>();
	          this.connection = DBCon.getCon();
	            Statement statement = connection.createStatement();
	            ResultSet result = statement.executeQuery(FETCH_ALL_CITY_NAME);
	            while(result.next()){
	            	String citycode = result.getString("citycode");
	            	String cityname = result.getString("cityname");
	            	String statecode = result.getString("statecode");
	            	String countrycode = result.getString("countrycode");
	                City city = new City(citycode,cityname,statecode,countrycode);        
	                listCityName.add(cityname);            
	        }
	        return listCityName;
	    }

}
