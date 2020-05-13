package ejercicio2;

public class Main {

	public static void main(String[] args) {
	Puerto p1=new Puerto();
	Camion c1=new Camion("c1",2000,20191019);
	Camion c2=new Camion("c2",3000,20191018);
	Camion c3=new Camion("c3",5000,20191017);
	p1.addCamion(c1);
	p1.addCamion(c2);
	p1.addCamion(c3);
	Barco b1=new Barco("b1",10000);
	Barco b2=new Barco("b2",3000);
	p1.addBarco(b1);
	p1.addBarco(b2);
	System.out.println(p1.getBarcos().toString());
	System.out.println(p1.getCamiones().toString());
	p1.cargar();
	System.out.println(b1.getCapacidad());
	System.out.println(b2.getCapacidad());
	}

}
