/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

import com.miweb.com.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.faces.model.SelectItem;

/**
 *
 * @author Igor
 */
public class ComboCategorias implements Serializable {

    private List<SelectItem> listCategorias;
    private HashMap<Integer, Categoria> mapCategorias;

    public ComboCategorias() {
        listCategorias = new ArrayList<SelectItem>();
        mapCategorias = new HashMap<Integer, Categoria>();
    }

    public void llenarCombo(List<Categoria> lista) {
        
        listCategorias.clear();
        for (Categoria c : lista) {
            listCategorias.add(new SelectItem(c.getIdcategoria(), c.getDescripcion()));
            mapCategorias.put(c.getIdcategoria(), c);
        }
    }

    public List<SelectItem> getListCategorias() {
        return listCategorias;
    }

    public void setListCategorias(List<SelectItem> listCategorias) {
        this.listCategorias = listCategorias;
    }

    public HashMap<Integer, Categoria> getMapCategorias() {
        return mapCategorias;
    }

    public void setMapCategorias(HashMap<Integer, Categoria> mapCategorias) {
        this.mapCategorias = mapCategorias;
    }
}
