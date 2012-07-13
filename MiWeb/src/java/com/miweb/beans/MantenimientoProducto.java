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

public class MantenimientoProducto implements Serializable{

    private Producto producto;
    private List<Producto> listProducto;
    private MantenimientoCategoria mantenCategoria;
    private Categoria categ;
    private ComboCategorias comboCategorias;
   // private static Logger logger = Logger.getLogger(MantenimientoProducto.class);

    public MantenimientoProducto() {

        producto = new Producto();
        mantenCategoria=new MantenimientoCategoria();
        comboCategorias=new ComboCategorias();
        comboCategorias.llenarCombo(mantenCategoria.LeerCategoria());
        categ= new Categoria();

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
    public void limpiar()
    {
        producto.setCantidad(0);
        producto.setDescripcion("");
        producto.setEstado(1);
        producto.setIdCategoria(0);
        producto.setIdProducto(0);
        producto.setPrecVenta(0);
        producto.setStock(0);
    }

    public void guardarProducto(ActionEvent event) {
        try {
            Modelo.grabarProductos(producto);
            limpiar();
            FacesMessageUtils.addMensajeInfo("Agregador correctamente");

        } catch (Exception e) {
            FacesMessageUtils.addMensajeError("Error: "+e.getMessage());
            //logger.error(e.getMessage(), e);
        }
    }
}
