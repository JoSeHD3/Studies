package lab6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {

	double a = 5;
	
	public static void main(String[] args) {
		
		Zadanie2 zad = new Zadanie2();
		boolean t = true;
		while(t) {
			t = zad.getNumber(zad);
		}
		zad.rozdzielLiczbe(zad.a);
	}
	
	public boolean getNumber(Zadanie2 zadanie) throws InputMismatchException {
		Scanner read = new Scanner(System.in);
		try{
			System.out.print("Wprowadz liczbe: ");
			zadanie.a = read.nextDouble();
			System.out.println();
			read.close();
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Zly format liczby");
			System.out.println("Podaj liczbe ponownie");
			read.close();
			return true;
		}
		
	}
	
	public void rozdzielLiczbe(double d) {
		double mantysa;
		int cecha;
		
		if(d < 0) {
			cecha = (int) (d/1 - 1);
			mantysa = d%1;
		} else {
			cecha = (int) (d/1);
			mantysa = d%1;
		}
		System.out.println(cecha + "           " + mantysa);
		System.out.println("Iloraz cechy przez mantyse wynosi: " + obliczIloraz(mantysa, cecha));
		
	}
	
	public double obliczIloraz(double mantysa, double cecha) {
		if(mantysa == 0 || cecha == 0) throw new ArithmeticException("Niepoprawne liczby");
		else return cecha/mantysa;
	}
	
}
