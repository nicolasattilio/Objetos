package ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class Temporada {
	private List<Episodio> episodios=new ArrayList<>();
	
	public void addEpisodio(Episodio e) {
		this.episodios.add(e);
	}
	
	public int episodiosVistosTemporada() {
		int contador=0;
		for (Episodio e:this.episodios) {
			if (e.getFlag()==true)
				contador++;
		}
		return contador;	
	}
	public double promedioEpisodioTemporada() {
		double promedio=0;
		for (Episodio e:this.episodios) {
			promedio+=e.getCalificacion();
		}
		return (promedio/episodios.size());
	}
	
	public boolean temporadaCompleta() {
		for (Episodio e:this.episodios) {
			if (e.isFlag()==false)
				return false;
		}
		return true;
	}
}
	