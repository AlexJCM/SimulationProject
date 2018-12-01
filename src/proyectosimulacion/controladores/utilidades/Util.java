package proyectosimulacion.controladores.utilidades;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Util {

    //Metodo para generar numeros pseudoAleatorios
    private static int generarAleatorio() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(1);
        return numero;

    }

    public static String HoraMinuto(double minutos) {
        String formato = "%02d:%02d";
        long horasReales = TimeUnit.MINUTES.toHours((int) minutos);
        long minutosReales = TimeUnit.MINUTES.toMinutes((int) minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours((int) minutos));

        return String.format(formato, horasReales, minutosReales);
    }

    public static String HoraMinuto1(double minutos) {
        String formato = "%02d:%02d";

        long horasReales = TimeUnit.MINUTES.toHours((int) minutos);
        horasReales = horasReales + 8;
        long minutosReales = TimeUnit.MINUTES.toMinutes((int) minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours((int) minutos));
        return String.format(formato, horasReales, minutosReales);
    }

    //recibe una lista de clientes de la fase 1 y retorna dicha lista con algunos clientes menos
    public static Object[][] abandonan(Object[][] listaClientes) {
        int numClientes = listaClientes.length;
        int tasaAbandono = 7;// 7% de abandono en la fase 1
        int numClientesAEliminar = 0;
        int seleccionClientes[];

        numClientesAEliminar = cantidadClientesABorrar(numClientes, tasaAbandono);
        System.out.println("Nro. clientes a eliminar: " + numClientesAEliminar);

        seleccionClientes = seleccionarClientes(numClientesAEliminar, listaClientes);//recibe un array con los clientes a borrar

        //int numeroSeleccionado = seleccionarNumero(listaClientes.length);

        Object[][] nuevaMatriz = new Object[listaClientes.length][listaClientes[0].length];
        
        //nuevaMatriz = removeRowFrom2dArray((numeroSeleccionado - 1), listaClientes);///    
        nuevaMatriz = removeRowFrom2dArray(seleccionClientes, listaClientes);///  envia el array con los clientes sleccionados
        
        mostrarMatriz(nuevaMatriz);

        return nuevaMatriz;
    }

    //selecciona un numero al azar entre un rango delimitado por el tamaño de un arreglo
    private static int seleccionarNumero(int tamanio) {
        int numero = (int) (Math.random() * tamanio) + 1;
        System.out.println("numero selecionado aleat: " + numero);
        return numero;
    }

    public static Object[][] removeRowFrom2dArray(int []escogidos, Object[][] array) {
        int rows = array.length;
       /* Object[][] arrayToReturn = new Object[rows - 1][];
        for (int i = 0; i < row; i++) {
            arrayToReturn[i] = array[i];
        }
        for (int i = row; i < arrayToReturn.length; i++) {
            arrayToReturn[i++] = array[i];
        }*/
       //FORMA 2
       
        Object[][] arrayToReturn = new Object[rows - escogidos.length][];
               for (int f = 0; f < escogidos.length; f++) {
            int escogigo = escogidos[f];
            for (int i = 0; i < escogigo; i++) {
                arrayToReturn[i] = array[i];
            }
            for (int i = escogigo; i < arrayToReturn.length; i++) {
                arrayToReturn[i++] = array[i];
            }
        }


        return arrayToReturn;
    }

    public static void mostrarMatriz(Object[][] info) {
        System.out.println("nueva matriz es de: " + info.length);
        /*for (int u = 0; u < info.length; u++) {
                for (int v = 0; v < 5; v++) {
                    System.out.print(info[u][v] + " - ");
                }
                System.out.println();
        }*/
    }

    private static int cantidadClientesABorrar(int numClientes, int tasaAbandono) {
        double clientesAEliminar;

        clientesAEliminar = (numClientes * tasaAbandono) / 100;
        if (clientesAEliminar < 1) {
            clientesAEliminar = 1;
        }

        return (int) clientesAEliminar;
    }

    public static int[] seleccionarClientes(int numClientesAEliminar, Object[][] listaClientes) {
        int selecClientes[] = null;
        int posicionAleatoria = 0;
        int contador = 0;
        /* 
        for (int i = 0; i < listaClientes.length; i++) {
            for (int j = 0; j < listaClientes[0].length; j++) {
                posicionAleatoria = (int) (Math.random() * listaClientes.length);// es 3
                selecClientes[i]=(int) listaClientes[posicionAleatoria][0];
                contador++;
                if (contador >= numClientesAEliminar) {
                    System.out.println("Se alnazo el numero deseado");
                }
                break;
            }
        }*/
        ///////////FORMA 2
        int n = numClientesAEliminar;
        int[] numeros = new int[n];
        int[] resultado = new int[n];
        Random rnd = new Random();
        int res;
        //se rellena una matriz ordenada del 1 al n(1..n)
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(listaClientes.length);
            if (res == 0) {
                res++;
            }
            resultado[i] = res;          
        }        
        System.out.println("El resultado de la matriz es:");
        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i] + " - ");
        }

        return resultado;

    }
}
