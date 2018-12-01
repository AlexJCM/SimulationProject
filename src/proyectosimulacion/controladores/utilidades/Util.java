package proyectosimulacion.controladores.utilidades;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Util {

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
     
    /**
     *  Recibe una lista de clientes de la fase 3 y retorna dicha lista con algunos clientes menos
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
    *  Recibe una lista de clientes de la fase 1 y retorna dicha lista con algunos clientes menos
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
        int numFilas= numClientes - numClientesAEliminar;
        System.out.println("numFilass: "+numFilas);
        
        Object[][] nuevaMatrizF1 = new Object[listaClientesF1.length][listaClientesF1[0].length];        
       
        nuevaMatrizF1 = removeRowFrom2dArray(seleccionClientes, listaClientesF1);///  envia el array con los clientes sleccionados
                

        return nuevaMatrizF1;
    }
    
    /**
     * Recibe clientes selecionados y la listaClientes a recortar
     * @param escogidos
     * @param array
     * @return 
     */
    public static Object[][] removeRowFrom2dArray(int []seleccionados, Object[][] array) {       
        int tamanioArr = array.length;    
        int cantidadSeleccionados= seleccionados.length;
        int numFilas = tamanioArr - cantidadSeleccionados;
        System.out.println("numFilas: "+numFilas);
        
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
            int fox=escogid;
            for (int i = escogid; i < arrayToReturn.length; i++) {
                arrayToReturn[fox++] = array[fox];
            }
            
        }

        return arrayToReturn;
    }

   /**
    * Calcula numero de clientes que abandona o reprueban segun la cantiad de clientes que reciba
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
        int convertido= (int) clientesAEliminar;       
        
        return convertido;
    }
    
    /**
     * Selecciona aleatoriamente n clientes a borrar, recibe la cantidad a borrar y el 
     * arreglo del que se van a borrar(especificamente su tamaño)    
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
            
            if (resutaldo[i] > (n-x) ) resutaldo[i] = (n-x); //para eitar el desbordamiento
            
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
