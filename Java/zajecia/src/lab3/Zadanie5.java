package lab3;

import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = decToBin();
		System.out.println("Liczba w postaci binarnej: " + s);
		System.out.println("Najdluzsza sekwencja zer wynosi: " + sequences(s));
	}
	
	public static String decToBin() {
		
		Scanner read = new Scanner(System.in);
		
		int a = read.nextInt();
		
		read.close();
		
		return Integer.toBinaryString(a);
	}

	public static int sequences(String s) {
		
		int r = 0;
		
		String[] array = s.split("1");
		if(s.charAt(s.length() - 1) == '0') array[array.length - 1] = "";
		for(int i = 0; i < array.length; i++) {
			int check = array[i].length();
			if(check > r) r = check;
		}
		
		return r;
	}
	
}
