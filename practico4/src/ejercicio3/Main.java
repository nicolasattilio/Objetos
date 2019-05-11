package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Fabrica f1 = new Fabrica();
		Mueble m1 = new Mueble("mesa", 3000, "roble");
		Pedido p = new Pedido(m1, "14 de Abril", "5 de Mayo", "Tandil");
		f1.recibirPedidos(p);
		f1.analizarPedidos();

	}

}
