package ejercicio4;

public class CondicionAnio implements Condicion {
	private int paridad;

	public CondicionAnio(int paridad) {
		this.paridad = paridad;
	}

	@Override
	public boolean cumple() {
		int rand = (int) Math.random();
		if (this.paridad == rand)
			return true;
		return false;
	}

}
