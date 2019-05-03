package ejercicio2;

public class Lado {
	private Punto p1;
	private Punto p2;
	
	Lado(Punto p1,Punto p2){
		this.p1=p1;
		this.p2=p2;
	}
	public double getLong() {
		return (Math.sqrt(Math.pow(this.p2.getX()-this.p1.getY(), 2)+Math.pow(this.p2.getY()-this.p1.getY(), 2)));
	}
}
