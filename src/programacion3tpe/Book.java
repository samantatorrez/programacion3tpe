import java.util.List;

public class Book {
    private String titulo;
    private String autor;
    private int paginas;
    private List<String> generos;

    public Book(String titulo, String autor, int paginas, List<String> generos) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.generos = generos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<String> getGeneros() { return generos; }

    public void setGeneros(List<String> generos) { this.generos = generos; }

    public String toString() {
        String listGeneros = String.join(" ", this.generos);
        return this.titulo + "," + this.autor + "," + this.paginas + "," + listGeneros;
    }
}
