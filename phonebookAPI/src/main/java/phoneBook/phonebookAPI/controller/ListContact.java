package phoneBook.phonebookAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import phoneBook.phonebookAPI.dto.ShowContact;
import phoneBook.phonebookAPI.services.ContactService;

public class ListContact {

	@Autowired
	ContactService cs;
	
	@GetMapping(path="/getallcontact")
	public List<ShowContact> getContact(@RequestParam("userId") String id) {
		return cs.showAllContact(id);
	}
	
}
