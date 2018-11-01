package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.samples.services.ServicesException;

public interface CommentDAO {
	
	public void addComment (int InitiativeId, Comment comment) throws ServicesException;

}
