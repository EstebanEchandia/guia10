package problema01;

import java.util.ArrayList;

public class Cuadrado {
	Punto puntoCentral, esqSupIzq, esqSupDer, esqInfIzq, esqInfDer;
	public Punto getPuntoCentral() {
		return puntoCentral;
	}

	public Punto getEsqSupIzq() {
		return esqSupIzq;
	}

	public Punto getEsqSupDer() {
		return esqSupDer;
	}

	public Punto getEsqInfIzq() {
		return esqInfIzq;
	}

	public Punto getEsqInfDer() {
		return esqInfDer;
	}

	public int getLado() {
		return lado;
	}

	int lado;
	
	public Cuadrado(int x, int y, int lado) {
		super();
		this.puntoCentral = new Punto(x,y);
		this.lado = lado;
		this.esqSupIzq = new Punto(y+lado/2, x-lado/2);
		this.esqSupDer = new Punto(y+lado/2, x+lado/2);
		this.esqInfIzq = new Punto(y-lado/2, x-lado/2);
		this.esqInfDer = new Punto(y-lado/2, x+lado/2);
		
	}
	@Override
	public String toString() {
		return (this.puntoCentral.getX()+" "+this.puntoCentral.getY() );
	}
	@Override
	public boolean equals(Object o) {
		return (o instanceof Cuadrado && ((Cuadrado)o).getPuntoCentral().getX()==this.getPuntoCentral().getX() && ((Cuadrado)o).getPuntoCentral().getY()==this.getPuntoCentral().getY());
	}
	

	
	
}
