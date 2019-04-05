package ejercicio4;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;
	
	public AlarmaLuminosa(Timbre t, Luz l) {
		super(t);
		this.luz=l;
	}
	@Override
	public boolean comprobar() {
		if (super.comprobar())
			return true;
		return false;
	}
}
