package phoneBook.phonebookAPI.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phoneBook.phonebookAPI.dto.DeleteContactData;
import phoneBook.phonebookAPI.dto.HideContactData;
import phoneBook.phonebookAPI.dto.ShowSharedData;
import phoneBook.phonebookAPI.entity.Connection;
import phoneBook.phonebookAPI.entity.Contact;
import phoneBook.phonebookAPI.exception.UserContactException;


@Service
@Transactional
public class ContactRepoImpl implements ContactRepoCustom {

	@Autowired
	EntityManager e;
	

	@Override
	public List<Contact> showAllContact(String userId) {
		
		Query q = e.createQuery("select c from Contact c where c.authuser=: userId and c.deleteContact = 'notdelete'");
		q.setParameter("userId", userId);
		System.out.println(userId);
		try {
			List<Contact> listAll = (List<Contact>) q.getResultList();
			return listAll;
		}catch (NoResultException e) {
			throw new UserContactException("No contacts exist, get some life bro!");
		}
		
	}

	

	@Override
	public List<Contact> showShared(ShowSharedData sd) {
		
		try {
			
			Query q = e.createQuery("select c from Connection as c where c.reqId =: reqId and connStatus= 'accepted'").setParameter("reqId",sd.getReqId());
			Connection c1 = (Connection) q.getSingleResult();
			
			if(sd.getUserId()==c1.getResperId().getUserId()) {
				
				try {
					
					Query query = e.createQuery("select c from Contact c where c.userId =: userId and sharedContactStatus ='visible'").setParameter("userId", c1.getRequrId().getUserId());
					
					return query.getResultList();
				} catch(NoResultException e) {
					throw new NoResultException("No Contacts Found to Show in this Connection");
				}
			}
			else {
				
				Query q1 = e.createQuery("select c from Contact c where c.userId =: userId and sharedContactStatus ='visible'").setParameter("userId", c1.getResperId().getUserId());
				return q1.getResultList();
			}
		}catch (NoResultException e) {
			
			throw new NoResultException("Request Rejected or not Accepted");
		}
		
	}



	@Override
	public String HideContact(HideContactData hd) {
		try {
			Query q = e.createQuery("update Contact c set c.sharedContactStatus = 'hidden' where userId =: userId").setParameter("userId", hd.getUserId());
			q.executeUpdate();
			return "Contact Hidden";
			
		} catch(NoResultException e) {
			throw new NoResultException("Some error occurred: "+ e); 
		} 
	
	}



	@Override
	public String DeleteContact(DeleteContactData dg) {
		try {
			Query q = e.createQuery("update Contact c set c.deleteContact = 'deleted' where contactId =: contactId").setParameter("contactId", dg.getContactId());
		    q.executeUpdate();
		    return "Contact deleted successfully";
		}catch(NoResultException e){
			throw new NoResultException("Some error occurred"+ e);
		}
	}

	

}
