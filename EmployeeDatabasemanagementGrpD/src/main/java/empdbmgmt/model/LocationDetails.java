package empdbmgmt.model;

public class LocationDetails {
	private String LocationId;
	private String LocationName;
	
	public LocationDetails() {
		super();
	}
	
	public LocationDetails(String LocationId, String LocationName) {
		super();
		this.LocationId = LocationId;
		this.LocationName = LocationName;
	}
	public String getLocationId() {
		return LocationId;
	}
	
	public void setId(String LocationId) {
		this.LocationId = LocationId;
	}
	
	public String getLocationName() {
		return LocationName;
	}
	public void setName(String LocationName) {
		this.LocationName = LocationName;
	}
	
	@Override
	public String toString() {
		return "LocationDetails [Username=" + LocationId + ", Password=" + LocationName + "]";
	}	
}



