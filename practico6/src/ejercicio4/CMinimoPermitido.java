package ejercicio4;

public class CMinimoPermitido implements Criterio {
	private Integer cantidadMinima;
	private double porcentaje;

	public CMinimoPermitido(Integer cantMinima, double porcentaje) {
		this.cantidadMinima = cantMinima;
		this.porcentaje = porcentaje;
	}

	@Override
	public boolean acepta(Integer cantidad) {
		return (cantidad  < this.cantidadMinima * this.porcentaje);
	}

}
