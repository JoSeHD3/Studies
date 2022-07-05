package zajecia;

public class Auto {
	
	int seatsNumber;												//pola
	String model;
	
	Auto(int seats, String m){											//Konstruktor parametrowy
		model = m;
		seatsNumber = seats;
	}
	
	Auto(){																//Konstruktor bezparametrowy
		model = "Undefined";
		seatsNumber = 0;
	}
	
	void displayValues() {												//Metoda objektu
		System.out.println("Miejsca w " + model + ": " + seatsNumber);
	}
	
	public static void main(String[] args) {
		
		Auto auto1 = new Auto();										//Wywolanie konstruktora bezparametrowego - tworzenie obiektu
		auto1.seatsNumber = 5;											//przypisanie parametrow
		auto1.model = "Audi";
		auto1.displayValues();											//wywolanie metody obiektu
		
		Auto auto2 = new Auto();
		auto2.seatsNumber = 4;
		auto2.model = "BMW";
		System.out.println("Miejsca w " + auto2.model + ": " + auto2.seatsNumber);
		
		Auto auto3 = new Auto(4, "Mercedes");							//Wywolanie konstruktora parametrowego - argumenty w nawiasach, obiekt z przypisanymi wartosciami w polach
		auto3.displayValues();
		
		Auto auto4 = new Auto();
		auto4.displayValues();
		
		Chair c = new Chair();
		c.setLegs(2);													//odwolanie do settera
		System.out.println("Liczba nog: " + c.getLegs());				//odwolanie do gettera
		
		/*
//		System.out.println("hello");
		
		int seatsNumber = 4;
		System.out.println("liczba miejsc w pojezdzie: " + seatsNumber);
		
		if(seatsNumber == 4) System.out.println("Samochod osobowy");				//if ..else.. 
		else if (seatsNumber == 2) System.out.println("Samochod ciezarowy");
		else System.out.println("Inny samochod");
		
		int dayNumber = 2;
		
		switch(dayNumber) {						//switch case
			case 1:		
				System.out.println("Poniedzialek");
				break;
			case 2:
				System.out.println("Wtorek");
				break;
			case 3:
				System.out.println("Sroda");
				break;
			case 4:
				System.out.println("Czwartek");
				break;
			case 5:
				System.out.println("Piatek");
				break;
			default:
				System.out.println("Weekendzik");
				break;
		}
		
		int[] array = new int[10];					//arrays
		//int[][] arr2D = new int[10][10];				
		
		for(int i = 0; i < 10; i++) {					//for
			System.out.println("for i: " + (i+1));
			array[i] = i+1;
		}
		
		for (int l : array) {						//foreach
			System.out.println(l);
		}
		
		int i = 1;
						
		while(i < 10) {							//while
			System.out.println("While loop: " + i);
			i++;
		}
		
		do {								//do while
			if(i == 4) continue;
			System.out.println("do while loop: " + i--);
			
		} while(i > 0);
			
	*/
	}
}

class Chair{
	private int legs;													//prywatne pole - brak dostepu w innych klasach

	public int getLegs() {												//getter
		return legs;
	}

	public void setLegs(int legs) {										//setter
		if(legs >2 )
		this.legs = legs;
		else System.out.println("Error in Chair.setLegs");
	}
	
}
