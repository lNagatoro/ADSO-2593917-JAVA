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


public class CrearPersona extends javax.swing.JFrame {
    Menu ventanaMenu;
    Personas listaPersonas [];
    
    public CrearPersona(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.listaPersonas = listaPersonas;
        
        this.ventanaMenu.setVisible(false);
        initComponents();
        initAlternComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCanselar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondousuarios.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 440));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userInicio.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 360, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRO DE USUARIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 300, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CEDULA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 90, 30));

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));
        campoCedula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        getContentPane().add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 220, 30));

        campoNombre.setBackground(new java.awt.Color(204, 204, 204));
        campoNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 230, 220, 30));

        campoApellido.setBackground(new java.awt.Color(204, 204, 204));
        campoApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 270, 220, 30));

        campoCorreo.setBackground(new java.awt.Color(204, 204, 204));
        campoCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 310, 220, 30));

        campoTelefono.setBackground(new java.awt.Color(204, 204, 204));
        campoTelefono.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 350, 220, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("APELLIDO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CORREO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 309, 90, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TELEFONO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 350, 90, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, 40));

        btnCanselar.setBackground(new java.awt.Color(153, 153, 153));
        btnCanselar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCanselar.setForeground(new java.awt.Color(0, 0, 0));
        btnCanselar.setText("ATRAS");
        btnCanselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanselarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCanselar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 120, 40));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedula = campoCedula.getText();
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String correo = campoCorreo.getText();
        String telefono = campoTelefono.getText();

        if (!cedula.equals("") && !nombre.equals("") && !apellido.equals("") && !correo.equals("") && !telefono.equals("")) {
            boolean repetido = false;
            if (!repetido) {

                boolean proceso = this.ventanaMenu.database.insertarUsuario(cedula, nombre, apellido, correo, telefono);

                this.ventanaMenu.setVisible(true);
                this.ventanaMenu.alertCreacionUsuario();
                dispose();
            }else{
                Alert alerta = new Alert("CODIGO", "El codigo ingresado se encuentra repetido.", "error");
            }
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
     
     
    
    public void validarTodosInputs(){
        validarInput(campoCedula);
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
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_creacionusuario.png") ) );
    }
    
    
    private void btnCanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanselarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCanselarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanselar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
