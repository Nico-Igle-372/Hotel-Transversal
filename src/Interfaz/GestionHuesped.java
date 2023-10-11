package Interfaz;

import AccesoADatos.ABMHuesped;
import Entidades.Huesped;
import javax.swing.JOptionPane;

public class GestionHuesped extends javax.swing.JInternalFrame {

    ABMHuesped ABMHues = new ABMHuesped();

    public GestionHuesped() {
       
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextoDni = new javax.swing.JTextField();
        jTextoNombre = new javax.swing.JTextField();
        jTextoDireccion = new javax.swing.JTextField();
        jTextoCorreo = new javax.swing.JTextField();
        jTextoCelular = new javax.swing.JTextField();
        jTextoEstado = new javax.swing.JTextField();
        jBotonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextoApellido = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonAltaBaja = new javax.swing.JButton();

        jLabel1.setText("Gestion Huesped");

        jLabel2.setText("D.N.I.");

        jLabel3.setText("Nombre");

        jLabel4.setText("Dirección");

        jLabel5.setText("Correo");

        jLabel6.setText("Celular");

        jLabel7.setText("Estado");

        jBotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.apagado.png"))); // NOI18N
        jBotonBuscar.setContentAreaFilled(false);
        jBotonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.encendido.png"))); // NOI18N
        jBotonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.encendido.png"))); // NOI18N
        jBotonBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.encendido.png"))); // NOI18N
        jBotonBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBotonBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido");

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevoHuespedPequeñoApagado.png"))); // NOI18N
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevoHuespedGrandeEncendido.png"))); // NOI18N
        botonGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevoHuespedGrandeEncendido.png"))); // NOI18N
        botonGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevoHuespedGrandeEncendido.png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-apagado.png"))); // NOI18N
        botonModificar.setContentAreaFilled(false);
        botonModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        botonModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        botonModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarApagado.png"))); // NOI18N
        botonLimpiar.setContentAreaFilled(false);
        botonLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarEncendido.png"))); // NOI18N
        botonLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarEncendido.png"))); // NOI18N
        botonLimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarEncendido.png"))); // NOI18N
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoSalirApagado.png"))); // NOI18N
        botonSalir.setContentAreaFilled(false);
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-salir-encendido.png"))); // NOI18N
        botonSalir.setRolloverEnabled(true);
        botonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-salir-encendido.png"))); // NOI18N
        botonSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-salir-encendido.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonAltaBaja.setText("Baja/Alta");
        botonAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)))
                        .addGap(18, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAltaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(jTextoCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextoCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextoDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextoNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonSalir)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jBotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAltaBaja)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBotonBuscar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLimpiar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSalir)
                        .addGap(8, 8, 8)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaBajaActionPerformed
        try {
            Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText()));
            if (hues.getIdHuesped() != 0) {
                if (hues.isEstado()) {
                    ABMHues.bajaHuesped(hues.getDni());
                    botonAltaBaja.setText("Alta");
                } else {
                    ABMHues.altaHuesped(hues.getDni());
                    botonAltaBaja.setText("Baja");
                }
                jTextoEstado.setText(hues.isEstado() ? "Inactivo" : "Activo");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontro huesped con ese dni");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Revise el dni");
        }
    }//GEN-LAST:event_botonAltaBajaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        vaciar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Huesped hues = new Huesped();
        hues.setDni(Integer.parseInt(jTextoDni.getText()));
        hues.setNombre(jTextoNombre.getText());
        hues.setApellido(jTextoApellido.getText());
        hues.setDomicilio(jTextoDireccion.getText());
        hues.setCorreo(jTextoCorreo.getText());
        hues.setCelular(Long.parseLong(jTextoCelular.getText()));
        hues.setEstado(true);
        ABMHues.modificarHuesped(hues);
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Huesped hues = new Huesped();
        hues.setDni(Integer.parseInt(jTextoDni.getText()));
        hues.setNombre(jTextoNombre.getText());
        hues.setApellido(jTextoApellido.getText());
        hues.setDomicilio(jTextoDireccion.getText());
        hues.setCorreo(jTextoCorreo.getText());
        hues.setCelular(Long.parseLong(jTextoCelular.getText()));
        hues.setEstado(true);
        Huesped hues2 = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText()));
        if (hues2 == null) {
            ABMHues.guardarHuesped(hues);
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe un huesped con ese dni");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed
        try {
            Huesped hues = ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText()));
            if (hues.getIdHuesped() != 0) {
                jTextoNombre.setText(hues.getNombre());
                jTextoApellido.setText(hues.getApellido());
                jTextoDireccion.setText(hues.getDomicilio());
                jTextoCorreo.setText(hues.getCorreo());
                jTextoCelular.setText(hues.getCelular() + "");
                jTextoEstado.setText(hues.isEstado() ? "Activo" : "Inactivo");
                if (hues.isEstado()) {
                    botonAltaBaja.setText("Baja");
                } else {
                    botonAltaBaja.setText("Alta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro huesped con ese dni");
            }
        } catch (NumberFormatException | NullPointerException ex) {

        }
    }//GEN-LAST:event_jBotonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAltaBaja;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTextoCelular;
    private javax.swing.JTextField jTextoCorreo;
    private javax.swing.JTextField jTextoDireccion;
    private javax.swing.JTextField jTextoDni;
    private javax.swing.JTextField jTextoEstado;
    private javax.swing.JTextField jTextoNombre;
    // End of variables declaration//GEN-END:variables

    public void vaciar() {
        jTextoCelular.setText("");
        jTextoCorreo.setText("");
        jTextoDireccion.setText("");
        jTextoDni.setText("");
        jTextoNombre.setText("");
        jTextoEstado.setText("");
        jTextoApellido.setText("");
    }
}
