package ejercicio9;

public class FTitulo implements Filtro {
	private String titulo;
	
	public FTitulo(String titulo) {
		this.titulo=titulo;
	}
	@Override
	public boolean cumple(Noticia n) {
		return this.titulo.equals(n.getTitulo());
	}

}
