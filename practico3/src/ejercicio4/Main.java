package ejercicio4;
import hardware.Luz;

public class Main {

	public static void main(String[] args) {
		Timbre t=new Timbre();
		Luz l = new Luz();
		Alarma a1= new Alarma(t);
		Alarma a=new AlarmaLuminosa(t,l);
		a.setMovimiento(true);
		System.out.println(a.comprobar());
		System.out.println(a1.comprobar());

	}

}
