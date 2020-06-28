package problema06;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Figura f = new Figura();
		ArrayList<ArrayList<Casilla>> matriz = new ArrayList<ArrayList<Casilla>>();
		
		ArrayList<Casilla> fila1 = new ArrayList<Casilla>();
		ArrayList<Casilla> fila2 = new ArrayList<Casilla>();
		ArrayList<Casilla> fila3 = new ArrayList<Casilla>();
		ArrayList<Casilla> fila4 = new ArrayList<Casilla>();
		
		Casilla c1 = new Casilla(0,0,true,1);
		Casilla c2 = new Casilla(0,1,true,1);
		Casilla c3 = new Casilla(0,2,true,1);
		Casilla c4 = new Casilla(0,3,false,1);
		Casilla c5 = new Casilla(1,0,false,1);
		Casilla c6 = new Casilla(1,1,true,1);
		Casilla c7 = new Casilla(1,2,false,1);
		Casilla c8 = new Casilla(1,3,false,1);
		Casilla c9 = new Casilla(2,0,true,1);
		Casilla c10 = new Casilla(2,1,true,1);
		Casilla c11 = new Casilla(2,2,false,1);
		Casilla c12 = new Casilla(2,3,false,1);
		Casilla c13 = new Casilla(3,0,false,1);
		Casilla c14 = new Casilla(3,1,false,1);
		Casilla c15 = new Casilla(3,2,false,1);
		Casilla c16 = new Casilla(3,3,false,1);
		
		fila1.add(c1);
		fila1.add(c2);
		fila1.add(c3);
		fila1.add(c4);
		
		fila2.add(c5);
		fila2.add(c6);
		fila2.add(c7);
		fila2.add(c8);
		
		fila3.add(c9);
		fila3.add(c10);
		fila3.add(c11);
		fila3.add(c12);
		
		fila4.add(c13);
		fila4.add(c14);
		fila4.add(c15);
		fila4.add(c16);
		
		matriz.add(fila1);
		matriz.add(fila2);
		matriz.add(fila3);
		matriz.add(fila4);
		
		f.matriz = matriz;
		
//		for(ArrayList<Casilla> fila: f.matriz) {
//			for (Casilla casilla : fila) {
//				System.out.println(casilla.toString());
//			}
//		}
		
		System.out.println(f.tamanio(1,1));

	}

}
