package programacion3tpe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) {
		/*esto anda
		List<String> array= new ArrayList<String>();
		array.add("terror");
		array.add("arte");
		array.add("suspenso");
		Libro lib= new Libro("ardilla","jo",1,array);
		List<Libro> list= new ArrayList<Libro>();
		list.add(lib);
		CSVConverterService.writeCSV(list, "resultado");
		*/
		
		Libreria libreria = new Libreria();
		long time_start, time_end = 0;
		System.out.println(">Dataset 1");
        time_start = System.currentTimeMillis();
        libreria.ingresarLibros("dataset1");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de carga de datos y creación del index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.generarResultadoPorGenero("humor", "dataset1_humor");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de busqueda por genero y guardado de datos en nuevo csv: "+ ( time_end - time_start ) +" milliseconds");
        
        System.out.println(">Dataset 2");
        time_start = System.currentTimeMillis();
        libreria.ingresarLibros("dataset1");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de carga de datos y creación del index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.generarResultadoPorGenero("humor", "dataset2_humor");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de busqueda por genero y guardado de datos en nuevo csv: "+ ( time_end - time_start ) +" milliseconds");
        
        System.out.println(">Dataset 3");
        time_start = System.currentTimeMillis();
        libreria.ingresarLibros("dataset3");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de carga de datos y creación del index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.generarResultadoPorGenero("humor", "dataset1_humor");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de busqueda por genero y guardado de datos en nuevo csv: "+ ( time_end - time_start ) +" milliseconds");
        
        System.out.println(">Dataset 4");
        time_start = System.currentTimeMillis();
        libreria.ingresarLibros("dataset4");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de carga de datos y creación del index: "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        libreria.generarResultadoPorGenero("humor", "dataset1_humor");
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo de busqueda por genero y guardado de datos en nuevo csv: "+ ( time_end - time_start ) +" milliseconds");
        
        
	}

}
