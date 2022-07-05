package Kolokwium;

import java.util.Scanner;

public class Zadanie2 {

	public final int[] ARR = {1, 2, 6, 7, 2, 13, 8, -3, -2, 4, 6};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zadanie2 zad = new Zadanie2();
		
		while(true) {
			int a = zad.wprowadzIndex();
			if(a == -1) break;
			else zad.wyswietlIndex(a);
		}
	}
	
	public int wprowadzIndex() {
		int a;
		Scanner read = new Scanner(System.in);
		a = read.nextInt();
		return a;
	}
	
	public void wyswietlIndex(int i) {
		
		try {
			System.out.println("Zawartosc indexu " + i + " tablicy: " + ARR[i]);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Index poza zakresem.");
		}
		
//		if(i < 0 || i > ARR.length - 1) throw new IndexOutOfBoundsException("Index poza zasiegiem tablicy.");
//		System.out.println("Zawartosc indexu " + i + " tablicy: " + ARR[i]);
	}

}
