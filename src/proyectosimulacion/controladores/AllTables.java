package proyectosimulacion.controladores;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectosimulacion.controladores.utilidades.Util;

public class AllTables extends javax.swing.JFrame {

    //VARIABLES GLOBALES
    public Double[] tiempoDeSalidaFaseONE;
    public Double[] tiempoDeSalidaFaseTWO;
    public Double[] tiempoDeSalidaFaseTHREE;
    public Object[][] tabla1;

    //VARIABLES LOCALES
    private double servidores; // numero de servidores
    ////////////////
    private double capacidad;//  Capacidad de la FASE1
    private double clientes;//   numero de clientes
    private double aleatorio1;
    private double tasaLlegada;//12/hora aprox. Tambien hay un array con un nombre similar
    private double momentoLlegada = 0;
    private double tiempoInicio = 0;
    private double tiempoEspera;
    private double aleatorio2;
    private double tiempoSalida;//es el tiempo de llegada de la fase
    //OTRAS VARIABLES
    private int tasaAbandonoF1 = 7;
    private int tasaRepruebanF3 = 20;    

    DefaultTableModel modeloF1;
    DefaultTableModel modeloF2;
    DefaultTableModel modeloF3;
    DefaultTableModel modeloF4;

    public AllTables() {
        initComponents();
        incializarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        txtCapacidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTasaLlegada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNroClientes = new javax.swing.JTextField();
        panelInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFase3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFase1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFase4 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFase2 = new javax.swing.JTable();
        btnExportar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Capacidad");

        jLabel2.setText("Tasa Llegada");

        txtTasaLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTasaLlegadaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nro Clientes");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTasaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTasaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblFase3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblFase3);

        tblFase1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblFase1);

