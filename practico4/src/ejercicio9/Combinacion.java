package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Combinacion extends Cuerpo {
	private List<Cuerpo> hoja=new ArrayList<>();
	public Combinacion(List<Cuerpo> cuerpo) {
		this.hoja=cuerpo;
	}
	public void add(Texto texto) {
		this.hoja.add(texto);
	}
	public List<Cuerpo> getHoja() {
		return new ArrayList<Cuerpo>(this.hoja);
	}
	@Override
	public boolean contieneTexto(List<String> s) {
		for (Cuerpo c:this.hoja) {
			if (c.contieneTexto(s))
				return true;
		}
		return false;
	}
}

