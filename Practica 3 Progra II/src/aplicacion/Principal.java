package aplicacion;

import mates.Matematicas;

import java.util.Scanner;

/**
 * La clase Principal es la clase principal que permite ejecutar el programa de
 * simulación de Montecarlo para estimar el valor de PI.
 */
public class Principal {

    /**
     * El método principal que recoge la entrada del usuario y realiza la simulación
     * de Montecarlo para estimar el valor de PI.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             programa).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de puntos que gustes: ");
        long puntostotales = sc.nextInt();

        Matematicas montecarlo = new Matematicas();
        double resultado = montecarlo.generarNumeroPi(puntostotales);

        System.out.println("El número PI es " + resultado);
        sc.close();
    }
}
