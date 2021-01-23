package phoneBook.phonebookAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import phoneBook.phonebookAPI.entity.Contact;
import phoneBook.phonebookAPI.services.ContactRepoCustom;

@RestController
public class ListContact {

	@Autowired
	ContactRepoCustom cs;
	
	@GetMapping("/getallcontact")
	public List<Contact> getContact(@RequestParam("userId") String id) {
		return cs.showAllContact(id);
	}

}
