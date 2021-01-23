package phoneBook.phonebookAPI.services;

import java.util.List;

import phoneBook.phonebookAPI.dto.ShowContact;

public interface ContactService {
	
	public ShowContact showContact(String uId, String contactId);
	
	public List<ShowContact> showAllContact(String userId);
	
	//public Contact addContact(String contactNo);

}
