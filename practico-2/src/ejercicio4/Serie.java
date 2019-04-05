package ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class Serie {
	private List<Temporada> temporadas=new ArrayList<>();
	private String nombre;
	private String descripcion;
	private String creador;
	private String genero;
	public Serie(String n,String d,String c,String g) {
		this.nombre=n;
		this.descripcion=d;
		this.creador=c;
		this.genero=g;
		
	}
	
	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public String getGenero() {
		return genero;
	}

	public void addTemporada(Temporada t) {
		this.temporadas.add(t);
	}
	
	public int episodiosVistosSerie() {
		int contador=0;
		for (Temporada t:this.temporadas) //
			contador+=t.episodiosVistosTemporada();
		return contador;		
	}
	
	public double promedioEpisodioSerie() {
		double promedio=0;
		for (Temporada t:this.temporadas) {
			promedio+=t.promedioEpisodioTemporada();
		}
		return (promedio/temporadas.size());
	}
	
	public static void main(String[] args) {
		Episodio E1 = new Episodio("Pilot", "Primer Capitulo");
		Episodio E2 = new Episodio("Mom", "Segundo Capitulo");
		Temporada T1 = new Temporada();
		T1.addEpisodio(E1);
		T1.addEpisodio(E2);
		Serie S1 = new Serie("La clase", "Como los estudiantes sobreviven a la cursada de objetos", "Christopher Nolan", "Terror");
		E1.setCalificacion(4);
		S1.addTemporada(T1);
		E1.setFlag(true);
		//System.out.println(T1.episodiosVistosTemporada());
		System.out.println(S1.episodiosVistosSerie());
		System.out.println(T1.promedioEpisodioTemporada());
		
	}

}
