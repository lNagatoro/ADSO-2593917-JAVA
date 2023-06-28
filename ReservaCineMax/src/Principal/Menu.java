package Principal;


//--------------
import Clases.DataBase;
import Clases.Personas;
import Clases.Peliculas;
import Clases.Reserva;
//------------------------
import ModuloPeliculas.CrearPeliculas;
import ModuloPeliculas.EliminarPeliculas;
import ModuloPeliculas.ModificarPeliculas;
import ModuloPeliculas.ListarPeliculas;
//------------------------
import ModuloReservas.CrearReserva;
import ModuloReservas.EliminarReserva;
import ModuloReservas.ListarReserva;
//------------------------
import ModuloUsuario.CrearPersona;
import ModuloUsuario.EliminarUsuario;
import ModuloUsuario.ListarUsuarios;
import ModuloUsuario.ModificarUsuario;
//------------------------
public class Menu extends javax.swing.JFrame {
    
       public DataBase database;
       public Personas listaPersonas [];
       public Peliculas listaPel [];
       public Reserva listaReset [];

    public Menu() {
      
        
        this.database = new DataBase();
        this.listaPersonas = new Personas [100];
        this.listaPel = new Peliculas [100];
        this.listaReset = new Reserva [100];
        
        initComponents();
        initAlternComponents();
       
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_aplicacion.png") ) );
    }

    public void alertCreacionUsuario(){
        Alert alerta = new Alert("CORRECTO", "Se ha creado un nuevo usuario.", "success");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        hacerReserva = new javax.swing.JButton();
        eliminarReserva = new javax.swing.JButton();
        listaReserva = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        crearPelicula = new javax.swing.JButton();
        eliminarPeliculas = new javax.swing.JButton();
        modificarPelicula = new javax.swing.JButton();
        listaPeliculas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        crearUsuario = new javax.swing.JButton();
        eliminarUsuario = new javax.swing.JButton();
        modificiarUsuario = new javax.swing.JButton();
        listaUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CLIENTES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        hacerReserva.setBackground(new java.awt.Color(255, 0, 0));
        hacerReserva.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        hacerReserva.setText("HACER RESERVAR");
        hacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerReservaActionPerformed(evt);
            }
        });

        eliminarReserva.setBackground(new java.awt.Color(255, 0, 0));
        eliminarReserva.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        eliminarReserva.setText("ELIMINAR RESERVA");
        eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservaActionPerformed(evt);
            }
        });

        listaReserva.setBackground(new java.awt.Color(255, 0, 0));
        listaReserva.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        listaReserva.setText("LISTA RESERVAS");
        listaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hacerReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(listaReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(hacerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(eliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(listaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        crearPelicula.setBackground(new java.awt.Color(255, 0, 0));
        crearPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        crearPelicula.setText("CREAR PELICULAS");
        crearPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPeliculaActionPerformed(evt);
            }
        });

        eliminarPeliculas.setBackground(new java.awt.Color(255, 0, 0));
        eliminarPeliculas.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        eliminarPeliculas.setText("ELIMINAR PELICULA");
        eliminarPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPeliculasActionPerformed(evt);
            }
        });

        modificarPelicula.setBackground(new java.awt.Color(255, 0, 0));
        modificarPelicula.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        modificarPelicula.setText("MODIFICAR PELICULA");
        modificarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPeliculaActionPerformed(evt);
            }
        });

        listaPeliculas.setBackground(new java.awt.Color(255, 0, 0));
        listaPeliculas.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        listaPeliculas.setText("LISTA PELICULAS");
        listaPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPeliculasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarPeliculas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(listaPeliculas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(crearPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 69)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CINEMA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 320, 100));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PELICULAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 180, -1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        crearUsuario.setBackground(new java.awt.Color(255, 0, 0));
        crearUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        crearUsuario.setText("CREAR USUARIO");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });

        eliminarUsuario.setBackground(new java.awt.Color(255, 0, 0));
        eliminarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        eliminarUsuario.setText("ELIMINAR USUARIO");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });

        modificiarUsuario.setBackground(new java.awt.Color(255, 0, 0));
        modificiarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        modificiarUsuario.setText("MODIFICAR USUARIO");
        modificiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificiarUsuarioActionPerformed(evt);
            }
        });

        listaUsuario.setBackground(new java.awt.Color(255, 0, 0));
        listaUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        listaUsuario.setText("LISTA USUARIOS");
        listaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificiarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESERVAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondonumero2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ANDRES FELIPE GARCIA R - JUANA MARIA QUICENO V");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DERECHOS RESERVADOS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 680, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        setVisible(false);
        CrearPersona ventana = new CrearPersona(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        setVisible(false);
        EliminarUsuario ventana = new EliminarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void listaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsuarioActionPerformed
        setVisible(false);
        ListarUsuarios ventana = new ListarUsuarios(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_listaUsuarioActionPerformed

    private void modificiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificiarUsuarioActionPerformed
        setVisible(false);
        ModificarUsuario ventana = new ModificarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_modificiarUsuarioActionPerformed

    private void listaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaReservaActionPerformed
        setVisible(false);
        ListarReserva ventana = new ListarReserva(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_listaReservaActionPerformed

    private void crearPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPeliculaActionPerformed
        setVisible(false);
        CrearPeliculas ventana = new CrearPeliculas();
        ventana.setVisible(true);
    }//GEN-LAST:event_crearPeliculaActionPerformed

    private void eliminarPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPeliculasActionPerformed
        setVisible(false);
        ListarPeliculas ventana = new ListarPeliculas(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_eliminarPeliculasActionPerformed

    private void hacerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerReservaActionPerformed
        setVisible(false);
        CrearReserva ventana = new CrearReserva();
        ventana.setVisible(true);
    }//GEN-LAST:event_hacerReservaActionPerformed

    private void listaPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPeliculasActionPerformed
        setVisible(false);
        ListarPeliculas ventana = new ListarPeliculas(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_listaPeliculasActionPerformed

    private void modificarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPeliculaActionPerformed
        setVisible(false);
        ModificarPeliculas ventana = new ModificarPeliculas();
        ventana.setVisible(true);
    }//GEN-LAST:event_modificarPeliculaActionPerformed

    private void eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaActionPerformed
        setVisible(false);
        EliminarReserva ventana = new EliminarReserva(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_eliminarReservaActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearPelicula;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JButton eliminarPeliculas;
    private javax.swing.JButton eliminarReserva;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JButton hacerReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton listaPeliculas;
    private javax.swing.JButton listaReserva;
    private javax.swing.JButton listaUsuario;
    private javax.swing.JButton modificarPelicula;
    private javax.swing.JButton modificiarUsuario;
    // End of variables declaration//GEN-END:variables
}
