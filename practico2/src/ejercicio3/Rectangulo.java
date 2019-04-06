package ejercicio3;

public class Rectangulo {
	private Punto p1=new Punto();
	private Punto p2=new Punto();
	private Punto p3=new Punto();
	private Punto p4=new Punto();
	
	public Rectangulo(Punto p1,Punto p2) {
		this.setP1(p1);
		this.setP2(p2);
		this.setP3(new Punto(p1.getCoorX(),p2.getCoorY()));
		this.setP4(new Punto(p2.getCoorY(),p1.getCoorX()));
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
	
	public void transladar(Punto p) {
		double dx = p.getCoorX() - this.getP1().getCoorX();
	    double dy = p.getCoorY() - this.getP1().getCoorY();
		this.setP1(p);
		this.setP2(new Punto((dx+this.getP2().getCoorX()),(dy+this.getP2().getCoorY())));
		this.setP3(new Punto((dx+this.getP3().getCoorX()),(dy+this.getP3().getCoorY())));
		this.setP4(new Punto((dx+this.getP4().getCoorX()),(dy+this.getP4().getCoorY())));
	}
	
	public double getArea() {
		return (p1.distanciaEuclidia(p3)*p1.distanciaEuclidia(p4));
	}
	
	public void invertir(double x,double y) {
		Punto p=new Punto(x,y);
		if (p==this.getP1()) {
			this.setP2(p);
			this.setP3(new Punto((p.distanciaEuclidia(p3)-this.getP3().getCoorY()),(p.distanciaEuclidia(p3)-this.getP3().getCoorX())));
			this.setP4(new Punto((p.distanciaEuclidia(p4)-this.getP4().getCoorY()),(p.distanciaEuclidia(p4)-this.getP4().getCoorX())));
			this.setP1(new Punto(this.getP3().getCoorX(),this.getP4().getCoorY()));
		}
		else if (p==this.getP2()) {
			this.setP1(p);
			this.setP3(new Punto((p.distanciaEuclidia(p3)+this.getP3().getCoorY()),(p.distanciaEuclidia(p3)+this.getP3().getCoorX())));
			this.setP4(new Punto((p.distanciaEuclidia(p4)+this.getP4().getCoorY()),(p.distanciaEuclidia(p4)+this.getP4().getCoorX())));
			this.setP2(new Punto(this.getP3().getCoorX(),this.getP4().getCoorY()));
		}
		else if (p==this.getP3()) {
			this.setP4(p);
			this.setP2(new Punto((p.distanciaEuclidia(p2)+this.getP2().getCoorY()),(p.distanciaEuclidia(p2)-this.getP2().getCoorX())));
			this.setP1(new Punto((p.distanciaEuclidia(p1)+this.getP1().getCoorY()),(p.distanciaEuclidia(p1)-this.getP1().getCoorX())));
			this.setP3(new Punto(this.getP1().getCoorX(),this.getP2().getCoorY()));
		}
		else if (p==this.getP4()) {
			this.setP3(p);
			this.setP2(new Punto((p.distanciaEuclidia(p2)-this.getP2().getCoorY()),(p.distanciaEuclidia(p2)+this.getP2().getCoorX())));
			this.setP1(new Punto((p.distanciaEuclidia(p1)-this.getP1().getCoorY()),(p.distanciaEuclidia(p1)+this.getP1().getCoorX())));
			this.setP4(new Punto(this.getP1().getCoorX(),this.getP2().getCoorY()));
			
		}
	}
	
	public int esMayor(Rectangulo r1) {
		if (this.getArea()>r1.getArea())
			return 1;
		else if (this.getArea()==r1.getArea())
			return 0;
		return -1;
	}
	
	public boolean esCuadrado() {
		if ((p1.distanciaEuclidia(p3)==p1.distanciaEuclidia(p4)))
			return true;
		return false;			
	}
	public double largoSuperior() {
		return this.getP3().distanciaEuclidia(this.getP4());
	}
	
	public void posicion() {
		if (this.largoSuperior()>(this.getP1().distanciaEuclidia(this.getP4())))
			System.out.println("Esta acostado");
		else 
			System.out.println("Esta parado");
	}
	public String devolverRectangulo(){
		return ("P1: ("+this.getP1().getCoorX()+","+this.getP1().getCoorY()+"), P2: ("+this.getP2().getCoorX()+","+this.getP2().getCoorY()+"), P3: ("+this.getP3().getCoorX()+","+this.getP3().getCoorY()+"), P4: ("+this.getP4().getCoorX()+","+this.getP4().getCoorY())+")";
	}
	
	
}
