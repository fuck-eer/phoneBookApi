package phoneBook.phonebookAPI.dto;

public class ShowSharedData {
	
	private String reqId;
	
    private String userId;

	public ShowSharedData(String reqId, String userId) {
	
		this.reqId = reqId;
		this.userId = userId;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    
    
}
