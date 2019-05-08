package ejercicio3;

public class CompuestoOR extends FiltroCompuesto {
	@Override
	public boolean cumple(Pedido p, Object o) {
		if(getF1().cumple(p,o) || getF2().cumple(p,o))
			return true;
		return false;
	}

}
