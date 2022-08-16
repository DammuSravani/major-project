package empdbmgmt.model;

public class City {
	String code;
	String name;
	String statecode;
    String countrycode;
	public City(String code, String name, String statecode, String countrycode) {
		super();
		this.code = code;
		this.name = name;
		this.statecode = statecode;
		this.countrycode = countrycode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
    
 
}
