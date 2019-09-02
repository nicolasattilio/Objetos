package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
	private List<TrabajoCongreso>trabajoDisponibles=new ArrayList<>();
	private String nombre;
	private List<String> temas=new ArrayList<>();
	
	public Evaluador(String n) {
		this.nombre=n;
	}
	public String getNombre() {
		return this.nombre;
	}
	public List<String> getTemas() {
		return new ArrayList<String>(this.temas);
	}
	
	public boolean contiene(String s) {
		return temas.contains(s);
	}
	
	public boolean esApto(TrabajoCongreso t) {
		return t.apto(this);
	}
	public void add(TrabajoCongreso t) {
		this.trabajoDisponibles.add(t);
	}
	public void addTema(String s) {
		this.temas.add(s);
	}
	
	public boolean esExperto(List<String> temasExperto) {
		for (String temasEspecificos:this.temas)
		if(!temasExperto.contains(temasEspecificos))
			return false;
		return true;
	}
}
