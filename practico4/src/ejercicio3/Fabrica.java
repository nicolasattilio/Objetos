package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	private List<Pedido> pendientes=new ArrayList<>();
	private List<Pedido> atendidos=new ArrayList<>();
	
	public void analizarPedidos() {
		Filtro f=new FiltroSimple("Lugar Entrega");
		for(Pedido p : this.pendientes)
			if (f.cumple(p, new String ("Tandil")))
				this.atendidos.add(p);
		
	}
	
	public void recibirPedidos(Pedido p) {
		this.pendientes.add(p);
	}
}
