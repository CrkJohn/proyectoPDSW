package edu.eci.pdsw.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Comment {
	private int id;
	private User user;
	private String comment;
	private Date date;
	private String dateS;
	
	public Comment() {}
	
	public Comment(int id,String comment, Date date ) {
		this.comment=comment;
		this.date=date;
		this.id=id;
	}

	public Date getDate() {
		return date;
	}
	
	public String getDateS(){
		Locale currentLocale = new Locale ("en", "US") ;
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat("EEE, dd/MMM/yyyy HH:mm", currentLocale);
		String fecha=formatter.format(date);
		return fecha;
	}
	
	public void setDateS(String s){
		this.dateS=s;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
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

