package phoneBook.phonebookAPI.services;

import phoneBook.phonebookAPI.dto.DataGot;
import phoneBook.phonebookAPI.dto.LoginPack;

public interface SignLogRepoCustom {

	public LoginPack atSignin(DataGot dg);
	
	public LoginPack atLogin(DataGot dg);
	
}
