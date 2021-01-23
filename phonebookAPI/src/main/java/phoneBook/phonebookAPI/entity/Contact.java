package phoneBook.phonebookAPI.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Contact {

	@Id
	@GenericGenerator(name = "sequence_contact_id", strategy = "phoneBook.phonebookAPI.model.ContactIdGenerator")
    @GeneratedValue(generator = "sequence_contact_id")
	private String contactId;
	
@ManyToOne
@JoinColumn(name="userId")
	private Authtable authuser;
	
	private String contactNo;
	
	private String sharedContactStatus;
	
	private String deleteContact;

	public Contact() {
	}

	public String getContactId() {
	return contactId;
	}
	
	public Contact(Authtable authuser, String contactNo) {
		
		this.authuser=authuser;
		this.contactNo = contactNo;
		this.deleteContact="notdelete";
		this.sharedContactStatus="visible";
	}
	

	public void setContactId(String contactId) {
	this.contactId = contactId;
	}

	public Authtable getUserId() {
	return authuser;
	}

	public void setUserId(Authtable userauth) {
	this.authuser = userauth;
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
