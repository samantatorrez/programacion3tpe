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
	public static final String SEPARATOR = ",";
	public static final String SEPARATOR_GENEROS = " ";

	public static List<Book> getBooksFromFile(String datasetName) {
		List<Book> books = new ArrayList<>();
		String csvFile = "datasets/books/" + datasetName + ".csv";
		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(SEPARATOR);
				String[] genres = fields[3].split(SEPARATOR_GENEROS);
				Book temp = new Book(fields[0], fields[1], Integer.parseInt(fields[2]), Arrays.asList(genres));
				books.add(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("catch");
		}
		return books;
	}

	public static void writeBooksResult(List<Book> books, String result) {
		BufferedWriter bw = null;
		try {
			File file = new File("datasets/results/" + result + ".csv");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			String contentLine = "Titulo,Autor,Paginas,Generos";
			bw.write(contentLine);
			bw.newLine();
			System.out.println("Result Size: " + books.size());
			for (Book book : books) {
				contentLine = book.toString();
				bw.write(contentLine);
				bw.newLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error closing BufferedWriter" + ex);
			}
		}
	}

	public static List<List<String>> getSearchList(String datasetName) {
		List<List<String>> searches = new ArrayList<List<String>>();
		List<String> search;
		String csvFile = "datasets/searches/" + datasetName + ".csv";
		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			br.readLine();
			while ((line = br.readLine()) != null) {
				List<String> list = new ArrayList<String>();
				String[] fields = line.split(SEPARATOR);
				search = Arrays.asList(fields);
				searches.add(search);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("catch");
		}
		return searches;
	}

}