package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public abstract class SistemaArchivos {
	private List<SistemaArchivos>carpetas=new ArrayList<>();
	protected String nombre;
	protected String fechaCreacion;
	public abstract int getTamanio();
	public abstract int getCantElementos();
	public void add(SistemaArchivos d) {
		this.carpetas.add(d);
	}
	public String getNombre() {
		return this.nombre;
	}
	public String fechaCreacion() {
		return this.fechaCreacion;
	}
}
