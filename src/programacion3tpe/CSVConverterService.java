package programacion3tpe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CSVConverterService {
	public static final String SEPARATOR=",";
	public static final String SEPARATOR_GENEROS=" ";
	public static List<Libro> readCSV(String datasetName){
		List<Libro> libros= new ArrayList<Libro>();
		  
			   String csvFile = "datasets/"+ datasetName +".csv";
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

	public static void writeCSV(List<Libro> libros, String resultado) {
		BufferedWriter bw = null;
		try {
			File file = new File("datasets/"+ resultado +".csv");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			String contenidoLinea="Titulo,Autor,Paginas,Generos";
			bw.write(contenidoLinea);
			bw.newLine();
			for(int i=0; i < libros.size(); i++) {
				contenidoLinea = libros.get(i).toString();
				bw.write(contenidoLinea);
				bw.newLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error cerrando el BufferedWriter" + ex);
			}
		}
	}
} 
   
