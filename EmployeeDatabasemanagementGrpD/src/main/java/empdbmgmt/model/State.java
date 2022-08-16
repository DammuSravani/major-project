package empdbmgmt.model;

public class State {
	
	String code;
    String countrycode;
    String name;
    
    
	public State(String code, String countrycode, String name) {
		super();
		this.code = code;
		this.countrycode = countrycode;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
	

}
