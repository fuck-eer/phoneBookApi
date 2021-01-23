package phoneBook.phonebookAPI.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Contact {

	@Id
	@GenericGenerator(name = "sequence_contact_id", strategy = "phoneBook.phonebookAPI.model.ContactIdGenerator")
    @GeneratedValue(generator = "sequence_contact_id")
	private String contactId;
	
	private String userId;
	
	private String contactNo;
	
	private String sharedContactStatus;
	
	private String deleteContact;

	public Contact() {
	}

	public String getContactId() {
	return contactId;
	}
	
	public Contact(String userId, String contactNo) {
		
		this.userId = userId;
		this.contactNo = contactNo;
		this.deleteContact="notdelete";
		this.sharedContactStatus="visible";
	}
	

	public void setContactId(String contactId) {
	this.contactId = contactId;
	}

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
