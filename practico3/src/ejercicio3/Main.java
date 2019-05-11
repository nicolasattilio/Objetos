package ejercicio3;

public class Main {

	public static void main(String[] args) {
	Cliente c1 = new Cliente("nicolas",01);
	CajaAhorro ca = new CajaAhorro(c1,01);
	Banco b1= new Banco();
	b1.addCliente(c1);
	b1.addCuenta(ca);
	System.out.print(b1.checkSaldo(c1));

	}

}
