package ejercicio2;

public class Camion implements Comparable<Object>{
	private int capacidad;
	private int fecha;
	private String name;
	
	public Camion(String n,int capacidad,int fecha) {
		this.capacidad=capacidad;
		this.fecha=fecha;
		this.name=n;
	}
	
	public String toString(){
		return this.name;
	}
	public int getCapacidad() {
		return capacidad;
	}

	public int getFecha() {
		return fecha;
	}
	
	public void descargar(Barco b) {
		b.setCapacidad(getCapacidad());
		this.capacidad=0;
	}


	@Override
	public int compareTo(Object o) {
		Camion c=(Camion)o;
		if(this.fecha<c.getFecha())
			return 1;
		else if(this.fecha>c.getFecha())
			return -1;
		return 0;
	}

}
