package uy.edu.ort.obli;

public class Delivery extends Punto {
	
	String cedula;

	public Delivery(double coordX, double coordY) {
		super(coordX, coordY);
		// TODO Auto-generated constructor stub
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
