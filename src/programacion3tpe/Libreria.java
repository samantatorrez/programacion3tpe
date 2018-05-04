package programacion3tpe;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
	private List<Libro> libros;
	//private loquesea indexesGenero;

	public Libreria() {
		setLibros(new ArrayList<Libro>());
	}
	
	public void ingresarLibros(String fileName) {
		//crea un libro por fila
		//se agrega ese libro al listado de libros
		//se crea un index por cada uno de los generos del libro
	}
	public void generarResultadoPorGenero(String genero, String fileNameOut) {
		//se recorre indexes y al encontrarse el genero lo devuelve
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
}
