package ejercicio7;

public class Futbolista extends Integrante {
	private int id;
	private String pierna;
	private int goles;
	
	public Futbolista(String nombre,String apellido,int nP,String fN,boolean disponible,boolean viajando,int id,String pierna,int goles) {
		super(nombre,apellido,nP,fN,disponible, viajando);
		this.id=id;
		this.pierna=pierna;
		this.goles=goles;
	}

	public int getId() {
		return id;
	}

	public String getPierna() {
		return pierna;
	}

	public int getGoles() {
		return goles;
	}
	
	
}
