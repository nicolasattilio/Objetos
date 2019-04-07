package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Poligono extends FigurasGeometricas {
	private List<Lado>lados=new ArrayList<>();
	
	public void addLados(Lado l) {
		this.lados.add(l);
	}
	public List<Lado> getLados() {
		return new ArrayList<Lado>(this.lados);
	}
	public Lado getLado(int i) {
		return lados.get(i);
	}
	
	@Override
	public double getArea() {
		return 0;//Preguntar
	}

	@Override
	public double getPerimetro() {
		double sumLados=0;
		for(Lado l:this.lados)
			sumLados+=l.getLong();
		return sumLados;
	}

}
