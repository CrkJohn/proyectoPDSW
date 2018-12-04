package edu.eci.pdsw.entities;

import java.text.SimpleDateFormat;
import java.util.*;

public class Initiative {

	private int id;
	private String description;
	private List<Keyword> keyWords;
	private TypeStatus status;
	private String area;
	private String name;
	private Date startDate;
	private Date modifyDate;
	private User user;
	private List<User> interested;
	private List<Comment> comments;
	private String dateS;
	private String dateModify;
	
	public Initiative() {}
	
	public Initiative(int id, String description, String area, Date startDate, Date modifyDate){
		this.description= description;
		this.area= area;
		this.id =  id;
		this.startDate = startDate;
		this.modifyDate = modifyDate;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Keyword> getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(List<Keyword> keyWords) {
		this.keyWords = keyWords;
	}
	
	public List<User> getInterested() {
		return interested;
	}

	public void setInterested(List<User> interested) {
		this.interested = interested;
	}

	public TypeStatus getStatus() {
		return status;
	}

	public void setTypeStatus(TypeStatus status) {
		this.status = status;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(TypeStatus status) {
		this.status = status;
	}
	
	public String getDateS(){
		Locale currentLocale = new Locale ("en", "US") ;
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat("dd/MMM/yyyy", currentLocale);
		String fecha=formatter.format(startDate);
		return fecha;
	}
	
	public String getDateModify(){
		Locale currentLocale = new Locale ("en", "US") ;
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat("dd/MMM/yyyy", currentLocale);
		String fecha=formatter.format(modifyDate);
		return fecha;
	}
	
	public String toString() {
		
		return "[Initiative: id: "+id+", description: "+description+", Area: "+area+", CreationDate: "+startDate+", ModifyDate: "+modifyDate+", user: "+user+", status: "+status+", keywords:"+keyWords+", name: "+name+"]";
	}
	
}
