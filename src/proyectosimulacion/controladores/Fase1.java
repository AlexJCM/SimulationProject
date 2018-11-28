package proyectosimulacion.controladores;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fase1 extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public Fase1() {
        initComponents();
        
        modelo = new DefaultTableModel();
        tablaFase1.setModel(modelo);

        modelo.addColumn("Cliente");//aprox. 12 cada hora
       // modelo.addColumn("Aleatorio 1");
        modelo.addColumn("Tiempo de Llegada");//Calculado en base al aleatiorio1  
        modelo.addColumn("Momento de Llegada");//M. de Ll. del cliente que está adelante  + T. de Ll. de éste cliente.
        modelo.addColumn("Tiempo Inicio de Servicio");//(T. de I. de servicio + T. de Atencion) del cliente que está adelante
        modelo.addColumn("Tiempo de Espera");//T. de I. de servicio - Momento de Llegada del mismo cliente
      // modelo.addColumn("Aleatorio 2");
        modelo.addColumn("Tiempo de Atencion");//Calculado en base al aleatiorio2
        modelo.addColumn("Tiempo de Salida");//T. de I. de servicio + T. de A. del mismo cliente

    }        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFase1 = new javax.swing.JPanel();
        jLabelCapacidad = new javax.swing.JLabel();
        capacidadField = new javax.swing.JTextField();
        jLabelLlegada = new javax.swing.JLabel();
        llegadaField = new javax.swing.JTextField();
        jLabelClientes = new javax.swing.JLabel();
        clientesField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFase1 = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFase1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario FASE 2"));
        jPanelFase1.setLayout(new java.awt.GridLayout(9, 0));

        jLabelCapacidad.setText("Capacidad");
        jLabelCapacidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFase1.add(jLabelCapacidad);

        capacidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadFieldActionPerformed(evt);
            }
        });
        jPanelFase1.add(capacidadField);

        jLabelLlegada.setText("Llegada");
        jLabelLlegada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFase1.add(jLabelLlegada);
        jPanelFase1.add(llegadaField);

        jLabelClientes.setText("Clientes");
        jLabelClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFase1.add(jLabelClientes);
        jPanelFase1.add(clientesField);

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

        jPanelFase1.add(jPanel2);

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanelFase1.add(jButtonAceptar);

        tablaFase1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaFase1);
        tablaFase1.getAccessibleContext().setAccessibleName("");

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanelFase1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFase1.getAccessibleContext().setAccessibleName("Formulario FASE 1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        double capacidad = 100;//  numero fijo
        double llegada;//gerear aleatorriamente 
        double clientes;//gerear aleatoriamente 
        double aleatorio1;//gerear aleatoriamente 
        double momentoLlegada = 0;
        double tiempoEspera;
        double aleatorio2;
        double tiempoInicio = 0;
        double tiempoSalida;//es el tiempo de llegada de la fase1

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

            Object[] object = new Object[7];
            object[0] = i;
           // object[1] = aleatorio1;
            object[1] = tiempoLlegada[i];
            object[2] = momentoLlegada;
            object[3] = tiempoInicio;
            object[4] = tiempoEspera;
            //object[6] = aleatorio2;
            object[5] = tiempoAtencion[i];
            object[6] = tiempoSalida;

            modelo.addRow(object);
        }

        limpiar();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int fila = tablaFase1.getSelectedRow();
        if (fila != -1) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabelCapacidad;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelLlegada;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFase1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField llegadaField;
    private javax.swing.JTable tablaFase1;
    // End of variables declaration//GEN-END:variables
}
