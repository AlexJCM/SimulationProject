package proyectosimulacion.controladores.utilidades;

import java.util.Random;
import java.util.Scanner;

public class Util {

    //Metodo para generar numeros pseudoAleatorios
    private int GenerarAleatorio() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(1);
        return numero;

    }
}
