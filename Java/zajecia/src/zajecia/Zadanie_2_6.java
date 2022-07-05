package zajecia;

public class Zadanie_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trojkat trojkat1 = new Trojkat(3, 4, 5);
		System.out.println(trojkat1.sprawdzTrojkat());
		
		Trojkat trojka2 = new Trojkat(5, 3, 4);
		System.out.println(trojka2.sprawdzTrojkat());
		
	}

}

class Trojkat{
	
	public int a, b, c;
	
	Trojkat(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean sprawdzTrojkat() {
		if( a < c + b) {
			if(b < a + c) {
				if(c < a + b) return true;
			}
		}
		return false;
	}
	
}