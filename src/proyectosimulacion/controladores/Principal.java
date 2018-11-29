
package proyectosimulacion.controladores;


public class Principal extends javax.swing.JFrame {
    
    PanelFase1 p1;
    PanelFase2 p2;
    public String varPanel1="0";//van public para acceder desde otra clase
    public String varPanel2="0";
    
    
    public Principal() {
        initComponents();
        AbrirPanelFase1();//se abrirá este panel ppor defecto
    }
    
    private void AbrirPanelFase1() {
        if (varPanel1.equals("0")) {
            p1 = new PanelFase1();
            contenedorPaneles.addTab("Panel 1", p1);
            contenedorPaneles.setSelectedComponent(p1);
        } else {
            contenedorPaneles.setSelectedComponent(p1);
        }
        varPanel1 = "1";//para que no vuelva a abrir el panel otrra vez

    }
        private void AbrirPanelFase2() {
        if (varPanel2.equals("0")) {
            p2 = new PanelFase2();
            contenedorPaneles.addTab("Panel 2", p2);
            contenedorPaneles.setSelectedComponent(p2);
        } else {
            contenedorPaneles.setSelectedComponent(p2);
        }
        varPanel2 = "1";//para que no vuelva a abrir el panel otrra vez

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFase1 = new javax.swing.JButton();
        btnFase2 = new javax.swing.JButton();
        btnFase3 = new javax.swing.JButton();
        btnFase4 = new javax.swing.JButton();
        contenedorPaneles = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFase1.setText("FASE 1");
        btnFase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase1ActionPerformed(evt);
            }
        });

        btnFase2.setText("FASE 2");
        btnFase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase2ActionPerformed(evt);
            }
        });

        btnFase3.setText("FASE 3");

        btnFase4.setText("FASE 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnFase1)
                        .addGap(18, 18, 18)
                        .addComponent(btnFase2)
                        .addGap(18, 18, 18)
                        .addComponent(btnFase3)
                        .addGap(18, 18, 18)
                        .addComponent(btnFase4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contenedorPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFase1)
                    .addComponent(btnFase2)
                    .addComponent(btnFase3)
                    .addComponent(btnFase4))
                .addGap(18, 18, 18)
                .addComponent(contenedorPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase1ActionPerformed
        AbrirPanelFase1();
        
    }//GEN-LAST:event_btnFase1ActionPerformed

    private void btnFase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase2ActionPerformed
        AbrirPanelFase2();
    }//GEN-LAST:event_btnFase2ActionPerformed

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
    private javax.swing.JButton btnFase1;
    private javax.swing.JButton btnFase2;
    private javax.swing.JButton btnFase3;
    private javax.swing.JButton btnFase4;
    private javax.swing.JTabbedPane contenedorPaneles;
    // End of variables declaration//GEN-END:variables
}
