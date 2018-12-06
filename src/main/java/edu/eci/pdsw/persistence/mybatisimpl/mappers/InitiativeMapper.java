package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.Keyword;
import edu.eci.pdsw.entities.TypeStatus;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.entities.chartInitiative;;

public interface InitiativeMapper {
	
	public void insertInitiative(@Param("description")String description, 
			@Param("area")String area,
			@Param("nvotos")int nvotos, 
			@Param("creation")Date creation, 
			@Param("idus")int idus, 
			@Param("modification")Date modification,
			@Param("state")String state,
			@Param("name") String name);
	
	public void insertKeyword(@Param("keyword") String keyword);
	
	public void insertWordInitiative();
	
	public void insertWordInitiativeId(@Param("id") int id);
			
	public List<Initiative> load(@Param("keyword") String keyword);
	
	public Initiative loadId(@Param("id") int initiativeId);

	public void modifyInitiative(@Param("newStatus")String newStatus,@Param("name") String name);

	public List<Initiative> loadAll();

	public List<TypeStatus> listStatus();

	public List<Keyword> listKeywords();
	
	public void addVote(@Param("idIni")int idIni, @Param("idUser")int idUser);
	
	public int loadVotes(@Param("id") int id);
	
	public void deleteVote(@Param("idIni") int idIni, @Param("idUser")int idUser);
	
	public int hasVoted(@Param("idIni") int idIni, @Param("idUser")int idUser);
	
	public void insertInterested(@Param("idIni")int idIni, @Param("idUser")int idUser);
	
	public List<User> loadInterested(@Param("id") int id);
	
	public int isInterested(@Param("idIni") int idIni, @Param("idUser") int idUser);
	
	public List<Keyword> loadKeywordInitiative(@Param("id")int id);

	public void deleteInterested(@Param("idIni")int idInitiative, @Param("idUser")int idUser);

	public List<chartInitiative> getDataChart();

	public List<Initiative> loadByUser(@Param("idUser")int idUser);

	public void modifyAllInitiative(@Param("id")int id,@Param("area") String area,@Param("description") String description,@Param("nombre")String nombre);
	
	public List<Initiative> loadByStatus(@Param("status")String status);

	public List<chartInitiative> getDataStatus();
}