package Clases;

    import java.sql.*;

public class DataBase {
    
    Statement manipularDB;

    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "cinema";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;

        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }  
    
    public Personas[] listaPersonas(){
        Personas [] listaPersonas = new Personas [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM usuarios");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Personas temp = new Personas( registros.getString("cedula") ,registros.getString("contra") ,registros.getString("nombre"), registros.getString("apellido"), registros.getString("correo"), registros.getString("telefono") );
                    listaPersonas[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaPersonas;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaPersonas;
        }
    }
    
    public Peliculas[] listaPel(){
        Peliculas [] listaPel = new Peliculas [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM peliculas");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Peliculas temp = new Peliculas( registros.getString("id"), registros.getString("imagen"),registros.getString("nombre"), registros.getString("precio"), registros.getString("fecha"), registros.getString("boleto") , registros.getString("genero"));
                    listaPel[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaPel;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaPel;
        }
    }
    
    public Reserva[] listaReset(){
        Reserva [] listaReset = new Reserva [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM reservas");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Reserva temp = new Reserva( registros.getString("cedula_usuario"),registros.getString("nom_usuario"), registros.getString("nom_pelicula"), registros.getString("precio"), registros.getString("hora"), registros.getString("fecha"), registros.getString("sala"), registros.getString("puesto") );
                    listaReset[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaReset;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaReset;
        }
    }
    
    public boolean insertarUsuario(String cedula, String contra, String nombre, String apellido, String correo, String telefono){
        String consulta = "INSERT INTO usuarios (cedula, contra, nombre, apellido, correo, telefono) VALUES ('"+cedula+"','"+contra+"','"+nombre+"','"+apellido+"','"+correo+"','"+telefono+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean insertarReserva(String cedula_usuario, String nom_usuario, String nom_pelicula, String precio, String hora, String fecha, String sala, String puesto){
        String consulta = "INSERT INTO reservas(cedula_usuario, nom_usuario, nom_pelicula, precio, hora, fecha, sala, puesto) VALUES ('"+cedula_usuario+"','"+nom_usuario+"','"+nom_pelicula+"','"+precio+"','"+hora+"','"+fecha+"','"+sala+"','"+puesto+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean insertarPelicula(String id, String imagen, String nombre, String precio,  String fecha, String boleto, String genero){
        String consulta = "INSERT INTO peliculas(id, imagen, nombre, precio, fecha, boleto, genero) VALUES ('"+id+"','"+imagen+"','"+nombre+"','"+precio+"','"+fecha+"','"+boleto+"','"+genero+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
     
    public boolean eliminarUsuario(Personas personas){
        boolean respuesta = false;
        String cedula = personas.getCedula();
        String consulta = "DELETE FROM usuarios WHERE cedula='"+cedula+"'";
        try {

            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("--> Error Delete: " + e.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
            
        }
        return false;
    }
    
    public boolean eliminarReserva(Reserva reserva){
        boolean respuesta = false;
        String cedula_usuario = reserva.getCedula_usuario();
        String consulta = "DELETE FROM reservas WHERE cedula_usuario='"+cedula_usuario+"'";
        try {

            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("--> Error Delete: " + e.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
            
        }
        return false;
    }    
            
     public boolean eliminarPelicula(Peliculas peliculas){
        boolean respuesta = false;
        String id = peliculas.getId();
        String consulta = "DELETE FROM peliculas WHERE id='"+id+"'";
        try {

            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("--> Error Delete: " + e.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
            
        }
        return false;
    }    
    
    public boolean editarUsuario(Personas personas){
        boolean respuesta = false;
        String cedula = personas.getCedula();
        String contra = personas.getContra();
        String nombre = personas.getNombre();
        String apellido = personas.getApellido();
        String correo = personas.getCorreo();
        String telefono = personas.getTelefono();
       
        
        try {
            String consulta = "UPDATE usuarios SET contra='"+contra+"', nombre='"+nombre+"', apellido='"+apellido+"', correo='"+correo+"', telefono='"+telefono+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
       
    public boolean editarReserva(Reserva reserva){
         boolean respuesta = false;
            String cedula_usuario = reserva.getCedula_usuario();
            String nom_usuario = reserva.getNom_usuario();
            String nom_pelicula = reserva.getNom_pelicula();
            String precio = reserva.getPrecio();
            String hora = reserva.getHora();
            String fecha = reserva.getFecha();
            String sala = reserva.getSala();
            String puesto = reserva.getPuesto();
        
        try {
            String consulta = "UPDATE reservas SET nom_usuario='"+nom_usuario+"', nom_pelicula='"+nom_pelicula+"', precio='"+precio+"', hora='"+hora+"', fecha='"+fecha+"', sala='"+sala+"', puesto='"+puesto+"' WHERE cedula_usuario='"+cedula_usuario+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarPelicula(Peliculas peliculas){
         boolean respuesta = false;
            String id = peliculas.getId();
            String nombre = peliculas.getNombre();
            String precio = peliculas.getPrecio();
            String fecha = peliculas.getFecha();
            String boleto = peliculas.getBoleto();
            String genero = peliculas.getGenero();
          
         
        
        try {
            String consulta = "UPDATE peliculas SET nombre='"+nombre+"', precio='"+precio+"', fecha='"+fecha+"', boleto='"+boleto+"', genero='"+genero+"' WHERE id='"+id+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
        
    public Personas buscarUsuario(String cedula){
        Personas temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM usuarios WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Personas( registros.getString("cedula"),registros.getString("contra"),registros.getString("nombre"), registros.getString("apellido"), registros.getString("correo"), registros.getString("telefono") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }

    public Peliculas buscarPeliculas(String id){
        Peliculas temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM peliculas WHERE id='"+id+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Peliculas( registros.getString("id"),registros.getString("imagen"),registros.getString("nombre"), registros.getString("precio"), registros.getString("fecha"), registros.getString("boleto"), registros.getString("genero") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    
    public Reserva buscarReserva(String cedula_usuario){
        Reserva temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM reservas WHERE cedula_usuario='"+cedula_usuario+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Reserva( registros.getString("cedula_usuario"),registros.getString("nom_usuario"), registros.getString("nom_pelicula"), registros.getString("precio"), registros.getString("hora"), registros.getString("fecha"), registros.getString("sala"), registros.getString("puesto") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
}