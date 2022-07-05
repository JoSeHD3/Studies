package lab6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
	
	int a = 0, b = 0;

	
	public static void main(String[] args) {
		Zadanie1 zad = new Zadanie1();
		boolean t = true;
		while(t) {
			t = zad.getNumber(zad);
		}
		zad.wybierzDzialanie();
	}
	
	public boolean getNumber(Zadanie1 zad) throws InputMismatchException {
		Scanner read = new Scanner(System.in);
		try{
			System.out.print("Wprowadz pierwsza liczbe: ");
			zad.a = read.nextInt();
			System.out.print("\nWprowadz druga liczbe: ");
			zad.b = read.nextInt();
			System.out.println();
			return false;
		} catch (InputMismatchException e) {
			System.out.println("Zly format liczby");
			System.out.println("Podaj liczbe ponownie");
			return true;
		}
	}

	public int dodawanie(int a, int b) {
		return a+b;
	}
	
	public int odejmowanie(int a, int b) {
		return a-b;
	}
	
	public int mnozenie(int a, int b) {
		if(a == 0 || b == 0) throw new ArithmeticException("Niepoprawne liczby");
		return a * b;
	}
	
	public double dzielenie(int a, int b) {
		if(b == 0) throw new ArithmeticException("Niepoprawny dzielnik.");
		else return a/b;
	}
	
	public double potegowanie(int a, int b) {
		if(a <= 0) throw new ArithmeticException("Niepoprawna liczba.");
		else return Math.pow(a, b);
	}
	
	public double pierwiastkowanie(int a) {
		if(a <= 0) throw new ArithmeticException("Niepoprawna liczba.");
		return Math.sqrt((double)a);
	}
	
	public void wybierzDzialanie() {
		
		System.out.println("Wprowadz typ dzialania: ");
		
		Scanner read = new Scanner(System.in);
		String s = read.nextLine();
		
		switch(s){
		case "dodawanie": 
			System.out.println("Wynik: " + dodawanie(a, b));
			break;
		case "odejmowanie":
			System.out.println("Wynik: " + odejmowanie(a, b));
			break;
		case "mnozenie":
			System.out.println("Wynik: " + mnozenie(a, b));
			break;
		case "dzielenie":
			System.out.println("Wynik: " + dzielenie(a, b));
			break;
		case "potegowanie":
			System.out.println("Wynik: " + potegowanie(a, b));
			break;
		case "pierwiastkowanie":
			System.out.println("Wynik: " + pierwiastkowanie(a));
			break;
		default:
			System.out.println("Niepoprawny format dzialania");
			break;
		}
		read.close();
	}
		
}
