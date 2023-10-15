package Interfaz;

import AccesoADatos.ABMHabitacion;
import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionHabitacion extends javax.swing.JInternalFrame {

    ABMHabitacion ABMHabi = new ABMHabitacion();

    private final DefaultTableModel modeloT = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int colum) {
            return false;
        }
    };

    public GestionHabitacion() {
        initComponents();
        
        redondearCajasDeTexto();
        labelPrecio.setVisible(false);
        jTextoPrecio.setVisible(false);
        botonCambiarPrecio.setVisible(false);
        armarCabecera();
        cargarTipoH();
        limpiarT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        labelHabitacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        TextoNumero = new javax.swing.JTextField();
        ComboTipoH = new javax.swing.JComboBox<>();
        TextoEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHabitacion = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JButton();
        BotonAltaBaja = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        botonPrecio = new javax.swing.JButton();
        labelPrecio = new javax.swing.JLabel();
        jTextoPrecio = new javax.swing.JTextField();
        botonCambiarPrecio = new javax.swing.JButton();

        setFrameIcon(null);

        titulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        titulo.setText("Gestión Habitación");

        labelHabitacion.setText("N° Habitación");

        jLabel3.setText("Tipo de Habitación");

        labelEstado.setText("Estado");

        ComboTipoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoHActionPerformed(evt);
            }
        });

        TablaHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaHabitacion);

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarApagado.png"))); // NOI18N
        BotonBuscar.setContentAreaFilled(false);
        BotonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarEncendido.png"))); // NOI18N
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonAltaBaja.setText("Alta/baja");

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirApagado(2).png"))); // NOI18N
        BotonSalir.setContentAreaFilled(false);
        BotonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        BotonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        BotonSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InicioSalirEncendido (1).png"))); // NOI18N
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionApagado.png"))); // NOI18N
        BotonGuardar.setContentAreaFilled(false);
        BotonGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionEncendido2.png"))); // NOI18N
        BotonGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionEncendido2.png"))); // NOI18N
        BotonGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NuevaHabitacionGestionEncendido2.png"))); // NOI18N
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-apagado.png"))); // NOI18N
        BotonModificar.setContentAreaFilled(false);
        BotonModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        BotonModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        BotonModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar-encendido.png"))); // NOI18N
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        botonPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGHabiApagadp.png"))); // NOI18N
        botonPrecio.setContentAreaFilled(false);
        botonPrecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGestionHabi.png"))); // NOI18N
        botonPrecio.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiarPrecioGestionHabi.png"))); // NOI18N
        botonPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrecioActionPerformed(evt);
            }
        });

        labelPrecio.setText("Precio");

        botonCambiarPrecio.setText("Cambiar Precio");
        botonCambiarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelPrecio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonCambiarPrecio))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(labelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BotonAltaBaja)
                                            .addComponent(BotonBuscar)))))
                            .addComponent(labelEstado)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(titulo)
                                .addGap(97, 97, 97))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BotonModificar)
                        .addGap(28, 28, 28)
                        .addComponent(botonPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHabitacion)
                            .addComponent(TextoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ComboTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(BotonBuscar)
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEstado)
                            .addComponent(BotonAltaBaja))))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecio)
                    .addComponent(jTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCambiarPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonModificar)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSalir))
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        try {
            limpiarT();
            Habitacion habi = ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText()));
            if (habi.getidHabitacion() != 0) {
                ComboTipoH.setSelectedItem(habi.gettipoHabitacion().getNombre());
                TextoEstado.setText(habi.isEstado() ? "Ocupada" : "Libre");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la habitación");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un número valido");
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void ComboTipoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoHActionPerformed
        TipoHabitacion tH = ABMHabi.buscarTipoHabitacionPorNombre(ComboTipoH.getSelectedItem() + "");
        limpiarT();
        cargarDatos(tH);
    }//GEN-LAST:event_ComboTipoHActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        Principal.contador--;
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        Habitacion h = new Habitacion();
        try {
            if (ABMHabi.buscarHabitacion(Integer.parseInt(TextoNumero.getText())).getidHabitacion() == 0) {
                h.setIdHabitacion(Integer.parseInt(TextoNumero.getText()));
                h.settipoHabitacion(ABMHabi.buscarTipoHabitacionPorNombre(ComboTipoH.getSelectedItem() + ""));
                h.setEstado(false);
                ABMHabi.crearHabitacion(h);
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una habitacion con ese número");
            }
        } catch (NullPointerException | NumberFormatException ex) {

        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void botonPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrecioActionPerformed
        if (titulo.getText().equals("Gestión Habitación")) {
            labelPrecio.setVisible(true);
            jTextoPrecio.setVisible(true);
            botonCambiarPrecio.setVisible(true);
            BotonGuardar.setVisible(false);
            BotonModificar.setVisible(false);
            BotonBuscar.setVisible(false);
            BotonAltaBaja.setVisible(false);
            TextoEstado.setVisible(false);
            TextoNumero.setVisible(false);
            labelEstado.setVisible(false);
            labelHabitacion.setVisible(false);
            titulo.setText("Gestión Precio");
            botonPrecio.setText("Modificar Habitación");
        } else {
            labelPrecio.setVisible(false);
            jTextoPrecio.setVisible(false);
            botonCambiarPrecio.setVisible(false);
            BotonGuardar.setVisible(true);
            BotonModificar.setVisible(true);
            BotonBuscar.setVisible(true);
            BotonAltaBaja.setVisible(true);
            TextoEstado.setVisible(true);
            TextoNumero.setVisible(true);
            labelEstado.setVisible(true);
            labelHabitacion.setVisible(true);
            titulo.setText("Gestión Habitación");
            botonPrecio.setText("Cambiar Precio");
        }
    }//GEN-LAST:event_botonPrecioActionPerformed

    private void botonCambiarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPrecioActionPerformed
        try {
            double precio = Double.parseDouble(jTextoPrecio.getText());
            TipoHabitacion tipoH = ABMHabi.buscarTipoHabitacionPorNombre((String) ComboTipoH.getSelectedItem());
            int idTH = tipoH.getIdTipo();
            ABMHabi.cambiarPrecio(idTH, precio);
            jTextoPrecio.setText("");
            TablaHabitacion.setValueAt(precio, 0, 4);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numericos");
        }
    }//GEN-LAST:event_botonCambiarPrecioActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAltaBaja;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> ComboTipoH;
    private javax.swing.JTable TablaHabitacion;
    private javax.swing.JTextField TextoEstado;
    private javax.swing.JTextField TextoNumero;
    private javax.swing.JButton botonCambiarPrecio;
    private javax.swing.JButton botonPrecio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextoPrecio;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelHabitacion;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void cargarTipoH() {
        List<TipoHabitacion> tipoHabitaciones = ABMHabi.listarTipoH();
        for (TipoHabitacion tipo : tipoHabitaciones) {
            ComboTipoH.addItem(tipo.getNombre());
        }
    }

    private void armarCabecera() {
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Capacidad");
        modeloT.addColumn("Cantidad de Camas");
        modeloT.addColumn("Tipo de Camas");
        modeloT.addColumn("Precio Por Noche");
        TablaHabitacion.setModel(modeloT);
    }

    private void limpiarT() {
        int tamaño = TablaHabitacion.getRowCount();
        if (tamaño != -1) {
            for (int i = tamaño - 1; i >= 0; i--) {
                modeloT.removeRow(i);
            }
        }
    }

    public void cargarDatos(TipoHabitacion tH) {
        modeloT.addRow(new Object[]{tH.getNombre(), tH.getCapacidad(), tH.getCantCamas(), tH.getTipoCamas(), tH.getPrecioNoche()});
    }

    private void redondearCajasDeTexto() {
        TextoEstado.putClientProperty("JComponent.roundRect", true);
        TextoNumero.putClientProperty("JComponent.roundRect", true);
        jTextoPrecio.putClientProperty("JComponent.roundRect", true);
        ComboTipoH.putClientProperty("JComponent.roundRect", true);
         BotonAltaBaja.putClientProperty("JComponent.roundRect", true);
    }
    
   
}
