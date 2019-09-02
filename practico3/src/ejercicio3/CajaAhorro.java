package ejercicio3;

public class CajaAhorro {
	private int nroCaja;
	private double saldo=0;
	private double saldoDescubierto;

	public CajaAhorro(int nroCaja,double saldodes) {
		this.saldoDescubierto=saldodes;
		this.nroCaja=nroCaja;
	}
	public int getNroCaja() {
		return nroCaja;
	}
	
	public void extraer(double saldo) {
		this.saldo-=saldo;
	}
	public double checkSaldo() {
		return saldo;
	}
	
	public void depositar(double saldo) {
		this.saldo+=saldo;
	}

	public double getSaldoDescubierto() {
		return saldoDescubierto;
	}
	
}
