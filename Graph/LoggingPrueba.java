package Graph;

public class LoggingPrueba {
  public static void main(String args[]) {
    Graph grafo = new Graph();
    
    //Agrego nodos
    grafo.addNode(2);
    grafo.addNode(4);
    grafo.addEdge(2, 4);

    //Agrego nodos y arcos repetidos
    grafo.addNode(2);
    grafo.addNode(4);
    grafo.addEdge(2,4);

    //Agrego arcos con nodos que no existen
    grafo.addEdge(2, 8);
    grafo.addEdge(9, 4);
    grafo.addEdge(5, 23);
  }
}
