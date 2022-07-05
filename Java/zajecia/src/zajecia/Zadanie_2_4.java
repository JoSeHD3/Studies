package zajecia;

public class Zadanie_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Owoc owoc1 = new Owoc();
		Owoc owoc2 = new Owoc();
		
		owoc1.setNazwa("Banan");
		owoc1.setMasa(125.5);
		owoc1.setIlosc(2);
		
		owoc2.setNazwa("Awokado");
		owoc2.setMasa(50.3);
		owoc2.setIlosc(1);
		
		display(owoc1);
		display(owoc2);
		
	}
	
	public static void display(Owoc owoc) {
		show("Nazwa owocu: " + owoc.getNazwa() + "\nMasa owoców: " + owoc.getMasa() + "\nIloœæ owoców: " + owoc.getIlosc() + "\n\n");
	}
	
	public static void show(String string) {
		System.out.println(string);
	}

}


class Owoc{
	
	private String nazwa;
	private double masa;
	private int ilosc;
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
}