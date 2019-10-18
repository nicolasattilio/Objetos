package ejercicio2;

public class Respuesta {
	private Object r;
	private Pregunta p;
	public boolean isCorrecta() {
		return p.esValido(r);
	}
}
