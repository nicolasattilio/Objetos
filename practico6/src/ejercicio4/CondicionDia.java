package ejercicio4;

public class CondicionDia implements Condicion {
	private int dia;

	public CondicionDia(int dia) {
		this.dia = dia;
	}

	@Override
	public boolean cumple() {
		int rand = (int) Math.random() * 7 + 1;
		if (rand == this.dia)
			return true;
		return false;
	}

}
