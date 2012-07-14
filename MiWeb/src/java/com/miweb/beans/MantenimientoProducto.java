/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

import com.miweb.Util.FacesMessageUtils;
import com.miweb.com.Producto;
import com.miweb.com.Categoria;
import com.miweb.model.Modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Igor
 */
@ManagedBean(name = "mantenimientoProducto")
@SessionScoped
public class MantenimientoProducto implements Serializable {

    private Producto producto;
    private Producto productoTmp;
    private List<Producto> listProducto;
    private MantenimientoCategoria mantenCategoria;
    private Categoria categ;
    private ComboCategorias comboCategorias;
    private boolean withConfirmation = true;
    // private static Logger logger = Logger.getLogger(MantenimientoProducto.class);

    public MantenimientoProducto() {

        producto = new Producto();
        productoTmp=new Producto();

        mantenCategoria = new MantenimientoCategoria();
        comboCategorias = new ComboCategorias();
        comboCategorias.llenarCombo(mantenCategoria.LeerCategoria());
        categ = new Categoria();
        llenarTablaProducto();
    }

    public Producto getProductoTmp() {
        return productoTmp;
    }

    public void setProductoTmp(Producto productoTmp) {
        this.productoTmp = productoTmp;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public MantenimientoCategoria getMantenCategoria() {
        return mantenCategoria;
    }

    public void setMantenCategoria(MantenimientoCategoria mantenCategoria) {
        this.mantenCategoria = mantenCategoria;
    }

    public ComboCategorias getComboCategorias() {
        return comboCategorias;
    }

    public void setComboCategorias(ComboCategorias comboCategorias) {
        this.comboCategorias = comboCategorias;
    }

    public Categoria getCateg() {
        return categ;
    }

    public void setCateg(Categoria categ) {
        this.categ = categ;
    }

    public void guardarProducto(ActionEvent event) {
        try {

            producto.setIdProducto(Modelo.grabarProductos(producto));
            producto.setNumeroOrden(listProducto.size() + 1);
            listProducto.add(producto);
            producto = new Producto();
            FacesMessageUtils.addMensajeInfo("Agregador correctamente");

        } catch (Exception e) {
            FacesMessageUtils.addMensajeError("Error: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public void actualizarProducto(ActionEvent event) {
        try {
            productoTmp.setIdProducto(Modelo.grabarProductos(productoTmp));


        } catch (Exception ex) {
            FacesMessageUtils.addMensajeError("Error: " + ex.getMessage());
        }
    }

    public void eliminarProducto(ActionEvent event){


        if (listProducto != null) {


            try {
                Modelo.eliminarProducto(productoTmp.getIdProducto());

            } catch (Exception e) {
                FacesMessageUtils.addMensajeError(e.getMessage());
                System.out.println(e.getMessage());
            }
            listProducto.remove(productoTmp);
            reordenarCorrel();
        }

    }

    public void llenarTablaProducto() {
        if (listProducto == null) {
            listProducto = new ArrayList<Producto>();
        } else {
            listProducto.clear();
        }
        try {
            listProducto = Modelo.cargarProductos();
        } catch (Exception ex) {
            FacesMessageUtils.addMensajeError("Error: " + ex.getMessage());
        }
    }

    public void reordenarCorrel() {
        int i = 0;
        for (Producto prod : listProducto) {
            i++;
            prod.setNumeroOrden(i);
        }
    }
}
