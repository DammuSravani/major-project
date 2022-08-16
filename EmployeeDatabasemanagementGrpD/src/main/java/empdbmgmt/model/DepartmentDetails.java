package empdbmgmt.model;

public class DepartmentDetails {
	private String DepartmentId;
	private String DepartmentName;
	
	public DepartmentDetails() {
		super();
	}
	
	public DepartmentDetails(String DepartmentId, String DepartmentName) {
		super();
		this.DepartmentId = DepartmentId;
		this.DepartmentName = DepartmentName;
	}
	public String getDepartmentId() {
		return DepartmentId;
	}
	
	public void setId(String DepartmentId) {
		this.DepartmentId = DepartmentId;
	}
	
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setName(String DepartmentName) {
		this.DepartmentName = DepartmentName;
	}
	
	@Override
	public String toString() {
		return "LocationDetails [Username=" + DepartmentId + ", Password=" + DepartmentName + "]";
	}	
}




