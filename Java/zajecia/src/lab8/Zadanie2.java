package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Zadanie2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			arr.add(r.nextInt(19)+1);
		}
		
		Collections.sort(arr, new SortByComparator());
		
		arr.forEach((n) -> {System.out.println(n);});
	}

}

class SortByComparator implements Comparator<Integer>{
	
	public int compare(Integer a, Integer b) {
		return a - b;
	}
}