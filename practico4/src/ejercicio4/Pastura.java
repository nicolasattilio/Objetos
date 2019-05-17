package ejercicio4;

public class Pastura extends Cereal {
	private int tamanio=50;
	public Pastura(String s) {
		super(s);
	}
	public boolean acepta(Lote l) {
		return (l.getTamanio()>this.tamanio && super.acepta(l));
	}
}
