public class Principal{
    int documento;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String correo;
   
    public Principal(int documento, String nombre, String apellido, String direccion, String telefono, String corre){
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = corre;
    }

    public int getDocumento(){
        return this.documento;
    }
    public void setdocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void settelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo(){
        return this.correo;
    }
    public void setcorreo(String correo) {
        this.correo = correo;
    }
    

    public void mostrardatospersonales(){
        System.out.println("----------------------------------");
        System.out.println("--         PERSONAS             --");
        System.out.println("----------------------------------");
        System.out.println("--| Documento : --" + this.documento);
        System.out.println("--| Nombre : --" + this.nombre);
        System.out.println("--| Apellido : --" + this.apellido);
        System.out.println("--| Direccion : --" + this.direccion);
        System.out.println("--| Telefono : --" + this.telefono);
        System.out.println("--| Correo: --"+ this.correo);
        System.out.println("----------------------------------");
    }

}










