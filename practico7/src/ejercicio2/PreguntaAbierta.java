package ejercicio2;

public class PreguntaAbierta extends Pregunta{
	private Object o1; //respuesta esperada

	@Override
	public boolean esValido(Object r) {
		return o1.equals(r);
	}
}
