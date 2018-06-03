package programacion3tpe;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private BinaryTree indexesGenre;

    public Library() {
        this.books = new ArrayList<Book>();
        this.indexesGenre = new BinaryTree();
    }

    /*
        Create a new file with the results of the search of books by genre.
        Needs the genre and the name of the result file as parameters.
     */
    public void getResultsForGenre(String genre, String fileNameOut) {
        Node result = indexesGenre.hasElem(genre);
        if (result != null) { //we create the file only if we have books as result
        	CSVConverterService.writeBooksResult(result.getBooks(), fileNameOut);
        }
    }

    public List<Book> getBooks() { return books; }

    /*
        This method reads the content of the file passed by parameter, and
        add the books to the Library. Also, generates/updates the indexes as it adds the books.
    */
    public void setBooks(String fileName) {
    	this.clear();
        this.books = CSVConverterService.getBooksFromFile(fileName);
        for (Book book : books) {
            indexesGenre.addGenres(book.getGeneros(), book);
        }
    }
    
    private void clear(){
    	this.books = new ArrayList<Book>();
        this.indexesGenre = new BinaryTree();
    }

    public void printBooks(List<Book> books) {
        for (Book bookActual : books) {
            System.out.println(bookActual.toString());
        }
    }

    public void printIndexes() { indexesGenre.printInOrder(indexesGenre.getRoot()); }
    
    public int getIterations() { return indexesGenre.getCount(); }
}
