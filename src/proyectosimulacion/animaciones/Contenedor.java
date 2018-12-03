package proyectosimulacion.animaciones;

import javax.swing.JComponent;

import javax.swing.JPanel;

import javax.swing.ImageIcon;

import java.awt.Graphics;

import java.awt.Color;
import java.time.LocalTime;
import proyectosimulacion.controladores.AllTables;
import proyectosimulacion.animaciones.Ventana;
import proyectosimulacion.modelo.Cliente;
import proyectosimulacion.controladores.utilidades.Util;

public class Contenedor extends JComponent {

    static JPanel panel;

    static int columna = 30;

    static int fila = 0;

    int pos1 = 0;
    int pos2 = 150;
    int pos3 = 300;
    int pos4 = 450;

    int servicio1 = 35;
    int servicio2 = 315;
    int servicio3 = 455;
    int servicio4 = 735;
    int servicio5 = 875;
    int servicio6 = 1015;
    int servicio7 = 1155;
    int servicio8 = 1435;

    int servicio2_3 = 315;
    int servicio4567 = 735;

    int numero = 315;

    int pos11 = 820;

    int s, p;

    Contenedor(JPanel panel) {
        Contenedor.panel = panel;

        setBounds(0, 0, panel.getWidth(), panel.getHeight());
    }
//dibujado de la pantalla la columna, fila de el aspecto de movimiento mediante los hilos

