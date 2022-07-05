package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		Zadanie2 zad = new Zadanie2();
		zad.dodajDoListy();
	}
	
	public void dodajDoListy(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner read = new Scanner(System.in);
		int a;
		while(true) {
			a = read.nextInt();
			if(a == 0) break;
			else list.add(a);
		}
		
		read.close();
		
		int number, sum = 0, mult = 1;
		
		number = list.size();
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			mult *= list.get(i);
		}
		
		System.out.println("Ilosc liczb w liscie: " + number + "\nSuma liczb: " + sum + "\nIloczyn liczb :" + mult);
	}
}