package Principal;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Alert extends javax.swing.JFrame {

    
    public Alert(String titulo, String mensaje, String tipo) {
       
        initComponents();
         
        String textoIcono = "";
        if (tipo.equals("success")) {
            textoIcono = "icono_success.png";
        }else if (tipo.equals("error")) {
            textoIcono = "icono_error.png";
        }else if (tipo.equals("warning")) {
            textoIcono = "icono_warning.png";
        }
        Image icono = getToolkit().getImage(ClassLoader.getSystemResource("imagenes/"+textoIcono));
        icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        etqImagen.setIcon(new ImageIcon(icono));
        
        etqTitulo.setText(titulo);
        etqMensaje.setText(mensaje);
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        setTitle("Alerta");
        setVisible(true);
        
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqImagen = new javax.swing.JLabel();
        etqMensaje = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        etqTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqImagen.setOpaque(true);
        getContentPane().add(etqImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 58, 56));

        etqMensaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etqMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMensaje.setText("XXXXXXXXXXXXxxx");
        etqMensaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        etqMensaje.setOpaque(true);
        getContentPane().add(etqMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 37, 213, 25));

        btnAceptar.setBackground(new java.awt.Color(0, 0, 102));
        btnAceptar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setFocusable(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 68, 95, 35));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("XXXXXx");
        etqTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        etqTitulo.setOpaque(true);
        getContentPane().add(etqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 6, 213, 25));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqMensaje;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
