package proyectosimulacion.controladores;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fase1 extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public Fase1() {
        initComponents();
      
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        modelo.addColumn("Cliente");
        modelo.addColumn("Aleatorio 1");
        modelo.addColumn("Tiempo de Llegada");
        modelo.addColumn("Momento de Llegada");
        modelo.addColumn("Tiempo Inicio de Servicio");
        modelo.addColumn("Tiempo de Espera");
        modelo.addColumn("Aleatorio 2");
        modelo.addColumn("Tiempo de Atencion");
        modelo.addColumn("Tiempo de Salida");

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        capacidadField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        llegadaField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clientesField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));
        jPanel1.setLayout(new java.awt.GridLayout(9, 0));

        jLabel1.setText("Capacidad");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1);

        capacidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadFieldActionPerformed(evt);
            }
        });
        jPanel1.add(capacidadField);

        jLabel2.setText("Llegada");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2);
        jPanel1.add(llegadaField);

        jLabel3.setText("Clientes");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3);
        jPanel1.add(clientesField);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        jButtonGuardar.setText("Aceptar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(221, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Formulario FASE 2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        double capacidad = 100;//  numero fijo
        double llegada;//gerear aleatoriamente 
        double clientes;//gerear aleatoriamente 
        double aleatorio1;//gerear aleatoriamente 
        double momentoLlegada = 0;
        double tiempoEspera;
        double aleatorio2;
        double tiempoInicio = 0;
        double tiempoSalida;//es el tiempo de llegada de la fase2

        Random aleatorio = new Random(System.currentTimeMillis());

        capacidad = Integer.parseInt(capacidadField.getText());
        llegada = Integer.parseInt(llegadaField.getText());
        clientes = Integer.parseInt(clientesField.getText());

        Double[] tiempoLlegada = new Double[Integer.parseInt(capacidadField.getText())];
        Double[] tiempoAtencion = new Double[Integer.parseInt(capacidadField.getText())];

        for (int i = 1; i <= clientes; i++) {
            aleatorio1 = aleatorio.nextDouble();
            aleatorio2 = aleatorio.nextDouble();
            tiempoLlegada[i] = (-(Math.log(1 - aleatorio1)) * (1 / llegada) * 60);
            tiempoAtencion[i] = (-(Math.log(1 - aleatorio2)) * (1 / capacidad) * 60);
            if (i == 1) {
                momentoLlegada = tiempoLlegada[i];
                tiempoEspera = 0.0000000000;
                tiempoInicio = tiempoLlegada[i];
            } else {
                momentoLlegada = momentoLlegada + tiempoLlegada[i];
                tiempoInicio = tiempoInicio + tiempoAtencion[i - 1];
                if (tiempoInicio < momentoLlegada) {
                    tiempoInicio = momentoLlegada;
                }
                tiempoEspera = tiempoInicio - momentoLlegada;
                if (tiempoEspera < 0) {
                    tiempoEspera = 0;
                }
            }
            tiempoSalida = tiempoInicio + tiempoAtencion[i];

            Object[] object = new Object[9];
            object[0] = i;
            object[1] = aleatorio1;
            object[2] = tiempoLlegada[i];
            object[3] = momentoLlegada;
            object[4] = tiempoInicio;
            object[5] = tiempoEspera;
            object[6] = aleatorio2;
            object[7] = tiempoAtencion[i];
            object[8] = tiempoSalida;

            modelo.addRow(object);
        }

        limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila != -1) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void capacidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadFieldActionPerformed

    private void limpiar() {
        capacidadField.setText("");
        llegadaField.setText("");
        clientesField.setText("");
    }

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
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capacidadField;
    private javax.swing.JTextField clientesField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField llegadaField;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
