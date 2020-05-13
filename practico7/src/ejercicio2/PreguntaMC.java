package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class PreguntaMC extends Pregunta{
	//private List<String>opciones=new ArrayList<>();
	private List<String>respuestasValidas=new ArrayList<>();
	
	@Override
	public boolean esValido(Object o1) {
		return respuestasValidas.contains(o1);
	}
	
}
