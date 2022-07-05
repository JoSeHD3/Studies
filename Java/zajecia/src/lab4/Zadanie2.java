package lab4;

import java.util.Random;

public class Zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uzupelnij();
	}
	
	public static void uzupelnij() {
		Random rand = new Random();
		
		int size = rand.nextInt(10)+10;
		
		int[][] arr = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = rand.nextInt(41)-20;
			}
		}
		
		int randomOne;
		
		for(int i = 0; i < size; i++) {
			while(true) {
				randomOne = rand.nextInt(3)-1;
				if(randomOne == -1 || randomOne == 1) break;
			}
			arr[i][size - i - 1] = randomOne;
		}
		
		wyswietl(arr);
		System.out.println("");
		obliczStosunek(arr);
		
	}
	
	public static void wyswietl(int[][] arr) {
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void obliczStosunek(int[][] arr) {
		int even = 0, odd = 0, size = arr.length;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i % 2 == 0) even += arr[i][j];
				if(j % 2 == 1) odd += arr[i][j];
			}
		}
		
		System.out.println("Stosunek wynosi: " + even + " / " + odd);
	}

}
