package ejercicio3;

public class Main {

	public static void main(String[] args) {
	Cliente c1 = new Cliente("nicolas",01);
	CajaAhorro ca = new CajaAhorro(1,0);
	Banco b1= new Banco();
	b1.addCliente(c1);
	c1.addCuenta(ca);
	c1.depositar(ca, 30);
	System.out.println(c1.checkSaldo(ca));

	}

}
