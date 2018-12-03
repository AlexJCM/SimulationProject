package proyectosimulacion.animaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import proyectosimulacion.controladores.AllTables;
import proyectosimulacion.modelo.Cliente;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();

        panel.add(new Contenedor(panel));
        t = new Timer(15, acciones);
        //timer tiempo de demora 15 se puede aumentar para hacer mas lento

    }
    private String numCliente;
    private String momentoLllegada;
    private String tiempoInicio;
    private String tiempoAtencion;
    private String tiempoSalida;

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
        //ayudar a haecr el metodo eficiente para que se vean mas naturales las corridas
        String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s;
        etiquetaTiempo.setText(tiempo);
        AllTables u = new AllTables();
        for (Cliente cliente : u.arrayClientesF1) {
            momentoLllegada = cliente.getMomentoLllegada().toString();
            tiempoInicio = cliente.getTiempoInicio().toString();
            for (int i = 0; i < u.arrayClientesF1.size(); i++) {
                if (tiempo.equals(momentoLllegada)) {
                    int silla1 = 315;
                    int silla2 = 455;
                    int silla3 = 595;
                    int silla4 = 735;
                    int silla5 = 875;
                    int silla6 = 1015;
                    int silla7 = 1155;

                    int pos1 = 0;
                    int pos2 = 150;
                    int pos3 = 300;
                    int pos4 = 450;

                    Contenedor.hilo_espera(silla1, pos1);
                }
                if (tiempo.equals(tiempoInicio)) {
                    int servicio1 = 35;
                    int servicio2 = 315;
                    int servicio3 = 455;
                    int servicio4 = 735;
                    int servicio5 = 875;
                    int servicio6 = 1015;
                    int servicio7 = 1155;
                    int servicio8 = 1435;
                    Contenedor.hilo_inicio_servicio(servicio1);
                }

                for (Cliente cliente1 : u.arrayClientesF2) {
                    String momentoLllegada1 = cliente1.getMomentoLllegada().toString();
                    String tiempoInicio1 = cliente1.getTiempoInicio().toString();
                    if (tiempo.equals(momentoLllegada1)) {
                        int silla1 = 315;
                        int silla2 = 455;
                        int silla3 = 595;
                        int silla4 = 735;
                        int silla5 = 875;
                        int silla6 = 1015;
                        int silla7 = 1155;

                        int pos1 = 0;
                        int pos2 = 150;
                        int pos3 = 300;
                        int pos4 = 450;
                        Contenedor.hilo_espera(silla1, pos2);
                    }

                    if (tiempo.equals(tiempoInicio1)) {
                        int servicio1 = 35;
                        int servicio2 = 315;
                        int servicio3 = 455;
                        int servicio4 = 735;
                        int servicio5 = 875;
                        int servicio6 = 1015;
                        int servicio7 = 1155;
                        int servicio8 = 1435;
                        Contenedor.hilo_inicio_servicio(servicio3);
                    }
                    for (Cliente cliente2 : u.arrayClientesF3) {
                        String momentoLllegada2 = cliente2.getMomentoLllegada().toString();
                        String tiempoInicio2 = cliente2.getTiempoInicio().toString();
                        if (tiempo.equals(momentoLllegada2)) {
                            int silla1 = 315;
                            int silla2 = 455;
                            int silla3 = 595;
                            int silla4 = 735;
                            int silla5 = 875;
                            int silla6 = 1015;
                            int silla7 = 1155;

                            int pos1 = 0;
                            int pos2 = 150;
                            int pos3 = 300;
                            int pos4 = 450;
                            Contenedor.hilo_espera(silla3, pos3);
                        }
                        if (tiempo.equals(tiempoInicio2)) {
                            int servicio1 = 35;
                            int servicio2 = 315;
                            int servicio3 = 455;
                            int servicio4 = 735;
                            int servicio5 = 875;
                            int servicio6 = 1015;
                            int servicio7 = 1155;
                            int servicio8 = 1435;
                            Contenedor.hilo_inicio_servicio(servicio5);
                        }
                        for (Cliente cliente3 : u.arrayClientesF4) {
                            String momentoLllegada3 = cliente3.getMomentoLllegada().toString();
                            String tiempoInicio3 = cliente3.getTiempoInicio().toString();
                            tiempoSalida = cliente3.getTiempoSalida().toString();
                            if (tiempo.equals(momentoLllegada3)) {
                                int silla1 = 315;
                                int silla2 = 455;
                                int silla3 = 595;
                                int silla4 = 735;
                                int silla5 = 875;
                                int silla6 = 1015;
                                int silla7 = 1155;

                                int pos1 = 0;
                                int pos2 = 150;
                                int pos3 = 300;
                                int pos4 = 450;
                                Contenedor.hilo_espera(silla4, pos4);
                            }
                            if (tiempo.equals(tiempoInicio3)) {
                                int servicio1 = 35;
                                int servicio2 = 315;
                                int servicio3 = 455;
                                int servicio4 = 735;
                                int servicio5 = 875;
                                int servicio6 = 1015;
                                int servicio7 = 1155;
                                int servicio8 = 1435;
                                Contenedor.hilo_inicio_servicio(servicio8);
                            }

                            if (tiempo.equals(tiempoSalida)) {

                                Contenedor.hilo_salida();
                            }
                        }
                    }
                }
            }
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton)
                    .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        t.start();
    }//GEN-LAST:event_botonActionPerformed

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
    // End of variables declaration//GEN-END:variables
}
