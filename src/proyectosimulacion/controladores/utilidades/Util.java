package proyectosimulacion.controladores.utilidades;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Util {

    /**
     * Convierte los minutos recibidos al formato hh:mm:ss
     *
     * @param minutos
     * @return
     */
    public static String horaMinutoSegundo1(double minutos) {
        String formato = "%02d:%02d:%02d";

        long hours = TimeUnit.SECONDS.toHours((int) minutos);
        hours = hours + 8;
        long tempSec = (long) (minutos - (TimeUnit.HOURS.toSeconds(hours - 8)));
        long minute = TimeUnit.SECONDS.toMinutes(tempSec);
        if (tempSec > TimeUnit.MINUTES.toSeconds(minute)) {
            tempSec = tempSec - (TimeUnit.MINUTES.toSeconds(minute));
        } else {
            tempSec = TimeUnit.MINUTES.toSeconds(minute) - tempSec;
        }
        long second = TimeUnit.SECONDS.toSeconds(tempSec);

        return String.format(formato, hours, minute, second);

    }

     public static double reverseHora(String horaConvertir) {
        
        String string = horaConvertir;
        String[] parts = string.split(":");
        String part1 = parts[0]; //
        String part2 = parts[1]; // 
        String part3 = parts[2]; //      
               
        int h, m, s, hh, mm;
        double resultado;
        
        h = Integer.parseInt(part1);
        
        m = Integer.parseInt(part2);
        
        s = Integer.parseInt(part3);
        hh = h * 3600;
        mm = m * 60;
        resultado = hh + mm + s;
        System.out.print(resultado);

        return resultado;
    }

    public static void calculateTime(long seconds) {
        long sec = seconds % 60;
        long minutes = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        long days = seconds / 86400;

        System.out.println("Day " + days + " Hour " + hours + " Minute " + minutes + " Seconds " + sec);
    }

    /**
     * Convierte los minutos recibidos al formato hh:mm:ss
     *
     * @param minutos
     * @return
     */
    public static String horaMinutoSegundo(double minutos) {
        String formato = "%02d:%02d:%02d";

        long hours = TimeUnit.SECONDS.toHours((int) minutos);

        long tempSec = (long) (minutos - (TimeUnit.HOURS.toSeconds(hours)));
        long minute = TimeUnit.SECONDS.toMinutes(tempSec);
        if (tempSec > TimeUnit.MINUTES.toSeconds(minute)) {
            tempSec = tempSec - (TimeUnit.MINUTES.toSeconds(minute));
        } else {
            tempSec = TimeUnit.MINUTES.toSeconds(minute) - tempSec;
        }

        long second = TimeUnit.SECONDS.toSeconds(tempSec);

        return String.format(formato, hours, minute, second);
    }
    
    /**
     * Recibe una lista de clientes de la fase 2 y retorna dicha lista con algunos clientes menos
     * @param listaClientesF2
     * @return 
     */
     public static Object[][]duplicado(Object[][] listaClientesF2) {
        int numClientes = listaClientesF2.length;
        int tasaDuplicado = 20;// 20% tiene duplicado en la fase 2      
        int numClientesAEliminar = 0;
        int seleccionClientes[];

        numClientesAEliminar = cantidadClientesABorrar(numClientes, tasaDuplicado);
        System.out.println("Nro. clientes a eliminar en fase2: " + numClientesAEliminar);

        seleccionClientes = seleccionarClientes(numClientesAEliminar, listaClientesF2);//recibe un array con los clientes a borrar

        Object[][] nuevaMatrizF2 = new Object[listaClientesF2.length][listaClientesF2[0].length];

        nuevaMatrizF2 = removeRowFrom2dArray(seleccionClientes, listaClientesF2);///  envia el array con los clientes sleccionados

        return nuevaMatrizF2;
    }


    /**
     * Recibe una lista de clientes de la fase 3 y retorna dicha lista con
     * algunos clientes menos
     *
     * @param listaClientes
     * @return array2d
     */
    public static Object[][] reprueban(Object[][] listaClientesF3) {
        int numClientes = listaClientesF3.length;
        int tasaReprueban = 20;// 20% reprueban examen en fase3      
        int numClientesAEliminar = 0;
        int seleccionClientes[];

        numClientesAEliminar = cantidadClientesABorrar(numClientes, tasaReprueban);
        System.out.println("Nro. clientes a eliminar en fase3: " + numClientesAEliminar);

        seleccionClientes = seleccionarClientes(numClientesAEliminar, listaClientesF3);//recibe un array con los clientes a borrar

        Object[][] nuevaMatrizF3 = new Object[listaClientesF3.length][listaClientesF3[0].length];

        nuevaMatrizF3 = removeRowFrom2dArray(seleccionClientes, listaClientesF3);///  envia el array con los clientes sleccionados

        return nuevaMatrizF3;
    }

    /**
     * Recibe una lista de clientes de la fase 1 y retorna dicha lista con
     * algunos clientes menos
     *
     * @param listaClientes
     * @return array2d
     */
    public static Object[][] abandonan(Object[][] listaClientesF1) {
        int numClientes = listaClientesF1.length;
        int tasaAbandono = 7;// 7% de abandono en la fase 1        
        int numClientesAEliminar = 0;
        int seleccionClientes[];

        numClientesAEliminar = cantidadClientesABorrar(numClientes, tasaAbandono);
        System.out.println("Nro. clientes a eliminar: " + numClientesAEliminar);

        seleccionClientes = seleccionarClientes(numClientesAEliminar, listaClientesF1);//recibe un array con EL INDICE de clientes a borrar
        int numFilas = numClientes - numClientesAEliminar;
        System.out.println("numFilass: " + numFilas);

        Object[][] nuevaMatrizF1 = new Object[listaClientesF1.length][listaClientesF1[0].length];

        nuevaMatrizF1 = removeRowFrom2dArray(seleccionClientes, listaClientesF1);///  envia el array con los clientes sleccionados

        return nuevaMatrizF1;
    }

    /**
     * Recibe clientes selecionados y la listaClientes a recortar
     *
     * @param escogidos
     * @param array
     * @return
     */
    public static Object[][] removeRowFrom2dArray(int[] seleccionados, Object[][] array) {
        int tamanioArr = array.length;
        int cantidadSeleccionados = seleccionados.length;
        int numFilas = tamanioArr - cantidadSeleccionados;
        System.out.println("numFilas: " + numFilas);

        Object[][] arrayToReturn = new Object[tamanioArr - cantidadSeleccionados][];

        for (int f = 0; f < cantidadSeleccionados; f++) {
            int escogid = seleccionados[f];

            for (int i = 0; i < escogid; i++) {
                arrayToReturn[i] = array[i];//clona el array hasta una pos. antes del cliente escogido para excluirlo 
            }
            /*
            for (int i = escogid; i < arrayToReturn.length; i++) {
                arrayToReturn[i++] = array[i];
            }*/
            //cambiado momentaneamente por el siguiente for para evitar desbordamientos ...CORREGUIR
            int fox = escogid;
            for (int i = escogid; i < arrayToReturn.length; i++) {
                arrayToReturn[fox++] = array[fox];
            }

        }

        return arrayToReturn;
    }

    /**
     * Calcula numero de clientes que abandona o reprueban segun la cantiad de
     * clientes que reciba
     *
     * @param numClientes
     * @param tasaAbandono
     * @return entero
     */
    public static int cantidadClientesABorrar(int numClientes, int tasa) {
        double clientesAEliminar;
        clientesAEliminar = (numClientes * tasa) / 100;

        if (clientesAEliminar <= 1) {
            clientesAEliminar = 1;
        }
        int convertido = (int) clientesAEliminar;

        return convertido;
    }

    /**
     * Selecciona aleatoriamente n clientes a borrar, recibe la cantidad a
     * borrar y el arreglo del que se van a borrar(especificamente su tamaño)
     *
     * @param numClientesAEliminar
     * @param listaClientes
     * @return retorna en arreglo con los n clientes a borrarse
     */
    public static int[] seleccionarClientes(int numClientesAEliminar, Object[][] listaClientes) {
        //genera x aleatorios sin repetir entre el 0 y  n
        Random rm = new Random();
        int x = numClientesAEliminar;//cantidad de aleatorios a generar. 7
        int t = 0; //temporal o numero aleatorio de seleccion
        int n = listaClientes.length;//rango superior para tomar el alaeatorio. 111
        int numeros[] = new int[n];
        int resutaldo[] = new int[x];
        int _t[] = new int[x];
        //rellenamos un vector con numeros ordenados del 0..n para escoger entre ellos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        for (int i = 0; i < x; i++) {
            t = rm.nextInt(n); //tira valor aleatorio desde 0 ...n (se le puso -1 para que no escoga el ultimo)           
            resutaldo[i] = numeros[t];

            if (resutaldo[i] > (n - x)) {
                resutaldo[i] = (n - x); //para eitar el desbordamiento
            }
            _t[i] = t;

            for (int j = t; j < numeros.length - 1; j++) {
                numeros[j] = numeros[j + 1]; //corrimiento del vector
            }
            n--;
        }

        for (int i = 0; i < resutaldo.length; i++) {
            System.out.println(resutaldo[i] + " y t = " + _t[i]);
        }

        return resutaldo;

    }
}
