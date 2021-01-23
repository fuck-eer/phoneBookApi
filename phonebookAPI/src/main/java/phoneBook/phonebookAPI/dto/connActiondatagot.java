package phoneBook.phonebookAPI.dto;

public class connActiondatagot {

	private String reqId;

	private String status;

	
	
	
	public connActiondatagot(String reqId, String status) {
		super();
		this.reqId = reqId;
		this.status = status;
	}




	public String getReqId() {
		return reqId;
	}




	public void setReqId(String reqId) {
		this.reqId = reqId;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public connActiondatagot() {
		// TODO Auto-generated constructor stub
	}

}
