package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Persona> contactos=new ArrayList<>();
	private List<Reunion> reuniones=new ArrayList<>();
	
	public void addContacto(Persona p) {
		this.contactos.add(p);
	}
	public void addReunion(Reunion r) {
		this.reuniones.add(r);
	}
	
	public List<Persona> mostrar() {
		return new ArrayList<Persona>();
	}
	
	public List<Reunion> mostrarReuniones(){
		return new ArrayList<Reunion>();
	}
}
