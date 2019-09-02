package ejercicio8;

public class Link extends Dato {
	Archivo arch;
	public Link(String nom,String fecha,Archivo a1) {
		fechaCreacion=fecha;
		nombre=nom;
		tamanio=1;	
		this.arch=a1;
	}

}
