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
	
	public List<String> mostrarContacto() {
		List<String>lista =new ArrayList<>(); 
		for (Persona p:this.contactos) {
			lista.add(p.getNombre());
			lista.add(p.getApellido());
			lista.add(2019-p.getFechaNacimiento().get(1), "Fecha");
			lista.add(p.getTelefono(), "Telefono");
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
	
	public List<String> mostrarReuniones(){
		List<String> lista=new ArrayList<>();
		for (Reunion r:this.reuniones) {
			lista.add(r.getLugar());
			lista.add(r.getDuracion(), "Duracion");
			lista.add(r.getTemaReunion());
		}
		return lista;
	}
}
