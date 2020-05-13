package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Servidor {
	private List<Noticia>noticias=new ArrayList<>();
	private List<Cliente>clientes=new ArrayList<>();
	Filtro f1;
	
	public void addNoticia(Noticia n) {
		this.noticias.add(n);
		for (Cliente c:this.clientes)
			if (c.acepta(n))
				System.out.println("Se ha enviado la noticia a : "+c.getNombre());
	}
	
	public Noticia contTitulo() {
		for(Noticia n:this.noticias) {
			if (n.contTitulo(f1))
				return n;	
		}
		return null;
	}
	
	public Noticia contCategoria() {
		for(Noticia n:this.noticias) {
			if(n.contCategoria(f1))
				return n;
		}
		return null;
	}
	
	public Noticia contCuerpo() {
		for(Noticia n:this.noticias) {
			if(n.contCuerpo(f1))
				return n;
		}
		return null;
	}
}
