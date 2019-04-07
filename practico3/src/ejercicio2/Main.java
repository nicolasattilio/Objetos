package ejercicio2;

public class Main {

	public static void main(String[] args) {
	Punto p1=new Punto(1,1);
	Punto p2=new Punto(3,1);
	Punto p3=new Punto(2,3);
	Lado l1=new Lado(p1, p2);
	Lado l2=new Lado(p1, p3);
	Lado l3=new Lado(p2,p3);
	Triangulo t1=new Triangulo(l1, l2, l3, 2);
	System.out.print(t1.getPerimetro());
	

	}

}
