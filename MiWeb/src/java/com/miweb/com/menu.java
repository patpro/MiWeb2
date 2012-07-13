/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.com;

import java.io.Serializable;

/**
 *
 * @author Armando
 */

public class menu implements Serializable
{
    private boolean menu1;      //Acciones
    private boolean menu2;      //Personal
    private boolean menu3;      //Productos
    private boolean menu4;      //Estadistica
    private boolean menu5;      //Navegacion
    private boolean menu6;      //Categorias Producto
    
    private boolean menu1_1;      //Acciones - Vender
    private boolean menu1_2;      //Acciones - Comprar
    private boolean menu1_3;      //Acciones - Registar Pedido
    private boolean menu1_4;      //Acciones - Consultar Pedidos
    private boolean menu1_5;      //Acciones - Agregar Voucher
    
    private boolean menu2_1;      //Personal - Cerrar Sesion
    private boolean menu2_2;      //Personal - Perfil
    private boolean menu2_3;      //Personal - Agregar Vendedor
    private boolean menu2_4;      //Personal - Consultar Usuarios
    
    
    private boolean menu3_1;      //Productos - Agregar Producto
    private boolean menu3_2;      //Productos - MOdificar Producto
    private boolean menu3_3;      //Productos - Buscar Producto
    private boolean menu3_4;      //Productos - Eliminar Producto
    
    private boolean menu4_1;      //Estadistica - Ventas en el Mes
    private boolean menu4_2;      //Estadistica - Ventas por Vendedor
    
    private boolean menu5_1;      //Navegacion - Home
    private boolean menu5_2;      //Navegacion - Home 2
    private boolean menu5_3;      //Navegacion - Lo Nuevo
    private boolean menu5_4;      //Navegacion - Lo Mas Vendido
    private boolean menu5_5;      //Navegacion - Busqueda
    
    private boolean menu6_1;      //Categoria Productos - Agregar Categoria
    private boolean menu6_2;      //Categoria Productos - MOdificar Categoria
    private boolean menu6_3;      //Categoria Productos - Buscar Categoria
    private boolean menu6_4;      //Categoria Productos - Eliminar Categoria
    
    public menu() 
    {
        limpiar();
    }

    public void limpiar()
    {
        menu1=false;
        menu2=false;
        menu3=false;
        menu4=false;
        menu5=false;
        menu6=false;
        
        menu1_1=false;
        menu1_2=false;
        menu1_3=false;
        menu1_4=false;
        menu1_5=false;
        menu2_1=false;
        menu2_2=false;
        menu2_3=false;
        menu2_4=false;
        menu3_1=false;
        menu3_2=false;
        menu3_3=false;
        menu3_4=false;
        menu4_1=false;
        menu4_2=false;
        menu5_1=false;
        menu5_2=false;
        menu5_3=false;
        menu5_4=false;
        menu5_5=false;
        menu6_1=false;
        menu6_2=false;
        menu6_3=false;
        menu6_4=false;
    }

    public boolean isMenu2_4() {
        return menu2_4;
    }

    public void setMenu2_4(boolean menu2_4) {
        this.menu2_4 = menu2_4;
    }
    
    public boolean isMenu1() {
        return menu1;
    }

    public void setMenu1(boolean menu1) {
        this.menu1 = menu1;
    }

    public boolean isMenu1_1() {
        return menu1_1;
    }

    public void setMenu1_1(boolean menu1_1) {
        this.menu1_1 = menu1_1;
    }

    public boolean isMenu1_2() {
        return menu1_2;
    }

    public void setMenu1_2(boolean menu1_2) {
        this.menu1_2 = menu1_2;
    }

    public boolean isMenu1_3() {
        return menu1_3;
    }

    public void setMenu1_3(boolean menu1_3) {
        this.menu1_3 = menu1_3;
    }

    public boolean isMenu1_4() {
        return menu1_4;
    }

    public void setMenu1_4(boolean menu1_4) {
        this.menu1_4 = menu1_4;
    }

    public boolean isMenu2() {
        return menu2;
    }

    public void setMenu2(boolean menu2) {
        this.menu2 = menu2;
    }

    public boolean isMenu2_1() {
        return menu2_1;
    }

    public void setMenu2_1(boolean menu2_1) {
        this.menu2_1 = menu2_1;
    }

    public boolean isMenu2_2() {
        return menu2_2;
    }

    public void setMenu2_2(boolean menu2_2) {
        this.menu2_2 = menu2_2;
    }

    public boolean isMenu3() {
        return menu3;
    }

    public void setMenu3(boolean menu3) {
        this.menu3 = menu3;
    }

    public boolean isMenu3_1() {
        return menu3_1;
    }

    public void setMenu3_1(boolean menu3_1) {
        this.menu3_1 = menu3_1;
    }

    public boolean isMenu3_2() {
        return menu3_2;
    }

