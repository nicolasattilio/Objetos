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
	
	public void devolverPunto() {
		System.out.println(this.getCoorX()+","+this.getCoorY());
	}
	
	public double distanciaEuclidia(Punto p2) {
		double dx=((this.getCoorX()-p2.getCoorX())*(this.getCoorX()-p2.getCoorX()));
		double dy=((this.getCoorY()-p2.getCoorY())*(this.getCoorY()-p2.getCoorY()));
		double dtotal=dx+dy;
		return (dtotal*dtotal);
		
	}
	
	public void desplazarPunto(double x,double y) {
		this.coorX=x;
		this.coorY=y;
	}

	public static void main(String[] args) {
		Punto p1=new Punto(2,3);
		p1.desplazarPunto(3,4);
		p1.devolverPunto();
		Punto p2=new Punto(5,3);
		System.out.println(p1.distanciaEuclidia(p2));
		
	}

}
