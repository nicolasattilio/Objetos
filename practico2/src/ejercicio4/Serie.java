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
		return new ArrayList<Temporada>(this.temporadas);
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

	public boolean serieCompleta() {
		for(Temporada t:this.temporadas) {
			if (t.temporadaCompleta()==false)
				return false;
		}
		return true;
	}
	

}
