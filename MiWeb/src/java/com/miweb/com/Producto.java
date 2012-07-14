/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.com;

import java.io.Serializable;

/**
 *
 * @author Igor
 */
public class Producto implements Serializable {

    private int numeroOrden;
    private int idProducto;
    private int nombreProducto;
    private int cantidad;
    private String descripcion;
    private double stock;
    private double precVenta;
    private int estado;
    private int idCategoria;

    public Producto() {
        estado = 1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecVenta() {
        return precVenta;
    }

    public void setPrecVenta(double precVenta) {
        this.precVenta = precVenta;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public int getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(int nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
    
}
