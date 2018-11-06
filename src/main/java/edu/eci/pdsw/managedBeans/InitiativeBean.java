package edu.eci.pdsw.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "initiativeBean")
@SessionScoped
public class InitiativeBean extends BasePageBean {
	
	@Inject
	InitiativeServices initiativeService;

	//private static final long serialVersionUID = 3594009161252782831L;
	
	public void addInitiative(String description, String area, int idus) throws ServicesException{
		try {
			initiativeService.createInitiative(description, area, idus);
		} catch (ServicesException ex) {
			throw ex;
		}
	}
	
    
}