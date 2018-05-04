package programacion3tpe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVConverterService {
	public static final String SEPARATOR=",";
	public static final String SEPARATOR_GENEROS=" ";
	public static List<Libro> readCSV() throws IOException{
		List<Libro> libros= new ArrayList<Libro>();
		  
			   String csvFile = "datasets/dataset1.csv";
		        String line = "";

		        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
		        	br.readLine();
		            while ((line = br.readLine()) != null) {
		                String [] fields = line.split(SEPARATOR);
				         String [] generos = fields[3].split(SEPARATOR_GENEROS);
				         libros.add(new Libro(fields[0],fields[1],Integer.parseInt(fields[2]),Arrays.asList(generos)));      
				         line = br.readLine();
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        
		   } 
	    return libros;
	}
	public static void writeCSV(List<Libro> libros) {
		
	}
} 
   
