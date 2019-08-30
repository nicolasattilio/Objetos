package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends SistemaArchivos {
	private int factorCompresion;
	public Directorio(String nombre,String fechaCreacion,int factorCompresion) {
		super();
		this.factorCompresion=factorCompresion;
	}
	List<SistemaArchivos>datos=new ArrayList<>();
	public void add(SistemaArchivos archivos) {
		this.datos.add(archivos);
	}
	@Override
	public int getTamanio() {
		int aux=0;
		for (SistemaArchivos d:this.datos)
			aux+=d.getTamanio();
		return aux*factorCompresion;
	}
	@Override
	public int getCantElementos() {
		int cant=0;
		for(SistemaArchivos d:this.datos)
			cant+=d.getCantElementos();
		return cant;
	}

}
