package Graph;

import java.util.*;


/**
 * Implementa un grafo dirigido no pesado.
 */
public class Graph {
  private Map<Integer, List<Integer>> nodos;

  public Graph() {
    nodos = new HashMap<>();
  }

  public int size() {
    return nodos.size();
  }

  /**
   * Agrega el nodo "node" al grafo, si aún no pertenecía a la estructura.
   * 
   * @param node nodo a agregar.
   */
  public void addNode(int node) {
    if (nodos.get(node) == null)
      nodos.put(node, new ArrayList<>());
  }

  /**
   * Agrega un arco entre el nodo “node1” y el nodo “node2”, si aún no existía el
   * arco y ambos parámetros son nodos pertenecientes a la estructura.
   * 
   * @param node1 nodo que tiene como extremo el arco.
   * @param node2 nodo que tiene como extremo el arco.
   */
  public void addEdge(int node1, int node2) {
    List<Integer> arcos = nodos.get(node1);

    if (arcos != null && nodos.get(node2) != null && !arcos.contains(node2)) {
      arcos.add(node2);
    }
  }

  /**
   * Remueve el nodo "node" del grafo, si el parámetro es un nodo de la
   * estructura.
   * 
   * @param node nodo a eliminar.
   */
  public void removeNode(int node) {
    nodos.remove(node);
  }

  /**
   * Remueve el arco entre el nodo "node1" y el nodo "node2", si el arco que los
   * conecta pertenece a la estructura.
   * 
   * @param node1
   * @param node2
   */
  public void removeEdge(int node1, int node2) {
    List<Integer> arcos = nodos.get(node1);

    if (arcos != null && nodos.get(node2) != null && arcos.contains(node2)) {
      arcos.remove(node2);
    }
  }
}