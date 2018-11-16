package edu.eci.pdsw.persistence.mybatisimpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.CommentMapper;
import edu.eci.pdsw.samples.services.ServicesException;

public class MyBatisCommentDAO implements CommentDAO{
	@Inject
	CommentMapper commentMapper;

	public void addComment(int InitiativeId, int userId, String comment) throws ServicesException {
		LocalDate date = LocalDate.now();
		commentMapper.addComment(InitiativeId, userId, comment,Date.valueOf(date));		
	}
	
	public List<Comment> loadComments() throws ServicesException {
		return commentMapper.loadComments();
	}
	
	public List<Comment> loadComment(int InitiativeId) throws ServicesException {
		return commentMapper.loadComment(InitiativeId);
	}


}
