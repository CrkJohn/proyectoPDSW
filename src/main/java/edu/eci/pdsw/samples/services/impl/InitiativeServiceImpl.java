package edu.eci.pdsw.samples.services.impl;

import java.util.List;

import javax.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.Keyword;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.entities.chartInitiative;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;
import edu.eci.pdsw.entities.TypeStatus;

public class InitiativeServiceImpl implements InitiativeServices {
	
	@Inject
	private UserDAO userDAO;
	
	@Inject
	private InitiativeDAO initiativeDAO;
	
	@Inject
	private CommentDAO commentDAO;

	
	@Override
	public void createUser(User user) throws ServicesException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> listUsers() throws ServicesException {
		return userDAO.loadAll();
	}

	@Override
	public void createInitiative(String description, String area, int idus, List<String> keywords, String name) throws ServicesException{
		try {
			initiativeDAO.addInitiative(description, area, idus, keywords,name);
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
		return initiativeDAO.load(idIni);
	}
	
	@Override
	public List<Initiative> searchInitiativeByKeywords(List<String> keywords) throws ServicesException {
		return initiativeDAO.load(keywords);
	}

	@Override
	public User getUser(String email, String password) throws ServicesException {
		return userDAO.getUserByCredetianls(email, password);
	}

	@Override
	public void modifyUser(String email, int rol) throws ServicesException {
		userDAO.modifyUser(email, rol);
		
	}

	@Override
	public void modifyInitiative(String newStatus, String name) throws ServicesException {
		initiativeDAO.modifyInitiative(newStatus,name);
		
	}

	@Override
	public List<Initiative> listInitiative() throws ServicesException {
		return initiativeDAO.loadAll();
	}

	@Override
	public List<TypeStatus> listStatus() throws ServicesException {
		return initiativeDAO.listStatus();
	}

	@Override
	public List<User> consultUserByMail(String usermail) throws ServicesException {
		return userDAO.loadUserByMail(usermail);
	}

	@Override
	public List<Keyword> listKeywords() throws ServicesException {
		return initiativeDAO.listKeywords();
	}
	

	@Override
	public void addComment (int InitiativeId, int userId, String comment) throws ServicesException {
		commentDAO.addComment(InitiativeId, userId, comment);
	}
	
	@Override
	public List<Comment> loadComments() throws ServicesException {
		return commentDAO.loadComments();
	}
	
	@Override
	public List<Comment> loadComment(int InitiativeId) throws ServicesException {
		return commentDAO.loadComment(InitiativeId);
	}
	
	@Override
	public void addVote(int idIni, int idUser) throws ServicesException{
		initiativeDAO.addVote(idIni, idUser);
	}
	
	@Override
	public int loadVotes(int id) throws ServicesException{
		return initiativeDAO.loadVotes(id);
	}
	
	@Override
	public void deleteVote(int idIni,int idUser) throws ServicesException{
		initiativeDAO.deleteVote(idIni, idUser);
	}

	@Override
	public void insertInterested(int idIni, int idUser) throws ServicesException {
		initiativeDAO.insertInterested(idIni, idUser);		
	}

	@Override
	public List<User> loadInterested(int id) throws ServicesException {
		return initiativeDAO.loadInterested(id);
	}

	@Override
	public List<Initiative> loadRelated(int id) throws ServicesException {
		return initiativeDAO.loadRelated(id);
	}

	@Override
	public void deleteInterested(int idInitiative, int idUser) {
		initiativeDAO.deleteInterested(idInitiative, idUser);		
	}

	@Override
	public List<chartInitiative> getDataChart() throws ServicesException {
		return initiativeDAO.gerDataChart();
	}

	@Override
	public List<Initiative> loadInitiativeByUser(int idUser) throws ServicesException {
		return initiativeDAO.loadByUser(idUser);
	}

	@Override
	public void modifyAllInitiative(String name, String area, String description) throws ServicesException {
		initiativeDAO.modifyAllInitiative(name,area,description);
		
	}

	@Override
	public List<Initiative> loadByStatus(String status) throws ServicesException {
		return initiativeDAO.loadByStatus(status);
	}

	@Override
	public List<chartInitiative> getDataStatus() throws ServicesException {
		return initiativeDAO.getDataStatus();
	}



}