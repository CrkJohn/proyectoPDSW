package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.samples.services.ServicesException;

public interface InitiativeDAO {
	
	public void addInitiative() throws ServicesException;
	
	public List<Initiative> loadByUser (String id) throws ServicesException;
	
	public Initiative load(int InitiativeId) throws ServicesException;
	
	
	
	

}
