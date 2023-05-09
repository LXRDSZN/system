/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package root;

import clases.Auto;
import clases.tiempo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.Timer;

/**
 *
 * @author vanes
 */
public class frm_membresia extends javax.swing.JFrame {

    
    public static LinkedList contenedorMembresia = new LinkedList();
    public int buscar;
    
    public frm_membresia() {
        initComponents();
        this.setLocationRelativeTo(null);
        //tiempo();
        mostrarTiempo();
    }
    
    tiempo tm=new tiempo();
    
    public void mostrarTiempo(){
         txt_hora.setText(tm.horaFormateada);
         txt_fecha.setText(tm.fechaFormateada);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        txt_propietario = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        cb_tipo = new javax.swing.JComboBox<>();
        cb_marca = new javax.swing.JComboBox<>();
        txt_color = new javax.swing.JTextField();
        btn_tabla = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_lugar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Membresia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 190, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 780, 30));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel2.setText("Placa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 80, 30));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel3.setText("Propietario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setText("Hora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel5.setText("Fecha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel6.setText("Tipo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel7.setText("Marca");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, 20));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel8.setText("Modelo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel9.setText("Color");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel10.setText("Lugar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        txt_placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_placaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 132, 200, 30));
        jPanel1.add(txt_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 182, 200, 30));
        jPanel1.add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 232, 200, 30));
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 30));
        jPanel1.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 200, 30));

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Pick up", "Moto" }));
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 200, 30));

        cb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Cadilac", "Chevrolet", "Chrysler", "Dodge", "Ferrari", "Fiat", "Ford", "Honda", "Hyundai", "Jeep", "Kia", "Mazda", "Mercedes Benz", "Nissan", "Ram", "Renault", "Susuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));
        jPanel1.add(cb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 200, 30));
        jPanel1.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 200, 30));

        btn_tabla.setText("Mostrar tabla");
        btn_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 485, 340, 30));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 445, 90, 30));

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 445, 100, 30));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 445, 90, 30));
        jPanel1.add(txt_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        
        String placa=txt_placa.getText();
        String prop=txt_propietario.getText();
        String hora=txt_hora.getText();
        String fecha=txt_fecha.getText();
        String tipo=cb_tipo.getSelectedItem().toString();
        String marca=cb_marca.getSelectedItem().toString();
        int modelo=Integer.parseInt(txt_modelo.getText());
        String color=txt_color.getText();
        int lugar=Integer.parseInt(txt_lugar.getText());
        
        Auto auto=new Auto(placa, prop, hora, fecha, tipo, marca, modelo, color, lugar);
        contenedorMembresia.add(auto);
        
        txt_placa.setText("");
        txt_propietario.setText("");
        txt_modelo.setText("");
        txt_color.setText("");

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_placaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_placaKeyTyped
        // TODO add your handling code here:
        int press=evt.getKeyChar();
        if(press==10){
            String idEncontrado=txt_placa.getText().trim();
            Auto a;
            for(int i = 0; i < contenedorMembresia.size(); i++){
                a=(Auto)contenedorMembresia.get(i);
                if(idEncontrado.equalsIgnoreCase(a.getPlaca())){
                    txt_propietario.setText(a.getPropietario());
                    txt_hora.setText(a.getHora());
                    txt_fecha.setText(a.getFecha());
                    cb_tipo.setSelectedItem(a.getTipo());
                    cb_marca.setSelectedItem(a.getMarca());
                    txt_modelo.setText(Integer.toString(a.getModelo()));
                    txt_color.setText(a.getColor());
                    txt_lugar.setText(Integer.toString(a.getLugar()));
                    
                    buscar=i;
                    break;
                    
                }//Fin if
                    
            }//fin for
            
        }//Fin if
    }//GEN-LAST:event_txt_placaKeyTyped

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
         String placa=txt_placa.getText();
        String prop=txt_propietario.getText();
        String hora=txt_hora.getText();
        String fecha=txt_fecha.getText();
        String tipo=cb_tipo.getSelectedItem().toString();
        String marca=cb_marca.getSelectedItem().toString();
        int modelo=Integer.parseInt(txt_modelo.getText());
        String color=txt_color.getText();
        int lugar=Integer.parseInt(txt_lugar.getText());
        
        Auto auto=new Auto(placa, prop, hora, fecha, tipo, marca, modelo, color, lugar);
        contenedorMembresia.set(buscar, auto);
        
        txt_placa.setText("");
        txt_propietario.setText("");
        
        txt_hora.setText(tm.horaFormateada);
        txt_fecha.setText(tm.fechaFormateada);
        
        txt_modelo.setText("");
        txt_color.setText("");
        txt_lugar.setText("");
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        contenedorMembresia.remove(buscar);
        
        txt_placa.setText("");
        txt_propietario.setText("");
        
        txt_hora.setText(tm.horaFormateada);
        txt_fecha.setText(tm.fechaFormateada);
        
        txt_modelo.setText("");
        txt_color.setText("");
        txt_lugar.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        new panel_root().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoActionPerformed

    private void btn_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablaActionPerformed
        // TODO add your handling code here:
        new csl_membresia().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_tablaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_membresia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_tabla;
    private javax.swing.JComboBox<String> cb_marca;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_lugar;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_propietario;
    // End of variables declaration//GEN-END:variables
}
