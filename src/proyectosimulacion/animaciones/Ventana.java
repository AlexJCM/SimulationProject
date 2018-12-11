package proyectosimulacion.animaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import proyectosimulacion.controladores.AllTables;
import proyectosimulacion.controladores.utilidades.Util;
import proyectosimulacion.modelo.Cliente;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();

        panel.add(new Contenedor(panel));
        t = new Timer(15, acciones);
        etiquetaTiempo.setText(label);
        //timer tiempo de demora 15 se puede aumentar para hacer mas lento

    }
    private String numCliente;
    private String momentoLllegada;
    private String tiempoInicio;
    private String tiempoAtencion;
    private String tiempoSalida;
    public int i = 0;
    public static String fin =" ";
    public static String label = AllTables.horaInicio + ":00";
    private Timer t;
    private int h = Integer.parseInt(Util.reverseHoraArreglo(label)[0]), h1=0, m = Integer.parseInt(Util.reverseHoraArreglo(label)[1]), s = Integer.parseInt(Util.reverseHoraArreglo(label)[2]);
    private ActionListener acciones = new ActionListener() {
//acciones para recorrer hora, minuto y segundo
        @Override
        public void actionPerformed(ActionEvent ae) {
            s = s + i;
            if (s >= 60) {
                s = 0;
                ++m;
            }
            if (m == 60) {
                m = 0;
                ++h1;
                ++h;
            }
            if (h == 60) {
                h = 0;
               h1 = 0;
            }

            actualizarLabel();
        }
    };

    private void actualizarLabel() {
        //actualiza el label para ser parecr que esta corriendo el tiempo y ademas se da la animacion median el reocrrido de los objeto ojo hay que hacer bien este metodo depende de toda la animacion
        //ayudar a haecr el metodo eficiente para que se vean mas naturales las corridas AYUDA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if (!AllTables.horaCierre.toString().equals(etiquetaTiempo.getText().toString())) {
            String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s;
            etiquetaTiempo.setText(tiempo);
            label = (h1 <= 9 ? "0" : "") + h1 + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s;
            panel.repaint();
        } else {
            t.stop();
        }
        if (Util.reverseHora(label) >= Util.reverseHora(AllTables.arrayClientesF4.get(AllTables.arrayClientesF4.size()-1).getTiempoSalida())) {
            t.stop();
            fin="fin";
            panel.repaint();
            JOptionPane.showMessageDialog(rootPane, "Se fue el ultimo Cliente");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        etiquetaTiempo = new javax.swing.JLabel();
        bx5 = new javax.swing.JButton();
        bx10 = new javax.swing.JButton();
        bx15 = new javax.swing.JButton();
        bnormal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 255, 255));
        setFocusable(false);

        boton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        boton.setText("Comenzar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(205, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(596, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                            .addComponent(jSeparator2))))
                .addGap(190, 190, 190))
        );

        etiquetaTiempo.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        etiquetaTiempo.setText("08:00:00");

        bx5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bx5.setText("x5");
        bx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bx5ActionPerformed(evt);
            }
        });

        bx10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bx10.setText("x10");
        bx10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bx10ActionPerformed(evt);
            }
        });

        bx15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bx15.setText("x15");
        bx15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bx15ActionPerformed(evt);
            }
        });

        bnormal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bnormal.setText("Normal");
        bnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnormal)
                .addGap(86, 86, 86)
                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(bx5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bx10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bx15)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton)
                    .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bx5)
                    .addComponent(bx10)
                    .addComponent(bx15)
                    .addComponent(bnormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed

        if (boton.getText().toString().equals("Comenzar")) {
            t.start();
            i = 1;
            boton.setText("Parar");
        } else {
            t.stop();
            boton.setText("Comenzar");
        }
    }//GEN-LAST:event_botonActionPerformed

    private void bnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnormalActionPerformed
        i = 1;
    }//GEN-LAST:event_bnormalActionPerformed

    private void bx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bx5ActionPerformed
        i = 5;
    }//GEN-LAST:event_bx5ActionPerformed

    private void bx10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bx10ActionPerformed
        i = 10;
    }//GEN-LAST:event_bx10ActionPerformed

    private void bx15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bx15ActionPerformed
        i = 15;
    }//GEN-LAST:event_bx15ActionPerformed

    public static void main(String args[]) {

        new Ventana().setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnormal;
    private javax.swing.JButton boton;
    private javax.swing.JButton bx10;
    private javax.swing.JButton bx15;
    private javax.swing.JButton bx5;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
