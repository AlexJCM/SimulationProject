package proyectosimulacion.controladores;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fase1 extends javax.swing.JFrame {
    
    //VARIABLES GLOBALES
    public static Double[] tiempoDeSalidaFaseONE;
    
    //VARIABLES LOCALES
    private double servidores; // numero de servidores
    ////////////////
    private double capacidad;//  Capacidad de la FASE1
    private double clientes;//   numero de clientes
    private double aleatorio1;//
    private double tasaLlegada;//12/hora aprox. Tambien hay un array con un nombre similar
    private double momentoLlegada = 0;
    private double tiempoInicio = 0;
    private double tiempoEspera;      
    private double aleatorio2;   
     //tiempo atencion es declarado cmo array
    private double tiempoSalida;//es el tiempo de llegada de la fase1

    DefaultTableModel modelo;

    public Fase1() {        
        initComponents();        
        
        modelo = new DefaultTableModel();
        tablaFase1.setModel(modelo);

        modelo.addColumn("Cliente");//aprox. 12 cada hora
        //modelo.addColumn("Aleatorio 1");
       // modelo.addColumn("Tiempo de Llegada");//Calculado en base al aleatiorio1  
        modelo.addColumn("Momento de Llegada");//M. de Ll. del cliente que está adelante  + T. de Ll. de éste cliente.
        modelo.addColumn("Tiempo Inicio de Servicio");//(T. de I. de servicio + T. de Atencion) del cliente que está adelante
      //  modelo.addColumn("Tiempo de Espera");//T. de I. de servicio - Momento de Llegada del mismo cliente
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
        jLabelTasaLlegada = new javax.swing.JLabel();
        tasaLlegadaField = new javax.swing.JTextField();
        jLabelClientes = new javax.swing.JLabel();
        clientesField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFase1 = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFase1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario FASE 1"));
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

        jLabelTasaLlegada.setText("Tasa Llegada / h");
        jLabelTasaLlegada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFase1.add(jLabelTasaLlegada);
        jPanelFase1.add(tasaLlegadaField);

        jLabelClientes.setText("Nro. Clientes");
        jLabelClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFase1.add(jLabelClientes);
        jLabelClientes.getAccessibleContext().setAccessibleDescription("");

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
        if (tablaFase1.getColumnModel().getColumnCount() > 0) {
            tablaFase1.getColumnModel().getColumn(0).setMinWidth(48);
            tablaFase1.getColumnModel().getColumn(0).setPreferredWidth(69);
            tablaFase1.getColumnModel().getColumn(0).setMaxWidth(70);
        }
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFase1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
       
        Random aleatorio = new Random(System.currentTimeMillis());        

        capacidad = Integer.parseInt(capacidadField.getText());
        tasaLlegada = Integer.parseInt(tasaLlegadaField.getText());
        clientes = Integer.parseInt(clientesField.getText());        
        
        if(clientes >= capacidad){
              JOptionPane.showMessageDialog(this, "El # de clientes NO debe ser mayor o igual a la Capacidad del Servidor");
              limpiar();
        } else{

        Double[] tiempoLlegada = new Double[Integer.parseInt(capacidadField.getText())];    
        Double[] tiempoAtencion = new Double[Integer.parseInt(capacidadField.getText())];
        tiempoDeSalidaFaseONE = new Double[Integer.parseInt(capacidadField.getText())];///

        for (int i = 1; i <= clientes; i++) {
            aleatorio1 = aleatorio.nextDouble();
            aleatorio2 = aleatorio.nextDouble();
            tiempoLlegada[i] = (-(Math.log(1 - aleatorio1)) * (1 / tasaLlegada) * 60);
            tiempoAtencion[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * 60);
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
            tiempoDeSalidaFaseONE[i] = tiempoInicio + tiempoAtencion[i];////Para enviarlo a la fase2
            
            //Se guardará en el array los campos del cliente numero i
            Object[] object = new Object[5];
            object[0] = i;            
            //object[2] = HoraMinuto(tiempoLlegada[i]);
            object[1] = HoraMinuto1(momentoLlegada);
            object[2] = HoraMinuto1(tiempoInicio);
            //object[3] = HoraMinuto(tiempoEspera);           
            object[3] = HoraMinuto(tiempoAtencion[i]);
            object[4] = HoraMinuto1(tiempoSalida);

            modelo.addRow(object);
        }//Fin del for
        
       limpiar();
       
        }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed
     public String HoraMinuto(double minutos) {
        String formato = "%02d:%02d";
        long horasReales = TimeUnit.MINUTES.toHours((int)minutos);
        long minutosReales = TimeUnit.MINUTES.toMinutes((int)minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours((int)minutos));

        return String.format(formato, horasReales, minutosReales);
     }
     
      public String HoraMinuto1(double minutos) {
        String formato = "%02d:%02d";

        long horasReales = TimeUnit.MINUTES.toHours((int)minutos);
        horasReales= horasReales+8;
        long minutosReales = TimeUnit.MINUTES.toMinutes((int)minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours((int)minutos));
        return String.format(formato, horasReales, minutosReales);
    }
       
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
        tasaLlegadaField.setText("");
        clientesField.setText("");
    }
    
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
    private javax.swing.JLabel jLabelTasaLlegada;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFase1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFase1;
    private javax.swing.JTextField tasaLlegadaField;
    // End of variables declaration//GEN-END:variables


}


