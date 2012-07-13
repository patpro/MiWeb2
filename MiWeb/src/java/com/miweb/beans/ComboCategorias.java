/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

import com.miweb.com.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;

/**
 *
 * @author CASO
 */
public class ComboCategorias implements Serializable{

    private List<SelectItem> listCategorias;

    public ComboCategorias() {
        listCategorias = new ArrayList<SelectItem>();
    }

    public void llenarCombo(List<Categoria> lista) {
        for (Categoria c : lista) {
            listCategorias.add(new SelectItem(c.getIdcategoria(), c.getDescripcion()));
        }
    }

    public List<SelectItem> getListCategorias() {
        return listCategorias;
    }

    public void setListCategorias(List<SelectItem> listCategorias) {
        this.listCategorias = listCategorias;
    }
}
