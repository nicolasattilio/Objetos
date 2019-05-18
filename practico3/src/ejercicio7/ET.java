package ejercicio7;

public class ET extends Integrante {
	private int id;
	public ET(String nombre, String apellido, int nP, String fN, boolean disponible,boolean viajando,int id) {
		super(nombre, apellido, nP, fN, disponible,viajando);
		this.id=id;
		
	}
	public int getId() {
		return this.id;
	}
	
	
}
