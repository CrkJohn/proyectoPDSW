package edu.eci.pdsw.managedBeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;



@SuppressWarnings("deprecation")
@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean extends BasePageBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3594009161252782831L;
	
	
	@Inject
	InitiativeServices initiativeService;
	
	public void logIn(String email, String password) throws ServicesException {
		System.out.println(initiativeService.getUser(email, password));
	}
	
	
}