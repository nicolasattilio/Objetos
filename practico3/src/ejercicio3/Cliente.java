package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private List<CajaAhorro> cuentas= new ArrayList<>();
	public Cliente(String n,int i) {
		this.nombre=n;
	}
	
	public void addCuenta(CajaAhorro a1) {
		cuentas.add(a1);
	}
	public void depositar(CajaAhorro a1,double saldo) {
		a1.depositar(saldo);
	}
	public void extraer(CajaAhorro a1,double saldo) {
		a1.extraer(saldo);
	}
	public double checkSaldo(CajaAhorro a1) {
		return a1.checkSaldo();
	}

	public List<CajaAhorro> getCuentas() {
		List<CajaAhorro> cuentasCliente = new ArrayList<>();
		for (CajaAhorro ca:this.cuentas)
				cuentasCliente.add(ca);
		return cuentasCliente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
