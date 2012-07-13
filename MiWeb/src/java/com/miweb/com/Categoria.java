/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.com;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Armando
 */
@ManagedBean(name = "Mcategoria")
@ViewScoped
public class Categoria implements Serializable
{
    private int idcategoria;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int idcategoria, String descripcion) {
        this.idcategoria = idcategoria;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }
    
    
}
