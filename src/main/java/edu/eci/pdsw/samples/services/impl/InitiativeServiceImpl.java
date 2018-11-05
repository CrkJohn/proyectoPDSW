package edu.eci.pdsw.samples.services.impl;

import java.util.List;

import javax.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;

public class InitiativeServiceImpl implements InitiativeServices {
	
	@Inject
	private UserDAO userDAO;
	private InitiativeDAO initiativeDAO;
	private CommentDAO commentDAO;
	
	
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
	public void createInitiative(Initiative i) throws ServicesException {
		// TODO Auto-generated method stub
		
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
	public User getUser(int id) throws ServicesException {
		return userDAO.load(id);
	}
	
	@Override
	public List<Initiative> searchInitiativeByKeywords(List<String> keywords) throws ServicesException {
		return initiativeDAO.load(keywords);
	}


}
