package ejercicio9;

public class Prioridad extends ProcOrden {

	@Override
	public int comparar(Tarea t) {
		for (Tarea ta:this.tareas) { //comparar con todas las tareas o solo con 1
			if (ta.getPrioridad()<t.getPrioridad())
				return 1;
		}
		return 0;
	}

}
