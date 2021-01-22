package phoneBook.phonebookAPI.services;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import phoneBook.phonebookAPI.dto.DataGot;
import phoneBook.phonebookAPI.dto.LoginPack;
import phoneBook.phonebookAPI.entity.Authtable;

@Repository
@Transactional
public class SignLogRepoImpl implements SignLogRepoCustom {

	
	@Autowired
	EntityManager em;
	

	@Override
	public LoginPack atSignin(DataGot dg) {
		String token=dg.getPhoneNumber()+dg.getName();
		
		Authtable a1=new Authtable(dg.getName(), token, dg.getPhoneNumber(), dg.getPassword());
		try {
			em.persist(a1);
			
			return new LoginPack(a1.getUserId(), a1.getName(), a1.getPhoneNumber(), a1.getIdToken(), a1.getExpiresIn());
			
		}catch(EntityExistsException e) {
			throw new EntityExistsException("User already Exists");
		}
	}

	
	
	
	@Override
	public LoginPack atLogin(DataGot dg) {
	
		Authtable a1=null;
		
		Query q= em.createQuery("select a from Authtable as a where a.phoneNumber=: phno and a.password=: pass");
		q.setParameter("phno", dg.getPhoneNumber());
		q.setParameter("pass", dg.getPassword());
		
		try {
			a1= (Authtable) q.getSingleResult();
			if(a1.getName().length()>0) {
				return new LoginPack(a1.getUserId(), a1.getName(), a1.getPhoneNumber(), a1.getIdToken(), a1.getExpiresIn());
			}else {
				return null;
			}
		}catch(NoResultException e) {
			
		  throw new NoResultException("phno or password is wrong");
		}
		

	}

}
