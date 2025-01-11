package modelo;

/**
 * Clase Usuario.
 * Representa un modelo de datos para los usuarios en el sistema.
 * Contiene los atributos básicos de un usuario, junto con sus métodos
 * de acceso (getters y setters) y un constructor predeterminado.
 */
public class Usuario {

    // Atributos
    private int idUsuario;
    private String nombre;
    private String Apellido;
    private String usuario;
    private String password;
    private String telefono;
    private int estado;

    /**
     * Constructor sin parámetros, inicializa el usuario con valores predeterminados.
     */
    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "";
        this.Apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.estado = 0;
    }

    // Getters y Setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
