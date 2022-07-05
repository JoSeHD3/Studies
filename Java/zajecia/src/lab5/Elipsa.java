package lab5;

import java.awt.Color;
import java.lang.Math;

class Elipsa extends Figura {
	
	private double a, b, c;
	private int f1x, f1y, f2x, f2y;
	
	Elipsa(int pole, int obwod, Color kolor, double a, double b, int f1x, int f1y, int f2x, int f2y) {
		super(pole, obwod, kolor);
		this.a = a;
		this.b = b;
		this.f1x = f1x;
		this.f1y = f1y;
		this.f2x = f2x;
		this.f2y = f2y;
		obliczC();
	}
	
	
	public Elipsa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Elipsa(int pole, int obwod, Color kolor) {
		super(pole, obwod, kolor);
		// TODO Auto-generated constructor stub
	}


	private void obliczC() {
		c = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));
	}

	public double getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public int getF1x() {
		return f1x;
	}

	public void setF1x(int f1x) {
		this.f1x = f1x;
	}

	public int getF1y() {
		return f1y;
	}

	public void setF1y(int f1y) {
		this.f1y = f1y;
	}

	public int getF2x() {
		return f2x;
	}

	public void setF2x(int f2x) {
		this.f2x = f2x;
	}

	public int getF2y() {
		return f2y;
	}

	public void setF2y(int f2y) {
		this.f2y = f2y;
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
