package ejercicio4;

import java.util.Hashtable;

public class ListaProducto {
	Criterio c;
	private Hashtable<String, Integer> productos = new Hashtable<String, Integer>();

	public void add(String nombre, int cantidad) {
		if (!productos.containsKey(nombre)) {
			productos.put(nombre, cantidad);
		} else {
			int cantidadInicial = productos.get(nombre);
			productos.put(nombre, cantidad + cantidadInicial);
		}
	}

	public Integer getCantidad(String nombre) {
		return productos.get(nombre);
	}

	public boolean escasea(String nombre) {
		return (c.acepta(this.getCantidad(nombre)));

	}
}
