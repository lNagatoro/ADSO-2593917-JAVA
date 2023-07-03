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
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoPuesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        campoCedula = new javax.swing.JTextField();
        btnEliminarUsuario = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        campoPelicula = new javax.swing.JTextField();
        campoHora = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoFecha.setBackground(new java.awt.Color(204, 204, 204));
        campoFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoFecha.setForeground(new java.awt.Color(0, 0, 0));
        campoFecha.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 253, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CEDULA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINAR RESERVA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FECHA:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRES:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        campoSala.setBackground(new java.awt.Color(204, 204, 204));
        campoSala.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoSala.setForeground(new java.awt.Color(0, 0, 0));
        campoSala.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 253, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PELICULA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HORA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SALA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 30));

        campoPuesto.setBackground(new java.awt.Color(204, 204, 204));
        campoPuesto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPuesto.setForeground(new java.awt.Color(0, 0, 0));
        campoPuesto.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 253, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N° PUESTO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 460, 100, 30));

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));
        campoCedula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoCedula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 257, 30));

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 30));

        campoNombre.setBackground(new java.awt.Color(204, 204, 204));
        campoNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        campoNombre.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 253, 30));

        campoPelicula.setBackground(new java.awt.Color(204, 204, 204));
        campoPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPelicula.setForeground(new java.awt.Color(0, 0, 0));
        campoPelicula.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 251, 30));

        campoHora.setBackground(new java.awt.Color(204, 204, 204));
        campoHora.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoHora.setForeground(new java.awt.Color(0, 0, 0));
        campoHora.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 251, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 410, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRECIO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        campoPrecio.setBackground(new java.awt.Color(204, 204, 204));
        campoPrecio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(0, 0, 0));
        campoPrecio.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel1.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 251, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo111.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        String cedula_usuario = campoCedula.getText();
        String nom_usuario = campoNombre.getText();
        String nom_pelicula = campoPelicula.getText();
        String precio = campoPrecio.getText();
        String hora = campoHora.getText();
        String fecha = campoFecha.getText();
        String sala = campoSala.getText();
        String puesto = campoPuesto.getText();

        Reserva temporal = new Reserva(cedula_usuario, nom_usuario, nom_pelicula, precio, hora, fecha, sala, puesto);

        if (!cedula_usuario.equals("") && !nom_usuario.equals("") && !nom_pelicula.equals("") && !precio.equals("") && !hora.equals("") && !fecha.equals("") && !sala.equals("") && !puesto.equals("")) {
            boolean proceso = this.ventanaMenu.database.eliminarReserva(temporal);
            Alert alerta = new Alert("EXITO", "Usuario eliminado correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Escriba bien Porfavor.", "error");
            validarTodosInputs();
        }
        
       
        campoNombre.setText("");
        campoPelicula.setText("");
        campoPrecio.setText("");
        campoHora.setText("");
        campoFecha.setText("");
        campoSala.setText("");
        campoPuesto.setText("");
        
 
        campoNombre.setEnabled(true);
        campoPelicula.setEnabled(true);
        campoPrecio.setEnabled(true);
        campoHora.setEnabled(true);
        campoFecha.setEnabled(true);
        campoSala.setEnabled(true);
        campoPuesto.setEnabled(true);

        btnEliminarUsuario.setText("Reserva Eliminada");
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cedula_usuario = campoCedula.getText();
        Reserva temporal = this.ventanaMenu.database.buscarReserva(cedula_usuario);

        if (temporal != null) {
            habilitarCampo(campoNombre);
            habilitarCampo(campoPelicula);
            habilitarCampo(campoPrecio);
            habilitarCampo(campoHora);
            habilitarCampo(campoFecha);
            habilitarCampo(campoSala);
            habilitarCampo(campoPuesto);
            
         
            campoNombre.setText(temporal.getNom_usuario());
            campoPelicula.setText(temporal.getNom_pelicula());
            campoPrecio.setText(temporal.getPrecio());
            campoHora.setText(temporal.getHora());
            campoFecha.setText(temporal.getFecha());
            campoSala.setText(temporal.getSala());
            campoPuesto.setText(temporal.getPuesto());
           
            
            campoNombre.requestFocus();
            btnEliminarUsuario.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoNombre.setText("");
            campoPelicula.setText("");
            campoPrecio.setText("");
            campoHora.setText("");
            campoFecha.setText("");
            campoSala.setText("");
            campoPuesto.setText("");
        
           
            deshabilitarCampo(campoNombre);
            deshabilitarCampo(campoPelicula);
            deshabilitarCampo(campoPrecio);
            deshabilitarCampo(campoHora);
            deshabilitarCampo(campoFecha);
            deshabilitarCampo(campoSala);
            deshabilitarCampo(campoPuesto);
       
            btnEliminarUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            deshabilitarCampo(campoHora);
            deshabilitarCampo(campoFecha);
            deshabilitarCampo(campoSala);
            deshabilitarCampo(campoPuesto);
    }
    
    public void validarTodosInputs(){
       
        validarInput(campoNombre);
        validarInput(campoPelicula);
        validarInput(campoPrecio);
        validarInput(campoHora);
        validarInput(campoFecha);
        validarInput(campoSala);
        validarInput(campoPuesto);
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
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoPuesto;
    private javax.swing.JTextField campoSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
