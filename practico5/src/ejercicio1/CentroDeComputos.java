package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class CentroDeComputos {
	private List<Computadora>computadoras=new ArrayList<>();
	private List<Proceso>procesos=new ArrayList<>();
	public void addPc(Computadora c) {
		this.computadoras.add(c);
		Collections.sort(this.computadoras);
	}
	public void addProceso(Proceso p) {
		this.procesos.add(p);
		Collections.sort(this.procesos);
	}
	public void executarProcesos() {
		for(Proceso p:this.procesos)
			for(Computadora c:this.computadoras)
				if (c.isDisponible())
					p.execute(c);
	}
	
}
