package aplicacion;

import palabras.CalculadoraDistancias;
import java.util.Scanner;

/**
 * La clase Principal es el punto de entrada de la aplicación que solicita al
 * usuario dos palabras y calcula la distancia de edicion entre ellas.
 */
public class Principal {

    /**
     * Metodo principal de la aplicación.
     * 
     * @param args Los argumentos de la linea de comandos. No se utilizan en esta
     *             aplicación.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera sentencia: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Introduce la segunda sentencia: ");
        String palabra2 = scanner.nextLine();

        scanner.close();

        System.out.println("La distancia de " + palabra1 + " a " + palabra2 + " es " +  CalculadoraDistancias.calcularDistancia(palabra1, palabra2));
    }
}
