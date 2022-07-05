package Kolokwium;

import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sebastian Bozek");
		
		Zadanie1 zad = new Zadanie1();
		
		zad.podajZakres();
	}
	
	public void podajZakres() {
		int a, b;
		Scanner read = new Scanner(System.in);
		System.out.println("Wprowadz poczatkowy zakres: ");
		a = read.nextInt();
		System.out.println("Wprowadz koncowy zakres: ");
		b = read.nextInt();
		System.out.println("Liczby z zakresu podzielne przez 27 bez reszty: ");
		for(int i = a; i < b; i++) {
			if(i%27 == 0) System.out.print(i + " ");
		}
		
		read.close();
	}

}
