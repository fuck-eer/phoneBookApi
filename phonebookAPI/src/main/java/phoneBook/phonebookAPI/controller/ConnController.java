package phoneBook.phonebookAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import phoneBook.phonebookAPI.dto.connActiondatagot;
import phoneBook.phonebookAPI.dto.connectiondatagot;
import phoneBook.phonebookAPI.entity.Connection;
import phoneBook.phonebookAPI.repositories.ConnectionRepo;

@RestController
public class ConnController {

	@Autowired
     ConnectionRepo cr;	
	
	
	
	@PostMapping(path="/newConnection")
	private String addConn(@RequestBody connectiondatagot cd) {
		
		return cr.askNewConn(cd);
		
	}
	
	
	@PostMapping(path="/changeStatus")
	private String changeConnStat(@RequestBody connActiondatagot cad) {
		
		return cr.actionConn(cad);
		
	}

	
	@PostMapping(path="/showConn/{uid}")
	private List<Connection> findAllConn (@PathVariable String uid) {
		
		return cr.showall(uid);
		
	}
	

}
