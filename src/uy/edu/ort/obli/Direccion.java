package uy.edu.ort.obli;

public class Direccion extends Punto {
	int frecuencia;

	public Direccion(double coordX, double coordY) {
		super(coordX, coordY);
		this.frecuencia = 1;
		// TODO Auto-generated constructor stub
	}
	
	public int getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}


}
