package edu.eci.pdsw.samples.services;

import java.util.List;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.Keyword;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.entities.chartInitiative;
import edu.eci.pdsw.entities.TypeStatus;


public interface InitiativeServices {

/**
 * Crea un usuario
 * @param user
 * @throws ServicesException
 */
	public void createUser(User user) throws ServicesException;
	
	/**
	 * 
	 * @return lista de usuarios
	 * @throws ServicesException
	 */
	public List<User> listUsers() throws ServicesException;
	
	public void modifyUser(String email, int rol) throws ServicesException;
	/**
	 * 
	 * @param i
	 * @throws ServicesException
	 */
	public void createInitiative(String description, String area, int idus, List<String> keywords) throws ServicesException;
	/**
	 * 
	 * @param idUser
	 * @param idIni
	 * @param comment
	 * @throws ServicesException
	 */
	public void createComment (long idUser, int idIni, String comment) throws ServicesException;
	/**
	 * 
	 * @param idUser
	 * @param idIni
	 * @throws ServicesException
	 */
	public void registerVote (long idUser,int idIni) throws ServicesException;
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ServicesException
	 */
	public List<Comment> searchCommentsByInitiative (int id) throws ServicesException;
	
	/**
	 * 
	 * @param idIni
	 * @return
	 * @throws ServicesException
	 */
	public Initiative searchInitiative(int idIni) throws ServicesException; 
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ServicesException
	 */
	public User getUser(String email, String password) throws ServicesException;
	
	public List<User> consultUserByMail(String usermail)throws ServicesException;
	
	/**
	 * 
	 * @param keywords
	 * @return
	 * @throws ServicesException
	 */
	public List<Initiative> searchInitiativeByKeywords(List<String> keywords) throws ServicesException;
	
	public List<Initiative> listInitiative() throws ServicesException;
	
	public void modifyInitiative(String newStatus, int id) throws ServicesException;
	
	public List<TypeStatus> listStatus() throws ServicesException;
	
	public List<Keyword> listKeywords() throws ServicesException;
	
	public void addComment (int InitiativeId, int userId, String comment) throws ServicesException;
	
	public List<Comment> loadComments() throws ServicesException;
	
	public List<Comment> loadComment(int InitiativeId) throws ServicesException;
	
	public void insertInterested(int idIni, int idUser) throws ServicesException;
	
	public List<User> loadInterested(int id) throws ServicesException;
	
	public List<Initiative> loadRelated(int id) throws ServicesException;

	public void deleteInterested(int idInitiative, int idUser);
	
	public List<chartInitiative> getDataChart() throws ServicesException;
	
	
}