package ModuloReservas;

import Clases.Reserva;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ListarReserva extends javax.swing.JFrame {

    Menu ventanaMenu;
    private JLabel etqTemporal;
    
    public ListarReserva(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_mirarlista.png") ) );
        
        contenUsuarios.setLayout( new BoxLayout(contenUsuarios, BoxLayout.Y_AXIS) );
        contenUsuarios.setBackground(Color.WHITE);
        imprimirClientes();
    }
    
    public void imprimirClientes(){
        Reserva listaReset [] = this.ventanaMenu.database.listaReset();
        
        if (listaReset!=null) {
            for(int i = 0; i < listaReset.length; i++){
                if(listaReset[i] != null){
                    etqTemporal = new JLabel(listaReset[i].getCedula_usuario()+" - "+listaReset[i].getNom_usuario()+" - "+listaReset[i].getNom_pelicula()+" - "+listaReset[i].getFecha()+" - "+listaReset[i].getPuesto());
                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                    contenUsuarios.add(etqTemporal);
                }else{
                    break;
                }
            }
            revalidate();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EtqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenUsuarios = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EtqTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        EtqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        EtqTitulo.setText("LISTA DE RESERVAS REGISTRADAS");
        jPanel1.add(EtqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        contenUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        contenUsuarios.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenUsuariosLayout = new javax.swing.GroupLayout(contenUsuarios);
        contenUsuarios.setLayout(contenUsuariosLayout);
        contenUsuariosLayout.setHorizontalGroup(
            contenUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        contenUsuariosLayout.setVerticalGroup(
            contenUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 400, 350));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 100, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otromas.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 490));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqTitulo;
    private javax.swing.JPanel contenUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
