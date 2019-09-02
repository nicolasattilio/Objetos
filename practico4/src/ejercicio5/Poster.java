package ejercicio5;

public class Poster extends TrabajoCongreso {
	
	@Override
	public boolean apto(Evaluador e) {
		for(String s:this.getPalabrasClaves())
			if (e.contiene(s))
				return true;
		return false; 
	}
	

}
