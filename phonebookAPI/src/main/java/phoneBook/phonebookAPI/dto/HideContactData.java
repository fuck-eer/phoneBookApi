package phoneBook.phonebookAPI.dto;

public class HideContactData {
	
	private String userId;
	
	private String sharedContactStatus;

	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getSharedContactStatus() {
		return sharedContactStatus;
	}



	public void setSharedContactStatus(String sharedContactStatus) {
		this.sharedContactStatus = sharedContactStatus;
	}



	public HideContactData(String userId, String sharedContactStatus) {
		
		this.userId = userId;
		this.sharedContactStatus = sharedContactStatus;
	}

}
