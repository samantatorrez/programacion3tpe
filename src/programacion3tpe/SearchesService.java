package programacion3tpe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchesService {
	private Graph graph;

	public List<String> getMostSearchedGenres(int N, String genreA){
		//Obtener los N géneros más buscados inmediatamente despues de buscar el género A.
		if (graph.containsGenre(genreA)){
			List<String> listResult = new ArrayList<>();
			List<String> listAdyORd = graph.getAdyacentesOrdenados(genreA);
			for (int cant=0; cant < N; cant++){
				//Agrego los N items a la lista de resultados siempre y cuando N < la cant de nodos adyacentes (para evitar nulos)
				//Si N es 3 pero solo tengo dos adyacentes, devuelvo solo esos dos.
				if (listAdyORd.size() > cant) {
					listResult.add(listAdyORd.get(cant));
				}
			}
			return listResult;
		}
		return null;
	}

	public static List<String> getMostSearchedGenres(int n){
		return null;
	}
	public static List<String> getGenresSearchedAfter(String genre){
		return null;
	}
	public static List<String> getRelatedGenres(String genre){
		return null;
	}

	public SearchesService(){
		graph = new Graph();
		List<List<String>> s =CSVConverterService.getSearchList("dataset1");
		for(List<String> ele:s) {
			System.out.println(Arrays.toString(ele.toArray()));
			for (int i=0; i<ele.size(); i++) {
				if ((i+1) < ele.size()){
					graph.addVertex(ele.get(i), ele.get(i+1));
				} else {
					graph.addEdge(ele.get(i));
				}
			}
		}
		graph.showGraph();
	}
}
