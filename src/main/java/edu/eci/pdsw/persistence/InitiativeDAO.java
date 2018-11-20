package edu.eci.pdsw.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.Keyword;
import edu.eci.pdsw.samples.services.ServicesException;
import edu.eci.pdsw.entities.TypeStatus;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.entities.chartInitiative;

public interface InitiativeDAO {
	
	public void addInitiative(String description, String area, int idus, List<String> keywords) throws ServicesException;
	
	public List<Initiative> loadByUser (String id) throws ServicesException;
	
	public Initiative load(int InitiativeId) throws ServicesException;
	
	public List<Initiative> load(List<String> keywords) throws ServicesException;

	public void modifyInitiative(String newStatus, int id) throws ServicesException;

	public List<Initiative> loadAll() throws ServicesException;

	public List<TypeStatus> listStatus() throws ServicesException;

	public List<Keyword> listKeywords() throws ServicesException;
	
	public void insertInterested(int idIni, int idUser) throws ServicesException;
	
	public List<User> loadInterested(int id) throws ServicesException;

	public List<Initiative> loadRelated(int id) throws ServicesException;

	public void deleteInterested(int idInitiative, int idUser);

	public List<chartInitiative> gerDataChart();
	

}
