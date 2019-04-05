package ejercicio4;

public class Main {
	public static void main(String[] args) {
		Episodio E1 = new Episodio("Pilot", "Primer Capitulo");
		Episodio E2 = new Episodio("Mom", "Segundo Capitulo");
		Episodio E3 = new Episodio("Dad", "Primer Capitulo");
		Episodio E4 = new Episodio("Bro", "Cuarto Capitulo");
		Temporada T1 = new Temporada();
		Temporada T2 = new Temporada();
		T1.addEpisodio(E1);
		T1.addEpisodio(E2);
		T2.addEpisodio(E3);
		T2.addEpisodio(E4);
		Serie S1 = new Serie("La clase", "Como los estudiantes sobreviven a la cursada de objetos", "Christopher Nolan", "Terror");
		E1.setCalificacion(4);
		S1.addTemporada(T1);
		S1.addTemporada(T2);
		E1.setFlag(true);
		E2.setFlag(true);
		System.out.println(T1.episodiosVistosTemporada());
		System.out.println(S1.episodiosVistosSerie());
		System.out.println(T1.promedioEpisodioTemporada());
		System.out.println(T1.temporadaCompleta());
		System.out.println(S1.serieCompleta());
		
	}

}
