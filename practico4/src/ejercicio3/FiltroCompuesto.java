package ejercicio3;

public abstract class FiltroCompuesto implements Filtro {
	private Filtro f1;
	private Filtro f2;
	public Filtro getF1() {
		return f1;
	}
	public Filtro getF2() {
		return f2;
	}
}
