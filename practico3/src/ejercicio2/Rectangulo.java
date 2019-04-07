package ejercicio2;

public class Rectangulo extends Poligono {
	Rectangulo(Lado lMe,Lado lMa){		//rectangulo
		super.addLados(lMa);
		super.addLados(lMe);
		super.addLados(lMa);
		super.addLados(lMe);
	}
	Rectangulo(Lado lado){		//cuadrado
		super.addLados(lado);
		super.addLados(lado);
		super.addLados(lado);
		super.addLados(lado);
	}
	@Override
	public double getArea() {
		return (super.getLado(1).getLong()*super.getLado(2).getLong());
			
	}

}
