package edu.eci.pdsw.persistence.mybatisimpl;

import java.sql.Date;
import java.util.List;
import com.google.inject.Inject;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.InitiativeMapper;
import edu.eci.pdsw.samples.services.ServicesException;

public class MyBatisInitiativeDAO implements InitiativeDAO{
	
	@Inject
	InitiativeMapper initiativeMapper;

	public void addInitiative(int idin, String description, String area, int nvotos, Date creation, int idus, Date modification) throws ServicesException{
		try {
			initiativeMapper.insertInitiative(idin,description,area,nvotos,creation,idus,modification);
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServicesException("Error trying to insert the initiative");
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
