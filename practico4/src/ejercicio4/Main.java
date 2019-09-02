package ejercicio4;

public class Main {

	public static void main(String[] args) {
		Cereal c1=new Cereal("Trigo");
		Lote l1=new Lote(60);
		Cooperativa cope=new Cooperativa("Vaca");
		cope.addCereal(c1);
		l1.add("Trigo");
		cope.addLote(l1);
		cope.addPrimario("Trigo");
		System.out.print(cope.esEspecial(l1));
		System.out.print(cope.queLotes(c1));
		
	}

}