        tblFase4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblFase4);

        tblFase2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblFase2);

        btnExportar.setText("EXPORTAR");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        jLabel4.setText("FASE 1");

        jLabel5.setText("FASE 2");

        jLabel6.setText("FASE 3");

        jLabel7.setText("FASE 4");

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(16, 16, 16))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnExportar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTasaLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTasaLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTasaLlegadaActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        Random aleatorio = new Random(System.currentTimeMillis());
        int i2 = 0;

        if (validarCampos()) {

            Double[] tiempoLlegada = new Double[Integer.parseInt(txtCapacidad.getText())];
            Double[] tiempoAtencion = new Double[Integer.parseInt(txtCapacidad.getText())];
            tiempoDeSalidaFaseONE = new Double[Integer.parseInt(txtCapacidad.getText())];
            tiempoDeSalidaFaseTWO = new Double[Integer.parseInt(txtCapacidad.getText())];
            tiempoDeSalidaFaseTHREE = new Double[Integer.parseInt(txtCapacidad.getText())];
            tabla1 = new Object[Integer.parseInt(txtNroClientes.getText())][5];
            

// <editor-fold defaultstate="collapsed" desc="for  FASE 1">
            for (int i = 1; i <= clientes; i++) {
                /////////////////////////////////////////////////////////////
                aleatorio1 = aleatorio.nextDouble();
                aleatorio2 = aleatorio.nextDouble();
                tiempoLlegada[i] = (-(Math.log(1 - aleatorio1)) * (1 / tasaLlegada) * 60);
                tiempoAtencion[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * 60);///////
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
                tiempoDeSalidaFaseONE[i] = tiempoSalida;//para enviarlo a la fase 2                
                  
                //Se guardará en el array los campos del cliente numero i
                Object[] objF1 = new Object[5];// era 5                
                objF1[0] = i;
                //object[2] = HoraMinuto(tiempoLlegada[i]);
                objF1[1] = Util.HoraMinuto1(momentoLlegada);
                objF1[2] = Util.HoraMinuto1(tiempoInicio);
                //object[3] = HoraMinuto(tiempoEspera);           
                objF1[3] = Util.HoraMinuto(tiempoAtencion[i]);
                objF1[4] = Util.HoraMinuto1(tiempoSalida);                                  
                 ///////////////////////////////////////////////////////////////////////////
                //guarda cada fila de la tabla en array bidimensional tabla1
                tabla1[i2][0] = objF1[0];                
                tabla1[i2][1] = objF1[1];                
                tabla1[i2][2] = objF1[2];               
                tabla1[i2][3] = objF1[3];
                tabla1[i2][4] = objF1[4];
                i2++;

                modeloF1.addRow(objF1);                      
                

            }//Fin del forF1
            
            //imprime el array bidimensional
            int aux = (int) clientes;
            System.out.println("tamanio tabla1.length: "+ tabla1.length);//filas
            System.out.println("tamanio tabla1[0].length: "+tabla1[0].length); //columnas          
           /* for (int u = 0; u < aux; u++) {
                for (int v = 0; v < 5; v++) {
                    System.out.print(tabla1[u][v] + " - ");
                }
                System.out.println();
            }*/
          // Object[][]abandona=Util.abandonan(tabla1);

// </editor-fold>        
// <editor-fold defaultstate="collapsed" desc="for  FASE 2">  
            for (int i = 1; i <= clientes; i++) {
                aleatorio2 = aleatorio.nextDouble();
                tiempoAtencion[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * 60);///////
                if (i == 1) {
                    momentoLlegada = tiempoDeSalidaFaseONE[i];//viene de la fase 1                   
                    tiempoEspera = 0.0000000000;
                    tiempoInicio = tiempoDeSalidaFaseONE[i];//viene de la fase 1                   
                } else {
                    momentoLlegada = tiempoDeSalidaFaseONE[i];//viene de la fase 1                   
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
                tiempoDeSalidaFaseTWO[i] = tiempoSalida;//para enviarlo a la fase 3

                //Se guardará en el array los campos del cliente numero i
                Object[] objectF2 = new Object[5];
                objectF2[0] = i;
                //object[2] = HoraMinuto(tiempoLlegada[i]);
                objectF2[1] = Util.HoraMinuto1(momentoLlegada);
                objectF2[2] = Util.HoraMinuto1(tiempoInicio);
                //object[3] = HoraMinuto(tiempoEspera);           
                objectF2[3] = Util.HoraMinuto(tiempoAtencion[i]);
                objectF2[4] = Util.HoraMinuto1(tiempoSalida);

                modeloF2.addRow(objectF2);

            }//Fin del forF2    
// </editor-fold>  

// <editor-fold defaultstate="collapsed" desc="for  FASE 3">  
            for (int i = 1; i <= clientes; i++) {
                aleatorio2 = aleatorio.nextDouble();
                tiempoAtencion[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * 60);///////
                if (i == 1) {
                    momentoLlegada = tiempoDeSalidaFaseTWO[i];//viene de la fase 2                   
                    tiempoEspera = 0.0000000000;
                    tiempoInicio = tiempoDeSalidaFaseTWO[i];//viene de la fase 2                   
                } else {
                    momentoLlegada = tiempoDeSalidaFaseTWO[i];//viene de la fase 2                  
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
                tiempoDeSalidaFaseTHREE[i] = tiempoSalida;//para enviarlo a la fase 4

                //Se guardará en el array los campos del cliente numero i
                Object[] objectF3 = new Object[5];
                objectF3[0] = i;
                //object[2] = HoraMinuto(tiempoLlegada[i]);
                objectF3[1] = Util.HoraMinuto1(momentoLlegada);
                objectF3[2] = Util.HoraMinuto1(tiempoInicio);
                //object[3] = HoraMinuto(tiempoEspera);           
                objectF3[3] = Util.HoraMinuto(tiempoAtencion[i]);
                objectF3[4] = Util.HoraMinuto1(tiempoSalida);

                modeloF3.addRow(objectF3);

            }//Fin del forF3 
// </editor-fold>  

// <editor-fold defaultstate="collapsed" desc="for  FASE 4">  
            for (int i = 1; i <= clientes; i++) {
                aleatorio2 = aleatorio.nextDouble();
                tiempoAtencion[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * 60);///////
                if (i == 1) {
                    momentoLlegada = tiempoDeSalidaFaseTHREE[i];//viene de la fase 3                   
                    tiempoEspera = 0.0000000000;
                    tiempoInicio = tiempoDeSalidaFaseTHREE[i];//viene de la fase 3                  
                } else {
                    momentoLlegada = tiempoDeSalidaFaseTHREE[i];//viene de la fase 3                 
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

                //Se guardará en el array los campos del cliente numero i
                Object[] objectF4 = new Object[5];
                objectF4[0] = i;
                //object[2] = HoraMinuto(tiempoLlegada[i]);
                objectF4[1] = Util.HoraMinuto1(momentoLlegada);
                objectF4[2] = Util.HoraMinuto1(tiempoInicio);
                //object[3] = HoraMinuto(tiempoEspera);           
                objectF4[3] = Util.HoraMinuto(tiempoAtencion[i]);
                objectF4[4] = Util.HoraMinuto1(tiempoSalida);

                modeloF4.addRow(objectF4);

            }//Fin del forF4
// </editor-fold>  

        }//Fin del if
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void limpiar() {
        txtCapacidad.setText("");
        txtNroClientes.setText("");
        txtTasaLlegada.setText("");
    }

    public boolean validarCampos() {
        boolean validar = txtCapacidad.getText().isEmpty() || txtNroClientes.getText().isEmpty()
                || txtTasaLlegada.getText().isEmpty();
        boolean aux = false;

        if (validar) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
            capacidad = Integer.parseInt(txtCapacidad.getText());
            tasaLlegada = Integer.parseInt(txtTasaLlegada.getText());
            clientes = Integer.parseInt(txtNroClientes.getText());

            if (clientes >= capacidad) {
                JOptionPane.showMessageDialog(this, "El # de clientes NO debe ser mayor o igual a la Capacidad del Servidor");
                txtNroClientes.setText("");
            } else {

                //Si llegó hasta aquí es porque todos los controles
                aux = true;

            }
        }

        return aux;
    }

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed

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
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllTables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tblFase1;
    private javax.swing.JTable tblFase2;
    private javax.swing.JTable tblFase3;
    private javax.swing.JTable tblFase4;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtNroClientes;
    private javax.swing.JTextField txtTasaLlegada;
    // End of variables declaration//GEN-END:variables

    private void incializarTablas() {
        modeloF1 = new DefaultTableModel();
        modeloF2 = new DefaultTableModel();
        modeloF3 = new DefaultTableModel();
        modeloF4 = new DefaultTableModel();
        tblFase1.setModel(modeloF1);
        tblFase2.setModel(modeloF2);
        tblFase3.setModel(modeloF3);
        tblFase4.setModel(modeloF4);

        modeloF1.addColumn("Cliente");//aprox. 12 cada hora        
        // modelo.addColumn("Tiempo de Llegada");//Calculado en base al aleatiorio1  
        modeloF1.addColumn("Momento Llegada");//M. de Ll. del cliente que está adelante  + T. de Ll. de éste cliente.
        modeloF1.addColumn("T. Inicio de Servicio");//(T. de I. de servicio + T. de Atencion) del cliente que está adelante
        //  modelo.addColumn("Tiempo de Espera");//T. de I. de servicio - Momento de Llegada del mismo cliente        
        modeloF1.addColumn("T. de Atencion");//Calculado en base al aleatiorio2
        modeloF1.addColumn("T. de Salida");//T. de I. de servicio + T. de A. del mismo cliente

        modeloF2.addColumn("Cliente");//aprox. 12 cada hora        
        // modelo.addColumn("Tiempo de Llegada");//Calculado en base al aleatiorio1  
        modeloF2.addColumn("Momento Llegada");//M. de Ll. del cliente que está adelante  + T. de Ll. de éste cliente.
        modeloF2.addColumn("T. Inicio de Servicio");//(T. de I. de servicio + T. de Atencion) del cliente que está adelante
        //  modelo.addColumn("Tiempo de Espera");//T. de I. de servicio - Momento de Llegada del mismo cliente     
        modeloF2.addColumn("T. de Atencion");//Calculado en base al aleatiorio2
        modeloF2.addColumn("T. de Salida");//T. de I. de servicio + T. de A. del mismo cliente

        modeloF3.addColumn("Cliente");//aprox. 12 cada hora       
        // modelo.addColumn("Tiempo de Llegada");//Calculado en base al aleatiorio1  
        modeloF3.addColumn("Momento Llegada");//M. de Ll. del cliente que está adelante  + T. de Ll. de éste cliente.
        modeloF3.addColumn("T. Inicio de Servicio");//(T. de I. de servicio + T. de Atencion) del cliente que está adelante
        //  modelo.addColumn("Tiempo de Espera");//T. de I. de servicio - Momento de Llegada del mismo cliente        
        modeloF3.addColumn("T. de Atencion");//Calculado en base al aleatiorio2
        modeloF3.addColumn("T. de Salida");//T. de I. de servicio + T. de A. del mismo cliente

        modeloF4.addColumn("Cliente");//aprox. 12 cada hora        
        // modelo.addColumn("Tiempo de Llegada");//Calculado en base al aleatiorio1  
        modeloF4.addColumn("Momento Llegada");//M. de Ll. del cliente que está adelante  + T. de Ll. de éste cliente.
        modeloF4.addColumn("T. Inicio de Servicio");//(T. de I. de servicio + T. de Atencion) del cliente que está adelante
        //  modelo.addColumn("Tiempo de Espera");//T. de I. de servicio - Momento de Llegada del mismo cliente        
        modeloF4.addColumn("T. de Atencion");//Calculado en base al aleatiorio2
        modeloF4.addColumn("T. de Salida");//T. de I. de servicio + T. de A. del mismo cliente
    }

}
