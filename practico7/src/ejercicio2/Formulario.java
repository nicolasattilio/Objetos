package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
	private double porcentaje;
	public List<Pregunta>preguntas=new ArrayList<>();
	public boolean cumple(RespuestaFormulario f) {
		return ((f.cantRespuestas()*100)/preguntas.size()>porcentaje);
	}
}
