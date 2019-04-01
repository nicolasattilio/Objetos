package ejercicio3;

public class Punto {
	private double coorX=0;
	private double coorY=0;
	
	public Punto() {
	}
	
	public Punto(double x,double y) {
		this.desplazarPunto(x, y);
	}
	
	public double getCoorX() {
		return coorX;
	}

	public double getCoorY() {
		return coorY;
	}
	
	public void setCoorX(double coorX) {
		this.coorX = coorX;
	}

	public void setCoorY(double coorY) {
		this.coorY = coorY;
	}

	public void devolverPunto() {
		System.out.println(this.getCoorX()+","+this.getCoorY());
	}
	
	public double distanciaEuclidia(Punto p2) {
		return Math.sqrt((Math.pow((this.getCoorX()-p2.getCoorX()),2))+(Math.pow((this.getCoorY()-p2.getCoorY()),2)));	
	}
	
	public void desplazarPunto(double x,double y) {
		this.setCoorX(x);
		this.setCoorY(y);
	}

	public static void main(String[] args) {
		Punto p1=new Punto(2,1);
		Punto p2=new Punto(5,1);
		Punto p3=new Punto(5,3);
		Punto p4=new Punto(2,3);
		System.out.println(p1.distanciaEuclidia(p2));
		Rectangulo r1=new Rectangulo(p1, p2, p3, p4);
		System.out.println(r1.esCuadrado());
	}

}