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
        
        //mostrarMatriz(nuevaMatriz);

        return nuevaMatriz;
    }

    //selecciona un numero al azar entre un rango delimitado por el tamaño de un arreglo
    private static int seleccionarNumero(int tamanio) {
        int numero = (int) (Math.random() * tamanio) + 1;
        System.out.println("numero selecionado aleat: " + numero);
        return numero;
    }

    public static Object[][] removeRowFrom2dArray(int []escogidos, Object[][] array) {
        //recibe clientes selecionados y listaClientes a recortar
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
            
            int escogid = escogidos[f];
            System.out.print("escogid: "+escogid+ " - ");
            for (int i = 0; i < escogid; i++) {
                arrayToReturn[i] = array[i];
            }
            for (int i = escogid; i < arrayToReturn.length; i++) {
                arrayToReturn[i++] = array[i];
            }
        }
        System.out.println("");

        return arrayToReturn;
    }

    public static void mostrarMatriz(Object[][] info) {
        System.out.println("nueva matriz es de tamanio: " + info.length);
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
        
        if (clientesAEliminar <= 1) {
            clientesAEliminar = 1;
        }
        int convertido= (int) clientesAEliminar;
        System.out.print("Convertido a entero: "+convertido+" --> ");
        
        return convertido;
    }

    public static int[] seleccionarClientes(int numClientesAEliminar, Object[][] listaClientes) {
        //metodo que selecciona aleatoriamente n clientes a borrar, recibe la cantidad a borrar y el 
        //arreglo del que se van a borrar(especificamente su tamaño)
        //retorna en arreglo con los n clientes a borrarse
                
        ///////////FORMA 2
       /* int nCli = numClientesAEliminar;
        int k= nCli;
        int[] numeros = new int[nCli];
        int[] resultado = new int[nCli];
        Random rnd = new Random();
        int res;
        //se rellena una matriz ordenada del 1 al nCli
        for (int i = 0; i < nCli; i++) {
            numeros[i] = i + 1;
        }
        //se escoge n de ellos al azar
        for (int i = 0; i < k; i++) {
            res = rnd.nextInt(listaClientes.length);
            System.out.println("Random: "+res);
            if (res <= 0) {
                res = 1;
            }
            resultado[i] = numeros[res];
            numeros[res] = numeros[k-1];
            k--; 
        }        
        
        System.out.println("El resultado de la matriz seleccion es:");
        for (int i = 0; i < nCli; i++) {
            System.out.print(resultado[i] + " - ");
        }*/
        
        //FORMA 3
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
        System.out.print("Random: ");
        for (int i = 0; i < x; i++) {
            t = rm.nextInt(n); //tira valor aleatorio desde 0 ...n (se le puso -1 para que no escoga el ultimo)
            System.out.print( t +", ");
            resutaldo[i] = numeros[t];
            
            if (resutaldo[i] > (n-x) ) resutaldo[i] = (n-x); //para eitar el desbordamiento
            
            _t[i] = t;

            for (int j = t; j < numeros.length - 1; j++) {
                numeros[j] = numeros[j + 1]; //corrimiento del vector
            }
            n--;
        }System.out.println("");
        
        for (int i = 0; i < resutaldo.length; i++) {
            System.out.println(resutaldo[i] + " y t = " + _t[i]);
        }

        return resutaldo;

    }
}
