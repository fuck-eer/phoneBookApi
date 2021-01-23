package phoneBook.phonebookAPI.dto;

public class DeleteContactData {
	
	private String userId;
	
    private String contactId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public DeleteContactData(String contactId) {
		
		this.contactId = contactId;
	}
    
	
    
}
