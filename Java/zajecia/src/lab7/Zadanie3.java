package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		Zadanie3 zad = new Zadanie3();
		zad.rozwiazanie();
	}
	
	public void rozwiazanie() {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a, sum = 0, mult = 1;
		while(true) {
			a = read.nextInt();	
			if(sum > 250 || mult > 3000000) {
				break;
			} else {
				sum += a;
				mult *= a;
				list.add(a);
				System.out.println(sum + "\t" + mult);
			}
		}
		read.close();
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}