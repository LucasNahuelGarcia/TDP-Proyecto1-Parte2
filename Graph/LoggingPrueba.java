package Graph;

public class LoggingPrueba {
  public static void main(String args[]) {
    Graph grafo = new Graph();

    // Agrego nodos y arcos
    grafo.addNode(2);
    grafo.addNode(4);
    grafo.addEdge(2, 4);
    grafo.addEdge(4, 2);

    // Agrego nodos y arcos repetidos
    grafo.addNode(2);
    grafo.addNode(4);
    grafo.addEdge(2, 4);

    // Agrego arcos con nodos que no existen
    grafo.addEdge(2, 8);
    grafo.addEdge(9, 4);
    grafo.addEdge(5, 23);

    // Elimino arco existente
    grafo.removeEdge(2, 4);
    grafo.removeEdge(4, 2);

    // Lo elimino de vuelta
    grafo.removeEdge(2, 4);

    // Elimino nodos
    grafo.removeNode(2);
    grafo.removeNode(4);

    // Elimino nodos no existentes
    grafo.removeNode(2);
    grafo.removeNode(211);
  }
}
