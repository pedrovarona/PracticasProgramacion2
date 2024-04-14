package palabras;

/**
 * La clase CalculadoraDistancias proporciona métodos estáticos para calcular la
 * distancia de edición entre dos cadenas de caracteres.
 */
public class CalculadoraDistancias {

    /**
     * Calcula la distancia de edición entre las cadenas `s1` y `s2`, según lo
     * expuesto por Jurafsky.
     * 
     * @param s1 La primera cadena.
     * @param s2 La segunda cadena.
     * @return La distancia de edición entre las dos cadenas.
     */
    public static int calcularDistancia(String s1, String s2) {
        int sentencia1 = s1.length();
        int sentencia2 = s2.length();

        int[][] matriz = new int[sentencia1 + 1][sentencia2 + 1];

        for (int i = 0; i <= sentencia1; i++) {
            matriz[i][0] = i;
        }
        for (int j = 0; j <= sentencia2; j++) {
            matriz[0][j] = j;
        }

        for (int i = 1; i <= sentencia1; i++) {
            for (int j = 1; j <= sentencia2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matriz[i][j] = matriz[i - 1][j - 1];
                } else {
                    matriz[i][j] = 1 + Math.min(matriz[i - 1][j - 1], Math.min(matriz[i][j - 1], matriz[i - 1][j]));
                }
            }
        }

        return matriz[sentencia1][sentencia2];
    }
}
