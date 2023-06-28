package Principal;

import Clases.DataBase;
import Clases.Persona;
import Clases.Producto;
import Clases.Factura;
import ModuloUsuarios.CrearUsuario;
import ModuloUsuarios.ListarUsuarios;
import ModuloUsuarios.ModificarUsuario;

import ModuloFacturas.CrearFactura;
import ModuloFacturas.ListarFactura;

import ModuloProductos.CrearProducto;
import ModuloProductos.EliminarProducto;
import ModuloProductos.ListarProductos;
import ModuloProductos.ModificarProductos;

import ModuloUsuarios.EliminarUsuario;
import javax.swing.*;

public class Menu extends JFrame {
    
    public DataBase database;
    public Persona listaClientes [];
    public Persona listaVendedores [];
    public Producto listaProductos [];
    public Factura listaFactura [];
    public int indexClientes;
    public int indexVendedores;
    
    public Menu() {
        this.database = new DataBase();
        
        this.listaClientes = new Persona [100];
        this.listaVendedores = new Persona [100];
        this.listaProductos = new Producto [100];
        this.listaFactura = new Factura [100];
                
        this.indexClientes = 5;
        this.indexVendedores = 5;
        
        this.listaClientes[0] = new Persona("108800", "Juan", "Perez", "300001", "Calle 20", "cliente01@mail.com");
        this.listaClientes[1] = new Persona("108801", "Manuel", "Molina", "300002", "Calle 21", "cliente02@mail.com");
        this.listaClientes[2] = new Persona("108802", "Jose", "Gonzalez", "300003", "Calle 22", "cliente03@mail.com");
        this.listaClientes[3] = new Persona("108803", "Ana", "Mendoza", "300004", "Calle 23", "cliente04@mail.com");
        this.listaClientes[4] = new Persona("108804", "Sofia", "Segura", "300005", "Calle 24", "cliente05@mail.com");
        
        this.listaVendedores[0] = new Persona("108805", "Andres", "Perez", "300011", "Calle 25", "vendedor01@mail.com");
        this.listaVendedores[1] = new Persona("108806", "Julian", "Molina", "300012", "Calle 26", "vendedor02@mail.com");
        this.listaVendedores[2] = new Persona("108807", "Camilo", "Gonzalez", "300013", "Calle 27", "vendedor03@mail.com");
        this.listaVendedores[3] = new Persona("108808", "Maria", "Mendoza", "300014", "Calle 28", "vendedor04@mail.com");
        this.listaVendedores[4] = new Persona("108809", "Carolina", "Segura", "300015", "Calle 29", "vendedor05@mail.com");
        
        this.listaProductos[0] = new Producto(1010, "Leche", 3500);
        this.listaProductos[1] = new Producto(1011, "Arroz Lb", 2500);
        this.listaProductos[2] = new Producto(1012, "Arroz Kg", 4800);
        this.listaProductos[3] = new Producto(1013, "Detergente Lb", 4400);
        this.listaProductos[4] = new Producto(1014, "Detergente Kg", 8000);
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqMenu = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        etiquetaCliente = new javax.swing.JLabel();
        contentClientes = new javax.swing.JPanel();
        btnCrearCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        etiquetaVendedores = new javax.swing.JLabel();
        contentVendedores = new javax.swing.JPanel();
        btnCrearVendedor = new javax.swing.JButton();
        btnModificarVendedor = new javax.swing.JButton();
        btnEliminarVendedor = new javax.swing.JButton();
        btnListarVendedores = new javax.swing.JButton();
        etiquetaProductos = new javax.swing.JLabel();
        contentProductos = new javax.swing.JPanel();
        btnCrearProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnListarProductos = new javax.swing.JButton();
        etiquetaFactura = new javax.swing.JLabel();
        contentFacturas = new javax.swing.JPanel();
        btnCrearFactura = new javax.swing.JButton();
        btnListarFacturas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        setBackground(new java.awt.Color(255, 51, 51));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        contentMenu.setBackground(new java.awt.Color(0, 0, 0));

        etqMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etqMenu.setForeground(new java.awt.Color(255, 255, 255));
        etqMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenu.setText("MENU FACTURADOR");

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaCliente.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaCliente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaCliente.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCliente.setText("CLIENTES");
        etiquetaCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contentClientes.setBackground(new java.awt.Color(255, 255, 255));
        contentClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearCliente.setBackground(new java.awt.Color(0, 0, 153));
        btnCrearCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCliente.setText("CREAR");
        btnCrearCliente.setFocusable(false);
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente.setText("MODIFICAR");
        btnModificarCliente.setFocusable(false);
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("ELIMINAR");
        btnEliminarCliente.setFocusable(false);
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnListarClientes.setBackground(new java.awt.Color(0, 0, 153));
        btnListarClientes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnListarClientes.setText("LISTAR");
        btnListarClientes.setFocusable(false);
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentClientesLayout = new javax.swing.GroupLayout(contentClientes);
        contentClientes.setLayout(contentClientesLayout);
        contentClientesLayout.setHorizontalGroup(
            contentClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentClientesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        contentClientesLayout.setVerticalGroup(
            contentClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentClientesLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etiquetaVendedores.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaVendedores.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaVendedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaVendedores.setText("VENDEDORES");
        etiquetaVendedores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contentVendedores.setBackground(new java.awt.Color(255, 255, 255));
        contentVendedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearVendedor.setBackground(new java.awt.Color(255, 153, 0));
        btnCrearVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearVendedor.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearVendedor.setText("CREAR");
        btnCrearVendedor.setFocusable(false);
        btnCrearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVendedorActionPerformed(evt);
            }
        });

