package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
		Zadanie4 zad = new Zadanie4();
		zad.rozwiazanie();
	}
	
	public void rozwiazanie() {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a, sum= 0;
		while(true) {
			a = read.nextInt();
			list.add(a);
			sum += a;
			System.out.println(sum);
			if(sum == 64) {
				break;
			} else if(sum > 64) {
				Collections.sort(list);
				Collections.reverse(list);
				sum -= list.get(0);
				list.remove(0);
				System.out.println("wywolalo");
				System.out.println(sum);
				System.out.println(list);
			}
		}
		read.close();
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);	
	}
}