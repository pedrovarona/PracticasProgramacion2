package util;
import java.util.*;

/**
 * Esta clase representa un grafo genérico no dirigido.
 * Los vértices del grafo pueden ser de cualquier tipo.
 * 
 * <p>
 * Esta implementación utiliza una lista de adyacencia para representar el
 * grafo.
 * </p>
 *
 * @param <V> el tipo de los vértices del grafo.
 * @author Pedro Varona
 */
public class Graph<V> {

    // Lista de adyacencia.
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    /**
     * Añade un nuevo vértice al grafo.
     *
     * @param v el vértice a añadir.
     * @return `true` si el vértice fue agregado exitosamente, `false` si ya existía
     *         en el grafo.
     */
    public boolean addVertex(V v) {
        if (!containsVertex(v)) {
            adjacencyList.put(v, new HashSet<V>());
            return true;
        } else
            return false;
    }

    /**
     * Añade una arista entre dos vértices al grafo.
     *
     * @param v1 el primer vértice.
     * @param v2 el segundo vértice.
     * @return `true` si la arista se agregó correctamente, `false` si ya existía en
     *         el grafo.
     */
    public boolean addEdge(V v1, V v2) {
        if (!containsVertex(v1))
            addVertex(v1);
        if (!containsVertex(v2))
            addVertex(v2);
        if (adjacencyList.get(v1).contains(v2))
            return false;
        else {
            adjacencyList.get(v1).add(v2);
            return true;
        }
    }

    /**
     * Obtiene el conjunto de vértices adyacentes a un vértice dado.
     *
     * @param v el vértice del que se obtienen los adyacentes.
     * @return conjunto de vértices adyacentes al vértice dado.
     * @throws Exception si el vértice no existe en el grafo.
     */
    public Set<V> obtainAdjacents(V v) throws Exception {
        if (!containsVertex(v))
            throw new Exception("El vertice no existe.");
        else
            return adjacencyList.get(v);
    }

    /**
     * Verifica si el grafo contiene un vértice dado.
     *
     * @param v el vértice para el que se realiza la comprobación.
     * @return `true` si el vértice está presente en el grafo, de lo contrario
     *         `false`.
     */
    public boolean containsVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    /**
     * Devuelve una representación de cadena del grafo.
     *
     * @return una cadena que representa la lista de adyacencia del grafo.
     */
    @Override
    public String toString() {
        String listaAdyacentes = adjacencyList.toString();
        return listaAdyacentes;
    }

    /**
     * Encuentra el camino más corto entre dos vértices en el grafo, si existe.
     *
     * @param v1 el vértice de origen.
     * @param v2 el vértice de destino.
     * @return una lista con la secuencia de vértices que forman el camino más corto
     *         desde `v1` hasta `v2`, o `null` si no hay camino.
     */
    public List<V> shortestPath(V v1, V v2) {
        if (!containsVertex(v1) || !containsVertex(v2)) {
            return null;
        }

        Queue<V> queue = new LinkedList<>();
        Map<V, V> previous = new HashMap<>();
        Set<V> visited = new HashSet<>();

        queue.add(v1);
        visited.add(v1);

        while (!queue.isEmpty()) {
            V current = queue.remove();

            if (current.equals(v2)) {
                break;
            }

            for (V neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    previous.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        if (!previous.containsKey(v2) && !v1.equals(v2)) {
            return null;
        }

        List<V> path = new ArrayList<>();
        V step = v2;
        while (step != null) {
            path.add(step);
            step = previous.get(step);
        }

        Collections.reverse(path);
        return path;
    }
}