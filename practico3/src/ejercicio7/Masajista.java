package ejercicio7;

public class Masajista extends Integrante {
	private int id;
	private int aniosCargo;
	public Masajista(String nombre, String apellido, int nP, String fN, boolean disponible,boolean viajando,int id,int aniosCargo) {
		super(nombre, apellido, nP, fN, disponible,viajando);
		this.id=id;
		this.aniosCargo=aniosCargo;	
	
	}
	public int getId() {
		return id;
	}
	public int getAniosCargo() {
		return aniosCargo;
	}
	
}
