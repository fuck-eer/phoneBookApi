package phoneBook.phonebookAPI.dto;

public class ShowContact {

	private String userId;
	
	private String contactNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	
	public ShowContact(String userId, String contactNo) {
		
		this.userId = userId;
		this.contactNo = contactNo;
	}
	
	

}
