package ejercicio9;

public class FCategoria implements Filtro{
	private String categoria;
	
	public FCategoria(String categoria) {
		this.categoria=categoria;
	}
	@Override
	public boolean cumple(Noticia n) {
		return this.categoria.equals(n.getClasificacion());
	}

}
