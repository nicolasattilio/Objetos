package ejercicio4;

public class ImpuestoCondicion implements Impuesto {
	private double constante;
	private Condicion c;

	public ImpuestoCondicion(double valor) {
		this.constante = valor;
	}

	@Override
	public double getImp() {
		if (c.cumple())
			return constante;
		return 0;
	}

}
