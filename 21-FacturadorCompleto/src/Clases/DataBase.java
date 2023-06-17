package Clases;

import ModuloFacturas.ListarFactura;
import java.sql.*;

public class DataBase {
    
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "almacenes";
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
    
    public Persona[] listaClientes(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Producto[] listaProductos(){
        Producto [] listaProductos = new Producto [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Producto temp = new Producto( registros.getInt("id"),registros.getString("nombre"), registros.getInt("precio"));
                    listaProductos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaProductos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaProductos;
        }
    }
    
    public Persona[] listaVendedores(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Factura[] listaFactura(){
        Factura[] listaFactura = new Factura [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM facturas");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Factura temp = new Factura( registros.getString("id"),registros.getString("cedula_cliente"), registros.getString("cedula_vendedor"), registros.getString("fecha"), registros.getString("total"));
                    listaFactura[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaFactura;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaFactura;
        }
    }
    
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Producto buscarProducto(int codigoint){
        Producto temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos WHERE id='"+codigoint+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Producto( registros.getInt("id"),registros.getString("nombre"), registros.getInt("precio"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    
    public Persona buscarVendedor(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE vendedores SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarProducto(Producto producto){
        boolean respuesta = false;
        int id = producto.getId();
        String nombre = producto.getNombre();
        int precio = producto.getPrecio();

        
        try {
            String consulta = "UPDATE productos SET nombre='"+nombre+"', precio='"+precio+"' WHERE id='"+id+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
    
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
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
    
    public boolean insertarVendedor(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO vendedores(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
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
    
    public boolean eliminarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String consulta = "DELETE FROM clientes WHERE cedula='"+cedula+"'";
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
    
    public boolean eliminarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String consulta = "DELETE FROM vendedores WHERE cedula='"+cedula+"'";
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
    
    public boolean eliminarProducto(Producto producto){
        boolean respuesta = false;
        int id = producto.getId();

        String consulta = "DELETE FROM productos WHERE id='"+id+"'";
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
    
    
    
    public boolean insertarProducto(int id, String nombre, int precio){
        String consulta = "INSERT INTO productos(id, nombre, precio) VALUES ('"+id+"','"+nombre+"','"+precio+"') ";    
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

    public String generarID(){
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM facturas ORDER BY id DESC ");
            registros.next();
            if (registros.getRow()==1) {
                return String.valueOf(registros.getInt("id")+1);
                
            }
            return "1";
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return "1";
        }
    }
    
    public String generarNumItem(){
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM items_factura ORDER BY id DESC ");
            registros.next();
            if (registros.getRow()==1) {
                return String.valueOf(registros.getInt("id")+1);
                
            }
            return "1";
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return "1";
        }
    }
    
    public boolean generarFactura(String id, String cedula_cliente, String cedula_vendedor,String fecha, String total){
        String consulta = "INSERT INTO facturas(id, cedula_cliente, cedula_vendedor, fecha, total) VALUES ('"+id+"','"+cedula_cliente+"','"+cedula_vendedor+"','"+fecha+"','"+total+"')";
        
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
    
    public boolean generarItem(String idfactura, String idproducto, String cantidad, String subtotal){
        String consulta = "INSERT INTO items_factura(id_factura, id_producto, cantidad, subtotal) VALUES ('"+idfactura+"','"+idproducto+"','"+cantidad+"','"+subtotal+"')";
        
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
    
    
    public Factura ConsultaFactura(int idFactura)  {
        Factura temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT facturas.* FROM facturas WHERE id = "+idFactura);
                         
            registros.next();
            if (registros.getRow()==1) {
                temp = new Factura( registros.getString("id"),registros.getString("cedula_cliente"), registros.getString("cedula_vendedor"), registros.getString("fecha"), registros.getString("total"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT hola: "+e.getMessage());
            return temp;
        }
    }
    
    public ItemsFactura[] ConsultaItemsFactura(int idFactura)  {
        ItemsFactura [] listaItems = new ItemsFactura [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT productos.id, items_factura.cantidad, items_factura.subtotal FROM items_factura INNER JOIN productos ON items_factura.id_producto = productos.id WHERE items_factura.id_factura= " +idFactura);
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    ItemsFactura temp = new ItemsFactura( String.valueOf(idFactura), registros.getString("id"), registros.getString("cantidad"), registros.getString("subtotal") );
                    listaItems[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaItems;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaItems;
        }
    }

}
