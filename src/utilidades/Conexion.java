/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Alejandro Sanchez Ospina
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    
    
    //variable que obtiene la conexion con la base de datos
    private Connection con= null; 
    
    String mensajes= null;
    String user="sa";
    String pass="12345";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://localhost:1433;databaseName=peliculas";
    

    public Connection getConecion() {
        
        try {
            Class.forName(driver);
            this.con = DriverManager.getConnection(url, user, pass);
            mensajes = "conexion exitosa";
        } catch (ClassNotFoundException | SQLException e) {
            mensajes = "No se conecto a la base de datos";
            e.printStackTrace();
        }
        return this.con;
    }

    public void Cerrar1(Connection con, CallableStatement cstm) {
        try {
            if (con != null) {
                this.con.close();
            }
            if (cstm != null) {
                cstm.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Cerrar2(CallableStatement cstm, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (cstm != null) {
                cstm.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //método que retorna la conexion con la base de datos
    public Connection getCon(){
        return this.con;
    }
    
    //método que retorna los mensajes 
    public String getMen()
    {
        return this.mensajes;
    }

}
