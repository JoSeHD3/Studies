package Kolokwium;

public class Opona {
	String producent;
	String model;
	int rozmiarOpony;
	
	public Opona(String producent, String model, int rozmiarOpony) {
		super();
		this.producent = producent;
		this.model = model;
		this.rozmiarOpony = rozmiarOpony;
	}

	@Override
	public String toString() {
		return "Opona [producent=" + producent + ", model=" + model + ", rozmiarOpony=" + rozmiarOpony + "]";
	}
	
	
}