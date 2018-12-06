package edu.eci.pdsw.managedBeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.TypeStatus;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.entities.UserType;
import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "initiativeBean")
@SessionScoped
public class InitiativeBean extends BasePageBean {
	
	@Inject
	InitiativeServices initiativeService;

	private static final long serialVersionUID = 3594009161252782831L;
	
	public void addInitiative(String description, String area, String keyword, String name) throws ServicesException{
		System.out.println(description+" "+area);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
		List<String> keywords= Arrays.asList(keyword.split(",")); 
		System.out.println(keywords); 
		
		try {
			initiativeService.createInitiative(description, area, Integer.parseInt(session.getAttribute("id").toString()), keywords, name);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Datos Guardados"));
			
		} catch (ServicesException ex) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo guardar","Error"));
			throw ex;
		}
	}
	
	public List<Initiative> searchInitiative(String keyword) throws ServicesException{
		List<String> keywords= Arrays.asList(keyword.split(",")); 
		return initiativeService.searchInitiativeByKeywords(keywords);
	}
	
	public Initiative searchInitiativeById(int id) throws ServicesException{
		System.out.println(id);
		System.out.println(initiativeService.searchInitiative(id));
		return initiativeService.searchInitiative(id);
	}
	
	public List<Initiative> listAll() throws ServicesException{
		return initiativeService.listInitiative();
	}
	
	public void modifyStatus(String newStatus, String name) throws ServicesException{
		initiativeService.modifyInitiative(newStatus, name);
	}
	
	public List<TypeStatus> getTypes () throws ServicesException{
		return initiativeService.listStatus();
	}
	
	public int loadVotes(int id) throws ServicesException{
		return initiativeService.loadVotes(id);
	}
	
	public List<Initiative> myInitiatives() throws ServicesException{
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
		return initiativeService.loadInitiativeByUser(Integer.parseInt(session.getAttribute("id").toString()));
	}
	
	public void modifyAll(int id,String area, String description,String nombre) {
		//System.out.println(id+" "+area+" "+description);		
		boolean save=true;
		if(save){
		try {
			initiativeService.modifyAllInitiative(id, area, description,nombre);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Datos Guardados"));
			}
				
		 catch (ServicesException e) {
			save=false;
			e.printStackTrace();
		}
		}else{	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo modificar","Error"));
		}
	}
	
	public Initiative loadInitiative(int id) throws ServicesException{
		System.out.println("HOLAAAAAAAAAAAAAAAAAA");
		System.out.println(id);
		return initiativeService.searchInitiative(id); 
	}
		
}



