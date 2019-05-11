package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes= new ArrayList<>();
	private List<CajaAhorro> cuentas= new ArrayList<>();
	
	public void addCuenta(CajaAhorro a1) {
		cuentas.add(a1);
	}
	public void depositar(Cliente c1,double saldo) {
		for (CajaAhorro ca:this.cuentas) {
			if (ca.getC1().getId()==c1.getId())
				ca.setSaldo(saldo);
		}
	}
	public void extraer(Cliente c1,double saldo) {
		for (CajaAhorro ca:this.cuentas) {
			if (ca.getC1().getId()==c1.getId())
				ca.eraseSaldo(saldo);
		}
	}
	public double checkSaldo(Cliente c1) {
		for (CajaAhorro ca:this.cuentas) {
			if (ca.getC1().getId()==c1.getId())
				return ca.getSaldo();
		}
		return 0;
	}
	
	public List<CajaAhorro> getCuentas(Cliente c1) {
		List<CajaAhorro> cuentasCliente = new ArrayList<>();
		for (CajaAhorro ca:this.cuentas)
			if (ca.getC1().getId()==c1.getId())
				cuentasCliente.add(ca);
		return cuentasCliente;
	}
	
	
	
	public void addCliente(Cliente c1) {
		clientes.add(c1);
		
	}
	

}
