
package ModuloFacturas;

import Clases.ItemsFactura;
import Clases.Persona;
import Clases.Producto;
import Principal.Alert;
import Principal.Menu;
import java.util.Date;


public class CrearFactura extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    ItemsFactura listaItems [];
    int indiceItems;
    
    public CrearFactura(Menu ventanaMenu, Persona[] listaClientes, Persona[] listaVendedores, Producto[] listaProductos) {
        this.ventanaMenu = ventanaMenu;
        this.listaItems = new ItemsFactura[100];
        this.indiceItems = 0;
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        String id = this.ventanaMenu.database.generarID();
        this.input_idFactura.setText(id);
        this.input_idFactura.setEnabled(false);
        
        String idItemF = this.ventanaMenu.database.generarNumItem();
        this.input_IdItem.setText(idItemF);
        this.input_IdItem.setEnabled(false);
        
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etq_tituloFactura = new javax.swing.JLabel();
        input_idFactura = new javax.swing.JTextField();
        etq_idFactura = new javax.swing.JLabel();
        input_IdItem = new javax.swing.JTextField();
        etq_item = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JPanel();
        etq_datos_cliente = new javax.swing.JLabel();
        etq_cedula_cliente = new javax.swing.JLabel();
        input_cedula_cliente = new javax.swing.JTextField();
        btn_buscar_cliente = new javax.swing.JButton();
        etq_buscandoCliente = new javax.swing.JLabel();
        etq_clienteEncontrado = new javax.swing.JLabel();
        etq_datos_vendedor = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        etq_vendedor_cliente = new javax.swing.JLabel();
        input_cedula_vendedor = new javax.swing.JTextField();
        btn_buscar_vendedor = new javax.swing.JButton();
        etq_buscandoVendedor = new javax.swing.JLabel();
        etq_vendedorEncontrado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etq_datos_productos = new javax.swing.JLabel();
        etq_id_producto = new javax.swing.JLabel();
        input_id_producto = new javax.swing.JTextField();
        etq_nombre_producto = new javax.swing.JLabel();
        input_nombre_producto = new javax.swing.JTextField();
        etq_precio_producto = new javax.swing.JLabel();
        input_precio_producto = new javax.swing.JTextField();
        etq_cant_producto = new javax.swing.JLabel();
        input_cant_producto = new javax.swing.JTextField();
        btn_add_producto = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_compraPRO = new javax.swing.JTextArea();
        input_total_pagar = new javax.swing.JTextField();
        etq_total = new javax.swing.JLabel();
        btn_generarValores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contenedorTitulo.setBackground(new java.awt.Color(0, 0, 0));

        etq_tituloFactura.setBackground(new java.awt.Color(255, 255, 255));
        etq_tituloFactura.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        etq_tituloFactura.setForeground(new java.awt.Color(255, 255, 255));
        etq_tituloFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_tituloFactura.setText("FACTURA");

        input_idFactura.setBackground(new java.awt.Color(255, 255, 255));
        input_idFactura.setForeground(new java.awt.Color(0, 0, 0));
        input_idFactura.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        etq_idFactura.setForeground(new java.awt.Color(255, 255, 255));
        etq_idFactura.setText("ID");

        input_IdItem.setBackground(new java.awt.Color(255, 255, 255));
        input_IdItem.setForeground(new java.awt.Color(0, 0, 0));
        input_IdItem.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        etq_item.setBackground(new java.awt.Color(255, 255, 255));
        etq_item.setForeground(new java.awt.Color(255, 255, 255));
        etq_item.setText("ITEM");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addComponent(etq_tituloFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_item)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_IdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_idFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_idFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_tituloFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(input_idFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_idFactura)
                    .addComponent(input_IdItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_item))
                .addContainerGap())
        );

        contenedorPrincipal.setBackground(new java.awt.Color(230, 230, 230));

        etq_datos_cliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_datos_cliente.setForeground(new java.awt.Color(0, 0, 0));
        etq_datos_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_datos_cliente.setText("DATOS CLIENTE");

        etq_cedula_cliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_cedula_cliente.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedula_cliente.setText("CEDULA");

        input_cedula_cliente.setBackground(new java.awt.Color(255, 255, 255));
        input_cedula_cliente.setForeground(new java.awt.Color(0, 0, 0));

        btn_buscar_cliente.setBackground(new java.awt.Color(0, 51, 153));
        btn_buscar_cliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_buscar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar_cliente.setText("BUSCAR");
        btn_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_clienteActionPerformed(evt);
            }
        });

        etq_buscandoCliente.setBackground(new java.awt.Color(0, 0, 0));
        etq_buscandoCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_buscandoCliente.setForeground(new java.awt.Color(0, 0, 0));
        etq_buscandoCliente.setText("Buscando Cliente...");

        etq_clienteEncontrado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_clienteEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        etq_clienteEncontrado.setText(":");

        etq_datos_vendedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_datos_vendedor.setForeground(new java.awt.Color(0, 0, 0));
        etq_datos_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_datos_vendedor.setText("DATOS VENDEDOR");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        etq_vendedor_cliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_vendedor_cliente.setForeground(new java.awt.Color(0, 0, 0));
        etq_vendedor_cliente.setText("CEDULA");

        input_cedula_vendedor.setBackground(new java.awt.Color(255, 255, 255));
        input_cedula_vendedor.setForeground(new java.awt.Color(0, 0, 0));

        btn_buscar_vendedor.setBackground(new java.awt.Color(255, 153, 0));
        btn_buscar_vendedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_buscar_vendedor.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar_vendedor.setText("BUSCAR");
        btn_buscar_vendedor.setToolTipText("");
        btn_buscar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_vendedorActionPerformed(evt);
            }
        });

        etq_buscandoVendedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_buscandoVendedor.setForeground(new java.awt.Color(0, 0, 0));
        etq_buscandoVendedor.setText("Buscando Vendedor...");

        etq_vendedorEncontrado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etq_vendedorEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        etq_vendedorEncontrado.setText(":");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        etq_datos_productos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_datos_productos.setForeground(new java.awt.Color(0, 0, 0));
        etq_datos_productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_datos_productos.setText("LISTA PRODUCTOS FACTURADOS");

        etq_id_producto.setForeground(new java.awt.Color(0, 0, 0));
        etq_id_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_id_producto.setText("ID");

        input_id_producto.setBackground(new java.awt.Color(255, 255, 255));
        input_id_producto.setForeground(new java.awt.Color(0, 0, 0));
        input_id_producto.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etq_nombre_producto.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre_producto.setText("PRODUCTO");

        input_nombre_producto.setBackground(new java.awt.Color(255, 255, 255));
        input_nombre_producto.setForeground(new java.awt.Color(0, 0, 0));

        etq_precio_producto.setForeground(new java.awt.Color(0, 0, 0));
        etq_precio_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_precio_producto.setText("PRECIO");

        input_precio_producto.setBackground(new java.awt.Color(255, 255, 255));
        input_precio_producto.setForeground(new java.awt.Color(0, 0, 0));

        etq_cant_producto.setForeground(new java.awt.Color(0, 0, 0));
        etq_cant_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_cant_producto.setText("CANTIDAD");

        input_cant_producto.setBackground(new java.awt.Color(255, 255, 255));
        input_cant_producto.setForeground(new java.awt.Color(0, 0, 0));

        btn_add_producto.setBackground(new java.awt.Color(153, 153, 153));
        btn_add_producto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_add_producto.setForeground(new java.awt.Color(0, 0, 0));
        btn_add_producto.setText("BUSCAR");
        btn_add_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_productoActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(204, 255, 153));
        btn_registrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_atras.setBackground(new java.awt.Color(255, 153, 153));
        btn_atras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(0, 0, 0));
        btn_atras.setText("ATRAS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        area_compraPRO.setBackground(new java.awt.Color(255, 255, 255));
        area_compraPRO.setColumns(20);
        area_compraPRO.setForeground(new java.awt.Color(0, 0, 0));
        area_compraPRO.setRows(5);
        jScrollPane1.setViewportView(area_compraPRO);

        input_total_pagar.setBackground(new java.awt.Color(255, 255, 255));
        input_total_pagar.setForeground(new java.awt.Color(0, 0, 0));

        etq_total.setBackground(new java.awt.Color(0, 0, 0));
        etq_total.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_total.setForeground(new java.awt.Color(0, 0, 0));
        etq_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_total.setText("TOTAL");

        btn_generarValores.setBackground(new java.awt.Color(153, 153, 153));
        btn_generarValores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_generarValores.setForeground(new java.awt.Color(0, 0, 0));
        btn_generarValores.setText("AGREGAR");
        btn_generarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarValoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_datos_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addComponent(etq_buscandoVendedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(etq_vendedorEncontrado))
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addComponent(etq_vendedor_cliente)
                                        .addGap(48, 48, 48)
                                        .addComponent(input_cedula_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscar_vendedor))))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addComponent(etq_buscandoCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(etq_clienteEncontrado))
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addComponent(etq_cedula_cliente)
                                        .addGap(46, 46, 46)
                                        .addComponent(input_cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscar_cliente)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(input_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etq_total, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_add_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_generarValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator2)
                            .addComponent(etq_datos_vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_datos_productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input_id_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(etq_id_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etq_nombre_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_nombre_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etq_precio_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_precio_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_cant_producto)
                                    .addComponent(etq_cant_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_datos_cliente)
                .addGap(18, 18, 18)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar_cliente)
                    .addComponent(input_cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_cedula_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_buscandoCliente)
                    .addComponent(etq_clienteEncontrado))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_datos_vendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_vendedor_cliente)
                    .addComponent(input_cedula_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_buscandoVendedor)
                    .addComponent(etq_vendedorEncontrado))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_datos_productos)
                .addGap(18, 18, 18)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_id_producto)
                    .addComponent(etq_cant_producto)
                    .addComponent(etq_precio_producto)
                    .addComponent(etq_nombre_producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_cant_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(btn_add_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_generarValores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_clienteActionPerformed
        String cedulaCliente = input_cedula_cliente.getText();
        int cedulaClienteInt = Integer.parseInt(cedulaCliente);
        
        Persona temporal = this.ventanaMenu.database.buscarCliente(cedulaCliente);
        
        if (temporal != null) {
            etq_buscandoCliente.setText("Cliente Encontrado");
            etq_clienteEncontrado.setText(temporal.getNombres()+" "+temporal.getApellidos());
            this.input_cedula_vendedor.requestFocus(); 
  
        }else{
            etq_buscandoCliente.setText("Cliente No Encontrado");
            etq_clienteEncontrado.setText("");
            this.input_cedula_cliente.setText("");
        }
    }//GEN-LAST:event_btn_buscar_clienteActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_buscar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_vendedorActionPerformed
        String cedulaVendedor = input_cedula_vendedor.getText();
        
        Persona temporal = this.ventanaMenu.database.buscarVendedor(cedulaVendedor);
        
        if (temporal != null) {
            etq_buscandoVendedor.setText("Vendedor Encontrado");
            etq_vendedorEncontrado.setText(temporal.getNombres()+" "+temporal.getApellidos());
            this.input_id_producto.requestFocus(); 
  
        }else{
            etq_buscandoVendedor.setText("Vendedor No Encontrado");
            etq_vendedorEncontrado.setText("");
            this.input_cedula_vendedor.setText("");
        }
    }//GEN-LAST:event_btn_buscar_vendedorActionPerformed

    private void btn_add_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_productoActionPerformed
        String id = input_id_producto.getText();
        int codigoInt = Integer.parseInt(id);

        Producto temporal = this.ventanaMenu.database.buscarProducto(codigoInt);

        if (temporal != null) {
   
            input_nombre_producto.setText(temporal.getNombre());
            input_precio_producto.setText(String.valueOf(temporal.getPrecio()));

 
        }else{
            Alert alerta = new Alert("NO EXISTE", "El producto no esta registrado.", "error");
            input_nombre_producto.setText("");
            input_precio_producto.setText("");
          
          
        }
    }//GEN-LAST:event_btn_add_productoActionPerformed

    int total=0;
    private void btn_generarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarValoresActionPerformed
        String id = input_id_producto.getText();
        String producto = input_nombre_producto.getText();
        String precio = input_precio_producto.getText();
        String canti = input_cant_producto.getText();
        
        int precioInt = Integer.parseInt(precio);
        int cantiInt = Integer.parseInt(canti);
        int subtotal = precioInt*cantiInt;

        total += subtotal;
        String totalSTR = Integer.toString(total);
        area_compraPRO.append(id+ " | " + producto + " | " + precio + " | " + canti + " | " +subtotal+ "\n");  
        input_total_pagar.setText(totalSTR);
        
        
        this.listaItems[ this.indiceItems ] = new ItemsFactura( input_idFactura.getText().toString(), id, canti, String.valueOf(subtotal) );
        this.indiceItems++;
        
    }//GEN-LAST:event_btn_generarValoresActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

        //--------------------------FACTURA (Sebas Colorado)-----------------------------//
        String ides = input_idFactura.getText();
        String cliente = input_cedula_cliente.getText();
        String vendedor = input_cedula_vendedor.getText();
        String totalidad = input_total_pagar.getText();
        
        Date fecha = new Date();
	String log = fecha.toString();

        
        if (!ides.equals("") && !cliente.equals("") && !vendedor.equals("") && !log.equals("") && !totalidad.equals("")) {
            boolean repetido = false;
            if (!repetido) {
                
                this.ventanaMenu.database.generarFactura(ides, cliente, vendedor,log, totalidad);
                for (int i=0; i<this.indiceItems; i++) {
                    this.ventanaMenu.database.generarItem(this.listaItems[i].getId_factura(), this.listaItems[i].getId_producto(), this.listaItems[i].getCantidad(), this.listaItems[i].getSubtotal() );
                }
                
                this.ventanaMenu.setVisible(true);
                this.ventanaMenu.alertCreacionUsuario();
                dispose();
            }
        }

    }//GEN-LAST:event_btn_registrarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_compraPRO;
    private javax.swing.JButton btn_add_producto;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_buscar_cliente;
    private javax.swing.JButton btn_buscar_vendedor;
    private javax.swing.JButton btn_generarValores;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etq_buscandoCliente;
    private javax.swing.JLabel etq_buscandoVendedor;
    private javax.swing.JLabel etq_cant_producto;
    private javax.swing.JLabel etq_cedula_cliente;
    private javax.swing.JLabel etq_clienteEncontrado;
    private javax.swing.JLabel etq_datos_cliente;
    private javax.swing.JLabel etq_datos_productos;
    private javax.swing.JLabel etq_datos_vendedor;
    private javax.swing.JLabel etq_idFactura;
    private javax.swing.JLabel etq_id_producto;
    private javax.swing.JLabel etq_item;
    private javax.swing.JLabel etq_nombre_producto;
    private javax.swing.JLabel etq_precio_producto;
    private javax.swing.JLabel etq_tituloFactura;
    private javax.swing.JLabel etq_total;
    private javax.swing.JLabel etq_vendedorEncontrado;
    private javax.swing.JLabel etq_vendedor_cliente;
    private javax.swing.JTextField input_IdItem;
    private javax.swing.JTextField input_cant_producto;
    private javax.swing.JTextField input_cedula_cliente;
    private javax.swing.JTextField input_cedula_vendedor;
    private javax.swing.JTextField input_idFactura;
    private javax.swing.JTextField input_id_producto;
    private javax.swing.JTextField input_nombre_producto;
    private javax.swing.JTextField input_precio_producto;
    private javax.swing.JTextField input_total_pagar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
