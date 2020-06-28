package problema01;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Patron n1 = new Patron();
		ArrayList<Cuadrado> fractal = n1.algoritmo(4);
		ArrayList<Cuadrado> fractal1 = (ArrayList<Cuadrado>) fractal.stream().distinct().collect(Collectors.toList());
		for(Cuadrado c: fractal1) {
			System.out.println(c.toString());
		}
	}

}
