package zajecia;

public class Zadanie_2_5 {

	public static void main(String[] args) {
		//forLoop();
		
		whileLoop();
	}
	
	public static void forLoop() {
		int count =0;
		for(int i = 6; i <=80;i++) {
			count++;
			System.out.print(i + " ");
			if(count == 15) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	public static void whileLoop() {
		
		int count = 0;
		int i = 6;
		
		while( i <= 80) {
			count++;
			System.out.print(i + " ");
			if(count == 15) {
				System.out.println();
				count = 0;
			}
			i++;
		}
		
	}
}