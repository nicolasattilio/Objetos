package ejercicio3;

public class Rectangulo {
	private Punto p1=new Punto();
	private Punto p2=new Punto();
	private Punto p3=new Punto();
	private Punto p4=new Punto();
	
	public Rectangulo(Punto p1,Punto p2,Punto p3,Punto p4) {
		this.setP1(p1);
		this.setP2(p2);
		this.setP3(p3);
		this.setP4(p4);
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Punto getP3() {
		return p3;
	}

	public void setP3(Punto p3) {
		this.p3 = p3;
	}

	public Punto getP4() {
		return p4;
	}

	public void setP4(Punto p4) {
		this.p4 = p4;
	}
	
	public void transladar(Punto p1,Punto p2,Punto p3,Punto p4) {
		this.setP1(p1);
		this.setP2(p2);
		this.setP3(p3);
		this.setP4(p4);
	}
	
	public double getArea() {
		return (p1.distanciaEuclidia(p2)*p2.distanciaEuclidia(p3));
	}
	
	public int esMayor(Rectangulo r1) {
		if (this.getArea()>r1.getArea())
			return 1;
		else if (this.getArea()==r1.getArea())
			return 0;
		return -1;
	}
	
	public void invertir() {
		//Preguntar en clase
	}
	public boolean esCuadrado() {
		if ((p1.getCoorX()==p2.getCoorX())&&(p1.getCoorY()==p3.getCoorY()))
			return true;
		return false;			
	}
	
	
}