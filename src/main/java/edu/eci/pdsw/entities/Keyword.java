package edu.eci.pdsw.entities;

public class Keyword {
	
	private int id;
	private String keyword;
	
	public Keyword() {}
	
	public Keyword(int id, String keyword) {
		this.id= id;
		this.keyword= keyword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String toString() {
		return keyword;
	}
}
