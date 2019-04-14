package ejercicio6;

public class EmpleadoHs extends EmpleadoContratado {
	private static double sueldo;
	private double hsTrabajadas;
	private double montoxHora;
	
	
	public EmpleadoHs(double hs,double mh) {
		super(sueldo);
		this.hsTrabajadas=hs;
		this.montoxHora=mh;
	}
	
	public double getHsTrabajadas() {
		return hsTrabajadas;
	}

	public double getMontoxHora() {
		return montoxHora;
	}

	public double getSueldo() {
		return super.getSueldo()+getHsTrabajadas()*getMontoxHora();
	}
}
