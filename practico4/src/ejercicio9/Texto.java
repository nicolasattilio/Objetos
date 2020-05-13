package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Texto extends Cuerpo{
	private List<String>palabras=new ArrayList<>();
	public Texto(List<String> palabras) {
		this.palabras=palabras;
	}
	public List<String> getTexto(){
		return new ArrayList<String>(this.palabras);
	}
	@Override
	public boolean contieneTexto(List<String> s) {
		for(String texto:this.palabras)
			if (!s.contains(texto))
				return false;
		return true;
	}
}
