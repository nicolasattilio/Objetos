package ejercicio4;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flag=false;
	private int calificacion=-1;
	public Episodio(String t,String d) {
		this.titulo=t;
		this.descripcion=d;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public boolean getFlag() {
		return this.flag;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		if ((calificacion<1)||(calificacion>5)) 
			System.out.println("No es posible ingresar esta clasificacion,la clasificacion va de 1-5");
		else
			this.calificacion = calificacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
}
