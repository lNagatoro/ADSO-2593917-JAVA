package Clases;

public class Reserva {
        private String cedula_usuario;
        private String nom_usuario;
        private String nom_pelicula;
        private String precio;
        private String hora;
        private String fecha;
        private String sala;
        private String puesto;

    public Reserva(String cedula_usuario, String nom_usuario, String nom_pelicula, String precio, String hora, String fecha, String sala, String puesto) {
        this.cedula_usuario = cedula_usuario;
        this.nom_usuario = nom_usuario;
        this.nom_pelicula = nom_pelicula;
        this.precio = precio;
        this.fecha = fecha;
        this.sala = sala;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
        
        
}