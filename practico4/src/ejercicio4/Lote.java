package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Lote {
	private int tamanio;
	private List <String> contenido =new ArrayList<>();	
	public Lote(int tam) {
		this.tamanio=tam;
	}
	public void add(String s) {
		this.contenido.add(s);
	}
	
	public boolean contiene(String s) {
		return (contenido.contains(s));
	}
	public boolean puede(Cereal c) {
		return (c.acepta(this));
	}
	public int getTamanio() {
		return tamanio;
	}
	public List<String> getContenido() {
		return new ArrayList<String>(this.contenido);
	}


	
}