    @Override
    public void paint(Graphics g) {
        //solo prestar atencion al img de este depende que se dibujen los clienteS

        ImageIcon silla = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/silla.png")).getImage());
        ImageIcon puerta = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/puerta.png")).getImage());
        ImageIcon venta = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/ventanilla.jpg")).getImage());

        g.drawImage(puerta.getImage(), 35, 0, 100, 100, null);
        g.drawImage(puerta.getImage(), 1435, 0, 100, 100, null);

        g.drawImage(venta.getImage(), 35, 900, 100, 100, null);
        g.drawImage(venta.getImage(), 315, 900, 100, 100, null);
        g.drawImage(venta.getImage(), 455, 900, 100, 100, null);
        g.drawImage(venta.getImage(), 735, 900, 100, 100, null);
        g.drawImage(venta.getImage(), 875, 900, 100, 100, null);
        g.drawImage(venta.getImage(), 1015, 900, 100, 100, null);
        g.drawImage(venta.getImage(), 1155, 900, 100, 100, null);
        g.drawImage(venta.getImage(), 1435, 900, 100, 100, null);

        g.drawImage(silla.getImage(), 315, 0, 100, 100, null);
        g.drawImage(silla.getImage(), 455, 0, 100, 100, null);
        g.drawImage(silla.getImage(), 595, 0, 100, 100, null);
        g.drawImage(silla.getImage(), 735, 0, 100, 100, null);
        g.drawImage(silla.getImage(), 875, 0, 100, 100, null);
        g.drawImage(silla.getImage(), 1015, 0, 100, 100, null);
        g.drawImage(silla.getImage(), 1155, 0, 100, 100, null);

        g.drawImage(silla.getImage(), 315, 150, 100, 100, null);
        g.drawImage(silla.getImage(), 455, 150, 100, 100, null);
        g.drawImage(silla.getImage(), 595, 150, 100, 100, null);
        g.drawImage(silla.getImage(), 735, 150, 100, 100, null);
        g.drawImage(silla.getImage(), 875, 150, 100, 100, null);
        g.drawImage(silla.getImage(), 1015, 150, 100, 100, null);
        g.drawImage(silla.getImage(), 1155, 150, 100, 100, null);

        g.drawImage(silla.getImage(), 315, 300, 100, 100, null);
        g.drawImage(silla.getImage(), 455, 300, 100, 100, null);
        g.drawImage(silla.getImage(), 595, 300, 100, 100, null);
        g.drawImage(silla.getImage(), 735, 300, 100, 100, null);
        g.drawImage(silla.getImage(), 875, 300, 100, 100, null);
        g.drawImage(silla.getImage(), 1015, 300, 100, 100, null);
        g.drawImage(silla.getImage(), 1155, 300, 100, 100, null);

        g.drawImage(silla.getImage(), 315, 450, 100, 100, null);
        g.drawImage(silla.getImage(), 455, 450, 100, 100, null);
        g.drawImage(silla.getImage(), 595, 450, 100, 100, null);
        g.drawImage(silla.getImage(), 735, 450, 100, 100, null);
        g.drawImage(silla.getImage(), 875, 450, 100, 100, null);
        g.drawImage(silla.getImage(), 1015, 450, 100, 100, null);
        g.drawImage(silla.getImage(), 1155, 450, 100, 100, null);

        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/1.png")).getImage());
        AllTables u = new AllTables();
        if (!Ventana.label.equals("08:00:00")) {
            if (numero == 1155) {
                numero = 315;
            }
            if (servicio2_3 == 455) {
                servicio2_3 = 315;
            }
            if (servicio4567 == 1155) {
                servicio4567 = 735;
            }
            for (int i = 0; i < u.arrayClientesF4.size() - 1; i++) {
                //////////////////////////////////////////////
                //array 1
                System.out.println(Util.reverseHora(Ventana.label));
                if (Util.reverseHora(u.arrayClientesF1.get(i).getMomentoLllegada()) <= Util.reverseHora(Ventana.label) && Util.reverseHora(u.arrayClientesF1.get(i).getTiempoInicio()) >= Util.reverseHora(Ventana.label)) {
                    g.drawImage(img.getImage(), numero, pos1, 80, 80, null);
                }/*else{
                    numero += 140;
                }*/
                if (Util.reverseHora(u.arrayClientesF1.get(i).getTiempoInicio()) <= Util.reverseHora(Ventana.label) &&Util.reverseHora(u.arrayClientesF1.get(i).getTiempoSalida())  >=Util.reverseHora(Ventana.label) ) {
                    g.drawImage(img.getImage(), servicio1, pos11, 80, 80, null);
                }
                /////////////////////////////////////////////
                //array 2
                if (Util.reverseHora(u.arrayClientesF2.get(i).getMomentoLllegada()) <=Util.reverseHora(Ventana.label)  &&Util.reverseHora(u.arrayClientesF2.get(i).getTiempoInicio() ) >= Util.reverseHora(Ventana.label)) {
                    g.drawImage(img.getImage(), numero, pos2, 80, 80, null);
                }/*else{
                    numero += 140;
                }*/
                if (Util.reverseHora(u.arrayClientesF2.get(i).getTiempoInicio()) <=Util.reverseHora(Ventana.label)  && Util.reverseHora(u.arrayClientesF2.get(i).getTiempoSalida()) >=Util.reverseHora(Ventana.label) ) {
                    g.drawImage(img.getImage(), servicio2_3, pos11, 80, 80, null);
                }/*else{
                    servicio2_3 += 140;
                }*/
                ////////////////////////////////////////////
                //array 3
                if (Util.reverseHora(u.arrayClientesF3.get(i).getMomentoLllegada()) <= Util.reverseHora(Ventana.label) &&Util.reverseHora(u.arrayClientesF3.get(i).getTiempoInicio())  >= Util.reverseHora(Ventana.label)) {
                    g.drawImage(img.getImage(), numero, pos3, 80, 80, null);
                }/*else{
                    numero += 140;
                }*/
                if (Util.reverseHora(u.arrayClientesF3.get(i).getTiempoInicio()) <=Util.reverseHora(Ventana.label)  &&Util.reverseHora(u.arrayClientesF3.get(i).getTiempoSalida() ) >= Util.reverseHora(Ventana.label)) {
                    g.drawImage(img.getImage(), servicio4567, pos11, 80, 80, null);
                }/*else{
                    servicio4567 += 140;
                }*/
                ///////////////////////////////////////////
                //array 4
                if (Util.reverseHora(u.arrayClientesF4.get(i).getMomentoLllegada()) <= Util.reverseHora(Ventana.label) && Util.reverseHora(u.arrayClientesF4.get(i).getTiempoInicio()) >= Util.reverseHora(Ventana.label)) {
                    g.drawImage(img.getImage(), numero, pos4, 80, 80, null);
                }
                /*else{
                    numero += 140;
                }*/
                if (Util.reverseHora(u.arrayClientesF4.get(i).getTiempoInicio()) <= Util.reverseHora(Ventana.label) &&Util.reverseHora(u.arrayClientesF4.get(i).getTiempoSalida())  >=Util.reverseHora( Ventana.label)) {
                    g.drawImage(img.getImage(), servicio8, pos11, 80, 80, null);
                }
                ////////////////////////////////////
                //salida
                if (Util.reverseHora(u.arrayClientesF4.get(i).getTiempoSalida())<=Util.reverseHora(Ventana.label)&&Util.reverseHora(u.arrayClientesF4.get(i).getTiempoSalida()+0.5)>=Util.reverseHora(Ventana.label)) {
                    g.drawImage(img.getImage(), 1435, 0, 80, 80, null);
                }
                
                /*if (Ventana.label.equals(u.arrayClientesF4.get(i).getTiempoSalida())) {
                    g.drawImage(img.getImage(), 1435, 0, 80, 80, null);
                }

                if (u.arrayClientesF1.get(i).getMomentoLllegada().equals(u.arrayClientesF1.get(i).getTiempoInicio())) {
                    if (Ventana.label.equals(u.arrayClientesF1.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio1, pos11, 80, 80, null);
                    }
                } else {
                    if (Ventana.label.equals(u.arrayClientesF1.get(i).getMomentoLllegada())) {
                        g.drawImage(img.getImage(), numero, pos1, 80, 80, null);
                    }
                    if (Ventana.label.equals(u.arrayClientesF1.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio1, pos11, 80, 80, null);
                    }
                }
                if (u.arrayClientesF2.get(i).getMomentoLllegada().equals(u.arrayClientesF2.get(i).getTiempoInicio())) {
                    if (Ventana.label.equals(u.arrayClientesF2.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio2_3, pos11, 80, 80, null);
                    }
                } else {
                    if (Ventana.label.equals(u.arrayClientesF2.get(i).getMomentoLllegada())) {

                        g.drawImage(img.getImage(), numero, pos2, 80, 80, null);
                    }
                    if (Ventana.label.equals(u.arrayClientesF2.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio2_3, pos11, 80, 80, null);
                    }
                }
                if (u.arrayClientesF3.get(i).getMomentoLllegada().equals(u.arrayClientesF3.get(i).getTiempoInicio())) {
                    if (Ventana.label.equals(u.arrayClientesF3.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio4567, pos11, 80, 80, null);
                    }
                } else {
                    if (Ventana.label.equals(u.arrayClientesF3.get(i).getMomentoLllegada())) {

                        g.drawImage(img.getImage(), numero, pos3, 80, 80, null);
                    }
                    if (Ventana.label.equals(u.arrayClientesF3.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio4567, pos11, 80, 80, null);
                    }
                }

                if (u.arrayClientesF4.get(i).getMomentoLllegada().equals(u.arrayClientesF4.get(i).getTiempoInicio())) {
                    if (Ventana.label.equals(u.arrayClientesF4.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio8, pos11, 80, 80, null);
                    }
                } else {
                    if (Ventana.label.equals(u.arrayClientesF4.get(i).getMomentoLllegada())) {

                        g.drawImage(img.getImage(), numero, pos4, 80, 80, null);
                    }
                    if (Ventana.label.equals(u.arrayClientesF4.get(i).getTiempoInicio())) {

                        g.drawImage(img.getImage(), servicio8, pos11, 80, 80, null);
                    }
                }
                if (Ventana.label.equals(u.arrayClientesF4.get(i).getTiempoSalida())) {
                    s = 1435;
                    p = 0;
                    g.drawImage(img.getImage(), 1435, 0, 80, 80, null);
                }*/
            }

        }
    }
}
