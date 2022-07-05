package lab3;

import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Znak: " + sprawdz());
	}
	
	public static char sprawdz() {
		
		Scanner read = new Scanner(System.in);
		int i;
		while(true) {
			i = read.nextInt();
			if(i >= 33 && i <= 126) break;
		}
		read.close();
		
		char c = (char) i;
		
		return c;
	}

}
