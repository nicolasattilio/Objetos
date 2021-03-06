package ejercicio1;


public class Persona {
	private String nombre="N";
	private String apellido="N";
	private int edad;
	private String fechaNacimiento= "01-01-2016";
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Persona(int d, String nombre, String apellido, String fecha) {
		this.dni=d;
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fecha;
	}
	
	public double masaCorporal() {
		return this.peso/(this.altura*this.altura);
	}
	
	public boolean estaEnForma() {
		if ((18.5 < this.masaCorporal()) && (25>this.masaCorporal()))
			return true;
		return false;
	}
	
	public boolean cumpleaños() {
	//preguntar en clase
		return true;
	}
	
	public boolean puedeVotar() {
		if (this.edad>16)
			return true;
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getDni() {
		return dni;
	}
	public char getSexo() {
		return sexo;
	}
	public int getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	
	public boolean mayorEdad() {
		if (this.edad>18)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona n1 = new Persona(36882126, "Nicolas","Apellido");
		System.out.println(n1.getNombre());

	}

}
