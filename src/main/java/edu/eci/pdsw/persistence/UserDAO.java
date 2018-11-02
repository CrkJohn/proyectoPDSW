package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.samples.services.ServicesException;

public interface UserDAO {
	
	public User load (int id) throws ServicesException;
	
	public List<User> loadAll() throws ServicesException;
	
	
}
