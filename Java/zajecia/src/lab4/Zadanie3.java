package lab4;

import java.util.Random;

public class Zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Okrag[] arr = createArray();
		System.out.println("Okregi sa " + checkPosition(arr));
		printFields(arr);
	}
	
	public static Okrag[] createArray() {
		Okrag[] arr = new Okrag[2];
		arr[0] = new Okrag();
		arr[1] = new Okrag();
		
		return arr;
	}
	
	public static String checkPosition(Okrag[] arr) {
		String s = "";
		double promien;
		
		int xOfThirdCoords = arr[0].x;
		int yOfThirdCoords = arr[1].y;
		
		promien = Math.sqrt(Math.pow(xOfThirdCoords, 2) + Math.pow(yOfThirdCoords, 2));
		
		double arrPromien = arr[0].promien + arr[1].promien;
		
		if((arr[0].x == arr[1].x) && (arr[0].y == arr[1].y) && (arr[0].promien == arr[1].promien)) {
			s = "pokrywajace";
		} else {
			if(promien == arrPromien) s = "styczne";
			else if(promien > arrPromien) s = "rozlaczne";
			else if(promien < arrPromien) s = "przecinajace";
		}
		
		return s;
	}
	
	public static void printFields(Okrag[] arr) {
		for(Okrag z : arr) {
			for(int x : z.coords) {
				System.out.print(x + "\t");
			}
			System.out.println("");
		}
	}

}


class Okrag{
	public int x, y, promien;
	public int[] coords = new int[3];
	public Okrag(){
		Random rand = new Random();
		x = rand.nextInt(91) + 5;
		y = rand.nextInt(91) + 5;
		promien = rand.nextInt(5) + 1;
		
		coords[0] = x;
		coords[1] = y;
		coords[2] = promien;
	}
	
}