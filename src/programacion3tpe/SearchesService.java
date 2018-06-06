package programacion3tpe;

import java.util.Arrays;
import java.util.List;

public class SearchesService {
	private Graph graph;

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
