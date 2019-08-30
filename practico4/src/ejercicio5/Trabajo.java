package ejercicio5;

public class Trabajo extends TrabajoCongreso {
	@Override
	public boolean apto(Evaluador e) {
		for(String s:this.getPalabrasClaves())
			if (!e.contiene(s))
				return false;
		return true; 
	}
	

}
