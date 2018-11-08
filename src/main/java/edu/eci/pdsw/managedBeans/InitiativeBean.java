package edu.eci.pdsw.managedBeans;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.TypeStatus;
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
	
	public void addInitiative(String description, String area) throws ServicesException{
		System.out.println(description+" "+area);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
		try {
			initiativeService.createInitiative(description, area, Integer.parseInt(session.getAttribute("id").toString()));
		} catch (ServicesException ex) {
			throw ex;
		}
	}
	
	public List<Initiative> searchInitiative(String keyword) throws ServicesException{
		System.out.println(keyword);
		List<String> keywords= Arrays.asList(keyword.split(",")); 
		return initiativeService.searchInitiativeByKeywords(keywords);
	}
	
	public List<Initiative> listAll() throws ServicesException{
		return initiativeService.listInitiative();
	}
	
	public void modifyStatus(String newStatus, int id) throws ServicesException{
		System.out.println("HOLIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII "+newStatus+" "+id);
		initiativeService.modifyInitiative(newStatus, id);
	}
	
	public List<TypeStatus> getTypes () throws ServicesException{
		return initiativeService.listStatus();
	}
    
}