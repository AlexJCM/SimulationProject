
package proyectosimulacion.controladores;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelFase1 extends javax.swing.JPanel {
    
    //VARIABLES GLOBALES
    public static Double[] tiempoDeSalidaFaseONE;
    
    //VARIABLES LOCALES
    private double servidores; // numero de servidores
    ////////////////
    private double capacidad = 100;//  Capacidad de la FASE1
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

    public PanelFase1() {
        initComponents();
        
          modelo = new DefaultTableModel();
        tblFase1.setModel(modelo);

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

        jPanel1 = new javax.swing.JPanel();
        txtServidores = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtTasaLlegada = new javax.swing.JTextField();
        txtNroClientes = new javax.swing.JTextField();
        lblTituloFase1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFase1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        lblTituloFase1.setText("Formulario Fase 1");

        jLabel2.setText("Servidores");

        jLabel3.setText("Capacidad");

        jLabel4.setText("Tasa Llegada");

        jLabel5.setText("Nro. Clientes");

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tblFase1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblTituloFase1))
                    .addComponent(jLabel3)
                    .addComponent(txtTasaLlegada)
                    .addComponent(txtServidores)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloFase1)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(txtServidores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTasaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerar)
                        .addGap(23, 23, 23))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        Random aleatorio = new Random(System.currentTimeMillis());
           
        if (validarCampos()) {
            
            Double[] tiempoLlegada = new Double[Integer.parseInt(txtCapacidad.getText())];
            Double[] tiempoAtencion = new Double[Integer.parseInt(txtCapacidad.getText())];
            tiempoDeSalidaFaseONE = new Double[Integer.parseInt(txtCapacidad.getText())];///

            for (int i = 1; i <= clientes; i++) {
                aleatorio1 = aleatorio.nextDouble();
                aleatorio2 = aleatorio.nextDouble();
                tiempoLlegada[i] = (-(Math.log(1 - aleatorio1)) * (1 / tasaLlegada) * 60);
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
                tiempoDeSalidaFaseONE[i] = tiempoInicio + tiempoAtencion[i];////Para enviarlo a la fase2

                //Se guardará en el array los campos del cliente numero i
                Object[] object = new Object[5];
                object[0] = i;
                //object[2] = HoraMinuto(tiempoLlegada[i]);
                object[1] = HoraMinuto1(momentoLlegada);
                object[2] = HoraMinuto(tiempoInicio);
                //object[3] = HoraMinuto(tiempoEspera);           
                object[3] = HoraMinuto(tiempoAtencion[i]);
                object[4] = HoraMinuto1(tiempoSalida);

                modelo.addRow(object);
            }//Fin del for

            limpiar();
        }


    }//GEN-LAST:event_btnGenerarActionPerformed

    public String HoraMinuto(double minutos) {
        String formato = "%02d:%02d";
        long horasReales = TimeUnit.MINUTES.toHours((int) minutos);
        long minutosReales = TimeUnit.MINUTES.toMinutes((int) minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours((int) minutos));

        return String.format(formato, horasReales, minutosReales);
    }

    public String HoraMinuto1(double minutos) {
        String formato = "%02d:%02d";

        long horasReales = TimeUnit.MINUTES.toHours((int) minutos);
        horasReales = horasReales + 8;
        long minutosReales = TimeUnit.MINUTES.toMinutes((int) minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours((int) minutos));
        return String.format(formato, horasReales, minutosReales);
    }

    private void limpiar() {
        txtCapacidad.setText("");
        txtNroClientes.setText("");
        txtServidores.setText("");
        txtTasaLlegada.setText("");
    }

    public boolean validarCampos() {
        boolean validar = txtCapacidad.getText().isEmpty() || txtNroClientes.getText().isEmpty() || 
                txtServidores.getText().isEmpty() || txtTasaLlegada.getText().isEmpty();
        boolean aux = false;
        
        if (validar) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
            servidores = Integer.parseInt(txtServidores.getText());
            capacidad = Integer.parseInt(txtCapacidad.getText());
            tasaLlegada = Integer.parseInt(txtTasaLlegada.getText());
            clientes = Integer.parseInt(txtNroClientes.getText());

            if (clientes >= capacidad) {
                JOptionPane.showMessageDialog(this, "El # de clientes NO debe ser mayor o igual a la Capacidad del Servidor");
                txtNroClientes.setText("");
            } else {
                if (servidores > 4) {
                    JOptionPane.showMessageDialog(this, "El # maximo de servidores permitidos es 4");
                    txtServidores.setText("");
                } else 
                {
                    //Si llegó hasta aquí es porque todos los controles
                    aux = true;
                }
            }
        }

        return aux;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloFase1;
    private javax.swing.JTable tblFase1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtNroClientes;
    private javax.swing.JTextField txtServidores;
    private javax.swing.JTextField txtTasaLlegada;
    // End of variables declaration//GEN-END:variables
}
