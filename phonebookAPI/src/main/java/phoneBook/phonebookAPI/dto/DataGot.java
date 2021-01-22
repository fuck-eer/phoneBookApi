package phoneBook.phonebookAPI.dto;

public class DataGot {

	private String phoneNumber;
	
	private String name;
	
	private String password;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DataGot(String phoneNumber, String name, String password) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.password = password;
	}
	
	
	
}
