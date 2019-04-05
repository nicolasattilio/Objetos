package ejercicio5;

import java.util.ArrayList;
import java.util.List;

import ejercicio4.Timbre;

public class Alarma {
	private List<Sensor> sensores=new ArrayList<>();
	private Timbre timbre;
	
	public Alarma(Timbre timbre) {
		this.timbre=timbre;
		this.sensores=new ArrayList<>();
	}
	
	/*public boolean comprobar() {
		boolean sonar=false;
		for(Sensor s:this.sensores)
			if (s.isDisparado())
				sonar=true;
				System.out.println("Sensor: "+s.getNombre()+" se ha activado");
		if (sonar==timbre)
			
	}*/
	
	public void addSensor(Sensor s) {
		this.sensores.add(s);
		
	}
	public List<Sensor> getSensores() {
		return new ArrayList<Sensor>(this.sensores);
		
	}
	
}
