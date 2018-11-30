package proyectosimulacion.controladores.utilidades;

import java.util.Random;
import java.util.concurrent.TimeUnit;

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
        int numeroSeleccionado = seleccionarNumero(listaClientes.length);     
        
        Object[][] nuevaMatriz = new Object[listaClientes.length][listaClientes[0].length];
       
        nuevaMatriz = removeRowFrom2dArray(numeroSeleccionado, listaClientes);
                       
         mostrarMatriz(nuevaMatriz);
         
        return nuevaMatriz;
    }
    
    //selecciona un numero al azar entre un rango delimitado por el tamaño de un arreglo
    private static int seleccionarNumero(int tamanio){        
        int numero = (int) (Math.random() * tamanio)+1;
        System.out.println("numero selecionado aleat: "+numero);
        return numero;        
    }
    
      

    public static Object[][] removeRowFrom2dArray(int row, Object[][] array) {
        int rows = array.length;
        Object[][] arrayToReturn = new String[rows - 1][array[0].length];
        for (int i = 0; i < rows; i++) {
            arrayToReturn[i] = array[i];
        }
        for (int i = row; i < arrayToReturn.length; i++) {
            arrayToReturn[i++] = array[i];
        }
        return arrayToReturn;
    }

    public static void mostrarMatriz(Object[][] info) {
        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
                System.out.print(info[i][j] + " - ");
            }
        }
        }

}
