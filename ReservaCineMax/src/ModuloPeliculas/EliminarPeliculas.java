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

public class EliminarPeliculas extends javax.swing.JFrame {
    Menu ventanaMenu;
    Peliculas listaPel [];   
 
    
    public EliminarPeliculas(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.listaPel = listaPel;
        
        
        this.ventanaMenu.setVisible(false);
        initAlternComponents();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnImagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        campoFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        campoPelicula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoBoleto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELIMINIAR PELICULA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 296, 29));

        campoId.setBackground(new java.awt.Color(153, 153, 153));
        campoId.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoId.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 256, 30));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iron-man-3-poster-1551691491.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 24, 296, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 86, 29));

        campoPrecio.setBackground(new java.awt.Color(153, 153, 153));
        campoPrecio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 256, 30));

        campoFecha.setBackground(new java.awt.Color(153, 153, 153));
        campoFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoFecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 256, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 86, 29));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 86, 29));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("ATRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 204, 204));
        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        campoPelicula.setBackground(new java.awt.Color(153, 153, 153));
        campoPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPelicula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 256, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOMBRE:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 86, 29));

        campoGenero.setBackground(new java.awt.Color(153, 153, 153));
        campoGenero.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoGenero.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 256, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENERO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 86, 29));

        campoBoleto.setBackground(new java.awt.Color(153, 153, 153));
        campoBoleto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoBoleto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 256, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BOLETO;");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 86, 29));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondeiro.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

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

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        String id = campoId.getText();
        String nombre = campoPelicula.getText();
        String precio = campoPrecio.getText();
     
        String fecha = campoFecha.getText();
        String boleto = campoBoleto.getText();
        String genero = campoGenero.getText();
        String imagen= btnImagen.toString();
   
        
        Peliculas temporal = new Peliculas(id, imagen, nombre, precio, fecha, boleto, genero);

        if (!id.equals("") && !imagen.equals("") && !nombre.equals("") && !precio.equals("") && !boleto.equals("") && !genero.equals("")) {
            boolean proceso = this.ventanaMenu.database.eliminarPelicula(temporal);
            Alert alerta = new Alert("EXITO", "Usuario eliminado correctamente.", "success");
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Escriba bien Porfavor.", "error");
            validarTodosInputs();
        }
        
       
        campoPelicula.setText("");
        campoPrecio.setText("");
       
        campoFecha.setText("");
        campoBoleto.setText("");
        campoGenero.setText("");
        
        
        campoBoleto.setEnabled(true);
        campoGenero.setEnabled(true);
        campoPelicula.setEnabled(true);
        campoPrecio.setEnabled(true);
       
        campoFecha.setEnabled(true);

        btnEliminarUsuario.setText("Pelicula Eliminada");
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
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
            
            campoId.requestFocus();
            btnEliminarUsuario.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            campoPelicula.setText(""); 
            campoPrecio.setText("");
          
            campoFecha.setText("");
            campoBoleto.setText("");
            campoGenero.setText("");
        
            btnEliminarUsuario.setEnabled(false);
        }
        
        
            
           
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    
   
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_error.png") ) );
        
       
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JLabel btnImagen;
    private javax.swing.JTextField campoBoleto;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoPrecio;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
}
