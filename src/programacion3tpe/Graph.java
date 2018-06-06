package programacion3tpe;

import java.util.*;

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

    public boolean containsGenre(String genre){
        return vertices.containsKey(genre);
    }

    public List<String> getAdyacentesOrdenados(String genre) {
        List<String> adyacentes = sortByComparator(vertices.get(genre));
        return adyacentes;
    }

    private List<String> sortByComparator(Map<String, Integer> unsortMap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        //Ordena segun la cantidad de busquedas, de mayor a menor
        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //Como se que estan ordenados, los agrego a una lista
        List<String> sortedList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedList.add(entry.getKey());
        }
        return sortedList;
    }

    public List<String> getVerticesFromGenre(String A) {
        List<String> results = new ArrayList<>();
        recursionRecorrido(A, results);
        return results;
    }

    public void recursionRecorrido(String genre, List<String> results) {
        while (!results.contains(genre)) {
            results.add(genre);
            Map<String, Integer> ady =  vertices.get(genre);
            for (Map.Entry<String, Integer> entry : ady.entrySet()) {
                recursionRecorrido(entry.getKey(), results);
            }
        }
    }

    public void showGraph() {
        for (Map.Entry<String, Map<String, Integer>> entry : vertices.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
            System.out.println("---------- ");

        }
    }
}
