package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
	private List<String>minerales=new ArrayList<>();
	private String nombre;
	public Cereal(String s) {
		this.nombre=s;
	}
	public boolean acepta(Lote l) {
		for(String m:this.minerales) {
			if(!l.contiene(m))
				return false;
		}
		return true;	
	}
	public void addMineral(String s) {
		this.minerales.add(s);
	}
	public List<String> getMinerales() {
		return new ArrayList<String>(this.minerales);
	}
	public String getNombre() {
		return nombre;
	}
	
	
}
