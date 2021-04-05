package tinder;

public class Persona {

	private String nombre;
	private String mail;
	private Genero genero;
	private int edad;
	private Genero generoDeseado;
	private int edadMinimaDeseada;
	private int edadMaximaDeseada;

	public Persona(String nombre, String mail, Genero genero, int edad, Genero generoDeseado, int edadMinimaDeseada,
			int edadMaximaDeseada) {
		setNombre(nombre);
		setMail(mail);
		setGenero(genero);
		setEdad(edad);
		setGeneroDeseado(generoDeseado);
		setEdadMinimaDeseada(edadMinimaDeseada);
		setEdadMaximaDeseada(edadMaximaDeseada);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	private void setMail(String mail) {
		this.mail = mail;
	}

	public Genero getGenero() {
		return genero;
	}

	private void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public Genero getGeneroDeseado() {
		return generoDeseado;
	}

	private void setGeneroDeseado(Genero generoDeseado) {
		this.generoDeseado = generoDeseado;
	}

	public int getEdadMinimaDeseada() {
		return edadMinimaDeseada;
	}

	private void setEdadMinimaDeseada(int edadMinimaDeseada) {
		this.edadMinimaDeseada = edadMinimaDeseada;
	}

	public int getEdadMaximaDeseada() {
		return edadMaximaDeseada;
	}

	private void setEdadMaximaDeseada(int edadMaximaDeseada) {
		this.edadMaximaDeseada = edadMaximaDeseada;
	}

	private boolean quiereIndistinto() {
		return generoDeseado == Genero.INDISTINTO;
	}
	
	public boolean match(Persona otraPersona) {
		
		boolean edadTarget = otraPersona.getEdad() >= edadMinimaDeseada
				&& otraPersona.getEdad() <= edadMaximaDeseada;

		boolean generoTarget = otraPersona.getGenero() == generoDeseado
				|| quiereIndistinto();
		
		return edadTarget && generoTarget;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", mail=" + mail + ", genero=" + genero + ", edad=" + edad
				+ ", generoDeseado=" + generoDeseado + ", edadMinimaDeseada=" + edadMinimaDeseada
				+ ", edadMaximaDeseada=" + edadMaximaDeseada + "]";
	}

}
