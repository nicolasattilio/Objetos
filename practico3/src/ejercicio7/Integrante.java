package ejercicio7;


public class Integrante {
	private String nombre;
	private String apellido;
	private int nroPasaporte;
	private String fechaNacimiento;
	private boolean disponible;
	private boolean viajando;
	
	public Integrante(String nombre, String apellido, int nP, String fN, boolean disponible,boolean viajando) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.nroPasaporte=nP;
		this.fechaNacimiento=fN;
		this.disponible=disponible;
		this.viajando=viajando;
	}
	

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getNroPasaporte() {
		return nroPasaporte;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	public boolean isDisponible() { 
		return (this.disponible && this.viajando);
	}
	
	
}
