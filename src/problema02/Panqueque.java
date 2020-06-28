package problema02;

import java.util.ArrayList;

public class Panqueque {
	
	
	
	
	public ArrayList<Integer> darVuelta(ArrayList<Integer> array, int i, int n){
		
		ArrayList<Integer> dadoVuelta = new ArrayList<Integer>();
		
		for(int s = n; s>=0; s--) {
			dadoVuelta.add(array.get(s) );
		}
		
		for(int j = n; j<array.size();j++) {
			dadoVuelta.add(array.get(j));
		}
		
		
		
		
		return null;
		
		
		
		
		
	}
}
