package ejercicio2;

public class Triangulo extends Poligono {
	private double h;
	
	public Triangulo(Lado l1,Lado l2,Lado l3,double h) {
		super.addLados(l1);
		super.addLados(l2);
		super.addLados(l3);
		this.h=h;
	}
	@Override
	public double getArea() {
		return ((super.getLado(1).getLong()*h)/2);
	}
}
