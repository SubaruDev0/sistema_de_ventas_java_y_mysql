package controlador;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import modelo.Usuario;
import conexion.Conexion;
import javax.swing.JOptionPane;

public class Ctrl_Usuario {

    /**
     * Método para iniciar sesión de un usuario. Verifica las credenciales
     * proporcionadas en la base de datos para autenticar al usuario.
     *
     * @param objeto Usuario - Objeto que contiene los datos del usuario (nombre
     * y contraseña) para verificar.
     * @return boolean - Retorna true si las credenciales son correctas, de lo
     * contrario false.
     */
    public boolean loginUser(Usuario objeto) {

        boolean respuesta = false;  // Variable para almacenar el resultado de la autenticación.

        // Establecemos la conexión con la base de datos utilizando la clase Conexion
        Connection cn = Conexion.conectar();

        // Consulta SQL para verificar si las credenciales coinciden en la base de datos.
        // NOTA: El uso de concatenación de strings en consultas SQL puede ser riesgoso, 
        // es recomendable usar PreparedStatement para evitar inyecciones SQL.
        String sql = "SELECT usuario, password FROM tb_usuario WHERE usuario = '"
                + objeto.getUsuario() + "' AND password = '"
                + objeto.getPassword() + "'";

        Statement st;
        try {
            // Se crea un Statement para ejecutar la consulta SQL
            st = cn.createStatement();

            // Ejecuta la consulta y obtiene los resultados en un ResultSet
            ResultSet rs = st.executeQuery(sql);

            // Si el ResultSet contiene registros, significa que el usuario existe con la contraseña correcta
            while (rs.next()) {
                respuesta = true;  // Autenticación exitosa
            }

        } catch (SQLException e) {
            // Si ocurre algún error durante la consulta SQL, se captura la excepción
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        // Retorna el valor de 'respuesta', que será true si el usuario fue autenticado correctamente.
        return respuesta;
    }
}
