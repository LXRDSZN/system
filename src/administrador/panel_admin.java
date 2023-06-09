/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import com.login.*;
import root.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author vanes
 */
public class panel_admin extends javax.swing.JFrame {

    /**
     * Creates new form panel_root
     */
    public panel_admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        tiempo();
    }
    
    public void tiempo(){
          Timer timer = new Timer(1000, e -> {
            Date date = new Date();

            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormatter.format(date);
            lb_fecha.setText(formattedDate);

            SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss a");
            String formattedTime = timeFormatter.format(date);
            lb_hora.setText(formattedTime);

            
        });
        timer.start();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        lb_hora = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(58, 59, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/park1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 160));

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario Root");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 160, 28));

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Hora");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 90, 30));

        lb_fecha.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        lb_fecha.setForeground(new java.awt.Color(204, 204, 255));
        lb_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fecha.setText("dd/mm/yyyy");
        jPanel2.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 110, 30));

        lb_hora.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        lb_hora.setForeground(new java.awt.Color(204, 204, 255));
        lb_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hora.setText("hh:mm:ss a.m");
        jPanel2.add(lb_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 140, 40));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Manual.png"))); // NOI18N
        jButton8.setText("Menu");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 130, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 280, 650));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/carroAgr.png"))); // NOI18N
        jButton1.setText("Membresia");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Lugar.png"))); // NOI18N
        jButton3.setText("Lugar");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 150, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/reloj.png"))); // NOI18N
        jButton4.setText("Hora");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 150, 80));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/coche.png"))); // NOI18N
        jButton6.setText("Salida vehiculos");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 150, 80));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salir.png"))); // NOI18N
        jButton7.setText("Cerar sesión");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 150, 80));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menu");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 150, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/renovacion.png"))); // NOI18N
        jButton9.setText("Renovacion");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 150, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/FondoMenu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 650));

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
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_hora;
    // End of variables declaration//GEN-END:variables
}
