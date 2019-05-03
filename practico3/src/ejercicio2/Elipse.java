package ejercicio2;

public class Elipse extends FigurasGeometricas {
	private float radioMenor;
	private float radioMayor;
	
	public Elipse(float rMe,float rMa) {	//elipse
		this.radioMayor=rMa;
		this.radioMenor=rMe;
	}
	
	public Elipse(float radio) {		//circulo
		this.radioMenor=radio;
		this.radioMayor=radio;
	}

	public float getRadioMenor() {
		return radioMenor;
	}

	public float getRadioMayor() {
		return radioMayor;
	}

	@Override
	public double getArea() {
		return (this.getRadioMenor()*this.getRadioMayor()*Math.PI);
	}

	@Override
	public double getPerimetro() {
		return (Math.PI*(3*(this.getRadioMenor()+this.getRadioMayor())-Math.sqrt(((3*this.getRadioMenor()+this.getRadioMayor())*(this.getRadioMenor()+3*this.getRadioMayor())))));
	}

}
