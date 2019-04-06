package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Reunion {
	private List<Persona> personas=new ArrayList<>();
	private String lugar;
	private int duracion;
	private String temaReunion;
	
	public void addPersona(Persona p) {
		this.personas.add(p);
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getTemaReunion() {
		return temaReunion;
	}
	public void setTemaReunion(String temaReunion) {
		this.temaReunion = temaReunion;
	}
	public List<Persona> mostrarIntegrantes() {
		return new ArrayList<Persona>();
	}
	
}
