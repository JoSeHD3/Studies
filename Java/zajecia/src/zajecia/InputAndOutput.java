package zajecia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class InputAndOutput {
  
	private static final String FILE = "./src/file.txt";
	private static final Path PATH = Paths.get(FILE);
	
	public static void main(String[] args) throws IOException {
		
		// odczytanie pliku w formie bajtowej
		byte[] input = readFile(FILE);
		
		// sparsowanie do stringa
		String text = new String(input);
		
		// sprawdzenie
		System.out.println(text);

		// sparsowanie do tablicy bajtowej
		byte[] output = text.getBytes();
		
		// zapis do pliku w formie bajtowej
		writeFile(output);
	}
  
	// odczyt z pliku BufferedReader, FileReader
	private static byte[] readFile(String fileName) throws IOException {
		return Files.readAllBytes(PATH);
	}
  
	// zapis do pliku FileWriter
	private static void writeFile(byte[] bytes) throws IOException {
		Files.write(PATH, bytes);
	}
}