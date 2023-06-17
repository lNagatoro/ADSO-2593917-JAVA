package ModuloFacturas;


import Clases.Factura;

import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ListarFactura extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    private String identificador;
    private JLabel etqTemporal;
    
    public ListarFactura(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        contenFactura.setLayout( new BoxLayout(contenFactura, BoxLayout.Y_AXIS) );
        contenFactura.setBackground(Color.WHITE);

        imprimirFacturas();
    }
    
    public void abrirDetalleFactura(int i){
        setVisible(false);

        
        DetalleFactura ventana = new DetalleFactura(this, i, this.ventanaMenu);
        ventana.setVisible(true);
        this.setVisible(false);
        
        System.out.println("numero "+i);
        
    }
    
    public void imprimirFacturas(){
        Factura listaFactura [] = this.ventanaMenu.database.listaFactura();
        
        if (listaFactura!=null) {
            for(int i = 0; i < listaFactura.length; i++){
                
                if(listaFactura[i] != null){

                    etqTemporal = new JLabel("Factura No."+listaFactura[i].getId()+" - "+" Fecha De Compra: "+listaFactura[i].getFecha());
                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                    contenFactura.add(etqTemporal);
                    
              
                    
                    JButton btnDetalle = new JButton("Detalle");
                    String posActual = listaFactura[i].getId();
                    int posActualINT = Integer.parseInt(posActual);
                    
                    btnDetalle.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            
                            abrirDetalleFactura(posActualINT);
                            
                        }
                    });
                    
                    contenFactura.add(btnDetalle);
                
                }else{
                    break;
                }
            }
            revalidate();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalContainer = new javax.swing.JPanel();
        EtqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenFactura = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);

        principalContainer.setBackground(new java.awt.Color(204, 204, 204));

        EtqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EtqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtqTitulo.setText("LISTAR FACTURAS");
        EtqTitulo.setToolTipText("");

        javax.swing.GroupLayout contenFacturaLayout = new javax.swing.GroupLayout(contenFactura);
        contenFactura.setLayout(contenFacturaLayout);
        contenFacturaLayout.setHorizontalGroup(
            contenFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        contenFacturaLayout.setVerticalGroup(
            contenFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenFactura);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalContainerLayout = new javax.swing.GroupLayout(principalContainer);
        principalContainer.setLayout(principalContainerLayout);
        principalContainerLayout.setHorizontalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(principalContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(EtqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        principalContainerLayout.setVerticalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalContainerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(EtqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqTitulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contenFactura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principalContainer;
    // End of variables declaration//GEN-END:variables
}
