package edu.eci.pdsw.samples.services.impl;

import java.util.List;

import javax.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;

public class InitiativeServiceImpl implements InitiativeServices {
	
	@Inject
	private UserDAO userDAO;
	
	@Inject
	private InitiativeDAO initiativeDAO;
	
	
	@Override
	public void createUser(User user) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> listUsers() throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createInitiative(String description, String area, int idus) throws ServicesException{
		try {
			System.out.println(initiativeDAO+" Holaaaaaaaaaaaaaaaaaaaaaaa");
			initiativeDAO.addInitiative(description, area, idus);
		}catch (ServicesException ex) {
			throw new ServicesException("Error trying to insert the initiative", ex);
		}
		
	}

	@Override
	public void createComment(long idUser, int idIni, String comment) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerVote(long idUser, int idIni) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> searchCommentsByInitiative(int id) throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Initiative searchInitiative(int idIni) throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Initiative> searchInitiativeByKeywords(List<String> keywords) throws ServicesException {
		return initiativeDAO.load(keywords);
	}

	@Override
	public User getUser(String email, String password) throws ServicesException {
		return userDAO.getUserByCredetianls(email, password);
	}


}
