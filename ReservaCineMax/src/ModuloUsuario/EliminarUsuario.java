package ModuloUsuario;

import Clases.Personas;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class EliminarUsuario extends javax.swing.JFrame {
    Menu ventanaMenu;
    Personas listaPersonas [];
    
    public EliminarUsuario(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.listaPersonas = listaPersonas;
        
        this.ventanaMenu.setVisible(false);
        initComponents();
        initAlternComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoCedula = new javax.swing.JTextField();
        btnBuscarCedula = new javax.swing.JButton();
        campoTelefono = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoContra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));
        campoCedula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCedula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 260, 30));

        btnBuscarCedula.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarCedula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscarCedula.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCedula.setText("BUSCAR");
        btnBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, 30));

        campoTelefono.setBackground(new java.awt.Color(204, 204, 204));
        campoTelefono.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 260, 30));

        campoApellido.setBackground(new java.awt.Color(204, 204, 204));
        campoApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 260, 30));

        campoCorreo.setBackground(new java.awt.Color(204, 204, 204));
        campoCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 260, 30));

        campoNombre.setBackground(new java.awt.Color(204, 204, 204));
        campoNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 260, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 110, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORREO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TELEFONO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 110, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ELIMINAR USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 260, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEDULA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 110, 30));

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 110, 40));

        jPanel2.setBackground(new java.awt.Color(0, 161, 174));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada_pelicula2.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar5.5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 490));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 446, 100, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONTRASEÑA:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 110, 30));

        campoContra.setBackground(new java.awt.Color(204, 204, 204));
        campoContra.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoContra.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondonumero6.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        String cedula = campoCedula.getText();
        String contra = campoContra.getText();  
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String correo = campoCorreo.getText();
        String telefono = campoTelefono.getText();

        Personas temporal = new Personas(cedula, contra, nombre, apellido, correo, telefono);

        if (!cedula.equals("")  && !contra.equals("") && !nombre.equals("") && !apellido.equals("") && !correo.equals("") && !telefono.equals("")) {
            boolean proceso = this.ventanaMenu.database.eliminarUsuario(temporal);
            Alert alerta = new Alert("EXITO", "Usuario eliminado correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Escriba bien Porfavor.", "error");
            validarTodosInputs();
        }
        
        campoContra.setText("");
        campoNombre.setText("");
        campoApellido.setText("");
        campoCorreo.setText("");
        campoTelefono.setText("");
        
        campoContra.setEnabled(true);
        campoNombre.setEnabled(true);
        campoApellido.setEnabled(true);
        campoCorreo.setEnabled(true);
        campoTelefono.setEnabled(true);

        btnEliminarUsuario.setText("Usuario Eliminado");
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCedulaActionPerformed
        String cedula = campoCedula.getText();
        Personas temporal = this.ventanaMenu.database.buscarUsuario(cedula);

        if (temporal != null) {
            habilitarCampo(campoNombre);
            habilitarCampo(campoContra);
            habilitarCampo(campoApellido);
            habilitarCampo(campoCorreo);
            habilitarCampo(campoTelefono);
            
            campoContra.setText(temporal.getContra());
            campoNombre.setText(temporal.getNombre());
            campoApellido.setText(temporal.getApellido());
            campoCorreo.setText(temporal.getCorreo());
            campoTelefono.setText(temporal.getTelefono());
            
            campoNombre.requestFocus();
            btnEliminarUsuario.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoContra.setText("");
            campoNombre.setText("");
            campoApellido.setText("");
            campoCorreo.setText("");
            campoTelefono.setText("");
            
            deshabilitarCampo(campoContra);
            deshabilitarCampo(campoNombre);
            deshabilitarCampo(campoApellido);
            deshabilitarCampo(campoCorreo);
            deshabilitarCampo(campoTelefono);
       
            btnEliminarUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarCedulaActionPerformed

    private void btnAtras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtras
                                  

    public void deshabilitarCampo(JTextField campo){
        JTextField referencia = new JTextField();
        campo.setBorder( referencia.getBorder() );
        campo.setEnabled(false);
        campo.setBackground(Color.GRAY );
    }
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        deshabilitarCampo(campoContra);
        deshabilitarCampo(campoNombre);
        deshabilitarCampo(campoApellido);
        deshabilitarCampo(campoCorreo);
        deshabilitarCampo(campoTelefono);
    }
    
    public void validarTodosInputs(){
        validarInput(campoContra);
        validarInput(campoNombre);
        validarInput(campoApellido);
        validarInput(campoCorreo);
        validarInput(campoTelefono);
    }
    
    public void validarInput(JTextField campo){
        if (campo.getText().equals("")) {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo.setBorder(borderRojo);
            campo.requestFocus();
        }else{
            JTextField referencia = new JTextField();
            campo.setBorder( referencia.getBorder() );
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCedula;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoContra;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
