package Primero;


public class Persona {
    private String apellido;
    private String nombre;
    private String direccion;
    private String cedula;
    private String telefono;
    private String correo;

    public Persona(String apellido, String nombre, String direccion, String cedula, String telefono, String correo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    

}
