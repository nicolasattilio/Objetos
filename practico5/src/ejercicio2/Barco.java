package ejercicio2;

public class Barco implements Comparable<Object> {
	private int capacidad;
	private String name;
	

	
	public Barco(String n,int capacidad) {
		this.capacidad=capacidad;
		this.name=n;
	}
	public String toString() {
		return this.name;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int c) {
		this.capacidad-=c;
	}

	@Override
	public int compareTo(Object o) {
		Barco b=(Barco)o;
		if(this.capacidad<b.getCapacidad())
			return 1;
		else if (this.capacidad>b.getCapacidad())
			return -1;
		return 0;
	}

}
