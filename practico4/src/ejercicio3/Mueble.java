package ejercicio3;

public class Mueble {
	private String nombre;
	private float costo;
	private String material;
	
	public Mueble(String n,float c,String m) {
		this.nombre=n;
		this.costo=c;
		this.material=m;
	}

	public String getNombre() {
		return nombre;
	}

	public float getCosto() {
		return costo;
	}

	public String getMaterial() {
		return material;
	}
	

}