        btnModificarVendedor.setBackground(new java.awt.Color(255, 153, 0));
        btnModificarVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarVendedor.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarVendedor.setText("MODIFICAR");
        btnModificarVendedor.setFocusable(false);
        btnModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVendedorActionPerformed(evt);
            }
        });

        btnEliminarVendedor.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminarVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarVendedor.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarVendedor.setText("ELIMINAR");
        btnEliminarVendedor.setFocusable(false);
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        btnListarVendedores.setBackground(new java.awt.Color(255, 153, 0));
        btnListarVendedores.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarVendedores.setForeground(new java.awt.Color(0, 0, 0));
        btnListarVendedores.setText("LISTAR");
        btnListarVendedores.setFocusable(false);
        btnListarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentVendedoresLayout = new javax.swing.GroupLayout(contentVendedores);
        contentVendedores.setLayout(contentVendedoresLayout);
        contentVendedoresLayout.setHorizontalGroup(
            contentVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentVendedoresLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        contentVendedoresLayout.setVerticalGroup(
            contentVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentVendedoresLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etiquetaProductos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaProductos.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaProductos.setText("PRODUCTOS");
        etiquetaProductos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contentProductos.setBackground(new java.awt.Color(255, 255, 255));
        contentProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearProducto.setBackground(new java.awt.Color(102, 255, 51));
        btnCrearProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearProducto.setText("CREAR");
        btnCrearProducto.setFocusable(false);
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setBackground(new java.awt.Color(102, 255, 51));
        btnModificarProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarProducto.setText("MODIFICAR");
        btnModificarProducto.setFocusable(false);
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(102, 255, 51));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setText("ELIMINAR");
        btnEliminarProducto.setFocusable(false);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnListarProductos.setBackground(new java.awt.Color(102, 255, 51));
        btnListarProductos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnListarProductos.setText("LISTAR");
        btnListarProductos.setFocusable(false);
        btnListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentProductosLayout = new javax.swing.GroupLayout(contentProductos);
        contentProductos.setLayout(contentProductosLayout);
        contentProductosLayout.setHorizontalGroup(
            contentProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentProductosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        contentProductosLayout.setVerticalGroup(
            contentProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentProductosLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etiquetaFactura.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaFactura.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFactura.setText("FACTURAS");

        contentFacturas.setBackground(new java.awt.Color(255, 255, 255));
        contentFacturas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        btnCrearFactura.setBackground(new java.awt.Color(220, 220, 220));
        btnCrearFactura.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearFactura.setText("CREAR");
        btnCrearFactura.setFocusable(false);
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });

        btnListarFacturas.setBackground(new java.awt.Color(220, 220, 220));
        btnListarFacturas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarFacturas.setForeground(new java.awt.Color(0, 0, 0));
        btnListarFacturas.setText("LISTAR");
        btnListarFacturas.setFocusable(false);
        btnListarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentFacturasLayout = new javax.swing.GroupLayout(contentFacturas);
        contentFacturas.setLayout(contentFacturasLayout);
        contentFacturasLayout.setHorizontalGroup(
            contentFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentFacturasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentFacturasLayout.setVerticalGroup(
            contentFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentFacturasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(contentFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("By Sebastian Colorado & Andres Garcia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contentVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etiquetaProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etiquetaVendedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etiquetaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        setVisible(false);
        ListarUsuarios ventana = new ListarUsuarios(this, "CLIENTES");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        setVisible(false);
        
        CrearUsuario ventana = new CrearUsuario(this, this.listaClientes, "CLIENTE");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(this, this.listaClientes, "CLIENTES");
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnCrearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVendedorActionPerformed
        setVisible(false);
        
        CrearUsuario ventana = new CrearUsuario(this, this.listaVendedores, "VENDEDOR");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearVendedorActionPerformed

    private void btnModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVendedorActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(this, this.listaVendedores, "VENDEDOR");
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnModificarVendedorActionPerformed

    private void btnListarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendedoresActionPerformed
        setVisible(false);
        ListarUsuarios ventana = new ListarUsuarios(this, "VENDEDORES");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarVendedoresActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        setVisible(false);
        
        CrearProducto ventana = new CrearProducto(this, this.listaProductos);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        setVisible(false);
        
        ModificarProductos ventana = new ModificarProductos(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProductosActionPerformed
        setVisible(false);
        
        ListarProductos ventana = new ListarProductos(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarProductosActionPerformed

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        setVisible(false);
        
        CrearFactura ventana = new CrearFactura(this, this.listaClientes, this.listaVendedores, this.listaProductos);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearFacturaActionPerformed

    private void btnListarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFacturasActionPerformed
        setVisible(false);
        
        ListarFactura ventana = new ListarFactura(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarFacturasActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        setVisible(false);
        
        EliminarUsuario ventana = new EliminarUsuario(this, this.listaClientes, "CLIENTES");
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed
        setVisible(false);
        
        EliminarUsuario ventana = new EliminarUsuario(this, this.listaClientes, "VENDEDORES");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        setVisible(false);
        
        EliminarProducto ventana = new EliminarProducto(this, this.listaProductos);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
    }
    
    public void alertCreacionUsuario(){
        Alert alerta = new Alert("CORRECTO", "Se ha creado un nuevo usuario.", "success");
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnCrearVendedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarVendedor;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnListarFacturas;
    private javax.swing.JButton btnListarProductos;
    private javax.swing.JButton btnListarVendedores;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarVendedor;
    private javax.swing.JPanel contentClientes;
    private javax.swing.JPanel contentFacturas;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JPanel contentProductos;
    private javax.swing.JPanel contentVendedores;
    private javax.swing.JLabel etiquetaCliente;
    private javax.swing.JLabel etiquetaFactura;
    private javax.swing.JLabel etiquetaProductos;
    private javax.swing.JLabel etiquetaVendedores;
    private javax.swing.JLabel etqMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
