package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.pdsw.entities.Comment;

public interface CommentMapper {
	
	public List<Comment> loadComments();
	
	public void addComment(@Param("idInitiative") int idInitiative, @Param("idUser") int idUser,@Param("comment") String comment, @Param("date")Date date);
	
	public List<Comment> loadComment(@Param("id")int idInitiative);
}
