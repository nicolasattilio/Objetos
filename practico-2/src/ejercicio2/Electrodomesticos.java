package ejercicio2;

public class Electrodomesticos {
	private String nombre;
	private double precioBase=100;
	private String color="Gris Plata";
	private double consumoEnergetico=10;
	private double peso=2;
	
	public Electrodomesticos(String nombre) {
		this.nombre=nombre;
	}
	
	public Electrodomesticos(String nombre,double precioBase) {
		this.nombre=nombre;
		this.precioBase=precioBase;
	}
	
	public Electrodomesticos(String nombre,double precioBase,String color) {
		this.nombre=nombre;
		this.precioBase=precioBase;
		this.color=color;
	}
	
	public Electrodomesticos(String nombre,double precioBase,String color,double consumoEnergetico) {
		this.nombre=nombre;
		this.precioBase=precioBase;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
	}
	
	public Electrodomesticos(String nombre,double precioBase,String color,double consumoEnergetico,double peso) {
		this.nombre=nombre;
		this.precioBase=precioBase;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.peso=peso;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(double consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public double getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public boolean esBajoConsumo() {
		if(this.getConsumoEnergetico()<45)
			return true;
		return false;
	}
	
	public double balance() {
		return (this.getPrecioBase()/this.getPeso());
	}
	
	public boolean esAltaGama() {
		if(this.balance()>3)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
