package lab5;

import java.awt.Color;

public class Okrag extends Elipsa{

	private double r;

	public Okrag(int pole, int obwod, Color kolor, double a, double b, int f1x, int f1y, int f2x, int f2y, double r) {
		super(pole, obwod, kolor, a, b, f1x, f1y, f2x, f2y);
		this.r = r;
	}

	public Okrag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Okrag(int pole, int obwod, Color kolor, double a, double b, int f1x, int f1y, int f2x, int f2y) {
		super(pole, obwod, kolor, a, b, f1x, f1y, f2x, f2y);
		// TODO Auto-generated constructor stub
	}

	public Okrag(int pole, int obwod, Color kolor) {
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
	public double getA() {
		// TODO Auto-generated method stub
		return super.getA();
	}

	@Override
	public void setA(float a) {
		// TODO Auto-generated method stub
		super.setA(a);
	}

	@Override
	public double getB() {
		// TODO Auto-generated method stub
		return super.getB();
	}

	@Override
	public void setB(float b) {
		// TODO Auto-generated method stub
		super.setB(b);
	}

	@Override
	public double getC() {
		// TODO Auto-generated method stub
		return super.getC();
	}

	@Override
	public void setC(float c) {
		// TODO Auto-generated method stub
		super.setC(c);
	}

	@Override
	public int getF1x() {
		// TODO Auto-generated method stub
		return super.getF1x();
	}

	@Override
	public void setF1x(int f1x) {
		// TODO Auto-generated method stub
		super.setF1x(f1x);
	}

	@Override
	public int getF1y() {
		// TODO Auto-generated method stub
		return super.getF1y();
	}

	@Override
	public void setF1y(int f1y) {
		// TODO Auto-generated method stub
		super.setF1y(f1y);
	}

	@Override
	public int getF2x() {
		// TODO Auto-generated method stub
		return super.getF2x();
	}

	@Override
	public void setF2x(int f2x) {
		// TODO Auto-generated method stub
		super.setF2x(f2x);
	}

	@Override
	public int getF2y() {
		// TODO Auto-generated method stub
		return super.getF2y();
	}

	@Override
	public void setF2y(int f2y) {
		// TODO Auto-generated method stub
		super.setF2y(f2y);
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

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	
	
}
