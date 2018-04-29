package programacion3tpe;

import java.util.List;

public class Index {
	private String genero;
	private List<Libro> libros;

	public Index(String genero, List<Libro> libros) {
		this.genero = genero;
		this.libros = libros;
	}
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
