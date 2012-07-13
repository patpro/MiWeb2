/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.Data;

import com.miweb.com.Categoria;
import com.miweb.com.voucher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author PC
 */
public final class conexion 
{
    
    
    public static Connection getConnection()
    {
        Context ctx;
        Connection cn=null;
        try {
            ctx = new InitialContext();
            DataSource ds;
            ds = (DataSource) ctx.lookup("jdbc/_tienda");                
            cn = ds.getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cn;
    }
    
    
}
