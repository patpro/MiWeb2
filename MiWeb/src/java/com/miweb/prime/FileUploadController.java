/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.prime;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

@ManagedBean(name = "fileUploadController")
public class FileUploadController {

    private String destination = "C:\\ficheros\\";

    
    
    
    public void upload(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage("Ok! ", event.getFile().getFileName() + " fue subido con éxito.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        // Do what you want with the file
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void copyFile(String fileName, InputStream in) {
        try {

            OutputStream out = new FileOutputStream(new File(destination + fileName));

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

            in.close();
            out.flush();
            out.close();

            System.out.println("El nuevo fichero fue creado con éxito!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}