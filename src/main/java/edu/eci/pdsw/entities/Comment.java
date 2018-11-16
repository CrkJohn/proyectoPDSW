package edu.eci.pdsw.entities;

import java.util.Date;

public class Comment {
	private int id;
	private User user;
	private Initiative initiative;
	private String comment;
	private Date startDate;
	
	public Comment() {}
	
	public Comment(User user, Initiative initiative,String comment, Date startDate ) {
		this.user=user;
		this.initiative=initiative;
		this.comment=comment;
		this.startDate=startDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getIdUser() {
		return user;
	}

	public void setIdUser(User user) {
		this.user = user;
	}

	public Initiative getIdInitiative() {
		return initiative;
	}

	public void setIdInitiative(Initiative initiative) {
		this.initiative = initiative;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

