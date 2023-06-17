package ModuloFacturas;

import Clases.Factura;
import Clases.ItemsFactura;
import Principal.Menu;

public class DetalleFactura extends javax.swing.JFrame {

    ListarFactura ventanaFactura;
    Menu ventanaMenu;
    private int identificador;

    public DetalleFactura(ListarFactura ventanaFactura, int i, Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.ventanaFactura = ventanaFactura;
        this.identificador = i;
        
        initComponents();
        initAlternComponents();
        mostrarDetalleFactura();
    }

    public void initAlternComponents() {
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));

    }

    public void mostrarDetalleFactura() {
        System.out.println("Prueba metodo");
        
        Factura factura = this.ventanaMenu.database.ConsultaFactura(identificador);
        ItemsFactura[] listaItems = this.ventanaMenu.database.ConsultaItemsFactura(identificador);
        
        
        if (factura != null){
            
            CampoIDfactura.setText(factura.getId());
            CampoCedulaCliente.setText(factura.getCedula_cliente());
            CampoCedulaVendedor.setText(factura.getCedula_vendedor());
            CampoFechaCompra.setText(factura.getFecha());
            CampoTotal.setText(factura.getTotal());
            

            if (listaItems!=null) {
                for(int i = 0; i < listaItems.length; i++){
                    if(listaItems[i] != null){
                        CampoTodo.append("PRODUCTO: "+listaItems[i].getId_producto()+ " | "+" CANTIDAD:  "+listaItems[i].getCantidad()+ " | "+" SUBTOTAL "+ listaItems[i].getSubtotal() + "\n");
                    }else{
                        break;
                    }
                }
                revalidate();
            }
        
            
            


        }else{
            System.out.print("No hay facturas Registradas");
        }

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelDetalleFactura = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        CampoIDfactura = new javax.swing.JTextField();
        CampoCedulaCliente = new javax.swing.JTextField();
        etqCliente = new javax.swing.JLabel();
        etqIdFactura = new javax.swing.JLabel();
        CampoCedulaVendedor = new javax.swing.JTextField();
        etqVendedor = new javax.swing.JLabel();
        CampoFechaCompra = new javax.swing.JTextField();
        etqFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CampoTotal = new javax.swing.JTextField();
        etqTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoTodo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLE FACTURA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDetalleFactura.setBackground(new java.awt.Color(204, 204, 204));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        etqCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqCliente.setText("Cedula Del Comprador");

        etqIdFactura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqIdFactura.setText("ID Factura");

        etqVendedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqVendedor.setText("Cedula Del Vendedor");

        etqFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqFecha.setText("Fecha De Compra");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        CampoTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CampoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etqTotal.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTotal.setText("TOTAL:");

        CampoTodo.setColumns(20);
        CampoTodo.setRows(5);
        jScrollPane1.setViewportView(CampoTodo);

        javax.swing.GroupLayout panelDetalleFacturaLayout = new javax.swing.GroupLayout(panelDetalleFactura);
        panelDetalleFactura.setLayout(panelDetalleFacturaLayout);
        panelDetalleFacturaLayout.setHorizontalGroup(
            panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleFacturaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqCliente)
                    .addComponent(etqIdFactura)
                    .addComponent(etqVendedor)
                    .addComponent(etqFecha))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CampoFechaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(CampoCedulaVendedor)
                    .addComponent(CampoCedulaCliente)
                    .addComponent(CampoIDfactura))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelDetalleFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleFacturaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(etqTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(27, 27, 27))
            .addGroup(panelDetalleFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelDetalleFacturaLayout.setVerticalGroup(
            panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleFacturaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoIDfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqIdFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTotal)
                    .addGroup(panelDetalleFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAtras)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDetalleFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDetalleFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaFactura.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCedulaCliente;
    private javax.swing.JTextField CampoCedulaVendedor;
    private javax.swing.JTextField CampoFechaCompra;
    private javax.swing.JTextField CampoIDfactura;
    private javax.swing.JTextArea CampoTodo;
    private javax.swing.JTextField CampoTotal;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel etqCliente;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JLabel etqIdFactura;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JLabel etqVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelDetalleFactura;
    // End of variables declaration//GEN-END:variables

}
