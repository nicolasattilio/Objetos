package ejercicio1;

public class Persona {
	private String nombre="N";
	private String apellido="N";
	private int edad;
	private String fecha_nacimiento= "1 Enero de 2000";
	private int dni;
	private char sexo='F';
	private int peso=1;
	private double altura=1;
	
	public Persona(int d) {
		this.dni=d;
	}
	public Persona(int d, String nombre, String apellido) {
		this.dni=d;
		this.nombre=nombre;
		this.apellido=apellido;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona n1 = new Persona(36882126);

	}

}
