package edu.eci.pdsw.managedBeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.TypeStatus;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "dInitiativeBean")
@RequestScoped

public class DescriptionInitiative extends BasePageBean{

	@ManagedProperty(value = "#{param.initiative}")
	private int initiative;
	
	@Inject
	InitiativeServices initiativeService;
	
	private static final long serialVersionUID = 3594009161252782831L;
	
	public void modifyStatus(String newStatus, int id) throws ServicesException{
		initiativeService.modifyInitiative(newStatus, id);
	}
	
	public List<TypeStatus> getTypes () throws ServicesException{
		return initiativeService.listStatus();
	}

	public List<User> getInterested() throws ServicesException{
		System.out.println(initiativeService);
		return initiativeService.loadInterested(initiative);
	}
	
	public void insertInterested() throws ServicesException{
		initiativeService.insertInterested(initiative, Integer.parseInt(((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("id").toString()));
	}
	
	public void deleteInterested() throws ServicesException{
		initiativeService.deleteInterested(initiative, Integer.parseInt(((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("id").toString()));
	}
	
	public List<Comment> getComments() throws ServicesException{
		return initiativeService.loadComment(initiative);
	}
		
	public List<Initiative> getRelated() throws ServicesException{
		return initiativeService.loadRelated(initiative);
	}
	
	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
}
