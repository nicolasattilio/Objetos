package ejercicio3;

public class FiltroSimple implements Filtro {
	private String nombreAtributo;

	public FiltroSimple(String nA) {
		this.nombreAtributo=nA;
	}
	@Override
	public boolean cumple(Pedido p,Object valorQuerido) {
		Object o=p.getPropiedades().get(this.nombreAtributo);
		return (o.equals(valorQuerido));
	}

}
