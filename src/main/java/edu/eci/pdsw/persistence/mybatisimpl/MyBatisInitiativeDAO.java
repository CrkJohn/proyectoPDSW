package edu.eci.pdsw.persistence.mybatisimpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.Keyword;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.entities.TypeStatus;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.entities.chartInitiative;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.InitiativeMapper;
import edu.eci.pdsw.samples.services.ServicesException;

public class MyBatisInitiativeDAO implements InitiativeDAO{
	
	@Inject
	InitiativeMapper initiativeMapper;

	public void addInitiative(String description, String area, int idus, List<String> keywords, String name) throws ServicesException{
		try {
			LocalDate creationDate = LocalDate.now();
			LocalDate modificationDate = LocalDate.now();
			
			initiativeMapper.insertInitiative(description,area,0, Date.valueOf(creationDate),idus,Date.valueOf(modificationDate),"En espera revision",name);
			List<Keyword> kw= initiativeMapper.listKeywords();
			/*
			 * Se revisará si ya existe la palabra clave, para no tener datos duplicados en la BD.
			 */
			int idKw ;
			for (String k: keywords) {
				idKw= -1;
				for (Keyword w: kw) {
					if(w.getKeyword().equals(k)) {idKw= w.getId(); break;}}
				if (idKw == -1) {
					initiativeMapper.insertKeyword(k);
					initiativeMapper.insertWordInitiative();
				}
				else {
					initiativeMapper.insertWordInitiativeId(idKw);
				}
			}
			
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
	
	public List<Initiative> loadByUser(int idUser) throws ServicesException {
		return initiativeMapper.loadByUser(idUser);
	}

	
	public Initiative load(int InitiativeId) throws ServicesException {
		return initiativeMapper.loadId(InitiativeId);
	}

	@Override
	public void modifyInitiative(String newStatus, String name) throws ServicesException {
		initiativeMapper.modifyInitiative(newStatus,name);
		
	}

	@Override
	public List<Initiative> loadAll() throws ServicesException {
		return initiativeMapper.loadAll();
	}

	@Override
	public List<TypeStatus> listStatus() throws ServicesException {
		return initiativeMapper.listStatus();
	}

	@Override
	public List<Keyword> listKeywords() throws ServicesException {
		return initiativeMapper.listKeywords();
	}
	
	@Override
	public void addVote(int idIni, int idUser) throws ServicesException{
		initiativeMapper.addVote(idIni, idUser);
	}
	
	@Override
	public int loadVotes(int id) throws ServicesException{
		return initiativeMapper.loadVotes(id);
	}
	
	@Override
	public void deleteVote(int idIni,int idUser) throws ServicesException{
		initiativeMapper.deleteVote(idIni, idUser);
	}

	@Override
	public void insertInterested(int idIni, int idUser) throws ServicesException {
		initiativeMapper.insertInterested(idIni, idUser);
		
	}

	@Override
	public List<User> loadInterested(int id) throws ServicesException {
		return initiativeMapper.loadInterested(id);
	}

	@Override
	public List<Initiative> loadRelated(int id) throws ServicesException {
		List<Keyword> keyword=initiativeMapper.loadKeywordInitiative(id);
		List<String> kw=new ArrayList <String>();
		for(Keyword k: keyword){
			kw.add(k.getKeyword());
		}
		List<Initiative> related=load(kw);
		List <Initiative> initiatives=new ArrayList <Initiative>();
		for (Initiative i:related){
			if (i.getId()!=id){
				initiatives.add(i);
			}
		}
		return initiatives;
	}

	@Override
	public void deleteInterested(int idInitiative, int idUser) {
		initiativeMapper.deleteInterested(idInitiative, idUser);
		
	}

	@Override
	public List<chartInitiative> gerDataChart() {
		return initiativeMapper.getDataChart();
	}

	@Override
	public void modifyAllInitiative(String name, String area, String description) {
		initiativeMapper.modifyAllInitiative(name,area,description);		
	}

	@Override
	public List<Initiative> loadByStatus(String status) {
		return initiativeMapper.loadByStatus(status);
	}

	
}
