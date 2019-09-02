package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Congreso {
	private List<Evaluador>generales=new ArrayList<>();
	private List<TrabajoCongreso>trabajos=new ArrayList<>();
	private List<String>temasExperto=new ArrayList<>();
	
	public void addTemasEspecificos(String s) {
		this.temasExperto.add(s);
	}
	
	public void addEvaluador(Evaluador e) {
			this.generales.add(e);
	}
	public List<TrabajoCongreso> queTrabajos(Evaluador e) {
		List<TrabajoCongreso>aux=new ArrayList<TrabajoCongreso>();
		for (TrabajoCongreso tc:this.trabajos)
			if(e.esApto(tc))
				aux.add(tc);
		return aux;
	}
	
	public List<Evaluador> queEvaluador(TrabajoCongreso tc){
		List<Evaluador>aux=new ArrayList<Evaluador>();
		for(Evaluador eG:this.generales) 
			if(tc.apto(eG))
				aux.add(eG);
		return aux;
		
	}
	public int cantTrabajos(Evaluador e) {
		return this.queTrabajos(e).size();
	
	}

}
