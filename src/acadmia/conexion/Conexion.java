/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acadmia.conexion;

/**
 *
 * @author LADY ANN
 */
public class Conexion {
    package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     public static Connection GetConexion() throws ClassNotFoundException, SQLException{
    Connection conex=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/Centro-pre";
        String usuario="root";
        String pass ="root";
        conex =(Connection) DriverManager.getConnection(url,usuario,pass);
    
    return conex;
    }
}

