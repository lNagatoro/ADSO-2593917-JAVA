package Clases;

public class Factura {
    private String id;
    private String cedula_cliente;
    private String cedula_vendedor;
    private String fecha;
    private String total;

    public Factura(String id, String cedula_cliente, String cedula_vendedor, String fecha, String total) {
        this.id = id;
        this.cedula_cliente = cedula_cliente;
        this.cedula_vendedor = cedula_vendedor;
        this.fecha = fecha;
        this.total = total;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public void setCedula_vendedor(String cedula_vendedor) {
        this.cedula_vendedor = cedula_vendedor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public String getCedula_cliente() {
        return cedula_cliente;
    }

    public String getCedula_vendedor() {
        return cedula_vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTotal() {
        return total;
    }   

}
