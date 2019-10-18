package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class RespuestaFormulario {
	private Formulario r;
	private List<Respuesta>respuestas=new ArrayList<>();
	public boolean esValido() {
		return r.cumple(this);
	}
	public int cantRespuestas() {
		return respuestas.size();
	}
	public int cantRespuestasCorrectas() {
		int suma=0;
		for(int i=0;i<respuestas.size();i++) {
			Respuesta r=respuestas.get(i);
			if(r.isCorrecta())
				suma++;
		}	
		return suma;
	}
}
