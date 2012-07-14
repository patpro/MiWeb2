/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author PC
 */
@ManagedBean(name = "almacenarVoucher")
@SessionScoped 
public class AlmacenarVoucher  implements Serializable
{

    public AlmacenarVoucher() {
    }
    
    public void handleFileUpload(FileUploadEvent event) {  
        String val=event.getFile().getFileName();
        System.out.println(val);
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    } 
}
