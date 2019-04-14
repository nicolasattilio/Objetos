package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Reunion {
	private List<Persona> personas=new ArrayList<>();
	private String lugar;
	private int duracion;
	private String temaReunion;
	
	public Reunion(String l,int d,String tR) {
		this.lugar=l;
		this.duracion=d;
		this.temaReunion=tR;
	}
	
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
	public List<String> mostrarIntegrantes() {
		List<String>lista =new ArrayList<>();
		for (Persona p:this.personas) {
			lista.add(p.getNombre());
		}
		return lista;
	}
	
}
