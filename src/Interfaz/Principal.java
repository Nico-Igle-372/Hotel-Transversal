package Interfaz;

import AccesoADatos.Conexion;
import com.sun.awt.AWTUtilities;

import java.awt.Shape;

import java.awt.geom.RoundRectangle2D;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        this.setLocationRelativeTo(null);
        initComponents();
        conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jBotonHuesped = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jBotonHabitacion = new javax.swing.JToggleButton();
        jBotonReserva = new javax.swing.JToggleButton();
        jBotonSalir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 150));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(235, 248, 237));

        jBotonHuesped.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jBotonHuesped.setForeground(new java.awt.Color(51, 51, 51));
        jBotonHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huesped_pequeño(apagado).png"))); // NOI18N
        jBotonHuesped.setText("Huesped");
        jBotonHuesped.setContentAreaFilled(false);
        jBotonHuesped.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonHuesped.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huespedGrandeEncendido.png"))); // NOI18N
        jBotonHuesped.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huespedGrandeEncendido.png"))); // NOI18N
        jBotonHuesped.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huespedGrandeEncendido.png"))); // NOI18N
        jBotonHuesped.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBotonHuesped.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotonHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonHuespedActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoHotel.png"))); // NOI18N

        jBotonHabitacion.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jBotonHabitacion.setForeground(new java.awt.Color(51, 51, 51));
        jBotonHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionPequeñaApagada.png"))); // NOI18N
        jBotonHabitacion.setText("Habitación");
        jBotonHabitacion.setBorderPainted(false);
        jBotonHabitacion.setContentAreaFilled(false);
        jBotonHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonHabitacion.setIconTextGap(-13);
        jBotonHabitacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionGrandeDos(encendido).png"))); // NOI18N
        jBotonHabitacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionGrandeDos(encendido).png"))); // NOI18N
        jBotonHabitacion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacionGrandeDos(encendido).png"))); // NOI18N
        jBotonHabitacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBotonHabitacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotonHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonHabitacionActionPerformed(evt);
            }
        });

        jBotonReserva.setText("Reserva");
        jBotonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonReservaActionPerformed(evt);
            }
        });

        jBotonSalir.setText("salir");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 648, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonReservaActionPerformed

    private void jBotonHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonHuespedActionPerformed
//      escritorio.removeAll();
//      escritorio.repaint();
        GestionHuesped gh = new GestionHuesped();
        gh.setVisible(true);
        escritorio.add(gh);
        escritorio.moveToFront(gh);
    }//GEN-LAST:event_jBotonHuespedActionPerformed

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBotonSalirActionPerformed

    private void jBotonHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonHabitacionActionPerformed
        GestionHabitacion gh = new GestionHabitacion();
        gh.setVisible(true);
        escritorio.add(gh);
        escritorio.moveToFront(gh);
    }//GEN-LAST:event_jBotonHabitacionActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JToggleButton jBotonHabitacion;
    private javax.swing.JToggleButton jBotonHuesped;
    private javax.swing.JToggleButton jBotonReserva;
    private javax.swing.JToggleButton jBotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 private void conectar() {
        Conexion con = new Conexion("jdbc:mariadb://localhost:3306/", "hotel31", "root", "");

    }

}
