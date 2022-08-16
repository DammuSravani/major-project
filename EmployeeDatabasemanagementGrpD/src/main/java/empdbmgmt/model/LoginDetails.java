package empdbmgmt.model;


public class LoginDetails 
{
	private String Username;
	private String Password;
	public LoginDetails() {
		super();
	}
	
	public LoginDetails(String Username, String Password) {
		super();
		this.Username = Username;
		this.Password = Password;
	}
	public String getUsername() {
		return Username;
	}
	
	public void setEmail(String Username) {
		this.Username = Username;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = Password;
	}
	
	@Override
	public String toString() {
		return "LogIn [Username=" + Username + ", Password=" + Password + "]";
	}	
}
