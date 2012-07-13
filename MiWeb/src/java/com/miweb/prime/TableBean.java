/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.prime;

/**
 *
 * @author PC
 */

import com.miweb.beans.MantenimientoCategoria;
import com.miweb.com.Productoold;
import com.miweb.com.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "tableBean")
@ViewScoped
public class TableBean implements Serializable 
{
	private String tipos[] = new String[10];
        private String precios[] = new String[10];
	private String manufacturers[] = new String[10];
        private SelectItem[] manufacturerOptions;
	private List<Productoold> productos;
        public List<Categoria> categoriasc;
	private Productoold selectedPro;
        MantenimientoCategoria mcat=new MantenimientoCategoria();
        
	public TableBean() 
        {
		
		tipos[0] = "Teclado";
		tipos[1] = "Monitor";
		tipos[2] = "Mouse";
		tipos[3] = "Memoria RAM";
		tipos[4] = "USB";
		tipos[5] = "Disco Duro";
		tipos[6] = "CPU";
		tipos[7] = "Procesador";
		tipos[8] = "Estabilizador";
		tipos[9] = "Audifonos";
                precios[0] = "S/. 1.50";
		precios[1] = "S/. 9.50";
		precios[2] = "S/. 8.30";
		precios[3] = "S/. 7.40";
		precios[4] = "S/. 6.50";
		precios[5] = "S/. 5.00";
		precios[6] = "S/. 4.00";
		precios[7] = "S/. 3.10";
		precios[8] = "S/. 10.50";
		precios[9] = "S/. 2.50";
                manufacturers[0] = "Mercedes";
		manufacturers[1] = "BMW";
		manufacturers[2] = "Volvo";
		manufacturers[3] = "Audi";
		manufacturers[4] = "Renault";
		manufacturers[5] = "Opel";
		manufacturers[6] = "Volkswagen";
		manufacturers[7] = "Chrysler";
		manufacturers[8] = "Ferrari";
		manufacturers[9] = "Ford";
                productos = new ArrayList<Productoold>();
		populateRandomCars(productos, 20);
                manufacturerOptions = createFilterOptions(manufacturers);
                categoriasc = new ArrayList<Categoria>();
                categoriasc=mcat.LeerCategoria();
	}

    public List<Categoria> getCategoriasc() {
        return categoriasc;
    }

    public void setCategoriasc(List<Categoria> categoriasc) {
        this.categoriasc = categoriasc;
    }
	
	private void populateRandomCars(List<Productoold> list, int size) {
		for(int i = 0 ; i < size ; i++)
                {
                    String a1=getRandomTipos();
                    int a2=getRandomCantidad();
                    String a3=getRandomDescripcion();
                    String a4=getRandomPrecios();
                   list.add(new Productoold(a1,a2 , a3, a4)); 
                }    
                 
	}
	
	public List<Productoold> getProductos() {
		return productos;
	}

	private int getRandomCantidad() {
		return (int) (Math.random() * 50 + 10);
	}
	
	private String getRandomTipos() {
		return tipos[(int) (Math.random() * 10)];
	}
	
	private String getRandomDescripcion() {
		return manufacturers[(int) (Math.random() * 10)];
	}
	
	private String getRandomPrecios() {
		return precios[(int) (Math.random() * 10)];
	}
        
        

    private SelectItem[] createFilterOptions(String[] data)  {
        SelectItem[] options = new SelectItem[data.length + 1];

        options[0] = new SelectItem("", "Seleccionar");
        for(int i = 0; i < data.length; i++) {
            options[i + 1] = new SelectItem(data[i], data[i]);
        }

        return options;
    }

    public Productoold getSelectedPro() {
        return selectedPro;
    }

    public void setSelectedPro(Productoold selectedPro) {
        this.selectedPro = selectedPro;
    }

    public SelectItem[] getManufacturerOptions() {
        return manufacturerOptions;
    }
}
