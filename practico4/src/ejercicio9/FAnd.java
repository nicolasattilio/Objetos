package ejercicio9;

public class FAnd extends FCompuesto {
	
	public FAnd(Filtro f1, Filtro f2) {
		super(f1, f2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple(Noticia n) {
		return f1.cumple(n)&&f2.cumple(n);
	}

}
