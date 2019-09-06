package ejercicio9;

import java.util.List;

public class Noticia {
	private String titulo;
	private String clasificacion;
	public String getTitulo() {
		return titulo;
	}

	public String getClasificacion() {
		return clasificacion;
	}
	Cuerpo cuerpo;
	public Noticia(String titulo,String clasificacion) {
		this.titulo=titulo;
		this.clasificacion=clasificacion;
	}
	
	public boolean contTitulo(Filtro f1) {
		return f1.cumple(this);
	}
	public boolean contCategoria(Filtro f1) {
		return f1.cumple(this);
	}
	public boolean contieneTexto(List<String> s) {
		return cuerpo.contieneTexto(s);
	}
	
	public boolean contCuerpo(Filtro f1) {
		return f1.cumple(this);
	}
}
