package problema02;
import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
	
		lista.add(2);
		lista.add(3);
		lista.add(5);
		lista.add(6);
		lista.add(8);
		lista.add(12);
		lista.add(45);
		lista.add(67);
		lista.add(89);
		lista.add(112);
		
		BusquedaBinaria bb = new BusquedaBinaria();
		
		System.out.println(bb.busqueda(lista,3));

		ArrayList<Integer> og = new ArrayList<Integer>();
		ArrayList<Integer> rot = new ArrayList<Integer>();
		
		og.add(1);
		og.add(2);
		og.add(3);
		og.add(4);
		og.add(5);
		og.add(6);
		og.add(7);

		rot.add(5);
		rot.add(6);
		rot.add(7);
		rot.add(1);
		rot.add(2);
		rot.add(3);
		rot.add(4);
		
		CalcularRotaciones cr = new CalcularRotaciones();
		
		System.out.println(cr.calcularRotaciones(og, rot));
		
		ArrayList<Integer> tortilla = new ArrayList<Integer>();
		tortilla.add(1);
		tortilla.add(2);
		tortilla.add(3);
		tortilla.add(8);
		tortilla.add(6);
		tortilla.add(4);
		
		
		
		
		
		
	}
}
