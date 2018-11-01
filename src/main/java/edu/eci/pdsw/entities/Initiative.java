package edu.eci.pdsw.entities;

import java.util.*;

public class Initiative {

	private int id;
	private String description;
	private List<String> keyWords;
	private String status;
	private String area;
	private int numVotes;
	private Date startDate;
	private User user;
	
	public Initiative() {}
	
	public Initiative(String description, List<String> keyWords, String area, User user){
		this.description= description;
		this.keyWords= keyWords;
		this.area= area;
		this.user= user;
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

	public List<String> getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
