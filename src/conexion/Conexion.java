package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    /**
     * Establece una conexión con la base de datos MySQL en el servidor local.
     * Utiliza el controlador JDBC de MySQL para conectarse a la base de datos
     * especificada en la URL de conexión.
     *
     * @return Connection objeto de tipo Connection que representa la conexión con la base de datos.
     *         Retorna null si ocurre un error al intentar establecer la conexión.
     */
    public static Connection conectar() {
        // Definimos la conexión que será devuelta.
        Connection cn = null;

        try {
            // Parámetros de conexión.
            String url = "jdbc:mysql://localhost:3306/bd_sistema_ventas";
            String usuario = "root";
            String contraseña = "administrador";
            
            // Establecer la conexión a la base de datos.
            cn = DriverManager.getConnection(url, usuario, contraseña);
            
            // Mensaje opcional para confirmar éxito.
            System.out.println("Conexión exitosa a la base de datos.");
            
        } catch (SQLException e) {
            // Capturamos y mostramos un mensaje en caso de error.
            System.out.println("Error en la conexión local: " + e.getMessage());
        }
        
        // Retornamos la conexión (puede ser null si hubo un error).
        return cn;
    }
}
