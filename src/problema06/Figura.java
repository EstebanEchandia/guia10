package problema06;

import java.util.ArrayList;

public class Figura {       
	
	public ArrayList<ArrayList<Casilla>> matriz;
	
	public Casilla getCasilla(int x, int y) {
		return matriz.get(x).get(y);
	}
	
	public int tamanio(int x, int y) {
	
		if(x<0 || y<0 || x>=matriz.size() || y>=matriz.size()) {
			return 0;
		}
		if(this.getCasilla(x, y).marcada) {
			this.getCasilla(x, y).marcada = false;
			return this.tamanio(x+1,y)+	this.tamanio(x,y+1)+this.tamanio(x-1, y)+this.tamanio(x, y-1)+1;		
		}
		
		else return 0;
	}
}
