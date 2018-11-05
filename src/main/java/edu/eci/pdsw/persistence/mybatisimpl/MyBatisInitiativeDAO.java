package edu.eci.pdsw.persistence.mybatisimpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.InitiativeMapper;
import edu.eci.pdsw.samples.services.ServicesException;

public class MyBatisInitiativeDAO implements InitiativeDAO{
	
	@Inject
	InitiativeMapper initiativeMapper;

	public void addInitiative(int idin, String description, String area, int nvotos, int idus) throws ServicesException{
		try {
			LocalDate creationDate = LocalDate.now();
			LocalDate modificationDate = LocalDate.now();
			initiativeMapper.insertInitiative(idin,description,area,nvotos, Date.valueOf(creationDate),idus,Date.valueOf(modificationDate));
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServicesException("Error trying to insert the initiative");
		}
	}
	
	public List<Initiative> load(List<String> keywords) throws ServicesException {
		try {
			return initiativeMapper.load(keywords);
		
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServicesException("Unable to load initiatives by keywords, persistence error");
		}
	}
	
	public List<Initiative> loadByUser(String id) throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Initiative load(int InitiativeId) throws ServicesException {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
