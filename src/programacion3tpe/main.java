package programacion3tpe;

import java.util.List;


public class main {

	public static void main(String[] args) {

		String [] datasets = {"dataset1","dataset2","dataset3","dataset4"};
		SearchesService searchService = new SearchesService();

		// ------------Service 1---------------- //

		long time_start_2, time_end_2 = 0;
		String [] mostSearchedGenresTest = {"thriller","cultura","religi�n","cine"};
		List<String> listMostSearchedGenresTest;
		System.out.println();
		System.out.println("Most Searched Genres Test");
		System.out.println();

		for(String dataset: datasets) {
			System.out.println();
			System.out.println("----Dataset: " + dataset);
			System.out.println();
			time_start_2 = System.currentTimeMillis();
			searchService.setDataset(dataset);
			time_end_2 = System.currentTimeMillis();
			System.out.println("Time of graph inicialization: "+ ( time_end_2 - time_start_2 ) +" milliseconds");
			for(String mostSearchedGenre: mostSearchedGenresTest) {
				System.out.println("----Method getMostSearchedGenres - Genre: " + mostSearchedGenre);
				time_start_2 = System.currentTimeMillis();
				listMostSearchedGenresTest=searchService.getMostSearchedGenres(3, mostSearchedGenre);
				time_end_2 = System.currentTimeMillis();
				System.out.println(listMostSearchedGenresTest);
				System.out.println("Time of getMostSearchedGenres: "+ ( time_end_2 - time_start_2 ) +" milliseconds");
				System.out.println();
			}
		}

		// ------------Service 2---------------- //

		long time_start_3, time_end_3 = 0;
		String [] genresSearchedAfterTest = {"thriller","cultura","religi�n","cine"};
		List<String> listGenresSearchedAfterTest;
		System.out.println();
		System.out.println("All Searched Genres After Origin Test");
		System.out.println();

		for(String dataset: datasets) {
			System.out.println();
			System.out.println("----Dataset: " + dataset);
			System.out.println();
			time_start_3 = System.currentTimeMillis();
			searchService.setDataset(dataset);
			time_end_3 = System.currentTimeMillis();
			System.out.println("Time of graph inicialization: "+ ( time_end_3 - time_start_3 ) +" milliseconds");
			for(String searchedAfterGenre: genresSearchedAfterTest) {
				System.out.println("----Method getGenresSearchedAfter - Genre: " + searchedAfterGenre);
				time_start_3 = System.currentTimeMillis();
				listGenresSearchedAfterTest=searchService.getGenresSearchedAfter(searchedAfterGenre);
				time_end_3 = System.currentTimeMillis();
				System.out.println(listGenresSearchedAfterTest);
				System.out.println("Time of getGenresSearchedAfter: "+ ( time_end_3 - time_start_3 ) +" milliseconds");
				System.out.println();
			}
		}

		// ------------Service 3---------------- //

		long time_start, time_end = 0;
		String [] relatedGenresTest = {"ficci�n","viajes","tecnolog�a","ludo"};
		List<String> listRelatedGenresTest;
		System.out.println();
		System.out.println("Related Genres Test");
		System.out.println();

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
				System.out.println();
			}
		}
	}
}