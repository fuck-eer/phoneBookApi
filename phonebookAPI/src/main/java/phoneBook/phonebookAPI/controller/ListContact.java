package phoneBook.phonebookAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phoneBook.phonebookAPI.dto.DeleteContactData;
import phoneBook.phonebookAPI.dto.HideContactData;
import phoneBook.phonebookAPI.dto.ShowSharedData;
import phoneBook.phonebookAPI.dto.adconDataGot;
import phoneBook.phonebookAPI.entity.Contact;
import phoneBook.phonebookAPI.services.ContactRepoCustom;

@RestController
@CrossOrigin
public class ListContact {

	@Autowired
	ContactRepoCustom cs;
	
	@GetMapping("/getallcontact")
	public List<Contact> getContact(@RequestParam("userId") String id) {
		return cs.showAllContact(id);
	}
	
	
	@PostMapping(path="/sharedContact")
	public List<Contact> sharedContact(@RequestBody ShowSharedData sd){
		return cs.showShared(sd);
	}

	@PostMapping(path="/hideAllCon")
	public String hidcon(@RequestBody HideContactData hd) {
		return cs.HideContact(hd);
				}

	
	@PostMapping(path="/delCon")
	public String delCon(@RequestBody DeleteContactData dg) {
		return cs.DeleteContact(dg);
	}
	
	@PostMapping(path="/savecon")
	public String saveCon(@RequestBody adconDataGot adg) {
		return cs.AddContact(adg);
	}
	
}
