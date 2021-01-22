package phoneBook.phonebookAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import phoneBook.phonebookAPI.dto.DataGot;
import phoneBook.phonebookAPI.dto.LoginPack;
import phoneBook.phonebookAPI.repositories.SignLogRepo;

@RestController
public class SignLog {

	
	@Autowired
     SignLogRepo sl;
	
	
	
	@PostMapping(path="/auth/login")
	private LoginPack getAuth(DataGot dg){
		
		if(dg.getName().length()>0) {
			return sl.atSignin(dg);
		}else {
			return sl.atLogin(dg);
		}
		
	}

}
