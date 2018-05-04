import java.util.ArrayList;
import java.util.List;

public class Node {
    private String genre;
    private List<Book> books;
    private Node left;
    private Node right;

    Node(String value) {
        this.genre = value;
        this.books = new ArrayList<Book>();
        this.left = null;
        this.right = null;
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Node getLeftNode(){
        return left;
    }
    public Node getRightNode(){
        return right;
    }

    public void setRightNode(Node node){
        this.right = node;
    }
    public void setLeftNode(Node node){
        this.left = node;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}