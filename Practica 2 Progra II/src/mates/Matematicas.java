package mates;

import java.util.Random;

/**
 * Clase que proporciona funciones matemáticas, incluyendo aproximación al
 * número pi mediante el método de Montecarlo.
 */
public class Matematicas {

    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo.
     * El parámetro 'pasos' indica el número de puntos generados.
     *
     * @param pasos Número de puntos generados.
     * @return Aproximación al número pi.
     */
    public static double generarNumeroPiIterativo(int pasos) {
        long puntoscirculo = 0;
        double areacuadrado = 4;

        for (long i = 1; i < pasos; i++) {
            Random numeroentre = new Random();
            double x = numeroentre.nextDouble();
            double y = numeroentre.nextDouble();

            if ((x * x + y * y) <= 1) {
                puntoscirculo++;
            }
        }

        return areacuadrado * puntoscirculo / pasos;
    }

    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo de
     * forma recursiva.
     * El parámetro 'pasos' indica el número de puntos generados.
     *
     * @param pasos Número de puntos generados.
     * @return Aproximación al número pi.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivoAux(pasos, 1, 0);
    }

    private static double generarNumeroPiRecursivoAux(long pasos, long actual, long puntoscirculo) {
        if (actual >= pasos) {
            double areacuadrado = 4;
            return areacuadrado * puntoscirculo / pasos;
        }

        Random numeroentre = new Random();
        double x = numeroentre.nextDouble();
        double y = numeroentre.nextDouble();

        if ((x * x + y * y) <= 1) {
            puntoscirculo++;
        }

        return generarNumeroPiRecursivoAux(pasos, actual + 1, puntoscirculo);
    }
}
