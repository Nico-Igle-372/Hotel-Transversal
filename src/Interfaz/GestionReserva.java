package Interfaz;

import AccesoADatos.ABMHabitacion;
import AccesoADatos.ABMHuesped;
import AccesoADatos.ABMReserva;
import Entidades.Habitacion;
import Entidades.Reserva;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class GestionReserva extends javax.swing.JInternalFrame {

    ABMReserva ABMR = new ABMReserva();
    ABMHabitacion ABMHabi = new ABMHabitacion();
    ABMHuesped ABMHues = new ABMHuesped();

    DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable() {
            return false;
        }
    };

    public GestionReserva() {
        initComponents();
        armarCabecera();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDFechaEgreso = new com.toedter.calendar.JDateChooser();
        jDFechaIngreso = new com.toedter.calendar.JDateChooser();
        TextoDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReserva = new javax.swing.JTable();
        botonNueva = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonConsultas = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        botonBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textoCantPers = new javax.swing.JTextField();
        BotonBuscarDni = new javax.swing.JButton();
        RHabitaciones = new javax.swing.JRadioButton();
        RReservas = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Gestión Reserva");

        jLabel3.setText("DNI");

        jLabel2.setText("Fecha Ingreso");

        jLabel4.setText("Fecha Egreso");

        tablaReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaReserva);

        botonNueva.setText("Nueva");
        botonNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar ");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonConsultas.setText("Consultas");
        botonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultasActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Simple");

        jCheckBox2.setText("Simple 2");

        jCheckBox3.setText("Simple 3");

        jCheckBox4.setText("Doble");

        jCheckBox5.setText("Triple");

        jCheckBox6.setText("Suite");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("N° de Huespedes");

        BotonBuscarDni.setText("Buscar");
        BotonBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarDniActionPerformed(evt);
            }
        });

        RHabitaciones.setSelected(true);
        RHabitaciones.setText("Habitaciones");
        RHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RHabitacionesActionPerformed(evt);
            }
        });

        RReservas.setText("reservas");
        RReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RReservasActionPerformed(evt);
            }
        });

        jLabel6.setText("ver:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel3)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jDFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textoCantPers, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(TextoDNI)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonBuscarDni)
                                    .addComponent(jDFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonBuscar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RHabitaciones)
                                .addGap(54, 54, 54)
                                .addComponent(RReservas))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonNueva)
                                .addGap(26, 26, 26)
                                .addComponent(botonCancelar)
                                .addGap(28, 28, 28)
                                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonConsultas)
                                .addGap(45, 45, 45)
                                .addComponent(botonSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6))
                                .addGap(28, 28, 28)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BotonBuscarDni))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDFechaEgreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RHabitaciones)
                            .addComponent(RReservas)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNueva)
                    .addComponent(botonCancelar)
                    .addComponent(botonModificar)
                    .addComponent(botonConsultas)
                    .addComponent(botonSalir))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        actualizar();
        limpiarT();
        try {
            
            int cantPersonas = Integer.parseInt(textoCantPers.getText());
            LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if(comprobarFechas(ingreso, egreso)){
            List<Habitacion> habitaciones = ABMR.buscarHabitacionParaReserva(cantPersonas, ingreso, egreso);
            for (Habitacion habi : habitaciones) {
                cargarTabla(ingreso, egreso, habi);
            }
            }else{
                JOptionPane.showMessageDialog(null, "Revise las fechas seleccionadas");
            }
        } catch (NumberFormatException | NullPointerException | DateTimeException e) {
            JOptionPane.showMessageDialog(null, "Error en busqueda de habitaciones para reservar");
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaActionPerformed
        
        if (RHabitaciones.isSelected()) {
            
            try {
            LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (comprobarFechas(ingreso, egreso)) {
                Reserva res = new Reserva();
                res.setHuesped(ABMHues.buscarHuesped(Integer.parseInt(TextoDNI.getText())));
                res.setHabitacion(ABMHabi.buscarHabitacion((int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0)));
                res.setFechaEntrada(jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                res.setFechaSalida(jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                res.setCantPersonas(Integer.parseInt(textoCantPers.getText()));
                res.setImporteTotal((double) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 3));
                res.setEstado(true);
                ABMR.crearReserva(res);
                ABMHabi.ocuparHabitacion(res.getHabitacion().getidHabitacion());
                }else{
                  JOptionPane.showMessageDialog(null, "Revise las fechas seleccionadas");
                }
            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error en generar Reserva");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione ver habitaciones");
        }
        actualizar();

    }//GEN-LAST:event_botonNuevaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        if (RReservas.isSelected()) {
            ABMR.cancelarReserva((int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione ver reservas");
        }
        actualizar();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (RReservas.isSelected()) {
            try {
                int cantPersonas = Integer.parseInt(textoCantPers.getText());
                LocalDate ingreso = jDFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate egreso = jDFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (comprobarFechas(ingreso, egreso)) {
                    Reserva res = ABMR.buscarPorId((int) tablaReserva.getValueAt(tablaReserva.getSelectedRow(), 0));
                    res.setCantPersonas(cantPersonas);
                    res.setFechaEntrada(ingreso);
                    res.setFechaSalida(egreso);
                    res.setImporteTotal(ABMR.calcularPrecioEstadia(ingreso, egreso, res.getHabitacion()));
                    ABMR.cancelarReserva(res.getIdReserva());
                    if (res.getHabitacion().gettipoHabitacion().getCapacidad() >= cantPersonas) {
                        List<Habitacion> habis = ABMR.buscarHabitacionParaReserva(cantPersonas, ingreso, egreso);
                        for (Habitacion habi : habis) {
                            if (habi.getidHabitacion() == res.getHabitacion().getidHabitacion()) {
                                ABMR.modificarReserva(res);
                                limpiarT();
                                cargarTablaR(res);
                                JOptionPane.showMessageDialog(null, "Reserva modificada");
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad maxima es de "
                                + res.getHabitacion().gettipoHabitacion().getCapacidad() + " personas");

                    }
                    ABMR.AltaReserva(res.getIdReserva());
                }else{
                    JOptionPane.showMessageDialog(null, "Revise las fechas seleccionadas");
                }

            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Seleccione una reserva de la tabla");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione ver reservas");
        }
        actualizar();
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConsultasActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Principal.contador--;
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void RHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RHabitacionesActionPerformed

        limpiarT();
        if (RHabitaciones.isSelected()) {
            RReservas.setSelected(false);
            armarCabecera();
        }


    }//GEN-LAST:event_RHabitacionesActionPerformed

    private void RReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RReservasActionPerformed
        limpiarT();
        if (RReservas.isSelected()) {
            RHabitaciones.setSelected(false);
            armarCabecera();
        }
    }//GEN-LAST:event_RReservasActionPerformed

    private void BotonBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarDniActionPerformed
        RReservas.setSelected(true);
        RHabitaciones.setSelected(false);
        armarCabecera();

        List<Reserva> listaRes = ABMR.buscarPorHuesped(Integer.parseInt(TextoDNI.getText()));
        limpiarT();
        for (Reserva res : listaRes) {
            cargarTablaR(res);
        }


    }//GEN-LAST:event_BotonBuscarDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarDni;
    private javax.swing.JRadioButton RHabitaciones;
    private javax.swing.JRadioButton RReservas;
    private javax.swing.JTextField TextoDNI;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultas;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNueva;
    private javax.swing.JButton botonSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private com.toedter.calendar.JDateChooser jDFechaEgreso;
    private com.toedter.calendar.JDateChooser jDFechaIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReserva;
    private javax.swing.JTextField textoCantPers;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        if (RHabitaciones.isSelected()) {

            modeloTabla.addColumn("Habitacion");
            modeloTabla.addColumn("Tipo de Habitacion");
            modeloTabla.addColumn("N° de Camas");
            modeloTabla.addColumn("Total");
            modeloTabla.setColumnCount(4);
            tablaReserva.setModel(modeloTabla);

        } else {

            modeloTabla.setColumnCount(7);
            tablaReserva.setModel(modeloTabla);

            JTableHeader tableHeader = tablaReserva.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();
            TableColumn tableColumn = tableColumnModel.getColumn(0);
            tableColumn.setHeaderValue("Id");
            TableColumn tableColumn1 = tableColumnModel.getColumn(1);
            tableColumn1.setHeaderValue("Huesped");
            TableColumn tableColumn2 = tableColumnModel.getColumn(2);
            tableColumn2.setHeaderValue("Habitacion");
            TableColumn tableColumn3 = tableColumnModel.getColumn(3);
            tableColumn3.setHeaderValue("Tipo de Habitacion");
            TableColumn tableColumn4 = tableColumnModel.getColumn(4);
            tableColumn4.setHeaderValue("Ingreso");
            TableColumn tableColumn5 = tableColumnModel.getColumn(5);
            tableColumn5.setHeaderValue("Egreso");
            TableColumn tableColumn6 = tableColumnModel.getColumn(6);
            tableColumn6.setHeaderValue("Total");
            tableHeader.repaint();

        }

    }

    private void cargarTabla(LocalDate ingreso, LocalDate egreso, Habitacion habi) {

        modeloTabla.addRow(new Object[]{habi.getidHabitacion(), habi.gettipoHabitacion().getNombre(),
            habi.gettipoHabitacion().getCantCamas(), ABMR.calcularPrecioEstadia(ingreso, egreso, habi)});
    }

    private void cargarTablaR(Reserva res) {
        modeloTabla.addRow(new Object[]{res.getIdReserva(), res.getHuesped().getNombre() + " " + res.getHuesped().getApellido(), res.getHabitacion().getidHabitacion(),
            res.getHabitacion().gettipoHabitacion().getNombre(), res.getFechaEntrada(), res.getFechaSalida(), res.getImporteTotal()});

    }

    private void limpiarT() {
        int tamaño = tablaReserva.getRowCount();
        if (tamaño != -1) {
            for (int i = tamaño - 1; i >= 0; i--) {
                modeloTabla.removeRow(i);
            }
        }
    }

    private boolean comprobarFechas(LocalDate ingreso, LocalDate egreso) {
        return egreso.isAfter(ingreso);
    }
    
    private void actualizar(){
       LocalDate hoy= LocalDate.now(); 
       List<Habitacion> habitaciones=ABMHabi.listaDesocupadas();
       for(Habitacion habi:habitaciones){
           
         List<Reserva> reservas=ABMR.buscarPorHabitacion(habi);
           for (Reserva res : reservas) {
              if(hoy.equals(res.getFechaEntrada())){
                  ABMHabi.ocuparHabitacion(habi.getidHabitacion());
              }
           }
       }
       habitaciones=ABMHabi.listaOcupadas();
       
        for (Habitacion habi : habitaciones) {
            List<Reserva> reservas=ABMR.buscarPorHabitacion(habi);
           for (Reserva res : reservas) {
              if(hoy.equals(res.getFechaSalida())){
                  ABMHabi.liberarHabitacion(habi.getidHabitacion());
              }
           } 
        }
       
    }
}
