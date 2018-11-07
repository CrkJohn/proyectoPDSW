package edu.eci.pdsw.persistence.mybatisimpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.InitiativeMapper;
import edu.eci.pdsw.samples.services.ServicesException;

public class MyBatisInitiativeDAO implements InitiativeDAO{
	
	@Inject
	InitiativeMapper initiativeMapper;

	public void addInitiative(String description, String area, int idus) throws ServicesException{
		try {
			LocalDate creationDate = LocalDate.now();
			LocalDate modificationDate = LocalDate.now();
			initiativeMapper.insertInitiative(description,area,0, Date.valueOf(creationDate),idus,Date.valueOf(modificationDate),"En espera revision");
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServicesException("Error trying to insert the initiative");
		}
	}
	
	public List<Initiative> load(List<String> keywords) throws ServicesException {
		try {
			List <Initiative> initiatives=new ArrayList <Initiative>();
			Set<Integer> tmp = new HashSet<Integer>(); 
			for(String k:keywords) {
				for(Initiative i:initiativeMapper.load(k)) {
					if (!tmp.contains(i.getId())) {
						initiatives.add(i);
						tmp.add(i.getId());
					}
				}
			}
			return initiatives;
		
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
		return initiativeMapper.loadId(InitiativeId);
	}

	@Override
	public void modifyInitiative(String newStatus, int id) throws ServicesException {
		initiativeMapper.modifyInitiative(newStatus,id);
		
	}

	

	

}
