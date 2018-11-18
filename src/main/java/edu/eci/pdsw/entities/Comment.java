package edu.eci.pdsw.entities;

import java.util.Date;

public class Comment {
	private int id;
	private User user;
	private String comment;
	private Date date;
	
	public Comment() {}
	
	public Comment(int id,String comment, Date date ) {
		this.comment=comment;
		this.date=date;
		this.id=id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date startDate) {
		this.date = startDate;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String toString() {
		
		return "[Initiative: id: "+id+", comment: "+comment+",CreationDate: "+date+", user: "+user+"]";
	}
	
}

