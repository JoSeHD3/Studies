package lab3;

public class Zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 48 - 57, 97 - 122
		System.out.println("Suma wartosci kodow ASCII: " + ascii("dfEgd4g"));
	}
	
	public static int ascii(String s) {
		int r = 0, l;
		for(int i = 0; i < s.length(); i++) {
			l = (int) s.charAt(i);
			if((l >= 48 && l <= 57) || (l >= 97 && l <= 122)) r += l;
		}
		return r;
	}

}
