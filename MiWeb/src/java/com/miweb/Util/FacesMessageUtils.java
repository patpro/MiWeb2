/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.Util;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Igor
 */
public class FacesMessageUtils {

    public static void addMensajeError(String mensaje){
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        message.setSummary("Error");
        message.setDetail(mensaje);
        context.addMessage(null,message);

    }
    public static void addMensajeInfo(String mensaje){
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        message.setSummary("Mensaje");
        message.setDetail(mensaje);
        context.addMessage(null,message);

    }
    public static void addMensajeFatal(String mensaje){
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_FATAL);
        message.setSummary("Error Fatal");
        message.setDetail(mensaje);
        context.addMessage(null,message);
    }
    public static void addMensajeWarn(String mensaje){
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_WARN);
        message.setSummary("Peligro");
        message.setDetail(mensaje);
        context.addMessage(null,message);
    }


}
