package mates;

import java.util.Random;
import java.util.function.DoublePredicate;

/**
 * La clase Matematicas contiene métodos matemáticos, incluido el método de
 * Montecarlo para estimar el valor de PI.
 */
public class Matematicas {

    /**
     * Genera una aproximación al número PI mediante el método de Montecarlo.
     *
     * @param pasos El número de puntos generados para la simulación.
     * @return Una aproximación del valor de PI basada en la simulación de
     *         Montecarlo.
     */
    public double generarNumeroPi(long pasos) {
        Random random = new Random();
        long puntoscirculo = 0;

        // Expresión lambda para representar la condición dentro del círculo
        DoublePredicate dentroDelCirculo = x -> {
            double y = random.nextDouble();
            return x * x + y * y <= 1;
        };

        for (long i = 1; i < pasos; i++) {
            if (dentroDelCirculo.test(random.nextDouble())) {
                puntoscirculo++;
            }
        }

        double areacuadrado = 4;
        return areacuadrado * puntoscirculo / pasos;
    }
}
