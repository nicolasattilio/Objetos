package ejercicio1;

public class Computadora implements Comparable<Object> {
	private boolean disponible=true;
	private float velocidad;
	public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}
	public float getVelocidad() {
		return this.velocidad;
	}
	public boolean isDisponible() {
		return this.disponible;
	}
	
	@Override
	public int compareTo(Object o) {
		Computadora c=(Computadora)o;
		if(this.velocidad==c.getVelocidad())
			return 0;
		if(this.velocidad>c.getVelocidad())
			return 1;
		else
			return -1;
	}
	
}
