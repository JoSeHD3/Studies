package Kolokwium;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sebastian Bozek");
		Auto auto1 = new Auto("VW", "Golf", 18);
		Auto auto2 = new Auto("Audi", "R8", 21);
		
		Opona opona1 = new Opona("Dunlop", "Winter", 18);
		Opona opona2 = new Opona("Dunlop", "Summer", 18);
		Opona opona3 = new Opona("Dunlop", "Both", 18);
		Opona opona4 = new Opona("Dunlop", "Winter", 21);
		Opona opona5 = new Opona("Dunlop", "Summer", 21);
		Opona opona6 = new Opona("Dunlop", "Both", 21);
		
		ArrayList<Auto> listaAut = new ArrayList<Auto>();
		ArrayList<Opona> listaOpon = new ArrayList<Opona>();
		listaAut.add(auto1);
		listaAut.add(auto2);
		
		listaOpon.add(opona1);
		listaOpon.add(opona2);
		listaOpon.add(opona3);
		listaOpon.add(opona4);
		listaOpon.add(opona5);
		listaOpon.add(opona6);
		
		Zadanie3 zad = new Zadanie3();
		int s = zad.wybierzSamochod(listaAut);
		zad.wyswietlOpony(listaOpon, s);
	}
	
	public int wybierzSamochod(ArrayList<Auto> listaAut) {
		int a;
		Scanner read = new Scanner(System.in);
		System.out.println("Wybierz samochod: ");
		for(int i = 0; i < listaAut.size(); i++) {
			System.out.println(listaAut.get(i).toString());
		}
		
		a = read.nextInt();
		read.close();
		return listaAut.get(a-1).rozmiarOpony;
	}
	
	public void wyswietlOpony(ArrayList<Opona> listaOpon, int s) {
		for(int i = 0; i < listaOpon.size(); i++) {
			if(listaOpon.get(i).rozmiarOpony == s) System.out.println(listaOpon.get(i).toString());
		}
	}
}