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

public class ModificarUsuario extends javax.swing.JFrame {
    Menu ventanaMenu;
    Personas listaPersonas [];   
    
    public ModificarUsuario(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.listaPersonas = listaPersonas;
        
        
        this.ventanaMenu.setVisible(false);
        initAlternComponents();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTitulo = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCedula = new javax.swing.JTextField();
        btnbuscarModificar = new javax.swing.JButton();
        tnNombre = new javax.swing.JLabel();
        tnApellido = new javax.swing.JLabel();
        tnCorreo = new javax.swing.JLabel();
        tnTelefono = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        campoContra = new javax.swing.JTextField();
        tnContraseña = new javax.swing.JLabel();
        btnImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTitulo.setBackground(new java.awt.Color(255, 255, 255));
        btnTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnTitulo.setForeground(new java.awt.Color(0, 0, 0));
        btnTitulo.setText("MODIFICAR USUARIOS");
        jPanel1.add(btnTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        campoNombre.setBackground(new java.awt.Color(204, 204, 204));
        campoNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 210, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CEDULA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 30));

        campoApellido.setBackground(new java.awt.Color(204, 204, 204));
        campoApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 210, 30));

        campoCorreo.setBackground(new java.awt.Color(204, 204, 204));
        campoCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 210, 30));

        campoTelefono.setBackground(new java.awt.Color(204, 204, 204));
        campoTelefono.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 210, 30));

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));
        campoCedula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCedula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 210, 30));

        btnbuscarModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnbuscarModificar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnbuscarModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarModificar.setText("BUSCAR");
        btnbuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 100, 30));

        tnNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tnNombre.setForeground(new java.awt.Color(0, 0, 0));
        tnNombre.setText("NOMBRE:");
        jPanel1.add(tnNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 110, 30));

        tnApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tnApellido.setForeground(new java.awt.Color(0, 0, 0));
        tnApellido.setText("APELLIDO:");
        jPanel1.add(tnApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 110, 30));

        tnCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tnCorreo.setForeground(new java.awt.Color(0, 0, 0));
        tnCorreo.setText("CORREO:");
        jPanel1.add(tnCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 110, 30));

        tnTelefono.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tnTelefono.setForeground(new java.awt.Color(0, 0, 0));
        tnTelefono.setText("TELEFONO:");
        jPanel1.add(tnTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 110, 30));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 100, 30));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 30));

        campoContra.setBackground(new java.awt.Color(204, 204, 204));
        campoContra.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoContra.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 210, 30));

        tnContraseña.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tnContraseña.setForeground(new java.awt.Color(0, 0, 0));
        tnContraseña.setText("CONTRASEÑA:");
        jPanel1.add(tnContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 110, 30));

        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondonumero1.jpg"))); // NOI18N
        jPanel1.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarModificarActionPerformed
        String cedula = campoCedula.getText();
        Personas temporal = this.ventanaMenu.database.buscarUsuario(cedula);
        
        if (temporal != null) {
            habilitarCampo(campoContra);
            habilitarCampo(campoNombre);
            habilitarCampo(campoApellido);
            habilitarCampo(campoCorreo);
            habilitarCampo(campoTelefono);
            
            campoContra.setText(temporal.getContra());
            campoNombre.setText(temporal.getNombre());
            campoApellido.setText(temporal.getApellido());
            campoCorreo.setText(temporal.getCorreo());
            campoTelefono.setText(temporal.getTelefono());
            
            campoContra.requestFocus();
            btnModificar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoContra.setText("");
            campoNombre.setText("");
            campoApellido.setText("");
            campoCorreo.setText("");
            campoTelefono.setText("");
          
            campoCedula.requestFocus();
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnbuscarModificarActionPerformed

    private void btnAtras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtras

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String cedula = campoCedula.getText();
        String contra = campoContra.getText();
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String correo = campoCorreo.getText();
        String telefono = campoTelefono.getText();
     
        Personas temporal = new Personas(cedula, contra, nombre, apellido, correo, telefono);
        
        if (!cedula.equals("") && !contra.equals("") && !nombre.equals("") && !apellido.equals("") && !correo.equals("") && !telefono.equals("") ) {
            boolean proceso = this.ventanaMenu.database.editarUsuario(temporal);
            Alert alerta = new Alert("EXITO", "Datos editados correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnModificarActionPerformed
        
    
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    public void deshabilitarCampo(JTextField campo){
        JTextField referencia = new JTextField();
        campo.setBorder( referencia.getBorder() );
        campo.setEnabled(false);
        campo.setBackground(Color.GRAY );
    }
    
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_modificar_usuario.png") ) );
        

    }
    
    public void validarTodosInputs(){
        validarInput(campoContra);
        validarInput(campoCorreo);
        validarInput(campoTelefono);
        validarInput(campoApellido);
        validarInput(campoNombre);
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
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel btnImagen;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel btnTitulo;
    private javax.swing.JButton btnbuscarModificar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoContra;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tnApellido;
    private javax.swing.JLabel tnContraseña;
    private javax.swing.JLabel tnCorreo;
    private javax.swing.JLabel tnNombre;
    private javax.swing.JLabel tnTelefono;
    // End of variables declaration//GEN-END:variables
}
