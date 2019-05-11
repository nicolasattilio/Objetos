package ejercicio3;

public class CajaAhorro {
	private int id;
	Cliente c1;
	private double saldo=0;
	public CajaAhorro(Cliente c1,int i) {
		this.id=i;
		this.c1=c1;
	}
	public int getId() {
		return id;
	}
	public Cliente getC1() {
		return c1;
	}
	public void setSaldo(double saldo) {
		this.saldo+=saldo;
	}
	public void eraseSaldo(double saldo) {
		this.saldo-=saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
	


}
