package ejercicio3;

public class Main {
	public static void main(String[] args) {
		Punto p1=new Punto(1,1);
		Punto p2=new Punto(3,3);
		Rectangulo r1=new Rectangulo(p1, p2);
		System.out.println(r1.devolverRectangulo());
		System.out.println(r1.esCuadrado());
		System.out.println(r1.getArea());
		r1.invertir(1,1);
		System.out.println(r1.devolverRectangulo());
		
	}

}
