package ejercicio4;

public class Producto {
	Impuesto imp;
	private double descuento;
	private double precio;
	private String nombre;

	public Producto(double precio, String nombre, double descuento) {
		this.precio = precio;
		this.nombre = nombre;
		this.descuento = descuento;

	}

	public double getPrecio() {
		return this.precio;
	}

	public double getDescuento() {
		return this.descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPrecio() {
		double suma = 0;
		if (imp != null)
			suma = imp.getImp();
		this.precio = getPrecio() * getDescuento() + suma;
	}

}
