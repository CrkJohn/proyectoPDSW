package edu.eci.pdsw.managedBeans;
import java.io.IOException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.h2.engine.SysProperties;

import edu.eci.pdsw.entities.User;
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
	
	public void logIn(String email, String password) throws ServicesException, IOException {
		User user = initiativeService.getUser(email, password);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		if(user != null) {
			HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
			session.setAttribute("id", user.getId());
			facesContext.getExternalContext().redirect("/faces/initiativerecord.xhtml");
		}
		else {
			facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario o clave invalido","Error"));
		}
	}
	
	public List<User> getUsers() throws Exception{
		try {
			return initiativeService.listUsers();
		}
		catch(ServicesException ex) {
			throw ex;
		}
	}
	
	public void modifyUser(String email, String rol) {
		System.out.println("HEYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY______-----------------------------");
		System.out.println(email+" "+rol);
	}
	
	
}