    public void setMenu3_2(boolean menu3_2) {
        this.menu3_2 = menu3_2;
    }

    public boolean isMenu4() {
        return menu4;
    }

    public void setMenu4(boolean menu4) {
        this.menu4 = menu4;
    }

    public boolean isMenu5() {
        return menu5;
    }

    public void setMenu5(boolean menu5) {
        this.menu5 = menu5;
    }

    public boolean isMenu4_1() {
        return menu4_1;
    }

    public void setMenu4_1(boolean menu4_1) {
        this.menu4_1 = menu4_1;
    }

    public boolean isMenu4_2() {
        return menu4_2;
    }

    public void setMenu4_2(boolean menu4_2) {
        this.menu4_2 = menu4_2;
    }
    

    public boolean isMenu1_5() {
        return menu1_5;
    }

    public void setMenu1_5(boolean menu1_5) {
        this.menu1_5 = menu1_5;
    }

    public boolean isMenu2_3() {
        return menu2_3;
    }

    public void setMenu2_3(boolean menu2_3) {
        this.menu2_3 = menu2_3;
    }

    public boolean isMenu3_3() {
        return menu3_3;
    }

    public void setMenu3_3(boolean menu3_3) {
        this.menu3_3 = menu3_3;
    }

    public boolean isMenu3_4() {
        return menu3_4;
    }

    public void setMenu3_4(boolean menu3_4) {
        this.menu3_4 = menu3_4;
    }

    public boolean isMenu5_1() {
        return menu5_1;
    }

    public void setMenu5_1(boolean menu5_1) {
        this.menu5_1 = menu5_1;
    }

    public boolean isMenu5_2() {
        return menu5_2;
    }

    public void setMenu5_2(boolean menu5_2) {
        this.menu5_2 = menu5_2;
    }

    public boolean isMenu5_3() {
        return menu5_3;
    }

    public void setMenu5_3(boolean menu5_3) {
        this.menu5_3 = menu5_3;
    }

    public boolean isMenu5_4() {
        return menu5_4;
    }

    public void setMenu5_4(boolean menu5_4) {
        this.menu5_4 = menu5_4;
    }

    public boolean isMenu5_5() {
        return menu5_5;
    }

    public void setMenu5_5(boolean menu5_5) {
        this.menu5_5 = menu5_5;
    }

    public boolean isMenu6() {
        return menu6;
    }

    public void setMenu6(boolean menu6) {
        this.menu6 = menu6;
    }

    public boolean isMenu6_1() {
        return menu6_1;
    }

    public void setMenu6_1(boolean menu6_1) {
        this.menu6_1 = menu6_1;
    }

    public boolean isMenu6_2() {
        return menu6_2;
    }

    public void setMenu6_2(boolean menu6_2) {
        this.menu6_2 = menu6_2;
    }

    public boolean isMenu6_3() {
        return menu6_3;
    }

    public void setMenu6_3(boolean menu6_3) {
        this.menu6_3 = menu6_3;
    }

    public boolean isMenu6_4() {
        return menu6_4;
    }

    public void setMenu6_4(boolean menu6_4) {
        this.menu6_4 = menu6_4;
    }
    
    
    public void activarAdmin()
    {
        limpiar();
        this.menu1 = true;
        this.menu2 = true;
        this.menu3 = true;
        this.menu4 = true;
        this.menu6 = true;
        
        this.menu1_5 = true;
        this.menu1_4 = true;
        this.menu2_1 = true;
        this.menu2_3 = true;
        this.menu2_4 = true;
        this.menu4_1 = true;
        this.menu4_2 = true;
        this.menu3_3 = true;
        this.menu6_1 = true;
        /*this.menu6_2 = true;
        this.menu6_3 = true;
        this.menu6_4 = true;
        * 
        */
    }
    
    public void activarVendedor()
    {
        
        this.menu1 = true;
        this.menu2 = true;
        this.menu3 = true;
        
        this.menu1_1 = true;
        this.menu1_4 = true;
        this.menu2_1 = true;
        this.menu2_2 = true;
        this.menu3_1 = true;
        this.menu3_2 = true;
        this.menu3_3 = true;
        this.menu3_4 = true;
        
    }
    
    public void activarCliente()
    {
        
        
        this.menu1 = true;
        this.menu2 = true;
        this.menu5 = true;
        
        this.menu1_2 = true;
        this.menu1_3 = true;
        this.menu2_1 = true;
        this.menu2_2 = true;
        this.menu5_2 = true;
        this.menu5_3 = true;
        this.menu5_4 = true;
        this.menu5_5 = true;
    }
    
    public void activarClienteExterno()
    {
        
        this.menu5 = true;
        this.menu5_1 = true;
        this.menu5_3 = true;
        this.menu5_4 = true;
        this.menu5_5 = true;
    }
}
