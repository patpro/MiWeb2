/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.model;

import com.miweb.Data.conexion;
import com.miweb.com.Producto;
import com.miweb.com.Categoria;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Igor
 */
public class Modelo {

    //private conexion cn= new conexion();
    public static int grabarProductos(Producto producto) throws Exception {

        Connection cnn = null;
        CallableStatement cstmt;
        int correlativo;

        cnn = conexion.getConnection();

        cstmt = cnn.prepareCall("CALL GRABARPRODUCTO(?, ?, ?, ?, ?, ?, ?)");

        cstmt.setInt(1, producto.getIdProducto());
        cstmt.setInt(2, producto.getCantidad());
        cstmt.setString(3, producto.getDescripcion());
        cstmt.setDouble(4, producto.getStock());
        cstmt.setDouble(5, producto.getPrecVenta());
        cstmt.setInt(6, producto.getEstado());
        cstmt.setInt(7, producto.getIdCategoria());


        System.out.println(producto.getIdProducto());
        cstmt.registerOutParameter(1, Types.INTEGER);

        cstmt.execute();
        producto.setIdProducto(cstmt.getInt(1));
        correlativo = cstmt.getInt(1);
        cstmt.close();
        cnn.close();


        return correlativo;
    }
    
    public static void Mantenimiento1Categoria(Categoria cat,int op) throws Exception 
    {
        Connection cnn=null;
        PreparedStatement pstmt = null;
        cnn = conexion.getConnection();
        
            switch(op)
            {
                case 1:
                {
                    String query = "insert into categoria (descripcion) values(?)";
                    pstmt = cnn.prepareStatement(query); // create a statement
                    pstmt.setString(1, cat.getDescripcion());
                }
                break;
                case 2:
                {
                    String query = "";
                    pstmt = cnn.prepareStatement(query); // create a statement
                    pstmt.setString(1, cat.getDescripcion());
                }
                break;
                case 3:
                {
                    String query = "DELETE FROM categoria WHERE descripcion=?";
                    pstmt = cnn.prepareStatement(query); // create a statement
                    pstmt.setString(1, cat.getDescripcion());
                }
                break;
            }
            
            pstmt.executeUpdate(); // execute insert statement
            pstmt.close();
            cnn.close();
            
        
    }
    
    public static ArrayList MantenimientoCategoria2() throws Exception 
    {
        Connection cn=null;
        Statement st;
        ResultSet rs;
        ArrayList categorias=null;

        cn=conexion.getConnection();
            st=cn.createStatement();
            String tsql;
            tsql="select * from categoria";
            rs=st.executeQuery(tsql);
            categorias=new ArrayList();
            while(rs.next())
            {
                Categoria m=new Categoria(rs.getInt(1),rs.getString(2));
                categorias.add(m);
            }
            cn.close();
            return(categorias);
        
    }
}
