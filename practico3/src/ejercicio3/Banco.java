package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes= new ArrayList<>();
	public List<Cliente> getClientes(){
		return new ArrayList<Cliente>(this.clientes);
	}
	
	public void addCliente(Cliente c1) {
		clientes.add(c1);
		
	}
}
