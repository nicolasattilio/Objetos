package ejercicio5;

public class Main {

	public static void main(String[] args) {
		Persona n1=new Persona("Nicolas","Attilio",1993,8,24,2494,"Del valle 91","nicolasattilio@gmail.com");
		Persona n2=new Persona("Susana","Reynoso",1963,4,20,2281,"Tucuman 393","susanareynoso@gmail.com");
		Reunion r1=new Reunion("Tucuman 393",90,"Scrum");
		r1.addPersona(n1);
		r1.addPersona(n2);
		Agenda a1=new Agenda();
		a1.addReunion(r1);
		System.out.print(r1.mostrarIntegrantes());
		System.out.print(a1.mostrarReuniones());
		a1.addContacto(n1);
		a1.addContacto(n2);
		System.out.print(a1.promedioEdadContacto());
		System.out.print(a1.mostrarContacto());
	}

}
