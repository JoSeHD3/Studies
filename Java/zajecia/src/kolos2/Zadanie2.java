package kolos2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Zadanie2 {

	  
	private static final String FILE = "./src/kolos2/file.txt";
	private static final Path PATH = Paths.get(FILE);
	
	public static void main(String[] args) throws IOException {
		String text = ""; 
		Random r = new Random();
		for(int i = 0; i < 100; i++) {
			text += r.nextInt(100) + "\n";
		}
		
		byte[] output = text.getBytes();
		
		writeFile(output);
		
		byte[] input = readFile(FILE);
		
		String spr = new String(input);
		System.out.println(spr);
	}
	
	private static byte[] readFile(String fileName) throws IOException {
		return Files.readAllBytes(PATH);
	}
  
	private static void writeFile(byte[] bytes) throws IOException {
		Files.write(PATH, bytes);
	}
}
