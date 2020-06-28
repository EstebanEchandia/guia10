package problema02;

import java.util.List;

public class BusquedaBinaria {
	
	
	
	
	public int busqueda(List<Integer> array, int x) {
		
		int medio = array.size()/2;
		
		if(array.size() == 2) {
			//System.out.println(array.toString());
			
			if(array.get(0) < x && array.get(1) > x)
				return array.get(0);
			
			else if( array.get(0) == x) return -1;
			else if( array.get(1) == x) return array.get(0);
			else {
				return array.get(1);
			}
		}
		
		if(array.size()==1 && array.get(0)<x) return array.get(0);
		else if(array.size()==1) return -1;
		
		
		if(x == array.get(medio)) return array.get(medio-1);
		
		else if(x > array.get(medio)) {
			System.out.println(array.subList(medio, array.size()).toString());
			return busqueda(array.subList(medio, array.size()), x);		
		}
		
		else {
			System.out.println((array.subList(0, medio).toString()));
			return busqueda(array.subList(0, medio), x);		
		}
		
	}
	
	

}
