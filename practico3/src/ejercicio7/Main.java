package ejercicio7;

public class Main {

	public static void main(String[] args) {
		Integrante j1= new Futbolista("nicolas","attilio",1234,"24 de agosto",false,true,10,"derecha",4);
		Integrante tec= new ET("Carlos", "Bilardo", 555, "30 de Febrero", true, true, 1);
		Contingente c1= new Contingente();
		c1.addIntegrante(j1);
		c1.addIntegrante(tec);
		System.out.println(j1.isDisponible());
		System.out.println(tec.isDisponible());
		
	}

}
