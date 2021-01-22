package phoneBook.phonebookAPI.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Connection {
	@Id
	@GenericGenerator(name = "sequence_connection_id", strategy = "phoneBook.phonebookAPI.model.ConnectionIdGenerator")
    @GeneratedValue(generator = "sequence_connection_id")
	private String reqId;
	
	private String requrId;
	
	private String resperId;
	
	
	private int connDuration;
	
	private LocalDateTime connValidTime;
	
	private String connStatus;
	public Connection() {
	}

	 public String getReqId() {
	return reqId;
	}

	 public void setReqId(String reqId) {
	this.reqId = reqId;
	}

	 public String getRequrId() {
	return requrId;
	}

	 public void setRequrId(String requrId) {
	this.requrId = requrId;
	}

	 public String getResperId() {
	return resperId;
	}

	 public void setResperId(String resperId) {
	this.resperId = resperId;
	}

	 public int getConnDuration() {
	return connDuration;
	}

	 public void setConnDuration(int connDuration) {
	this.connDuration = connDuration;
	}

	 public LocalDateTime getConnValidTime() {
	return connValidTime;
	}

	 public void setConnValidTime(LocalDateTime connValidTime) {
	this.connValidTime = connValidTime;
	}

	 public String getConnStatus() {
	return connStatus;
	}

	 public void setConnStatus(String connStatus) {
	this.connStatus = connStatus;
	}

	public Connection(String requrId, String resperId, int connDuration) {
		super();
		this.requrId = requrId;
		this.resperId = resperId;
		this.connDuration = connDuration;
	}
	
	public Connection(String requrId, String resperId) {
		super();
		this.requrId = requrId;
		this.resperId = resperId;
		this.connDuration = 18000;
	}

	 
	  

}
