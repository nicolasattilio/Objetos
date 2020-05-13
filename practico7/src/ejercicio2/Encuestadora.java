package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Encuestadora extends Formulario {
	private List<RespuestaFormulario>respuestas=new ArrayList<>();
	public int cantRespondieronBienMas(int n) {
		int suma=0;
		for(int i=0;i<respuestas.size();i++) {
			RespuestaFormulario rf1=respuestas.get(i);
			if (rf1.esValido()&& rf1.cantRespuestas()>n)
				suma++;
		}
		return suma;
	}

}


