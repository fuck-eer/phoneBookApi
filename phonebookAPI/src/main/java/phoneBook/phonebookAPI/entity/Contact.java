package phoneBook.phonebookAPI.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "contactId")

@Entity
public class Contact {

	@Id
	@GenericGenerator(name = "sequence_contact_id", strategy = "phoneBook.phonebookAPI.model.ContactIdGenerator")
    @GeneratedValue(generator = "sequence_contact_id")
	private String contactId;
	
@JsonIdentityReference(alwaysAsId = true)
@ManyToOne
@JoinColumn(name="userId")
	private Authtable authuser;

	
	private String contactNo;
	
	private String contactName;
	
	private String sharedContactStatus;
	
	private String deleteContact;

	public Contact() {
	}

	public String getContactId() {
	return contactId;
	}
	
	public Contact(Authtable authuser, String contactNo, String contactName) {
		
		this.authuser=authuser;
		this.contactNo = contactNo;
		this.contactName=contactName;
		this.deleteContact="notdelete";
		this.sharedContactStatus="visible";
	}
	

	public Authtable getAuthuser() {
		return authuser;
	}

	public void setAuthuser(Authtable authuser) {
		this.authuser = authuser;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setContactId(String contactId) {
	this.contactId = contactId;
	}


	public String getContactNo() {
	return contactNo;
	}

	public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
	}

	public String getSharedContactStatus() {
	return sharedContactStatus;
	}

	public void setSharedContactStatus(String sharedContactStatus) {
	this.sharedContactStatus = sharedContactStatus;
	}

	public String getDeleteContact() {
	return deleteContact;
	}

	public void setDeleteContact(String deleteContact) {
	this.deleteContact = deleteContact;
	}

}
