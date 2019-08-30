package ejercicio5;

public class Main {

	public static void main(String[] args) {
		Congreso c1=new Congreso();
		TrabajoCongreso p1=new Poster();
		p1.add("tema");
		p1.add("objetos");
		Evaluador e1=new Evaluador("nico");
		e1.add(p1);
		e1.addTema("tema");
		System.out.print(c1.queEvaluador(p1));
	}

}
