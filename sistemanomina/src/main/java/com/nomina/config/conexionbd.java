package com.nomina.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.nomina.exceptions.*;

public class conexionbd {
    private static final String URL = "jdbc:mysql://localhost:3306/sistemanomina?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "ar965821";

    public static Connection ObtenerConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driven");
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException e) {
            throw new ValidacionNominaException("Error de Infraestructura: No se encontró el driver de MySQL en el Classpath");
        } catch (SQLException e) {
            throw new ValidacionNominaException("Error de Conexion a la base de datos: " + e.getMessage());
        }    
    }
}
