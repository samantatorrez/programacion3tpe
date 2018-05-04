public class main {

    public static void main(String[] args) {
        Library libreria = new Library();
        long time_start, time_end = 0;
        System.out.println(">Dataset 1, 20 books");
        time_start = System.currentTimeMillis();
        libreria.setBooks("dataset1");
        time_end = System.currentTimeMillis();
        System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.getResultsForGenre("cine", "dataset1_cine");
        time_end = System.currentTimeMillis();
        System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");

        System.out.println(">Dataset 2, 1000 books");
        time_start = System.currentTimeMillis();
        libreria.setBooks("dataset2");
        time_end = System.currentTimeMillis();
        System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.getResultsForGenre("humor", "dataset2_humor");
        time_end = System.currentTimeMillis();
        System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");

        System.out.println(">Dataset 3, 100000 books");
        time_start = System.currentTimeMillis();
        libreria.setBooks("dataset3");
        time_end = System.currentTimeMillis();
        System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.getResultsForGenre("humor", "dataset3_humor");
        time_end = System.currentTimeMillis();
        System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");

        System.out.println(">Dataset 4,1000000 books");
        time_start = System.currentTimeMillis();
        libreria.setBooks("dataset4");
        time_end = System.currentTimeMillis();
        System.out.println("Time of data loading and creation of the index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.getResultsForGenre("humor", "dataset4_humor");
        time_end = System.currentTimeMillis();
        System.out.println("Search time by gender and saving data in new CSV: "+ ( time_end - time_start ) +" milliseconds");
    }
}
