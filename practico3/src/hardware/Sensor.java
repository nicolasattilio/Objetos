package hardware;

public class Sensor {
	
	private boolean disparo;
	private String nombre;
	
	public Sensor(String nombre) {
		this.disparo = false;
		this.nombre = nombre;
	}
	
	public boolean isDisparado() {
		return this.disparo;
	}
	
	public void setDisparado(boolean disp) {
		this.disparo = disp;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Sensor: " + this.nombre;
	}
}
