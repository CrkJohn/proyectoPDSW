package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.samples.services.ServicesException;

public interface CommentDAO {
	
	public void addComment (int InitiativeId, int userId, String comment) throws ServicesException;
	
	public List<Comment> loadComments() throws ServicesException;
	
	public List<Comment> loadComment(int InitiativeId) throws ServicesException;
}
