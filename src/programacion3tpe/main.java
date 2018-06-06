package programacion3tpe;

import java.util.List;


public class main {

    public static void main(String[] args) {
    	long time_start, time_end = 0;
    	String [] datasets = {"dataset1","dataset2","dataset3","dataset4"};
    	String [] relatedGenresTest = {"ficción","viajes","tecnología","ludo"};
    	SearchesService searchService = new SearchesService();
    	List<String> listRelatedGenresTest;
    	
    	for(String dataset: datasets) {
    		System.out.println("----Dataset: " + dataset);
    		time_start = System.currentTimeMillis();
    		searchService.setDataset(dataset);
    		time_end = System.currentTimeMillis();
    		System.out.println("Time of graph inicialization: "+ ( time_end - time_start ) +" milliseconds");
    		
    		for(String relatedGenre: relatedGenresTest) {
    			System.out.println("----Method getRelatedGenres - Genre: " + relatedGenre);
    			time_start = System.currentTimeMillis();
    			listRelatedGenresTest=searchService.getRelatedGenres(relatedGenre);
    			time_end = System.currentTimeMillis();
    			System.out.println(listRelatedGenresTest);
    			System.out.println("Time of getRelatedGenres: "+ ( time_end - time_start ) +" milliseconds");
    		}
    	}
}
}