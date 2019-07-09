/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.ClienteEn;
import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class DAOs {

    public DAOs() {
    }
    
    public boolean guardarCliente(Connection c, ClienteEn cli){
        boolean resultado = true;
        
        return resultado;
    }
}
