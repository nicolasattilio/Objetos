package ejercicio3;

import java.util.Hashtable;

public class Pedido {
	private Hashtable<String,Object> propiedades=new Hashtable<String,Object>();
	
	public Pedido(Mueble m,String fechaPedido,String fechaMax,String lugarEntrega) {
		this.propiedades.put("Mueble", m);
		this.propiedades.put("Fecha Pedido",fechaPedido);
		this.propiedades.put("Fecha Maxima", fechaMax);
		this.propiedades.put("Lugar Entrega", lugarEntrega);
	}

	public Hashtable<String, Object> getPropiedades() {
		return propiedades;
	}
	
	
}
