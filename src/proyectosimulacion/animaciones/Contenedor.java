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

    int pos11 = 820;

    AllTables u = new AllTables();

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
        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/1.png")).getImage());

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

        /////////////////////////////////////// array 1 ///////////////////////////////////////////////
        for (int i = 0; i < u.arrayClientesF1.size(); i++) {
            ///////////////////Sillas////////////////////////////////
            if (i + 1 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 1).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 1).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 315, pos1, 80, 80, null);
                }
            }
            if (i + 2 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 2).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 2).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 455, pos1, 80, 80, null);
                }
            }
            if (i + 3 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 3).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 3).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 595, pos1, 80, 80, null);
                }
            }
            if (i + 4 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 4).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 4).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 735, pos1, 80, 80, null);
                }
            }
            if (i + 5 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 5).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 5).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 875, pos1, 80, 80, null);
                }
            }
            if (i + 6 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 6).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 6).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1015, pos1, 80, 80, null);
                }
            }
            if (i + 7 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 7).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 7).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1155, pos1, 80, 80, null);
                }
            }
            if (i + 8 < u.arrayClientesF1.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i + 8).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i + 8).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1295, pos1, 80, 80, null);
                }
            }
            ///////////////////Servicios////////////////////////////////
            if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF1.get(i).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF1.get(i).getTiempoSalida())) {
                g.drawImage(img.getImage(), servicio1, pos11, 80, 80, null);
            }
        }
        /////////////////////////////////////// array 2 ///////////////////////////////////////////////
        for (int i = 0; i < u.arrayClientesF2.size() - 1; i++) {
            ///////////////////Sillas////////////////////////////////
            if (i + 1 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 1).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 1).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 315, pos2, 80, 80, null);
                }
            }
            if (i + 2 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 2).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 2).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 455, pos2, 80, 80, null);
                }
            }
            if (i + 3 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 3).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 3).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 595, pos2, 80, 80, null);
                }
            }
            if (i + 4 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 4).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 4).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 735, pos2, 80, 80, null);
                }
            }
            if (i + 5 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 5).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 5).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 875, pos2, 80, 80, null);
                }
            }
            if (i + 6 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 6).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 6).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1015, pos2, 80, 80, null);
                }
            }
            if (i + 7 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 7).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 7).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1155, pos2, 80, 80, null);

                }
            }
            if (i + 8 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 8).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 8).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1295, pos2, 80, 80, null);
                }
            }
            ///////////////////Servicios////////////////////////////////
            if (i + 1 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 1).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 1).getTiempoSalida())) {
                    g.drawImage(img.getImage(), servicio2, pos11, 80, 80, null);
                }
            }
            if (i + 2 < u.arrayClientesF2.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF2.get(i + 2).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF2.get(i + 2).getTiempoSalida())) {
                    g.drawImage(img.getImage(), servicio3, pos11, 80, 80, null);
                }
            }
        }

        /////////////////////////////////////// array 3 ///////////////////////////////////////////////
        for (int i = 0; i < u.arrayClientesF3.size() - 1; i++) {
            ///////////////////Sillas////////////////////////////////
            if (i + 1 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 1).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 1).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 315, pos3, 80, 80, null);
                }
            }
            if (i + 2 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 2).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 2).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 455, pos3, 80, 80, null);
                }
            }
            if (i + 3 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 3).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 3).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 595, pos3, 80, 80, null);
                }
            }
            if (i + 4 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 4).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 4).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 735, pos3, 80, 80, null);
                }
            }
            if (i + 5 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 5).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 5).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 875, pos3, 80, 80, null);
                }
            }
            if (i + 6 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 6).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 6).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1015, pos3, 80, 80, null);
                }
            }
            if (i + 7 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 7).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 7).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1155, pos3, 80, 80, null);
                }
            }
            if (i + 8 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 8).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 8).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1295, pos3, 80, 80, null);
                }
            }
            ///////////////////Servicios////////////////////////////////
            if (i + 1 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 1).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 1).getTiempoSalida())) {
                    g.drawImage(img.getImage(), servicio4, pos11, 80, 80, null);
                }
            }
            if (i + 2 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 2).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 2).getTiempoSalida())) {
                    g.drawImage(img.getImage(), servicio5, pos11, 80, 80, null);
                }
            }
            if (i + 3 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 3).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 3).getTiempoSalida())) {
                    g.drawImage(img.getImage(), servicio6, pos11, 80, 80, null);
                }
            }
            if (i + 4 < u.arrayClientesF3.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF3.get(i + 4).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF3.get(i + 4).getTiempoSalida())) {
                    g.drawImage(img.getImage(), servicio7, pos11, 80, 80, null);
                }
            }
        }
        /////////////////////////////////////// array 4 ///////////////////////////////////////////////
        for (int i = 0; i < u.arrayClientesF4.size() - 1; i++) {
            ///////////////////Sillas////////////////////////////////
            if (i + 1 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 1).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 1).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 315, pos4, 80, 80, null);
                }
            }
            if (i + 2 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 2).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 2).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 455, pos4, 80, 80, null);
                }
            }
            if (i + 3 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 3).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 3).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 595, pos4, 80, 80, null);
                }
            }
            if (i + 4 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 4).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 4).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 735, pos4, 80, 80, null);
                }
            }
            if (i + 5 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 5).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 5).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 875, pos4, 80, 80, null);
                }
            }
            if (i + 6 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 6).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 6).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1015, pos4, 80, 80, null);
                }
            }
            if (i + 7 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 7).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 7).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1155, pos4, 80, 80, null);
                }
            }
            if (i + 8 < u.arrayClientesF4.size()) {
                if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i + 8).getMomentoLllegada()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i + 8).getTiempoInicio())) {
                    g.drawImage(img.getImage(), 1295, pos4, 80, 80, null);
                }
            }
            ///////////////////Servicios////////////////////////////////
            if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i).getTiempoInicio()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i).getTiempoSalida())) {
                g.drawImage(img.getImage(), servicio8, pos11, 80, 80, null);
            }
            ///////////////////Salida////////////////////////////////
            if (Util.reverseHora(Ventana.label) >= Util.reverseHora(u.arrayClientesF4.get(i).getTiempoSalida()) && Util.reverseHora(Ventana.label) <= Util.reverseHora(u.arrayClientesF4.get(i).getTiempoSalida() + 1)) {
                g.drawImage(img.getImage(), 1435, 0, 80, 80, null);
            }
        }
    }
}
