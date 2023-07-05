package Clases;

public class Reserva {
        private String cedula_usuario;
        private String nom_usuario;
        private String ape_usuario;
        private String correo;
        private String telefono;
        private String nom_pelicula;
        private String precio;
        private String fecha;
        private String puesto;

    public Reserva(String cedula_usuario, String nom_usuario, String ape_usuario, String correo, String telefono, String nom_pelicula, String precio, String fecha, String puesto) {
        this.cedula_usuario = cedula_usuario;
        this.nom_usuario = nom_usuario;
        this.ape_usuario = ape_usuario;
        this.correo = correo;
        this.telefono = telefono;
        this.nom_pelicula = nom_pelicula;
        this.precio = precio;
        this.fecha = fecha;
        this.puesto = puesto;
    }

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getApe_usuario() {
        return ape_usuario;
    }

    public void setApe_usuario(String ape_usuario) {
        this.ape_usuario = ape_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNom_pelicula() {
        return nom_pelicula;
    }

    public void setNom_pelicula(String nom_pelicula) {
        this.nom_pelicula = nom_pelicula;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
    
    
}