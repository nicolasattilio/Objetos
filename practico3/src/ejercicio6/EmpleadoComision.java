package ejercicio6;

public class EmpleadoComision extends EmpleadoContratado {
	private static double sueldo;
	private double montoxVenta;
	private double porcentajeComision;
	
	public EmpleadoComision(double mv,double pc) {
		super(sueldo);
		this.montoxVenta=mv;
		this.porcentajeComision=pc;
	}

	public double getMontoxVenta() {
		return montoxVenta;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}
	
	public double getSueldo() {
		return getMontoxVenta()*getPorcentajeComision();
	}
}
