package uy.edu.ort.obli;

import java.util.ArrayList;

public class Usuario implements Comparable <Usuario>{

	private String nombre;
	private String email;
	private String password;
	private ArrayList <Direccion> direcciones;
	
	
	public Usuario() {
		
	}
	
	@Override
	public String toString() {
		return email + " ; " + nombre;
	}

	public Usuario(String email) {
		super();
		this.email = email;
	}
	
	public Usuario(String nombre, String mail, String password) {
		super();
		this.nombre = nombre;
		this.email = mail;
		this.password = password;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}

	public void setMail(String mail) {
		this.email = mail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int compareTo(Usuario o)
	{
	    return this.getEmail().compareTo(o.getEmail());
	}
	
	public boolean equals(Usuario o)
	{
	    return this.getEmail() == o.getEmail();
	}

	public boolean ValidarEmail() {
		return this.email.length() >=3 && this.email.contains("@"); 
	}
	
	public boolean AgregarDireccion (double coordX, double coordY) {
		
		
	}
	public String ListarDirecciones () {
		
	}
	
	public Boolean BuscarDirecion (double coordX, double coordY) {
		
	}
	
	public Boolean ActualizarDireccion(Direccion unaDire) {
		
	}
	
	public void ManejoDireccion(double coordX, double coordY) {
		
	}
	
}
