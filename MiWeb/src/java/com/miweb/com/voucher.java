/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC
 */
@ManagedBean(name = "voucher")
@ViewScoped
public class voucher 
{
    private int nro;
    private String banco;
    private double monto;

    public voucher() {
    }

    public voucher(int nro, String banco, double monto) {
        this.nro = nro;
        this.banco = banco;
        this.monto = monto;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    
    
}
