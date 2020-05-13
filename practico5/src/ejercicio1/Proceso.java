package ejercicio1;

public class Proceso implements Comparable<Object> {
	private float memoriaUtilizada;
	private boolean ejecutado;
	
	public boolean isEjecutado() {
		return ejecutado;
	}
	public void execute(Computadora c) {
		c.setDisponible(false);
		this.ejecutado=true;
	}
	public float getMemoria() {
		return this.memoriaUtilizada;
	}
	
	@Override
	public int compareTo(Object o) {
		Proceso c=(Proceso)o;
		if(c.getMemoria()==this.memoriaUtilizada)
			return 0;
		if(c.getMemoria()>this.memoriaUtilizada)
			return 1;
		else
			return -1;
	}
}
