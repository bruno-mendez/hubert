package uy.edu.ort.obli;

public class Usuario implements Comparable <Usuario>{

	private String nombre;
	private String mail;
	private String password;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String mail, String password) {
		super();
		this.nombre = nombre;
		this.mail = mail;
		this.password = password;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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
	    return this.getMail().compareTo(o.getMail());
	}

	
}
