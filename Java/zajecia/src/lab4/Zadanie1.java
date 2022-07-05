package lab4;

public class Zadanie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wyswietlDwuliczbowe();
		//wyswietlJednoliczbowe();
	}
	
	public static void wyswietlDwuliczbowe() {
		int[] arr = new int[100];
		
		for(int i = 0; i < 100; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < 100; i++) {
			if(arr[i]<10) System.out.print("0");
			System.out.print(arr[i] + " ");
			if(arr[i]%10 == 9) System.out.println("");
			
		}
		
	}
	
	public static void wyswietlJednoliczbowe() {
		int[] arr = new int[100];
		
		for(int i = 0; i < 100; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i]%10 == 9) System.out.println("");
			
		}
	}

}
