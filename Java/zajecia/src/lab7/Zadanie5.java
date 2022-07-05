package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		Zadanie5 zad = new Zadanie5();
		zad.rozwiazanie();
	}
	
	public void rozwiazanie() {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a, mult= 1;
		while(true) {
			a = read.nextInt();
			list.add(a);
			mult *= a;
			System.out.println(mult);
			if(mult == 256) {
				break;
			} else if(mult > 256) {
				Collections.sort(list);
			//	Collections.reverse(list);
				mult /= list.get(0);
				list.remove(0);
				System.out.println("wywolalo");
				System.out.println(mult);
				System.out.println(list);
			}
		}
		read.close();
		Collections.sort(list);
	//	Collections.reverse(list);
		System.out.println(list);	
	}
}