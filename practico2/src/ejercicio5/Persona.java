package ejercicio5;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private String email;
	private int telefono;
	private String apellido;
	private Calendar fechaNacimiento=Calendar.getInstance();
	private String direccion;
	
	public Persona(String n,String a,int y,int m,int da,int num,String d,String e) {
		this.nombre=n;
		this.apellido=a;
		this.fechaNacimiento.set(y,m,da);;
		this.telefono=num;
		this.direccion=d;
		this.email=e;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public String getApellido() {
		return apellido;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public int getTelefono() {
		return telefono;
	}
	public String mostrarPersona() {
		return ("Nombre: "+this.getNombre()+" Email: "+this.getEmail()+" Telefono: "+this.getTelefono());
	}
}
