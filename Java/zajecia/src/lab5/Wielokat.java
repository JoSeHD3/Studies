package lab5;

import java.awt.Color;

class Wielokat extends Figura{
	
	private int wierzcholki, boki, sumaKatowWewn;
	
	public Wielokat(int pole, int obwod, Color kolor, int wierzcholki, int boki) {
		super(pole, obwod, kolor);
		this.wierzcholki = wierzcholki;
		this.boki = boki;
		obliczSumeKatowWewn();
	}
	
	public Wielokat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wielokat(int pole, int obwod, Color kolor) {
		super(pole, obwod, kolor);
		// TODO Auto-generated constructor stub
	}

	private void obliczSumeKatowWewn() {
		sumaKatowWewn = (boki - 2) * 180;
	}
	
	public int getWierzcholki() {
		return wierzcholki;
	}

	public void setWierzcholki(int wierzcholki) {
		this.wierzcholki = wierzcholki;
	}

	public int getBoki() {
		return boki;
	}

	public void setBoki(int boki) {
		this.boki = boki;
	}

	public int getSumaKatowWewn() {
		return sumaKatowWewn;
	}

	public void setSumaKatowWewn(int sumaKatowWewn) {
		this.sumaKatowWewn = sumaKatowWewn;
	}

	@Override
	protected void rysuj() {
		// TODO Auto-generated method stub
		super.rysuj();
	}

	@Override
	protected void usun() {
		// TODO Auto-generated method stub
		super.usun();
	}

	@Override
	protected void przesun() {
		// TODO Auto-generated method stub
		super.przesun();
	}

	@Override
	public int getPole() {
		// TODO Auto-generated method stub
		return super.getPole();
	}

	@Override
	public void setPole(int pole) {
		// TODO Auto-generated method stub
		super.setPole(pole);
	}

	@Override
	public int getObwod() {
		// TODO Auto-generated method stub
		return super.getObwod();
	}

	@Override
	public void setObwod(int obwod) {
		// TODO Auto-generated method stub
		super.setObwod(obwod);
	}

	@Override
	public Color getKolor() {
		// TODO Auto-generated method stub
		return super.getKolor();
	}

	@Override
	public void setKolor(Color kolor) {
		// TODO Auto-generated method stub
		super.setKolor(kolor);
	}

	@Override
	protected String podajParametry() {
		// TODO Auto-generated method stub
		return super.podajParametry();
	}
	
	
	
}
