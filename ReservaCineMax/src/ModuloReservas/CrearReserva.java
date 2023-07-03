package ModuloReservas;

import java.awt.Image;
import javax.swing.ImageIcon;




public class CrearReserva extends javax.swing.JFrame {

    
    public CrearReserva() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnPrecio = new javax.swing.JTextField();
        btnHora = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        campoCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnFecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnimagen = new javax.swing.JPanel();
        btnImagen = new javax.swing.JLabel();
        campoSala2 = new javax.swing.JCheckBox();
        campoSala1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PUESTO");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 341, -1, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 341, 93, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RESERVAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        btnPrecio.setBackground(new java.awt.Color(204, 204, 204));
        btnPrecio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPrecio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 243, 164, -1));

        btnHora.setBackground(new java.awt.Color(204, 204, 204));
        btnHora.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnHora.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btnHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 285, 132, -1));

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PELICULAS" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 243, 148, -1));

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));
        campoCedula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCedula.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 16, 286, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESERVACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 10, -1, -1));

        campoApellido.setBackground(new java.awt.Color(204, 204, 204));
        campoApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 126, 286, 30));

        campoNombre.setBackground(new java.awt.Color(204, 204, 204));
        campoNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 89, 286, 30));

        campoTelefono.setBackground(new java.awt.Color(204, 204, 204));
        campoTelefono.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 200, 286, 30));

        campoCorreo.setBackground(new java.awt.Color(204, 204, 204));
        campoCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 163, 286, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 52, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRES:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 88, 93, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEDULA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 15, 93, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDOS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 125, 93, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TELEFONO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 199, 93, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CORREO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 162, 93, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FECHA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 284, 61, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HORA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 284, -1, 30));

        btnFecha.setBackground(new java.awt.Color(204, 204, 204));
        btnFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnFecha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 285, 125, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRECIO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 242, 61, 30));

        btnimagen.setBackground(new java.awt.Color(204, 204, 204));
        btnimagen.setForeground(new java.awt.Color(0, 0, 0));
        btnimagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnimagen.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 360));

        getContentPane().add(btnimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 361));

        campoSala2.setBackground(new java.awt.Color(153, 153, 153));
        campoSala2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoSala2.setForeground(new java.awt.Color(0, 0, 0));
        campoSala2.setText("SALA 2");
        getContentPane().add(campoSala2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 100, 30));

        campoSala1.setBackground(new java.awt.Color(153, 153, 153));
        campoSala1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoSala1.setForeground(new java.awt.Color(0, 0, 0));
        campoSala1.setText("SALA 1");
        getContentPane().add(campoSala1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 100, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fodiu.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnFecha;
    private javax.swing.JTextField btnHora;
    private javax.swing.JLabel btnImagen;
    private javax.swing.JTextField btnPrecio;
    private javax.swing.JPanel btnimagen;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JCheckBox campoSala1;
    private javax.swing.JCheckBox campoSala2;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
