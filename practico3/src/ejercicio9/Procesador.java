package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public abstract class Procesador {
	private List<Tarea> tareas=new ArrayList<>();
	public void execute() {
		
	}
	public abstract void add(Tarea t);
	
}
