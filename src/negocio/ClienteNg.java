/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.*;
import java.sql.Connection;
import persistencia.DAOs;

/**
 *
 * @author Usuario
 */
public class ClienteNg {
    DAOs dao = new DAOs();
    public ClienteNg(){
         
    }
    
    public boolean guardarCliente(Connection c, ClienteEn cli){
        return dao.guardarCliente(c, cli);
    }
}
