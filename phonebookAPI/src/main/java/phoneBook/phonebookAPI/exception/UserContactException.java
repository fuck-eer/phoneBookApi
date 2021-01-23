package phoneBook.phonebookAPI.exception;

public class UserContactException extends RuntimeException{

	public UserContactException() {
		super();
	}
	
	public UserContactException(String message) {
		super(message);
	}
	
}
