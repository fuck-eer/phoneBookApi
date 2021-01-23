package phoneBook.phonebookAPI.dto;

public class adconDataGot {

	private String userId;
	
	private String phoneNumber;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public adconDataGot(String userId, String phoneNumber) {
		super();
		this.userId = userId;
		this.phoneNumber = phoneNumber;
	}
	
	

}
