package ModuloReservas;

import Clases.Reserva;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class EliminarReserva extends javax.swing.JFrame {

    Menu ventanaMenu;
    Reserva listaPersonas [];
    
    public EliminarReserva(Menu ventanaMenu) {
        
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
        campoFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoSala = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoPuesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        campoCedula = new javax.swing.JTextField();
        btnEliminarUsuario = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        campoPelicula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoFecha.setBackground(new java.awt.Color(204, 204, 204));
        campoFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoFecha.setForeground(new java.awt.Color(0, 0, 0));
        campoFecha.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 200, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINAR RESERVA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 420, 50));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FECHA:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 80, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRES:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        campoSala.setBackground(new java.awt.Color(204, 204, 204));
        campoSala.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoSala.setForeground(new java.awt.Color(0, 0, 0));
        campoSala.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 200, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PELICULA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 80, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SALA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 80, 30));

        campoPuesto.setBackground(new java.awt.Color(204, 204, 204));
        campoPuesto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPuesto.setForeground(new java.awt.Color(0, 0, 0));
        campoPuesto.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 210, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 80, 30));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 100, 30));

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));
        campoCedula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCedula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 257, 30));

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 30));

        campoNombre.setBackground(new java.awt.Color(204, 204, 204));
        campoNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        campoNombre.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 210, 30));

        campoPelicula.setBackground(new java.awt.Color(204, 204, 204));
        campoPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPelicula.setForeground(new java.awt.Color(0, 0, 0));
        campoPelicula.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 200, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 750, 10));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PRECIO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, 30));

        campoPrecio.setBackground(new java.awt.Color(204, 204, 204));
        campoPrecio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(0, 0, 0));
        campoPrecio.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 200, 30));

        campoApellido.setBackground(new java.awt.Color(204, 204, 204));
        campoApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(0, 0, 0));
        campoApellido.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 210, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("APELLIDO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        campoCorreo.setBackground(new java.awt.Color(204, 204, 204));
        campoCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        campoCorreo.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 210, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CORREO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        campoTelefono.setBackground(new java.awt.Color(204, 204, 204));
        campoTelefono.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        campoTelefono.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 210, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("TELEFONO:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        campoId.setBackground(new java.awt.Color(204, 204, 204));
        campoId.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoId.setForeground(new java.awt.Color(0, 0, 0));
        campoId.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 200, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("N° PUESTO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondonumero3.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        
        String cedula_usuario = campoCedula.getText();
        String nom_usuario = campoNombre.getText();
        String ape_usuario = campoApellido.getText();
        String correo = campoCorreo.getText();
        String telefono = campoTelefono.getText();
        String nom_pelicula = campoPelicula.getText();
        String precio = campoPrecio.getText();
        String fecha = campoFecha.getText();
        String puesto = campoPuesto.getText();

        Reserva temporal = new Reserva(cedula_usuario, nom_usuario, ape_usuario, correo, telefono, nom_pelicula, precio, fecha, puesto);

        if (!cedula_usuario.equals("") && !nom_usuario.equals("") && !ape_usuario.equals("") && !correo.equals("") && !telefono.equals("")&& !nom_pelicula.equals("") && !precio.equals("") && !puesto.equals("")) {
            boolean proceso = this.ventanaMenu.database.eliminarReserva(temporal);
            Alert alerta = new Alert("EXITO", "Usuario eliminado correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Escriba bien Porfavor.", "error");
            validarTodosInputs();
        }
        
       
        campoNombre.setText("");
        campoPelicula.setText("");
        campoPrecio.setText("");
        campoApellido.setText("");
        campoCorreo.setText("");
        campoTelefono.setText("");
        campoFecha.setText("");
        campoSala.setText("");
        campoPuesto.setText("");
        
 
        campoNombre.setEnabled(true);
        campoPelicula.setEnabled(true);
        campoPrecio.setEnabled(true);
        campoApellido.setEnabled(true);
        campoCorreo.setEnabled(true);
        campoTelefono.setEnabled(true);
        campoFecha.setEnabled(true);
        campoSala.setEnabled(true);
        campoPuesto.setEnabled(true);

        btnEliminarUsuario.setText("Reserva Eliminada");
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula_usuario = campoCedula.getText();
        Reserva temporal = this.ventanaMenu.database.buscarReserva(cedula_usuario);

        if (temporal != null) {
            habilitarCampo(campoNombre);
            habilitarCampo(campoPelicula);
            habilitarCampo(campoPrecio);
            habilitarCampo(campoApellido);
            habilitarCampo(campoCorreo);
            habilitarCampo(campoTelefono);
            habilitarCampo(campoFecha);
            habilitarCampo(campoPuesto);
            
         
            campoNombre.setText(temporal.getNom_usuario());
            campoPelicula.setText(temporal.getNom_pelicula());
            campoPrecio.setText(temporal.getPrecio());
            campoApellido.setText(temporal.getApe_usuario());
            campoCorreo.setText(temporal.getCorreo());
            campoTelefono.setText(temporal.getTelefono());
            campoFecha.setText(temporal.getFecha());
            campoPuesto.setText(temporal.getPuesto());
           
            
            campoCedula.requestFocus();
            btnEliminarUsuario.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoNombre.setText("");
            campoPelicula.setText("");
            campoPrecio.setText("");
            campoApellido.setText("");
            campoCorreo.setText("");
            campoTelefono.setText("");
            campoFecha.setText("");
            campoSala.setText("");
            campoPuesto.setText("");
        
           
            deshabilitarCampo(campoNombre);
            deshabilitarCampo(campoPelicula);
            deshabilitarCampo(campoPrecio);
            deshabilitarCampo(campoApellido);
            deshabilitarCampo(campoFecha);
            deshabilitarCampo(campoTelefono);
            deshabilitarCampo(campoCorreo);
            deshabilitarCampo(campoPuesto);
       
            btnEliminarUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
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
        
            deshabilitarCampo(campoNombre);
            deshabilitarCampo(campoPelicula);
            deshabilitarCampo(campoPrecio);
            deshabilitarCampo(campoApellido);
            deshabilitarCampo(campoFecha);
            deshabilitarCampo(campoTelefono);
            deshabilitarCampo(campoCorreo);
            deshabilitarCampo(campoPuesto);
    }
    
    public void validarTodosInputs(){
       
        validarInput(campoNombre);
        validarInput(campoPelicula);
        validarInput(campoPrecio);
        validarInput(campoApellido);
        validarInput(campoFecha);
        validarInput(campoCorreo);
        validarInput(campoPuesto);
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
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoPuesto;
    private javax.swing.JTextField campoSala;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
