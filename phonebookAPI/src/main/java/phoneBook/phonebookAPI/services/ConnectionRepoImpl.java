package phoneBook.phonebookAPI.services;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phoneBook.phonebookAPI.dto.connActiondatagot;
import phoneBook.phonebookAPI.dto.connectiondatagot;
import phoneBook.phonebookAPI.entity.Authtable;
import phoneBook.phonebookAPI.entity.Connection;


@Service
@Transactional
public class ConnectionRepoImpl implements ConnectionRepoCustom {

	
	@Autowired
EntityManager em;
	
	

	@Override
	public String askNewConn(connectiondatagot cd) {
		
		try {
			Query q2=em.createQuery("select c from Connection where c.requrId=: requrId and c.resperId=: resperId and c.conValidTime >:timenow");
			q2.setParameter("requrId", cd.getRequrId());
			q2.setParameter("resperId", cd.getResperId());
			q2.setParameter("timenow", LocalDateTime.now());
			
			Connection c4= null;
			c4=(Connection) q2.getSingleResult();
			
			return "Connection Request is in pool with ID "+ c4.getReqId()+" please try after 3 hours";
			
			
		}catch(NoResultException e) {
			
			
		
			try {
				
				Query q= em.createQuery("select a from Authtable a where a.userId=:requrId");
				q.setParameter("requrId", cd.getRequrId());
				Authtable requr=(Authtable)q.getSingleResult();
				
				Query q1= em.createQuery("select a from Authtable a where a.userId=:resperId");
				q1.setParameter("resperId", cd.getResperId());
				Authtable resper=(Authtable)q1.getSingleResult();
				
				Connection c1=new Connection(requr, resper);
				em.merge(c1);
				
				return "Connection Request Sent with reqId: "+c1.getReqId();		
				
			
			}catch(Exception k) {
				return "something went wrong" + k;
			}
			
			
			
		}
		
//		
		
		
		
	}

	@Override
	public String actionConn(connActiondatagot cad) {
		
		
		try {
			
			Query q=em.createQuery("update Connection c set c.connStatus=:status , c.connValidTime=:timenow where c.reqId=:reqId");
			q.setParameter("status", cad.getStatus());
			q.setParameter("reqId", cad.getReqId());
			q.setParameter("timenow",  LocalDateTime.now().plusHours(3));
			q.executeUpdate();
			
			return "connection status of your request has bee changed!";
			
		}catch(NoResultException e) {
			return "Cant find this request right now";
		}
	}

	@Override
	public List<Connection> showall(String userId) {
		
		try {
			Query q =em.createQuery("select c from Connection c where c.resperId=:userId or c.requrId=:userId");
			q.setParameter("userId", userId);
			
			return q.getResultList();
			
		}catch(NoResultException e) {
			throw new NoResultException("No requests to show in here!");
			
		}
		
	}

}
