/*
  autores Luis Diego Jimenez Delgado y Alejandro Rangel Mendez
  grupo 5Im6
  fecha 29 de agosto del 2017
 */
package Servicio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Servicio {
    public String doLogin(String email, String password){
        Connection con = null;
        String message = "";
        //conexion a bd
        BD.cDatos sql = new BD.cDatos();
        ResultSet rs = null;
        try {
            //ejecuta una consulta 
            sql.conectar();
            rs = sql.consulta("select count(*) as Resultado from usuarios where email = '"+email+"' and pass = '"+password+"';");
            while (rs.next()) {
               message = rs.getString("Resultado"); 
            }
            //regrese un mensjae 
            sql.cierraConexion();
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }
}
