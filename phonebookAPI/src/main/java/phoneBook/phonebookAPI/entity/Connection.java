package phoneBook.phonebookAPI.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Connection {
	@Id
	@GenericGenerator(name = "sequence_connection_id", strategy = "phoneBook.phonebookAPI.model.ConnectionIdGenerator")
    @GeneratedValue(generator = "sequence_connection_id")
	private String reqId;
	
	@ManyToOne
	@JoinColumn(name="requrId")
	private Authtable requr;
	
	@ManyToOne
	@JoinColumn(name="resperId")
	private Authtable resper;
	
	
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

	 public Authtable getRequrId() {
	return requr;
	}

	 public void setRequrId(Authtable requr) {
	this.requr = requr;
	}

	 public Authtable getResperId() {
	return resper;
	}

	 public void setResperId(Authtable resper) {
	this.resper = resper;
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

	
	public Connection(Authtable requr, Authtable resper) {
		super();
		this.requr = requr;
		this.resper = resper;
		this.connDuration = 18000;
		this.connStatus="pending";
		this.connValidTime=null;
	}

	 
	  

}
