package ejercicio9;

public class Cliente {
	private String nombre;
	Filtro f1;
	public Cliente(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public boolean acepta(Noticia n) {
		return f1.cumple(n);
			
	}
}
