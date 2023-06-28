package Clases;

   
public class Peliculas{
        private String id;
        private String nombre;
        private String hora;
        private String fecha;
        
        
        public Peliculas(String id, String nombre, String hora, String fecha) {
           this.id = id;
           this.nombre = nombre;
           this.hora = hora;
           this.fecha = fecha;
       
                
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

  
        
}
