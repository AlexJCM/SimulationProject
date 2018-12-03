package proyectosimulacion.animaciones;

import javax.swing.JComponent;

import javax.swing.JPanel;

import javax.swing.ImageIcon;

import java.awt.Graphics;

import java.awt.Color;
import proyectosimulacion.controladores.AllTables;
import proyectosimulacion.modelo.Cliente;

public class Contenedor extends JComponent {

    static JPanel panel;

    static int columna = 30;

    static int fila = 0;

    static int numero = 1;

    static int cliente = 12;

    Contenedor(JPanel panel) {
        Contenedor.panel = panel;

        setBounds(0, 0, panel.getWidth(), panel.getHeight());
    }
//dibujado de la pantalla la columna, fila de el aspecto de movimiento mediante los hilos
    @Override
    public void paint(Graphics g) {
        //solo prestar atencion al img de este depende que se dibujen los clientes
        
        AllTables u=new AllTables();

        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/" + numero + ".png")).getImage());
        g.drawImage(img.getImage(), columna, fila, 80, 80, null);
        

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

    }
   //static Thread hilo_inicio_servicio = new Thread() {
        //@/Override
    //hilos para el movimiento del dibujo recive a cordenada del servcio a entrar todo funciona mediane filas y columnas 
        static void hilo_inicio_servicio(int servicio) {
            //try {
               

                int pos1 = 820;

                while (columna != servicio || fila != pos1) {
                    numero++;
                    if (numero == 8) {
                        numero = 1;
                    }
                    if (fila < pos1) {
                        panel.repaint();

                        fila++;

                       // hilo_inicio_servicio.sleep(1);

                    } else {
                        panel.repaint();

                        fila--;

                       // hilo_inicio_servicio.sleep(1);
                    }
                    if (fila == pos1) {

                        if (columna < servicio) {
                            panel.repaint();

                            columna++;

                        //    hilo_inicio_servicio.sleep(1);
                        } else {
                            panel.repaint();

                            columna--;

                          //  hilo_inicio_servicio.sleep(1);
                        }
                    }

                }

           // } catch (java.lang.InterruptedException ex) {

             //   System.out.println(ex.getMessage());
            //}
        }
    //};

    //static Thread hilo_salida = new Thread() {
        //@Override
        static void hilo_salida() {
           // try {
                int servicio1 = 1435;
                int pos1 = 0;

                while (columna != servicio1 || fila != pos1) {
                    numero++;
                    if (numero == 8) {
                        numero = 1;
                    }
                    if (fila < pos1) {
                        panel.repaint();

                        fila++;

                       // hilo_salida.sleep(1);

                    } else {
                        panel.repaint();

                        fila--;

                      // hilo_salida.sleep(1);
                    }
                    if (fila == pos1) {

                        if (columna < servicio1) {
                            panel.repaint();

                            columna++;

                            //hilo_salida.sleep(1);
                        } else {
                            panel.repaint();

                            columna--;

                           // hilo_salida.sleep(1);
                        }
                    }

                }

          /*  } catch (java.lang.InterruptedException ex) {

                System.out.println(ex.getMessage());
            }*/
        }
   // };

    //static Thread hilo_espera = new Thread() {
        //@Override
        static void hilo_espera(int silla, int pos) {
           // try {
                

                while (columna != silla || fila != pos) {
                    numero++;
                    if (numero == 8) {
                        numero = 1;
                    }
                    if (fila < pos) {
                        panel.repaint();

                        fila++;

                      //  hilo_espera.sleep(1);

                    } else {
                        panel.repaint();

                        fila--;

                       // hilo_espera.sleep(1);
                    }
                    if (fila == pos) {

                        if (columna < silla) {
                            panel.repaint();

                            columna++;

                           // hilo_espera.sleep(1);
                        } else {
                            panel.repaint();

                            columna--;

                          //  hilo_espera.sleep(1);
                        }
                    }

                }

           /* } catch (java.lang.InterruptedException ex) {

                System.out.println(ex.getMessage());
            }*/
        }
    //};


}
