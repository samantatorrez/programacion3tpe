import java.text.Collator;
import java.util.List;

public class BinaryTree {
    private Node root;

    //Constructor to initialize the tree with a value
    public BinaryTree(String value) { this.root = new Node(value); }

    //Constructor to initialize the tree with a node
    public BinaryTree(Node root) {
        this.root = root;
    }

    //Constructor to initialize the tree empty
    public BinaryTree() { this.root = null; }

    public Node getRoot() { return root; }

    public String getRootValue() { return root.getGenre(); }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(String data, Book book) { root = insert(root, data, book); }

    private Node insert(Node node, String data, Book book) {
        if (node == null) {
            node = new Node(data);
            node.addBook(book);
        } else {
            Collator collator = Collator.getInstance();
            if (collator.compare(data, node.getGenre()) < 0) {
                node.setLeftNode(insert(node.getLeftNode(), data, book));
            } else {
                node.setRightNode(insert(node.getRightNode(), data, book));
            }
        }
        return node;
    }

    public Node hasElem(String value) { return searchElem(root, value); }

    private Node searchElem(Node node, String val) {
        if (node == null) {
            return null;
        } else {
            Collator collator = Collator.getInstance();
            if (collator.compare(val, node.getGenre()) < 0) {
                return searchElem(node.getLeftNode(), val);
            } else if (collator.compare(val, node.getGenre()) > 0) {
                return searchElem(node.getRightNode(), val);
            } else {
                return node;
            }
        }
    }

    public void printInOrder(Node node){
        if (node != null) {
            printInOrder(node.getLeftNode());
            System.out.print(node.getGenre() + " ");
            printInOrder(node.getRightNode());
        }
    }

    public void printPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.getGenre() + " ");
            printPreOrder(node.getLeftNode());
            printPreOrder(node.getRightNode());
        }
    }

    public void printPosOrder(Node node) {
        if (node != null) {
            printPosOrder(node.getLeftNode());
            printPosOrder(node.getRightNode());
            System.out.print(node.getGenre() + " ");

        }
    }

    public boolean isEmpty() { return (this.root == null); }

    public void addGenres(List<String> genres, Book book) {
        for (String genre : genres){
            Node newNode = new Node(genre);
            newNode.addBook(book);
            if (this.isEmpty()){
                setRoot(newNode);
            }
            else {
                Node existentGenre = this.hasElem(genre);
                if (existentGenre != null) {
                    existentGenre.addBook(book);
                } else {
                    this.insert(genre, book);
                }
            }
        }
    }
}
