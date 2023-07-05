package ModuloReservas;

import Clases.DataBase;
import Clases.Personas;
import Clases.Peliculas;
import Clases.Reserva;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class CrearReserva extends javax.swing.JFrame {
    
    public Menu ventanaMenu;
    public Reserva listaReset [];
    public Peliculas listaPel [];
    public Personas listaPersonas[];
    public DataBase database;
    
    public CrearReserva(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.database = new DataBase();
        this.listaReset = listaReset;
        this.listaPel = listaPel; 
        this.listaPersonas = listaPersonas;
        
        this.ventanaMenu.setVisible(false);
        initComponents();
        initAlternComponents();
        
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/111imagen324.png") ) );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPuesto = new javax.swing.JTextField();
        btnReserva = new javax.swing.JButton();
        campoPrecio = new javax.swing.JTextField();
        campoCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoFecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnimagen = new javax.swing.JPanel();
        btnImagen = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        campoPelicula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoPuesto.setBackground(new java.awt.Color(204, 204, 204));
        campoPuesto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPuesto.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 160, -1));

        btnReserva.setBackground(new java.awt.Color(0, 0, 0));
        btnReserva.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva.setText("RESERVAR");
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        campoPrecio.setBackground(new java.awt.Color(204, 204, 204));
        campoPrecio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 90, -1));

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

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 52, -1, -1));

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
        jLabel7.setText("PUESTO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 70, 30));

        campoFecha.setBackground(new java.awt.Color(204, 204, 204));
        campoFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoFecha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 240, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRECIO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 61, 30));

        btnimagen.setBackground(new java.awt.Color(204, 204, 204));
        btnimagen.setForeground(new java.awt.Color(0, 0, 0));
        btnimagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondousuarios.jpg"))); // NOI18N
        btnimagen.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 360));

        getContentPane().add(btnimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 361));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        campoPelicula.setBackground(new java.awt.Color(204, 204, 204));
        campoPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPelicula.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 90, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PELICULAS:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 237, 430, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 50, 30));

        campoId.setBackground(new java.awt.Color(204, 204, 204));
        campoId.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoId.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 250, 110, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FECHA:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 60, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fodiu.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = campoCedula.getText();
        Personas temporal = this.ventanaMenu.database.buscarUsuario(cedula);
        
    
        if (temporal != null) {
            habilitarCampo(campoNombre);
            habilitarCampo(campoApellido);
            habilitarCampo(campoCorreo);
            habilitarCampo(campoTelefono);
            
            campoNombre.setText(temporal.getNombre());
            campoApellido.setText(temporal.getApellido());
            campoCorreo.setText(temporal.getCorreo());
            campoTelefono.setText(temporal.getTelefono());
            
            campoNombre.requestFocus();
            btnReserva.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            
            campoNombre.setText("");
            campoApellido.setText("");
            campoCorreo.setText("");
            campoTelefono.setText("");
          
       
            btnReserva.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = campoId.getText();
        Peliculas temporal = this.ventanaMenu.database.buscarPeliculas(id);
        
        
        if (temporal != null) {
            habilitarCampo(campoPrecio);
            habilitarCampo(campoFecha);
            habilitarCampo(campoPelicula);
            
            campoPrecio.setText(temporal.getPrecio());
            campoFecha.setText(temporal.getFecha());
            campoPelicula.setText(temporal.getNombre());
            
       
    
            btnReserva.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            
            campoPrecio.setText("");
            campoFecha.setText("");
            campoPelicula.setText("");
       
            btnReserva.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        String cedula_usuario = campoCedula.getText();
        String nom_usuario = campoNombre.getText();
        String ape_usuario = campoApellido.getText();
        String correo = campoCorreo.getText();
        String telefono = campoTelefono.getText();
        String nom_pelicula = campoPelicula.getText();
        String precio = campoPrecio.getText();
        String fecha = campoFecha.getText();
        String puesto = campoPuesto.getText();
        

        if (!cedula_usuario.equals("") && !nom_usuario.equals("") && !ape_usuario.equals("") && !correo.equals("") && !telefono.equals("") && !nom_pelicula.equals("") && !precio.equals("") && !fecha.equals("")  && !puesto.equals("")) {
            boolean repetido = false;
            if (!repetido) {

                boolean proceso = this.ventanaMenu.database.insertarReserva(cedula_usuario, nom_usuario, ape_usuario, correo, telefono, nom_pelicula, precio, fecha,puesto);

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
    }//GEN-LAST:event_btnReservaActionPerformed

    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    
    public void validarTodosInputs(){
        validarInput(campoPrecio);
        validarInput(campoFecha);
        validarInput(campoPelicula);
        
    
        
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnImagen;
    private javax.swing.JButton btnReserva;
    private javax.swing.JPanel btnimagen;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoPuesto;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
