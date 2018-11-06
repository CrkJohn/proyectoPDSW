package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.entities.Initiative;

public interface InitiativeMapper {
	
	public void insertInitiative(@Param("description")String description, 
			@Param("area")String area,
			@Param("nvotos")int nvotos, 
			@Param("creation")Date creation, 
			@Param("idus")int idus, 
			@Param("modification")Date modification,
			@Param("state")String state);
			
	public List<Initiative> load(@Param("keyword") String keyword);
	
}
