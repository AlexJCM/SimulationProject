
package proyectosimulacion.controladores;

import javax.swing.table.DefaultTableModel;

public class TablaResumen extends javax.swing.JFrame {
    
    public static DefaultTableModel modelResumen;

    public TablaResumen() {
        initComponents();
       initResumeTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblResumen = new javax.swing.JTable();
        lblResumen = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblResumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tblResumen);

        lblResumen.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblResumen.setText("TABLA DE RESUMEN DE LAS 4 FASES");

        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosimulacion/gui/button_exportar (1).png"))); // NOI18N
        btnExportar.setBorder(null);
        btnExportar.setBorderPainted(false);
        btnExportar.setContentAreaFilled(false);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(lblResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 320, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

    
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
            java.util.logging.Logger.getLogger(TablaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaResumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResumen;
    public static javax.swing.JTable tblResumen;
    // End of variables declaration//GEN-END:variables

    private void initResumeTable() {       
       modelResumen = new DefaultTableModel();
       tblResumen.setModel(modelResumen);
       
        modelResumen.addColumn("Cliente");        
        modelResumen.addColumn("Momento Llegada");
        modelResumen.addColumn("T. Inicio de Servicio");
        modelResumen.addColumn("T. de Espera");
        modelResumen.addColumn("T. de Atencion");
        modelResumen.addColumn("T. de Salida");
        modelResumen.addColumn("Estado");
        modelResumen.addColumn("LLegó hasta");
        
        cargarDatosEnTabla();
       
    }

    private void cargarDatosEnTabla() {
         Object[] obj = new Object[8];         
        for (int i = 0; i < AllTables.arrayClientesF1.size(); i++) {            
            obj[0] = AllTables.arrayClientesF1.get(i).getNumCliente();
            obj[1] = AllTables.arrayClientesF1.get(i).getMomentoLllegada();
            obj[2] = AllTables.arrayClientesF1.get(i).getTiempoInicio();
            obj[3] = AllTables.arrayClientesF1.get(i).getTiempoEspera();
            obj[4] = AllTables.arrayClientesF1.get(i).getTiempoAtencion();
            obj[5] = AllTables.arrayClientesF1.get(i).getTiempoSalida();
            obj[6] = AllTables.arrayClientesF1.get(i).getEstado();
            obj[7] = "Por definir hasta DONDE LLEGO";
            modelResumen.addRow(obj);
        }
    }
}
