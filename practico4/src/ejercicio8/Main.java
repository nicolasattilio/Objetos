package ejercicio8;

public class Main {

	public static void main(String[] args) {
		Archivo a1=new Archivo("archi", "20 de enero", "5 de febrero", 15);
		Archivo a2=new Archivo("archije", "21 de enero", "6 de febrero", 20);
		Link l1=new Link("link", "22 de enero",a1);
		SistemaArchivos d1=new Directorio("carpeta", "23 de enero", 1);
		d1.add(a1);
		d1.add(a2);
		d1.add(l1);
		System.out.println(d1.getCantElementos());
		System.out.println(d1.getTamanio());
		System.out.println(l1.arch.nombre);

	}

}
