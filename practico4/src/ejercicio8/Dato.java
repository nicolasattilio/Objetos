package ejercicio8;

public class Dato extends SistemaArchivos {
	protected int tamanio;
	public Dato() {
		super();
	}
	@Override
	public int getTamanio() {
		return this.tamanio;
	}
	@Override
	public int getCantElementos() {
		return 1;
	}


}
