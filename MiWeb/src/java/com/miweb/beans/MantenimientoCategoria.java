/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

import com.miweb.Data.conexion;
import com.miweb.Util.FacesMessageUtils;
import com.miweb.com.Categoria;
import com.miweb.model.Modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Armando
 */
@ManagedBean(name = "mantenimientoCategoria")
@SessionScoped
public class MantenimientoCategoria implements Serializable {

    private Categoria categoria;
    private Categoria categoriaTemp;
    private List<Categoria> listaCategorias = new ArrayList<Categoria>();
    private boolean withConfirmation = true;
    
    public MantenimientoCategoria() {
        categoria = new Categoria();
        categoriaTemp = new Categoria();
        llenarTablaCategoria();
    }

    public Categoria getCategoriaTemp() {
        return categoriaTemp;
    }

    public void setCategoriaTemp(Categoria categoriaTemp) {
        this.categoriaTemp = categoriaTemp;
    }

    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    
    public void GuardarCategoria(ActionEvent actionEvent) {
        try 
        {
            Modelo.Mantenimiento1Categoria(categoria, 1);
            listaCategorias.add(categoria);
            categoria= new Categoria();
            FacesMessageUtils.addMensajeInfo("Agregado correctamente");
        } catch (Exception es) {
            FacesMessageUtils.addMensajeError("Error: " + es.getMessage());
        }

    }

    public void ActualizarCategoria(ActionEvent actionEvent) {
        try 
        {
            Modelo.Mantenimiento1Categoria(categoriaTemp, 2);
            
            FacesMessageUtils.addMensajeInfo("Actualizado correctamente");
        } catch (Exception es) {
            FacesMessageUtils.addMensajeError("Error: " + es.getMessage());
        }

    }
    
    public void EliminarCategoria(ActionEvent actionEvent) {
        try {
            Modelo.Mantenimiento1Categoria(categoriaTemp,3);
            listaCategorias.remove(categoriaTemp);
            categoria= new Categoria();
            FacesMessageUtils.addMensajeInfo("Se Elimino correctamente");
        } catch (Exception es) {
            FacesMessageUtils.addMensajeError("Error: " + es.getMessage());
            System.out.println(es.getMessage());
        }

    }

    public void llenarTablaCategoria() {
        if (listaCategorias == null) {
            listaCategorias = new ArrayList<Categoria>();
        } else {
            listaCategorias.clear();
        }
        try {
            listaCategorias = Modelo.MantenimientoCategoria2();
        } catch (Exception ex) {
            FacesMessageUtils.addMensajeError("Error: " + ex.getMessage());
        }
    }
    public ArrayList LeerCategoria() {
        ArrayList categorias = null;
        try {
            categorias = Modelo.MantenimientoCategoria2();

        } catch (Exception es) {
            System.out.println(es.getMessage());
        }
        return categorias;

    }
}
