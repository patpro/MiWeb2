/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.prime;

import com.miweb.com.Usuario;
import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author Armando
 */
@ManagedBean(name = "userWizard")
@ViewScoped
public class UserWizard implements Serializable 
{

	private Usuario user = new Usuario();
	
	private boolean skip;
	
	private static Logger logger = Logger.getLogger(UserWizard.class.getName());

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public void save(ActionEvent actionEvent) {
		//Persist user
		
		FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.getIdUsuario());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}
	
	public String onFlowProcess(FlowEvent event) {
		logger.info("Current wizard step:" + event.getOldStep());
		logger.info("Next step:" + event.getNewStep());
		
		if(skip) {
			skip = false;	//reset in case user goes back
			return "confirm";
		}
		else {
			return event.getNewStep();
		}
	}
}
