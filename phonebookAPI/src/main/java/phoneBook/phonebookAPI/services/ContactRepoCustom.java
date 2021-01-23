package phoneBook.phonebookAPI.services;

import java.util.List;

import phoneBook.phonebookAPI.dto.DeleteContactData;
import phoneBook.phonebookAPI.dto.HideContactData;
import phoneBook.phonebookAPI.dto.ShowSharedData;
import phoneBook.phonebookAPI.entity.Contact;

public interface ContactRepoCustom {
	
	
	public List<Contact> showAllContact(String userId);
	
	public List<Contact> showShared(ShowSharedData sd );
	
	public String HideContact(HideContactData hd);
	
	public String DeleteContact(DeleteContactData dg);

}
