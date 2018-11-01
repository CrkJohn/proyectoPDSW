package edu.eci.pdsw.entities;

public class Comment {
	private int id;
	private long idUser;
	private int idInitiative;
	private String comment;
	
	public Comment() {}
	
	public Comment(long idUser, int idInitiative,String comment ) {
		this.idUser=idUser;
		this.idInitiative=idInitiative;
		this.comment=comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public int getIdInitiative() {
		return idInitiative;
	}

	public void setIdInitiative(int idInitiative) {
		this.idInitiative = idInitiative;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

