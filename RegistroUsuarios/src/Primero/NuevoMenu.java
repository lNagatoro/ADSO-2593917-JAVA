package Primero;

public class NuevoMenu extends javax.swing.JFrame {
    Persona listaPersonas [];
    int indexPersona;
    
    
    public NuevoMenu() {
        this.listaPersonas = new Persona [100];
        this.indexPersona = 0;
      
        
        initComponents();
        initAlternComponents();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        new_menu = new javax.swing.JLabel();
        cont_secund = new javax.swing.JPanel();
        crear = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        lista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        cont_principal.setBackground(new java.awt.Color(102, 102, 102));

        new_menu.setBackground(new java.awt.Color(51, 255, 255));
        new_menu.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        new_menu.setForeground(new java.awt.Color(0, 0, 153));
        new_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_menu.setText("Menu");

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(new_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(new_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        cont_secund.setBackground(new java.awt.Color(102, 102, 102));
        cont_secund.setForeground(new java.awt.Color(153, 153, 153));

        crear.setBackground(new java.awt.Color(51, 51, 51));
        crear.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        crear.setForeground(new java.awt.Color(204, 204, 204));
        crear.setText("Crear Usuario");
        crear.setFocusable(false);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(51, 51, 51));
        eliminar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        eliminar.setForeground(new java.awt.Color(204, 204, 204));
        eliminar.setText("Eliminar Usuario");
        eliminar.setFocusable(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(51, 51, 51));
        modificar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        modificar.setForeground(new java.awt.Color(204, 204, 204));
        modificar.setText("Modificar Usuario");
        modificar.setFocusable(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        lista.setBackground(new java.awt.Color(51, 51, 51));
        lista.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lista.setForeground(new java.awt.Color(204, 204, 204));
        lista.setText("Listar Usuario");
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_secundLayout = new javax.swing.GroupLayout(cont_secund);
        cont_secund.setLayout(cont_secundLayout);
        cont_secundLayout.setHorizontalGroup(
            cont_secundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_secundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cont_secundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cont_secundLayout.setVerticalGroup(
            cont_secundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_secundLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(crear)
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addGap(18, 18, 18)
                .addComponent(modificar)
                .addGap(18, 18, 18)
                .addComponent(lista)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cont_secund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_secund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        setVisible(false);
        
        
        EliminarUsuario ventana = new EliminarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_eliminarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        setVisible(false);
        
        
        CrearUsuario ventana = new CrearUsuario(this);
        ventana.setVisible(true);  
    }//GEN-LAST:event_crearActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        setVisible(false);
        
        
        ModificarUsuario ventana = new ModificarUsuario(this);
        
        ventana.setVisible(true);
    }//GEN-LAST:event_modificarActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        setVisible(false);
        ListaUsuarios ventana = new ListaUsuarios(this);
        ventana.mostrar();
        ventana.setVisible(true);
       
    }//GEN-LAST:event_listaActionPerformed
   
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
    }
   
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_principal;
    private javax.swing.JPanel cont_secund;
    private javax.swing.JButton crear;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton lista;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel new_menu;
    // End of variables declaration//GEN-END:variables
}
