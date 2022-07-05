package lab5;

import java.awt.Color;

public class Prostokat extends Wielokat{

	private double a, b;

	public Prostokat(int pole, int obwod, Color kolor, int wierzcholki, int boki, double a, double b) {
		super(pole, obwod, kolor, wierzcholki, boki);
		this.a = a;
		this.b = b;
	}

	public Prostokat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prostokat(int pole, int obwod, Color kolor, int wierzcholki, int boki) {
		super(pole, obwod, kolor, wierzcholki, boki);
		// TODO Auto-generated constructor stub
	}

	public Prostokat(int pole, int obwod, Color kolor) {
		super(pole, obwod, kolor);
		// TODO Auto-generated constructor stub
	}
	
	public int obliczObwod() {
		return obwod;
	}
	
	public int obliczPole() {
		return pole;
	}
	
	@Override
	public int getWierzcholki() {
		// TODO Auto-generated method stub
		return super.getWierzcholki();
	}

	@Override
	public void setWierzcholki(int wierzcholki) {
		// TODO Auto-generated method stub
		super.setWierzcholki(wierzcholki);
	}

	@Override
	public int getBoki() {
		// TODO Auto-generated method stub
		return super.getBoki();
	}

	@Override
	public void setBoki(int boki) {
		// TODO Auto-generated method stub
		super.setBoki(boki);
	}

	@Override
	public int getSumaKatowWewn() {
		// TODO Auto-generated method stub
		return super.getSumaKatowWewn();
	}

	@Override
	public void setSumaKatowWewn(int sumaKatowWewn) {
		// TODO Auto-generated method stub
		super.setSumaKatowWewn(sumaKatowWewn);
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

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
