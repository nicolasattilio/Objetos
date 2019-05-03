package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public abstract class Procesador {
	protected List<Tarea> tareas=new ArrayList<>();
	public void execute() {
		
	}
	public abstract void add(Tarea t);
	
}
