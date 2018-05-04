package programacion3tpe;

import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		try {
			CSVConverterService.readCSV();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
