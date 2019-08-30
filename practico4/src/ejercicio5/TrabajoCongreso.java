package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public abstract class TrabajoCongreso {
	private List<String>palabrasClaves=new ArrayList<>();
	public abstract boolean apto(Evaluador e);
	public List<String> getPalabrasClaves() {
		return new ArrayList<String>(this.palabrasClaves);			
	}
	
	public void add(String s) {
		this.palabrasClaves.add(s);
	}

	
}
