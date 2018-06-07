package programacion3tpe;

import java.util.List;


public class main {

	public static void main(String[] args) {

		String [] datasets = {"dataset1","dataset2","dataset3","dataset4"};
		SearchesService searchService = new SearchesService();

		long time_start, time_end = 0;
		String [] test = {"thriller","cultura","religión","cine","tecnología","ludo"};
		List<String> listMostSearchedGenresTest;
		List<String> listGenresSearchedAfterTest;
		List<String> listRelatedGenresTest;
		

		for(String dataset: datasets) {
			System.out.println();
			System.out.println("----Dataset: " + dataset);
			System.out.println();
			time_start = System.currentTimeMillis();
			searchService.setDataset(dataset);
			time_end = System.currentTimeMillis();
			System.out.println("Time of graph inicialization: "+ ( time_end - time_start ) +" milliseconds");
			
			// ------------Service 1---------------- //
			System.out.println();
			System.out.println("Most Searched Genres Test");
			System.out.println();
			for(String mostSearchedGenre: test) {
				System.out.println("----Method getMostSearchedGenres - Genre: " + mostSearchedGenre);
				time_start = System.currentTimeMillis();
				listMostSearchedGenresTest=searchService.getMostSearchedGenres(3, mostSearchedGenre);
				time_end = System.currentTimeMillis();
				System.out.println(listMostSearchedGenresTest);
				System.out.println("Time of getMostSearchedGenres: "+ ( time_end - time_start ) +" milliseconds");
				System.out.println();
			}
			
			// ------------Service 2---------------- //
			System.out.println();
			System.out.println("All Searched Genres After Origin Test");
			System.out.println();
			for(String searchedAfterGenre: test) {
				System.out.println("----Method getGenresSearchedAfter - Genre: " + searchedAfterGenre);
				time_start = System.currentTimeMillis();
				listGenresSearchedAfterTest=searchService.getGenresSearchedAfter(searchedAfterGenre);
				time_end = System.currentTimeMillis();
				System.out.println(listGenresSearchedAfterTest);
				System.out.println("Time of getGenresSearchedAfter: "+ ( time_end - time_start ) +" milliseconds");
				System.out.println();
			}
			
			// ------------Service 3---------------- //
			
			System.out.println();
			System.out.println("Related Genres Test");
			System.out.println();
			for(String relatedGenre: test) {
				System.out.println("----Method getRelatedGenres - Genre: " + relatedGenre);
				time_start = System.currentTimeMillis();
				listRelatedGenresTest=searchService.getRelatedGenres(relatedGenre);
				time_end = System.currentTimeMillis();
				System.out.println(listRelatedGenresTest);
				System.out.println("Time of getRelatedGenres: "+ ( time_end - time_start ) +" milliseconds");
				System.out.println();
			}
		}
	}
}