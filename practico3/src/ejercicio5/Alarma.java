package ejercicio5;
import hardware.Sensor;
import hardware.Timbre;

import java.util.ArrayList;
import java.util.List;



public class Alarma {
	private List<Sensor> sensores=new ArrayList<>();
	private Timbre timbre;
	
	public Alarma(Timbre timbre) {
		this.timbre=timbre;
		this.sensores=new ArrayList<>();
	}
	
	public boolean comprobar() {
		boolean sonar = false;
		for(Sensor s: this.sensores) {
			if (s.isDisparado()) {
				sonar = true;
				System.out.println("Sensor: "+s.getNombre()+" dispar�");
			}
		}
		if (sonar) {
			this.timbre.sonar();
			return true;
		}
		return false;
	}
	
	public void addSensor(Sensor s) {
		this.sensores.add(s);
		
	}
	public List<Sensor> getSensores() {
		return new ArrayList<Sensor>(this.sensores);
		
	}
	
}
