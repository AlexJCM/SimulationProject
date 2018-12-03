package proyectosimulacion.animaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import static proyectosimulacion.animaciones.Contenedor.columna;
import proyectosimulacion.controladores.AllTables;
import proyectosimulacion.modelo.Cliente;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();

        panel.add(new Contenedor(panel));
        t = new Timer(100, acciones);
        //timer tiempo de demora 15 se puede aumentar para hacer mas lento

    }
    private String numCliente;
    private String momentoLllegada;
    private String tiempoInicio;
    private String tiempoAtencion;
    private String tiempoSalida;
    public int i = 0;
    public static String label="08:00:00";
    private Timer t;
    private int h = 8, m, s;
    private ActionListener acciones = new ActionListener() {
//acciones para recorrer hora, minuto y segundo
        @Override
        public void actionPerformed(ActionEvent ae) {
            ++s;
            if (s == 60) {
                s = 0;

                ++m;
            }
            if (m == 60) {
                m = 0;

                ++h;
            }
            if (h == 60) {
                h = 0;
            }

            actualizarLabel();
        }

    };

    private void actualizarLabel() {
        //actualiza el label para ser parecr que esta corriendo el tiempo y ademas se da la animacion median el reocrrido de los objeto ojo hay que hacer bien este metodo depende de toda la animacion
        //ayudar a haecr el metodo eficiente para que se vean mas naturales las corridas AYUDA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s;
        etiquetaTiempo.setText(tiempo);
        label = etiquetaTiempo.getText();
        panel.repaint();
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
        parar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 255, 255));
        setFocusable(false);

        boton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        boton.setText("Activar");
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

        parar.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        parar.setText("Parar");
        parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararActionPerformed(evt);
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
                .addComponent(parar)
                .addGap(517, 517, 517)
                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton)
                    .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        t.start();
        boton.setEnabled(false);
        boton.setText("Reanudar");
        parar.setEnabled(true);
    }//GEN-LAST:event_botonActionPerformed

    private void pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararActionPerformed
        t.stop();
        boton.setEnabled(true);
        parar.setEnabled(false);
    }//GEN-LAST:event_pararActionPerformed

    public static void main(String args[]) {

        new Ventana().setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panel;
    private javax.swing.JButton parar;
    // End of variables declaration//GEN-END:variables
}
