
package Interfaz;

import AccesoADatos.ABMHuesped;
import Entidades.Huesped;
import javax.swing.JOptionPane;


public class GestionHuesped extends javax.swing.JInternalFrame {
    ABMHuesped ABMHues= new ABMHuesped();
    
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
        jBotonGuardar = new javax.swing.JToggleButton();
        jBotonModificar = new javax.swing.JToggleButton();
        jBotonSalir = new javax.swing.JToggleButton();
        jBotonAltaBaja = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextoApellido = new javax.swing.JTextField();
        jBotonLimpiar = new javax.swing.JToggleButton();

        jLabel1.setText("Gestion Huesped");

        jLabel2.setText("D.N.I.");

        jLabel3.setText("Nombre");

        jLabel4.setText("Dirección");

        jLabel5.setText("Correo");

        jLabel6.setText("Celular");

        jLabel7.setText("Estado");

        jTextoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoDniActionPerformed(evt);
            }
        });

        jTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoNombreActionPerformed(evt);
            }
        });

        jBotonGuardar.setText("Guardar");
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });

        jBotonModificar.setText("Modificar");
        jBotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonModificarActionPerformed(evt);
            }
        });

        jBotonSalir.setText("Salir");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        jBotonAltaBaja.setText("Baja/Alta");
        jBotonAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAltaBajaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido");

        jTextoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoApellidoActionPerformed(evt);
            }
        });

        jBotonLimpiar.setText("Limpiar");
        jBotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonLimpiarActionPerformed(evt);
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
                        .addComponent(jBotonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotonModificar)
                        .addGap(90, 90, 90)
                        .addComponent(jBotonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jBotonSalir))
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBotonAltaBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoDni)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jTextoApellido))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(jButton1))
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
                    .addComponent(jBotonAltaBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonGuardar)
                    .addComponent(jBotonModificar)
                    .addComponent(jBotonSalir)
                    .addComponent(jBotonLimpiar))
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

    private void jTextoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoDniActionPerformed

    private void jTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
          Huesped hues= ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText()));
          if(hues!=null){
          jTextoNombre.setText(hues.getNombre());
          jTextoApellido.setText(hues.getApellido());
          jTextoDireccion.setText(hues.getDomicilio());
          jTextoCorreo.setText(hues.getCorreo());
          jTextoCelular.setText(hues.getCelular()+"");
          jTextoEstado.setText(hues.isEstado()?"Activo":"Inactivo");
          if(hues.isEstado()){
              jBotonAltaBaja.setText("Baja");
          }else{
              jBotonAltaBaja.setText("Alta");
          }
          }else{
              JOptionPane.showMessageDialog(null,"No Se encontro huesped con ese dni");
          }
          
      }catch(NumberFormatException | NullPointerException ex){
          
      }
        
      
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBotonAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAltaBajaActionPerformed
       Huesped hues=ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText())); 
        if(hues.isEstado()){
            ABMHues.bajaHuesped(hues.getDni());
             jBotonAltaBaja.setText("Baja");
        }else{
             ABMHues.altaHuesped(hues.getDni());
              jBotonAltaBaja.setText("Alta");
        }
        jTextoEstado.setText(hues.isEstado()?"Activo":"Inactivo");
    }//GEN-LAST:event_jBotonAltaBajaActionPerformed

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed
      Huesped hues=new Huesped();
      hues.setDni(Integer.parseInt(jTextoDni.getText()));
      hues.setNombre(jTextoNombre.getText());
      hues.setApellido(jTextoApellido.getText());
      hues.setDomicilio(jTextoDireccion.getText());
      hues.setCorreo(jTextoCorreo.getText());
      hues.setCelular(Long.parseLong(jTextoCelular.getText()));
      hues.setEstado(true);
      Huesped hues2=ABMHues.buscarHuesped(Integer.parseInt(jTextoDni.getText()));
      if(hues2==null){
         ABMHues.guardarHuesped(hues); 
      }else{
          JOptionPane.showMessageDialog(null,"Ya existe un huesped con ese dni");
      }
      
      
    }//GEN-LAST:event_jBotonGuardarActionPerformed

    private void jTextoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoApellidoActionPerformed

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jBotonSalirActionPerformed

    private void jBotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonLimpiarActionPerformed
        vaciar();
    }//GEN-LAST:event_jBotonLimpiarActionPerformed

    private void jBotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonModificarActionPerformed
       Huesped hues=new Huesped();
      hues.setDni(Integer.parseInt(jTextoDni.getText()));
      hues.setNombre(jTextoNombre.getText());
      hues.setApellido(jTextoApellido.getText());
      hues.setDomicilio(jTextoDireccion.getText());
      hues.setCorreo(jTextoCorreo.getText());
      hues.setCelular(Long.parseLong(jTextoCelular.getText()));
      hues.setEstado(true);
      ABMHues.modificarHuesped(hues);
      
    }//GEN-LAST:event_jBotonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBotonAltaBaja;
    private javax.swing.JToggleButton jBotonGuardar;
    private javax.swing.JToggleButton jBotonLimpiar;
    private javax.swing.JToggleButton jBotonModificar;
    private javax.swing.JToggleButton jBotonSalir;
    private javax.swing.JButton jButton1;
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

   public void vaciar(){
       jTextoCelular.setText("");
       jTextoCorreo.setText("");
       jTextoDireccion.setText("");
       jTextoDni.setText("");
       jTextoNombre.setText("");
       jTextoEstado.setText("");
       jTextoApellido.setText("");
   }
}
