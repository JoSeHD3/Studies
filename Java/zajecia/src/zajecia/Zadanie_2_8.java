package zajecia;

public class Zadanie_2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(8));
	}
	
	public static int fib(int n) {
		if(n <= 1) return n;
		return (fib(n-1) + fib(n-2));
	}

}
