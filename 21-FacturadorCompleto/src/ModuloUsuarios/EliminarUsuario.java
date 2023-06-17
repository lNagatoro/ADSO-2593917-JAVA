
package ModuloUsuarios;

import Clases.Persona;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.sql.*;

public class EliminarUsuario extends javax.swing.JFrame {

    Menu ventanaMenu;
    Persona listaPersonas [];
    String tipoLista;
    
    public EliminarUsuario(Menu ventanaMenu, Persona [] listaPersonas, String tipoLista) {
        this.ventanaMenu = ventanaMenu;
        this.listaPersonas = listaPersonas;
        this.tipoLista = tipoLista;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etTitulo = new javax.swing.JLabel();
        contenedorDatosEliminarUser = new javax.swing.JPanel();
        etqBuscarCedula = new javax.swing.JLabel();
        campoBusCedula = new javax.swing.JTextField();
        btnBuscarCedula = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etq_Buscando = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        btnEliminarUsuario = new javax.swing.JButton();
        btnCancelarEliminar = new javax.swing.JButton();
        campoTelefono = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorTitulo.setBackground(new java.awt.Color(0, 0, 102));

        etTitulo.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        etTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etTitulo.setText("ELIMINAR");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorDatosEliminarUser.setBackground(new java.awt.Color(153, 153, 255));

        etqBuscarCedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqBuscarCedula.setForeground(new java.awt.Color(0, 0, 0));
        etqBuscarCedula.setText("Cedula:");

        campoBusCedula.setBackground(new java.awt.Color(255, 255, 255));
        campoBusCedula.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscarCedula.setBackground(new java.awt.Color(0, 0, 153));
        btnBuscarCedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscarCedula.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCedula.setText("BUSCAR");
        btnBuscarCedula.setToolTipText("");
        btnBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCedulaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        etq_Buscando.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_Buscando.setForeground(new java.awt.Color(0, 0, 0));
        etq_Buscando.setText("Buscando Usuario...");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombres:");
        jLabel4.setToolTipText("");

        campoNombres.setBackground(new java.awt.Color(255, 255, 255));
        campoNombres.setForeground(new java.awt.Color(0, 0, 0));
        campoNombres.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellidos:");

        campoApellidos.setBackground(new java.awt.Color(255, 255, 255));
        campoApellidos.setForeground(new java.awt.Color(0, 0, 0));
        campoApellidos.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnCancelarEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelarEliminar.setText("CANCELAR");
        btnCancelarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEliminarActionPerformed(evt);
            }
        });

        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));

        campoDireccion.setBackground(new java.awt.Color(255, 255, 255));
        campoDireccion.setForeground(new java.awt.Color(0, 0, 0));

        campoEmail.setBackground(new java.awt.Color(255, 255, 255));
        campoEmail.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Telefono:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Direccion:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email:");

        javax.swing.GroupLayout contenedorDatosEliminarUserLayout = new javax.swing.GroupLayout(contenedorDatosEliminarUser);
        contenedorDatosEliminarUser.setLayout(contenedorDatosEliminarUserLayout);
        contenedorDatosEliminarUserLayout.setHorizontalGroup(
            contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                        .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etq_Buscando, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorDatosEliminarUserLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                                                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(campoEmail)
                                                    .addComponent(campoDireccion)
                                                    .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                                        .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                                            .addComponent(btnCancelarEliminar)
                                            .addGap(37, 37, 37)
                                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etqBuscarCedula)
                                .addGap(3, 3, 3)
                                .addComponent(campoBusCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCedula)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contenedorDatosEliminarUserLayout.setVerticalGroup(
            contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosEliminarUserLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBusCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqBuscarCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_Buscando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(contenedorDatosEliminarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorDatosEliminarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatosEliminarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEliminarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarEliminarActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

        String cedula = campoBusCedula.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String direccion = campoDireccion.getText();
        String telefono = campoTelefono.getText();
        String email = campoEmail.getText();

        Persona temporal = new Persona(cedula, nombres, apellidos, telefono, direccion, email);

        if (!cedula.equals("") && !nombres.equals("") && !apellidos.equals("") && !direccion.equals("") && !telefono.equals("") && !email.equals("") ) {
            boolean proceso = (this.tipoLista.equalsIgnoreCase("CLIENTES"))? this.ventanaMenu.database.eliminarCliente(temporal) : this.ventanaMenu.database.eliminarVendedor(temporal);
            Alert alerta = new Alert("EXITO", "Usuario eliminado correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Debe Buscar a un usuario.", "error");
            validarTodosInputs();
        }

        campoNombres.setText("");
        campoApellidos.setText("");
        campoBusCedula.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
        campoEmail.setText("");
        
        campoNombres.setEnabled(true);
        campoApellidos.setEnabled(true);
        campoBusCedula.setEnabled(true);
        campoTelefono.setEnabled(true);
        campoDireccion.setEnabled(true);
        campoEmail.setEnabled(true);

        etq_Buscando.setText("Usuario Eliminado");
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCedulaActionPerformed
        String cedula = campoBusCedula.getText();
        Persona temporal = (this.tipoLista.equalsIgnoreCase("CLIENTES"))? this.ventanaMenu.database.buscarCliente(cedula) : this.ventanaMenu.database.buscarVendedor(cedula);

        if (temporal != null) {
            habilitarCampo(campoNombres);
            habilitarCampo(campoApellidos);
            habilitarCampo(campoTelefono);
            habilitarCampo(campoDireccion);
            habilitarCampo(campoEmail);
            campoNombres.setText(temporal.getNombres());
            campoApellidos.setText(temporal.getApellidos());
            campoBusCedula.setText(temporal.getCedula());
            campoTelefono.setText(temporal.getTelefono());
            campoDireccion.setText(temporal.getDireccion());
            campoEmail.setText(temporal.getEmail());
            campoNombres.requestFocus();
            btnEliminarUsuario.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoNombres.setText("");
            campoApellidos.setText("");
            campoTelefono.setText("");
            campoDireccion.setText("");
            campoEmail.setText("");
            deshabilitarCampo(campoNombres);
            deshabilitarCampo(campoApellidos);
            deshabilitarCampo(campoTelefono);
            deshabilitarCampo(campoDireccion);
            deshabilitarCampo(campoEmail);
       
            btnEliminarUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarCedulaActionPerformed

    private void eventoKeyCampos(java.awt.event.KeyEvent evt) {                                 
        JTextField campo = (JTextField) evt.getSource();
        validarInput(campo);
    }                                

    private void eventoKeyCedula(java.awt.event.KeyEvent evt) {                                 
        String cedula = campoBusCedula.getText();
        campoNombres.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
        campoEmail.setText("");
        deshabilitarCampo(campoNombres);
        deshabilitarCampo(campoApellidos);
        deshabilitarCampo(campoTelefono);
        deshabilitarCampo(campoDireccion);
        deshabilitarCampo(campoEmail);
        btnEliminarUsuario.setEnabled(false);
    }                                

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
        setTitle("Usuarios");
        etTitulo.setText("ELIMINAR "+this.tipoLista);
        
        deshabilitarCampo(campoNombres);
        deshabilitarCampo(campoApellidos);
        deshabilitarCampo(campoTelefono);
        deshabilitarCampo(campoDireccion);
        deshabilitarCampo(campoEmail);
    }
    
    public void validarTodosInputs(){
        validarInput(campoEmail);
        validarInput(campoDireccion);
        validarInput(campoTelefono);
        validarInput(campoApellidos);
        validarInput(campoNombres);
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
    private javax.swing.JButton btnCancelarEliminar;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoBusCedula;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorDatosEliminarUser;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etTitulo;
    private javax.swing.JLabel etqBuscarCedula;
    private javax.swing.JLabel etq_Buscando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
