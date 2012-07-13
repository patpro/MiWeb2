/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.beans;

/**
 *
 * @author Armando 
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "imageSwitchBean")
@SessionScoped 
public class ImageSwitchBean implements Serializable 
{

    private List<String> images;

    public ImageSwitchBean() {
        images = new ArrayList<String>();
        images.add("admin1.jpg");
        images.add("admin2.jpg");
        images.add("admin3.jpg");
        images.add("admin4.jpg");
    }

    public List<String> getImages() {
        return images;
    }
}
