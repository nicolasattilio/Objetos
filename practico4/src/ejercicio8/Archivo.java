package ejercicio8;

public class Archivo extends Dato {
	private String fechaModificacion;
	public Archivo(String nombre,String fechaCreacion,String fechaModificacion,int tamanio) {
		this.nombre=nombre;
		this.fechaCreacion=fechaCreacion;
		this.tamanio=tamanio;
		this.fechaModificacion=fechaModificacion;
	}
	public String getFechaModificacion() {
		return fechaModificacion;
	}
	


}
