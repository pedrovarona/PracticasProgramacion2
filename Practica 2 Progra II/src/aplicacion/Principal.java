package aplicacion;

import mates.Matematicas;

import java.util.Scanner;

/**
 * Clase principal que contiene el programa para obtener la aproximación al
 * número pi mediante el método de Montecarlo.
 */
public class Principal {

    /**
     * Método principal para ejecutar el programa.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     *             programa).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de puntos que gustes: ");

        long puntostotales = sc.nextInt();

        System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(puntostotales));

        sc.close();
    }
}
