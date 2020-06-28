package problema06;

public class Casilla {
	public int x;
	public int y;
	public boolean marcada;
	public int grupo;
	
	
	public Casilla(int x,int y,boolean m,int g) {
		this.x=x;
		this.y=y;
		this.marcada=m;
		this.grupo=g;
	}
	
	@Override
	public String toString() {
		return "["+this.x+","+this.y+" -> "+this.marcada+"]";
	}
}
