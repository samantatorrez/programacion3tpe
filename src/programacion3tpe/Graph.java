package programacion3tpe;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<String, Map<String, Integer>> vertices = new HashMap<>();

    public Graph() {}

    public void addVertex(String genre, String nextGenre) {
        //Si el genero buscado ya esta en el grafo
        if (vertices.containsKey(genre)) {
            Map alist = vertices.get(genre);
            // y si la lista de siguientes del genero buscado contiene el genero buscado posteriormente
            if (alist.containsKey(nextGenre)) {
                //Incremento la cantidad del genero buscado posteriormente
                alist.put(nextGenre, (Integer)alist.get(nextGenre) + 1);
            } else {
                //sino está, lo agrego a la lista de siguientes
                alist.put(nextGenre, 1);
            }
        } else { //Si el genero buscado no esta en el grafo, lo agrego
            Map<String, Integer> aux = new HashMap<>();
            //y agrego el genero siguiente con valor 1
            aux.put(nextGenre, 1);
            vertices.put(genre, aux);
        }
    }

    public void addEdge(String genre) {
        //Si es el ultimo elemento de la busqueda y si el genero no existe en el grafo, lo agrego
        if (!vertices.containsKey(genre)) {
            vertices.put(genre, new HashMap<>());
        }
    }

    public void showGraph() {
        for (Map.Entry<String, Map<String, Integer>> entry : vertices.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
            System.out.println("---------- ");

        }
    }
}
