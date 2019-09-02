package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Contingente {
	private List<Integrante> seleccion=new ArrayList<>();
	public void addIntegrante(Integrante i) {
		this.seleccion.add(i);
	}
}
