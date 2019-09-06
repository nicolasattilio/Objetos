package ejercicio9;

public abstract class FCompuesto implements Filtro {
	Filtro f1;
	Filtro f2;
	public FCompuesto(Filtro f1,Filtro f2) {
		this.f1=f1;
		this.f2=f2;
	}

}
