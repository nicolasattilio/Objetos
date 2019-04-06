package ejercicio4;

public class Alarma {
	private boolean vidrio;
	private boolean puertaVentana;
	private boolean movimiento;
	private Timbre timbre;
	
	public Alarma(Timbre timbre) {
		this.timbre=timbre;
		this.vidrio=false;
		this.puertaVentana=false;
		this.movimiento=false;
	}
	
	public boolean isVidrio() {
		return vidrio;
	}

	public void setVidrio(boolean vidrio) {
		this.vidrio = vidrio;
	}

	public boolean isPuertaVentana() {
		return puertaVentana;
	}

	public void setPuertaVentana(boolean puertaVentana) {
		this.puertaVentana = puertaVentana;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}

	public Timbre getTimbre() {
		return timbre;
	}

	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

	public boolean comprobar() {
		if(this.vidrio || this.puertaVentana || this.movimiento)
			return true;
		return false;
	}
}
