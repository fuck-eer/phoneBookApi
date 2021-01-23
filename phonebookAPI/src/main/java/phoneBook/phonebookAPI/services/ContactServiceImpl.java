package phoneBook.phonebookAPI.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import phoneBook.phonebookAPI.dto.Contact;
import phoneBook.phonebookAPI.dto.ShowContact;
import phoneBook.phonebookAPI.exception.UserContactException;


@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	EntityManager e;
	
	@Override
	public ShowContact showContact(String uId, String contactId) {
		
		ShowContact con = null;
		Query query = e.createQuery("select c from Contact as c where c.userId =:uId and c.contactId =: contactId");
		query.setParameter("uId", con.getUserId());
		query.setParameter("contactId", con.getContactNo());
		try {
			con = (ShowContact) query.getSingleResult();
			return new ShowContact(con.getUserId(),con.getContactNo());
		} catch (NoResultException e) {
			throw new UserContactException ("Contact does not exist");
		}
		
	}

	@Override
	public List<ShowContact> showAllContact(String userId) {
		ShowContact con = null;
		Query q = e.createQuery("select c from Contact as c where c.userId=: userId");
		q.setParameter("userId", con.getUserId());
		System.out.println(userId);
		try {
			List<ShowContact> listAll = (List<ShowContact>) q.getResultList();
			return listAll;
		}catch (NoResultException e) {
			throw new UserContactException("No contacts exist, get some life bro!");
		}
		
		
		//return null;
	}

	/*
	 * @Override public Contact addContact(String contactNo) {
	 * 
	 * return null; }
	 */
	
	

}
