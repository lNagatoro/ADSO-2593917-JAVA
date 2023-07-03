package ModuloPeliculas;


import Clases.Peliculas;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class ModificarPeliculas extends javax.swing.JFrame {
    Menu ventanaMenu;
    Peliculas listaPel [];  
    
    public ModificarPeliculas(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.listaPel = listaPel;
        
        
        this.ventanaMenu.setVisible(false);
        initAlternComponents();
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImagen = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        campoPelicula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoBoleto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MODIFICAR PELICULA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 19, 296, 29));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 54, 296, 380));

        campoPrecio.setBackground(new java.awt.Color(153, 153, 153));
        campoPrecio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 86, 29));

        btnModificar.setBackground(new java.awt.Color(0, 204, 204));
        btnModificar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("BUSCAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ATRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, -1, -1));

        campoPelicula.setBackground(new java.awt.Color(153, 153, 153));
        campoPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPelicula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 250, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 90, 29));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FECHA:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 86, 29));

        campoFecha.setBackground(new java.awt.Color(153, 153, 153));
        campoFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoFecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 250, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NOMBRE:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 86, 29));

        campoId.setBackground(new java.awt.Color(153, 153, 153));
        campoId.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoId.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 250, 30));

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BOLETO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 86, 29));

        campoBoleto.setBackground(new java.awt.Color(153, 153, 153));
        campoBoleto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoBoleto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 250, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GENERO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 86, 29));

        campoGenero.setBackground(new java.awt.Color(153, 153, 153));
        campoGenero.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoGenero.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 250, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondeiro.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String id = campoId.getText();
        Peliculas temporal = this.ventanaMenu.database.buscarPeliculas(id);
        
        if (temporal != null) {
            habilitarCampo(campoPelicula);
            habilitarCampo(campoPrecio);

            habilitarCampo(campoFecha);
            habilitarCampo(campoBoleto);
            habilitarCampo(campoGenero);
            
            campoPelicula.setText(temporal.getNombre());
            campoPrecio.setText(temporal.getPrecio());
        
            campoFecha.setText(temporal.getFecha());
            campoBoleto.setText(temporal.getBoleto());
            campoGenero.setText(temporal.getGenero());
            
            campoPelicula.requestFocus();
            btnModificar.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoPelicula.setText("");
            campoPrecio.setText("");
          
            campoFecha.setText("");
            campoBoleto.setText("");
            campoGenero.setText("");
          
            campoId.requestFocus();
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = campoId.getText();
        String nombre = campoPelicula.getText();
        String precio = campoPrecio.getText();
   
        String fecha = campoFecha.getText();
        String boleto = campoBoleto.getText();
        String genero = campoGenero.getText();
        String imagen = btnImagen.getText();
       
        
        Peliculas temporal = new Peliculas(id, imagen, nombre, precio, fecha, boleto, genero);
        
        if (!id.equals("") && !nombre.equals("") && !precio.equals("") && !fecha.equals("") && !boleto.equals("") && !genero.equals("") ) {
            boolean proceso = this.ventanaMenu.database.editarPelicula(temporal);
            Alert alerta = new Alert("EXITO", "Datos editados correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
        
        validarInput(campoPelicula);
        validarInput(campoPrecio);
        
        validarInput(campoFecha);
        validarInput(campoBoleto);
        validarInput(campoGenero);
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
    private javax.swing.JLabel btnImagen;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField campoBoleto;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
