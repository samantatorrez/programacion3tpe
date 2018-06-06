package programacion3tpe;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        /**Library libreria = new Library();
        long time_start, time_end = 0;
        String[] genres = {"humor","thriller","investigaciï¿½n","ensayo","cine","infantil","ciencia","fantasï¿½a","biografï¿½a","poesï¿½a"};
        
        for(String genre: genres) {
        	System.out.println(">Genre: "+genre);
            System.out.println(">Dataset 1, 20 books");
            time_start = System.currentTimeMillis();
            libreria.setBooks("dataset1");
            time_end = System.currentTimeMillis();
            System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
            time_start = System.currentTimeMillis();
            libreria.getResultsForGenre(genre, "dataset1_"+genre);
            time_end = System.currentTimeMillis();
            System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");
            System.out.println("iterations: "+libreria.getIterations());

            System.out.println(">Dataset 2, 1000 books");
            time_start = System.currentTimeMillis();
            libreria.setBooks("dataset2");
            time_end = System.currentTimeMillis();
            System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
            time_start = System.currentTimeMillis();
            libreria.getResultsForGenre(genre, "dataset2_"+genre);
            time_end = System.currentTimeMillis();
            System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");
            System.out.println("iterations: "+libreria.getIterations());

            System.out.println(">Dataset 3, 100000 books");
            time_start = System.currentTimeMillis();
            libreria.setBooks("dataset3");
            time_end = System.currentTimeMillis();
            System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
            time_start = System.currentTimeMillis();
            libreria.getResultsForGenre(genre, "dataset3_"+genre);
            time_end = System.currentTimeMillis();
            System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");
            System.out.println("iterations: "+libreria.getIterations());

            System.out.println(">Dataset 4,1000000 books");
            time_start = System.currentTimeMillis();
            libreria.setBooks("dataset4");
            time_end = System.currentTimeMillis();
            System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
            time_start = System.currentTimeMillis();
            libreria.getResultsForGenre(genre, "dataset4"+genre);
            time_end = System.currentTimeMillis();
            System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");
            System.out.println("iterations: "+libreria.getIterations());
            System.out.println("----------");
        }
    
    	List<List<String>> s =CSVConverterService.getSearchList("dataset1");  
      	for(List<String> ele:s) {
      		System.out.println(Arrays.toString(ele.toArray()));
      	}*/

		SearchesService s1 = new SearchesService();
		List<String> jo=s1.getRelatedGenres("ficción");
		for(String j:jo) {
			System.out.println(j);
		}
		
    }
}
