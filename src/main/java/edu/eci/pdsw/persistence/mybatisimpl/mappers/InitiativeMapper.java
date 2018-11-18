package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.Keyword;
import edu.eci.pdsw.entities.TypeStatus;
import edu.eci.pdsw.entities.User;;

public interface InitiativeMapper {
	
	public void insertInitiative(@Param("description")String description, 
			@Param("area")String area,
			@Param("nvotos")int nvotos, 
			@Param("creation")Date creation, 
			@Param("idus")int idus, 
			@Param("modification")Date modification,
			@Param("state")String state);
	
	public void insertKeyword(@Param("keyword") String keyword);
	
	public void insertWordInitiative();
	
	public void insertWordInitiativeId(@Param("id") int id);
			
	public List<Initiative> load(@Param("keyword") String keyword);
	
	public Initiative loadId(@Param("id") int initiativeId);

	public void modifyInitiative(@Param("newStatus")String newStatus,@Param("id") int id);

	public List<Initiative> loadAll();

	public List<TypeStatus> listStatus();

	public List<Keyword> listKeywords();
	
	public void insertInterested(@Param("idIni")int idIni, @Param("idUser")int idUser);
	
	public List<User> loadInterested(@Param("id") int id);
	
	public List<Keyword> loadKeywordInitiative(@Param("id")int id);
	
}
