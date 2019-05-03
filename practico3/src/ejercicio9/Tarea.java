package ejercicio9;

public class Tarea {
	private int prioridad=0;
	private double memoria=0;
	private double cpu=0;
	
	public Tarea(int p,double m,double c) {
		this.prioridad=p;
		this.memoria=m;
		this.cpu=c;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public double getMemoria() {
		return memoria;
	}
	public double getCpu() {
		return cpu;
	}
	
}
