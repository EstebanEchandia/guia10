package problema01;

import java.util.ArrayList;

public class Patron {
	public ArrayList<Cuadrado> algoritmo(int k) {
		Cuadrado cuadradoInicial = new Cuadrado(0,0,k);
		ArrayList<Cuadrado> listaCuadrados = new ArrayList<Cuadrado>();
		return this.generarFractal(cuadradoInicial, k,listaCuadrados);
	}
	
	private ArrayList<Cuadrado> generarFractal(Cuadrado c, int k,ArrayList<Cuadrado>listaCuadrados){
		if(k<2) {
			return listaCuadrados;
		}
		else {
			Cuadrado c1 = new Cuadrado(c.getEsqInfDer().getX(),c.getEsqInfDer().getY(),k/2);
			Cuadrado c2 = new Cuadrado(c.getEsqInfIzq().getX(),c.getEsqInfIzq().getY(),k/2);
			Cuadrado c3 = new Cuadrado(c.getEsqSupIzq().getX(),c.getEsqSupIzq().getY(),k/2);
			Cuadrado c4 = new Cuadrado(c.getEsqSupDer().getX(),c.getEsqSupDer().getY(),k/2);
			listaCuadrados.add(c1);
			listaCuadrados.add(c2);	
			listaCuadrados.add(c3);
			listaCuadrados.add(c4);
			generarFractal(c1, k/2, listaCuadrados);
			generarFractal(c2, k/2, listaCuadrados);
			generarFractal(c3, k/2, listaCuadrados);
			generarFractal(c4, k/2, listaCuadrados);
		}
		return listaCuadrados;	
	}	
}
