package Kolokwium;

public class Auto {
	String marka;
	String model;
	int rozmiarOpony;
	
	public Auto(String marka, String model, int rozmiarOpony) {
		super();
		this.marka = marka;
		this.model = model;
		this.rozmiarOpony = rozmiarOpony;
	}

	@Override
	public String toString() {
		return "Auto [marka=" + marka + ", model=" + model + ", rozmiarOpony=" + rozmiarOpony + "]";
	}
	
	
}