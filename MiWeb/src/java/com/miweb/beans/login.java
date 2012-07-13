/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

import com.miweb.com.Usuario;
import com.miweb.com.menu;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 *
 * @author PC
 */
@ManagedBean(name = "loginBean")
@SessionScoped 
public class login implements Serializable
{
    private Usuario user;
    private menu menu;
    
    public login() 
    {
        user=new Usuario();
        menu=new menu();
    }
    
    public String CheckValidUser() throws ValidatorException 
    {
        if(user.getIdUsuario().compareTo("admin")==0&& user.getPass().compareTo("admin")==0)
        { 
            System.out.println("Entre");
            menu.limpiar();
            menu.activarAdmin();
           // menu.activarVendedor();
            return "inicioA";
        } 
        else
        { 
            if(user.getIdUsuario().compareTo("abc")==0&& user.getPass().compareTo("abc")==0)
            { 
                System.out.println("Entre 2");
                menu.limpiar();
                menu.activarVendedor();
                return "inicioVendedor";
            } 
            else
            { 
                if(user.getIdUsuario().compareTo("qwe")==0&& user.getPass().compareTo("qwe")==0)
                { 
                    System.out.println("Entre 3");
                    menu.limpiar();
                    menu.activarCliente();
                    return "general";
                } 
                else
                { 
                    String msgText = " Usuario or password Incorrecta"; 

                    //FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "ERROR 1", "ERROR 2");  
                    //addMessage(message); 
                    System.out.println(msgText);

                    FacesContext context = FacesContext.getCurrentInstance();  

                    context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "Usuario NO Registrado"));  


                    return "index";

                    //FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msgText, null); 
                    //throw new ValidatorException(msg); 
                }
            }
        } 
         
    }
    
    public String cerrarSesion() {
         String inicio="index";
        try {
            HttpSession session = null;
            ExternalContext ectx = FacesContext.getCurrentInstance().getExternalContext();
            HttpServletRequest req = (HttpServletRequest) ectx.getRequest();
            session = req.getSession(false);
            Map<String, Object> oMap = ectx.getSessionMap();
            Set<String> setKeys = oMap.keySet();
            System.out.println("INICIO - Eliminar datos de la sesion");
            for (String oString : setKeys) {
                System.out.println("Se eliminara el atributo de sesion: " + oString);
                oMap.remove(oString);
            }
            System.out.println("FIN - Eliminar datos de la sesion");
            //HttpServletResponse response = (HttpServletResponse) ectx.getResponse();
            if (session != null) {
                session.invalidate();
            }
           
            System.gc();

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return inicio;
    }
    
    public Usuario getUsuario() {
        return user;
    }

    public void setUsuario(Usuario usuario) {
        this.user = usuario;
    }
    
    public menu getMenu() {
        return menu;
    }

    public void setMenu(menu menu) {
        this.menu = menu;
    }
    
}
