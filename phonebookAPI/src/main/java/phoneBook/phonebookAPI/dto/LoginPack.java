package phoneBook.phonebookAPI.dto;

public class LoginPack {

	private String userID;
	
	private String name;
	
	private String phoneNumber;
	
	private String idToken;
	
	private int expiresIn;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdToken() {
		return idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public LoginPack(String userID, String name, String phoneNumber, String idToken, int expiresIn) {
		super();
		this.userID = userID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.idToken = idToken;
		this.expiresIn = expiresIn;
	}
	
	
	
	
	

}
