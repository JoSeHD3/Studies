package lab3;

import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = odczyt();
		s = cipher(s);
		System.out.println(s);
		s = decipher(s);
		System.out.println(s);
		System.out.println(palindrom(s));
	}

	public static String odczyt() {
		Scanner read = new Scanner(System.in);
		String s;
		
		s = read.nextLine();
		
		read.close();
		
		return s;
	}
	
	public static String cipher(String s) {
		String r = "";
		int check;
		for(int i = 0; i < s.length(); i++) {
			check = (int) s.charAt(i);
			if((check >= 65 && check <= 90) || (check >= 97 && check <= 122)) {
				check += 2;
				r += (char) check;
			} else {
				r += (char) check;
			}
			
		}
		
		return r;
	}
	
	public static String decipher(String s) {
		String r = "";
		int check;
		for(int i = 0; i < s.length(); i++) {
			check = (int) s.charAt(i);
			if((check >= 67 && check <= 92) || (check >= 99 && check <= 124)) {
				check -= 2;
				r += (char) check;
			} else {
				r += (char) check;
			}
			
		}
		
		return r;
	}
	
	public static boolean palindrom(String s) {
		byte l = 1;
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) == s.charAt(s.length() - i - 1)) {
				
			} else {
				l = 0;
			}
		}
		if(l == 1) return true;
		else return false;
	}
	
}