package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Puerto {
	private List<Barco>barcos=new ArrayList<>();
	private List<Camion>camiones=new ArrayList<>();
	
	public void addBarco(Barco barcos) {
		this.barcos.add(barcos);
		Collections.sort(this.barcos);
	}
	
	public void addCamion(Camion camiones) {
		this.camiones.add(camiones);
		Collections.sort(this.camiones);
	}
	
	public List<Camion> getCamiones() {
		return new ArrayList<Camion>(this.camiones);
	}
	
	public List<Barco> getBarcos(){
		return new ArrayList<Barco>(this.barcos);
	}
	
	
	public void cargar() {
		for(Barco b:this.barcos) 
			for (Camion c:this.camiones)
				if(b.getCapacidad()>=0)
					c.descargar(b);

					
	}
	
}
