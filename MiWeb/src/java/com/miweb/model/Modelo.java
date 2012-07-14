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

    public static ArrayList<Producto> cargarProductos() throws Exception {

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        Producto producto = null;
        Connection cnn = null;
        Statement stmt;
        ResultSet rs;
        String sql = "";
        int i = 0;

        try {
            cnn = conexion.getConnection();
            stmt = cnn.createStatement();

            sql = "select IdProducto,Descripcion,PVenta,Stock from producto where Estado=1";

            //logger.debug(sql);
            rs = stmt.executeQuery(sql);
            listaProductos = new ArrayList<Producto>();

            while (rs.next()) {
                i++;
                producto = new Producto();
                producto.setIdProducto(rs.getInt("IdProducto"));
                producto.setDescripcion(rs.getString("Descripcion"));
                producto.setPrecVenta(rs.getDouble("PVenta"));
                producto.setStock(rs.getDouble("Stock"));
                producto.setNumeroOrden(i);
                listaProductos.add(producto);

            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            //logger.error(e.getMessage(), e);
            throw new Exception(e.getMessage());
        } catch (Exception e) {
            //logger.error(e.getMessage(), e);
            throw new Exception(e.getMessage());
        } finally {
            try {
                if (cnn != null && !cnn.isClosed()) {
                    cnn.close();
                }
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }

        return listaProductos;
    }

    public static void eliminarProducto(int codProducto) throws Exception{
        Connection cnn = null;
        Statement cstmt;

        try {
            cnn = conexion.getConnection();
            cstmt = cnn.createStatement();

            String sql = "delete from producto where IdProducto="+codProducto+" ";


            cstmt.executeUpdate(sql);
            cstmt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        } finally {
            try {
                if (cnn != null && !cnn.isClosed()) {
                    cnn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
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
                    String query = "UPDATE categoria SET descripcion = ? WHERE idcategoria= ?;";
                    pstmt = cnn.prepareStatement(query); // create a statement
                    pstmt.setString(1, cat.getDescripcion());
                    pstmt.setInt(2, cat.getIdcategoria());
                }
                break;
                case 3:
                {
                    String query = "DELETE FROM categoria WHERE idcategoria= ?";
                    pstmt = cnn.prepareStatement(query); // create a statement
                    pstmt.setInt(1, cat.getIdcategoria());
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
