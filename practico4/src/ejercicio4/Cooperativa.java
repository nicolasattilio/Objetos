package ejercicio4;

import java.util.List;
import java.util.ArrayList;

public class Cooperativa {
	private String nombre;
	private List<String>primarios=new ArrayList<>();
	private List<String>secundarios=new ArrayList<>();
	private List<Cereal>cereales=new ArrayList<>();
	private List<Lote>lotes=new ArrayList<>();
	
	public Cooperativa(String n) {
		this.nombre=n;
	}
	public String getNombre() {
		return nombre;
	}
	public void addPrimario(String s) {
		this.primarios.add(s);
	}
	public void addSecundario(String s) {
		this.secundarios.add(s);
	}
	public void addCereal(Cereal c) {
		this.cereales.add(c);
	}
	public void addLote(Lote l) {
		this.lotes.add(l);
	}
	public List<String> getSecundarios() {
		return new ArrayList<String>(this.secundarios);
	}
	public boolean esEspecial(Lote l) {
		for(String m:this.primarios)
			if(!l.contiene(m))
				return false;
		return true;
	}
	
	public boolean puede(Cereal c,Lote l) {
		return c.acepta(l);
	}
	
	
	public List<Cereal> queCereales(Lote l) {
		List<Cereal>aux=new ArrayList<Cereal>();
		for (Cereal c:this.cereales)
			if(l.puede(c))
				aux.add(c);
		return aux;
	}
	
	public List<Lote> queLotes(Cereal c) {
		List<Lote>aux=new ArrayList<Lote>();
		for (Lote l:this.lotes)
			if(c.acepta(l))
				aux.add(l);
		return aux;
	}
	
	
	public List<String> getPrimarios() {
		return new ArrayList<String>(this.primarios);
	}
	
	
	
}
