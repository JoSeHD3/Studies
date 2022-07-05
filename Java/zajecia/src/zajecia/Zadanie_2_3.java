package zajecia;

public class Zadanie_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uczen uczen1 = new Uczen();
		Uczen uczen2 = new Uczen("Konrad", "Nowak", 18, 3.56);
		Uczen uczen3 = new Uczen("Szymon", "Kowal", 17, 4.06);
		Uczen uczen4 = new Uczen("Magda", "Kowalska", 18, 5.02);
		
		uczen1.display();
		uczen2.display();
		uczen3.display();
		uczen4.display();
		
	}

}

class Uczen {
	public String imie;
	public String nazwisko;
	public int wiek;
	public double srednia;
	
	
	Uczen(){
		imie = "Undefined";
		nazwisko = "Undefined";
		wiek = -1;
		srednia = -1.0;
	}
	
	Uczen(String imie, String nazwisko, int wiek, double srednia){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.srednia = srednia;
	}
	
	public void display() {
		System.out.println("Imie: " + imie + "\nNazwisko: " + nazwisko + "\nWiek: " + wiek + "\nSrednia: " + srednia + "\n");
	}
}
