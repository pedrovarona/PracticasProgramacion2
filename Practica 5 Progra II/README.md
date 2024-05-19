# Encontrar el camino mas corto de un vertice a otro en un grafo

Este proyecto en Java encontrara el camino mas corto para llegar de un vertice inicial a otro. Se valdra de varias estructuras auxiliares para ello. Creara el grado y una lista de adyacentes la cual permitira sabes que vertices tienen aristas con que otros vertices. Para encontrar el camino mas corto usara la busqueda por ancho, creara una cola donde añadira el vertice inicial y sus vecinos, a medida que encuentre los vertices de los numeros que estan en la cola los añadira a otra estructura auxiliar que los marcara como visitados y se eliminaran de la cola. Tambien se crea otra estructura que marcara cada vertice y su padre, es decir, de donde viene el mismo. Una vez encontrado el vertice que buscamos se añadira a una lista este numero y se revisara quien es su padre con la lista mencionada anteriormente, y ese mismo vertice tambien se revisaria su padre hasta llegar al vertice inicial el cual no tiene padre. De esta manera una vez encontrado dicho camino se marcara en una lista para mas tarde hacer un reverse y darle la vuelta para mostrar el camino desde el primer vertice hasta el vertice buscado.

## Estructura del Proyecto

El proyecto está organizado en dos paquetes principales:

1. **src.test.GraphTest:** Contiene la clase principal que sirve como punto de entrada del programa. Esta añadira los aristas necesarias y declara el camino mas corto de la arista 1 a la 4 para verificar si el programa ah conseguido encontrar dicho camino.

2. **src.test.GraphTest:** Se encarga de encontrar el camino mas corto entre dos vertices dados. Cuenta con diversos metodos para añadir ejes, vertices, verificar si ciertos ejes se encuentran en el grafo y encontrar dicho camino a traves de varias estructuras auxiliares.

## License

El archivo LICENSE contiene los términos y condiciones de la licencia del proyecto, asegurando su uso adecuado y legal.

## Comandos Maven

### mvn compile

El comando `mvn compile` se utiliza para compilar el proyecto.

### mvn package
El comando `mvn package` empaquetara el proyecto. Se compilara el proyecto, se ejecutaran las pruebas y se empaquetara dentro de `target`.

### mvn test
El comando `mvn test` se utiliza para ejecutar las pruebas unitarias del proyecto. Maven buscará todas las clases de prueba en el directorio src/test/java y ejecutará las pruebas.
