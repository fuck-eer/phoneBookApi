package phoneBook.phonebookAPI.services;

import java.util.List;

import phoneBook.phonebookAPI.dto.connActiondatagot;
import phoneBook.phonebookAPI.dto.connectiondatagot;
import phoneBook.phonebookAPI.entity.Connection;

public interface ConnectionRepoCustom {

	
	public String askNewConn(connectiondatagot cd);
	
	public String actionConn(connActiondatagot cad);
	
	//will do filter on the front end
	public List<Connection> showall(String userId);
	
}
