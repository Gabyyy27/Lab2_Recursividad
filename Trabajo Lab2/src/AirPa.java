/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author porti
 */
public class AirPa extends javax.swing.JFrame {

    /**
     * Creates new form AirPa
     */
    
    public AirPa() {
        initComponents();
        PalindromoAir palindromoAir = new PalindromoAir();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VENDER_B = new javax.swing.JDialog();
        NombrePasajero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnVENDER = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        VENDER = new javax.swing.JButton();
        CANCELAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        INGRESOS = new javax.swing.JButton();
        DESPACHAR = new javax.swing.JButton();
        REINICIAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();

        jLabel1.setText("Ingrese Nombre");

        btnVENDER.setBackground(new java.awt.Color(0, 204, 0));
        btnVENDER.setText("VENDER");
        btnVENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVENDERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VENDER_BLayout = new javax.swing.GroupLayout(VENDER_B.getContentPane());
        VENDER_B.getContentPane().setLayout(VENDER_BLayout);
        VENDER_BLayout.setHorizontalGroup(
            VENDER_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VENDER_BLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(NombrePasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VENDER_BLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVENDER)
                .addGap(62, 62, 62))
        );
        VENDER_BLayout.setVerticalGroup(
            VENDER_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VENDER_BLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(VENDER_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrePasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(76, 76, 76)
                .addComponent(btnVENDER)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        VENDER.setBackground(new java.awt.Color(0, 153, 153));
        VENDER.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        VENDER.setText("VENDER BOLETO");
        VENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENDERActionPerformed(evt);
            }
        });

        CANCELAR.setBackground(new java.awt.Color(0, 153, 153));
        CANCELAR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CANCELAR.setText("CANCELAR BOLETO");

        MOSTRAR.setBackground(new java.awt.Color(0, 153, 153));
        MOSTRAR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MOSTRAR.setText("MOSTRAR PASAJEROS");

        INGRESOS.setBackground(new java.awt.Color(0, 153, 153));
        INGRESOS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        INGRESOS.setText("INGRESOS TOTALES");

        DESPACHAR.setBackground(new java.awt.Color(0, 153, 153));
        DESPACHAR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DESPACHAR.setText("DESPACHAR AVION");

        REINICIAR.setBackground(new java.awt.Color(0, 153, 153));
        REINICIAR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        REINICIAR.setText("REINICIAR ASIENTOS");

        BUSCAR.setBackground(new java.awt.Color(0, 153, 153));
        BUSCAR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BUSCAR.setText("BUSCAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DESPACHAR)
                        .addGap(37, 37, 37)
                        .addComponent(REINICIAR))
                    .addComponent(INGRESOS)
                    .addComponent(MOSTRAR)
                    .addComponent(CANCELAR)
                    .addComponent(VENDER))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUSCAR)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BUSCAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(VENDER)
                .addGap(18, 18, 18)
                .addComponent(CANCELAR)
                .addGap(18, 18, 18)
                .addComponent(MOSTRAR)
                .addGap(18, 18, 18)
                .addComponent(INGRESOS)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DESPACHAR)
                    .addComponent(REINICIAR))
                .addGap(45, 45, 45))
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

    private void VENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENDERActionPerformed
        // TODO add your handling code here:
        this.VENDER_B.setVisible(true);
        VENDER_B.setSize(400, 300);
        VENDER_B.setLocationRelativeTo(null);
    }//GEN-LAST:event_VENDERActionPerformed

    private void btnVENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVENDERActionPerformed
        // TODO add your handling code here:
        String nombrePasajero = NombrePasajero.getText();

        palindromoAir.sellTicket(nombrePasajero);
    }//GEN-LAST:event_btnVENDERActionPerformed

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
            java.util.logging.Logger.getLogger(AirPa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirPa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirPa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirPa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirPa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton CANCELAR;
    private javax.swing.JButton DESPACHAR;
    private javax.swing.JButton INGRESOS;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JTextField NombrePasajero;
    private javax.swing.JButton REINICIAR;
    private javax.swing.JButton VENDER;
    private javax.swing.JDialog VENDER_B;
    private javax.swing.JButton btnVENDER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}