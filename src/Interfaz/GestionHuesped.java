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

        jBotonBuscar.setText("Buscar");
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido");

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextoNombre)
                            .addComponent(jTextoDireccion)
                            .addComponent(jTextoCorreo)
                            .addComponent(jTextoCelular)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoDni, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jBotonBuscar))
                            .addComponent(jTextoApellido)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonAltaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificar)
                        .addGap(89, 89, 89)
                        .addComponent(botonLimpiar)
                        .addGap(107, 107, 107)
                        .addComponent(botonSalir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAltaBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(botonLimpiar)
                    .addComponent(botonModificar)
                    .addComponent(botonGuardar))
                .addContainerGap())
        );

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

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        vaciar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

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
