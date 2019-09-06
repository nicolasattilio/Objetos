package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class FCuerpo implements Filtro {
	private List<String>cuerpo=new ArrayList<>();
	
	public FCuerpo(List<String> palabras) {
		this.cuerpo=palabras;
	}
	@Override
	public boolean cumple(Noticia n) {
		return n.contieneTexto(cuerpo);
	}

}
