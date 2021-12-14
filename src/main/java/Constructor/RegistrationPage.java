package Constructor;

public class RegistrationPage {
	private String firstname;
	private String lastname;
	private String email;
	private  int phone;
	private String password;
	private String confirmpassword;
	
	public RegistrationPage(String firstname, String lastname, String email, int phone, String password,
			String confirmpassword) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Object getPassword() {
		return password;
	}

	public void setPassword(Object password) {
		this.password = password;
	}

	public Object getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(Object confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
	
	

}
