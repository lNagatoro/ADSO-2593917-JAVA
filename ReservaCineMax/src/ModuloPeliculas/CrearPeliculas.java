package ModuloPeliculas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import Clases.Peliculas;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Date;


public class CrearPeliculas extends javax.swing.JFrame {

    Menu ventanaMenu;
    Peliculas listaPel [];
    
    public CrearPeliculas(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.listaPel = listaPel;
        
        this.ventanaMenu.setVisible(false);
        initComponents();
        initAlternComponents();
        
 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImagen = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();
        campoPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoPelicula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        campoGenero = new javax.swing.JTextField();
        campoBoleto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AGREGAR PELICULAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 0, 280, 29));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 380));

        btnAgregarImagen.setBackground(new java.awt.Color(0, 204, 204));
        btnAgregarImagen.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAgregarImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarImagen.setText("AGREGAR IMAGEN DE LA PELICULA");
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 300, -1));

        campoPrecio.setBackground(new java.awt.Color(153, 153, 153));
        campoPrecio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 250, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRECIO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 86, 29));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENERO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 86, 29));

        btnAgregar.setBackground(new java.awt.Color(0, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        btnAtras.setBackground(new java.awt.Color(0, 204, 204));
        btnAtras.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_camara5.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 120, 120));

        campoPelicula.setBackground(new java.awt.Color(153, 153, 153));
        campoPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoPelicula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 250, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 30, 29));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BOLETO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 86, 29));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NOMBRE:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 86, 29));

        campoId.setBackground(new java.awt.Color(153, 153, 153));
        campoId.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoId.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 80, 30));

        campoGenero.setBackground(new java.awt.Color(153, 153, 153));
        campoGenero.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoGenero.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 250, 30));

        campoBoleto.setBackground(new java.awt.Color(153, 153, 153));
        campoBoleto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        campoBoleto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 222, 250, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondeiro.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 440));

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

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        String Ruta = "";
        
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF","jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            Ruta = jFileChooser.getSelectedFile().getPath();
            Image btnImagen = new ImageIcon(Ruta).getImage();
            ImageIcon mIcono = new ImageIcon(btnImagen.getScaledInstance(this.btnImagen.getWidth(), this.btnImagen.getHeight(), Image.SCALE_SMOOTH));
            
            this.btnImagen.setIcon(mIcono);
        }
    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String id = campoId.getText();
        String imagen = btnImagen.toString();
        String nombre = campoPelicula.getText();
        String precio = campoPrecio.getText();    
        String genero = campoGenero.getText();
        String boleto = campoBoleto.getText();
        Date fecha = new Date();
	String log = fecha.toString();
        
        if (!id.equals("") && !imagen.equals("") && !nombre.equals("") && !precio.equals("") && !log.equals("") && !boleto.equals("") && !genero.equals("")) {
            boolean repetido = false;
            if (!repetido) {

                boolean proceso = this.ventanaMenu.database.insertarPelicula(id, imagen, nombre, precio, log, boleto, genero);

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
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
     public void validarTodosInputs(){
        validarInput(campoId);
        validarInput(campoPelicula);
        validarInput(campoPrecio);
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
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_creacionusuario.png") ) );
    }
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel btnImagen;
    private javax.swing.JTextField campoBoleto;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
