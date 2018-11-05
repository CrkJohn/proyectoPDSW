package edu.eci.pdsw.persistence;

import java.util.List;
import java.sql.Date;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.samples.services.ServicesException;

public interface InitiativeDAO {
	
	public void addInitiative(int idin, String description, String area, int nvotos, Date creation, int idus, Date modification) throws ServicesException;
	
	public List<Initiative> loadByUser (String id) throws ServicesException;
	
	public Initiative load(int InitiativeId) throws ServicesException;
	
	
	
	

}
