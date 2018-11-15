package edu.eci.pdsw.persistence;

import java.util.List;
import java.sql.Date;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.Keyword;
import edu.eci.pdsw.samples.services.ServicesException;
import edu.eci.pdsw.entities.TypeStatus;

public interface InitiativeDAO {
	
	public void addInitiative(String description, String area, int idus, List<String> keywords) throws ServicesException;
	
	public List<Initiative> loadByUser (String id) throws ServicesException;
	
	public Initiative load(int InitiativeId) throws ServicesException;
	
	public List<Initiative> load(List<String> keywords) throws ServicesException;

	public void modifyInitiative(String newStatus, int id) throws ServicesException;

	public List<Initiative> loadAll() throws ServicesException;

	public List<TypeStatus> listStatus() throws ServicesException;

	public List<Keyword> listKeywords() throws ServicesException;
	
	
	

}
