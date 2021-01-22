package phoneBook.phonebookAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Authtable {

	@Id
	@GenericGenerator(name = "sequence_user_id", strategy = "phoneBook.phonebookAPI.model.UserIdGenerator")
    @GeneratedValue(generator = "sequence_user_id")
	private String userId;
	
	private String name;
	
	private String idToken;
	
	private int expiresIn;
	
	private String phoneNumber;
	
	private String password;

	private String imgUrl;
	
	
	public Authtable() {
	
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdToken() {
		return idToken;
	}


	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}


	public int getExpiresIn() {
		return expiresIn;
	}


	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public Authtable(String name, String idToken, String phoneNumber, String password) {
		super();
		this.name = name;
		this.idToken = idToken;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.imgUrl="";
		this.expiresIn=3600;
	}
	
	
	
	

}
