package ejercicio4;

public class ImpuestoSuma implements Impuesto {
	Impuesto i1;
	Impuesto i2;

	public double getImp() {
		return i1.getImp() + i2.getImp();
	}
}
