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
 * @author PC
 */
@ManagedBean(name = "producto")
@ViewScoped
public class Productoold implements Serializable 
{
    
     int cantidad;
     String precio;
     String descripcion;
     String tipo;

    public Productoold() {
    }

    public Productoold(String tipo,int cantidad,String descripcion, String precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
   
     
     
}
