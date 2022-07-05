package lab3;

public class Zadanie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Znak wystepuje " + sprawdz('c', "cbbaacffhgc") + " razy.");
	}
	
	public static int sprawdz(char c, String s) {
		int spr = 0;
		for(int i = 0; i < s.length(); i++ ) {
			if(s.charAt(i) == c) spr++;
		}
		return spr;
	}

}
