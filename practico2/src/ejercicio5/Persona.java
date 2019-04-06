package ejercicio5;

import java.util.Calendar;

public class Persona {
	private char jerarquia;
	private String nombre;
	private String email;
	private int telefono;
	private String apellido;
	private Calendar fechaNacimiento;
	private String direccion;
	public Persona(char j,String n,String e,int t) {
		this.jerarquia=j;
		this.email=e;
		this.nombre=n;
		this.telefono=t;
	}
	public Persona(String n,String a,Calendar fN,int num,String d,String e) {
		this.nombre=n;
		this.apellido=a;
		this.fechaNacimiento=fN;
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
	public char getJerarquia() {
		return jerarquia;
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
		return ("Nombre: "+this.getNombre()+" Jerarquia: "+this.getJerarquia()+" Email: "+this.getEmail()+" Telefono: "+this.getTelefono());
	}
}
