package mates;
import java.util.Random;
public class Matematicas{

/**
* Genera una aproximación al número pi mediante el método de
* Montecarlo. El parámetro ‘pasos‘ indica el número de puntos
* generado.
*/

public static double generarNumeroPi(long pasos){
long puntoscirculo = 0;


double areacuadrado = 4;

for (long i=1; i<pasos; i++){
    Random numeroentre = new Random();
    double x = numeroentre.nextDouble();
    double y = numeroentre.nextDouble();

    if ((x*x + y*y) <= 1) {
        puntoscirculo++;
    }
}
return areacuadrado*puntoscirculo/pasos ;
}
}