package ejercicio4;

public class ImpuestoFijo implements Impuesto {
	private double pt;

	@Override
	public double getImp() {
		return this.pt;
	}

}
