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
	
	public List<Persona> mostrarContacto() {
		List lista =new ArrayList<Persona>(); //consultar parametrizacion
		for (Persona p:this.contactos) {
			lista.add(p.getNombre());
			lista.add(p.getApellido());
			lista.add(2019-p.getFechaNacimiento().get(1));
			lista.add(p.getTelefono());
		}
		return lista;
	}
	
	public double promedioEdadContacto() {
		double edadPromedio=0;
		for (Persona p:this.contactos) {
			edadPromedio+=(2019-p.getFechaNacimiento().get(1));
		}
		return (edadPromedio/this.contactos.size());
			
	}
	
	public List<Reunion> mostrarReuniones(){
		List lista=new ArrayList<Reunion>();
		for (Reunion r:this.reuniones) {
			lista.add(r.getLugar());
			lista.add(r.getDuracion());
			lista.add(r.getTemaReunion());
		}
		return lista;
	}
}
