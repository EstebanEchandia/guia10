package problema02;

import java.util.ArrayList;

public class CalcularRotaciones {
	public int calcularRotaciones(ArrayList<Integer> og, ArrayList<Integer> rotado) {
		
		if(og.equals(rotado)) return 0;
		else return calcularRotaciones(rotar(og), rotado)+1;	
	}
	
	public ArrayList<Integer> rotar(ArrayList<Integer> og){
		int primer = og.get(0);
		
		for(int i=og.size()-1;i>0;i--) {
			og.set((i+1)%og.size(), og.get(i));
		}
		
		og.set(1, primer);
		
		return og;
		
	}
}
