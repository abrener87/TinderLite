package tinder;

import java.util.ArrayList;

public class Aplicacion {

	private String nombre;
	private ArrayList<Persona> personas;

	public Aplicacion(String nombre) {
		personas = new ArrayList<>();
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Persona buscarPersona(String mail, String nombre) {

		Persona personaABuscar = null;
		int i = 0;

		while (i < personas.size() && (!mail.equalsIgnoreCase(personas.get(i).getMail())
				|| !nombre.equalsIgnoreCase(personas.get(i).getNombre()))) {
			i++;
		}

		if (i < personas.size()) {
			personaABuscar = personas.get(i);
		}

		return personaABuscar;
	}

	public boolean registrarPersona(String nombre, String mail, Genero genero, int edad, Genero generoDeseado,
			int edadMinimaDeseada, int edadMaximaDeseada) {

		boolean pudeRegistrar = false;

		if (buscarPersona(mail, nombre) == null) {
			pudeRegistrar = personas
					.add(new Persona(nombre, mail, genero, edad, generoDeseado, edadMinimaDeseada, edadMaximaDeseada));
		}

		return pudeRegistrar;
	}

	private boolean verificarCoincidenciaParcial(Persona persona1, Persona persona2) {

		return persona1.match(persona2);
	}

	private boolean verificarCoincidenciaTotal(Persona persona1, Persona persona2) {

		return verificarCoincidenciaParcial(persona1, persona2) && verificarCoincidenciaParcial(persona2, persona1);
	}

	public ArrayList<Persona> mostrarListado(String mail, String nombre) {

		ArrayList<Persona> listado = null;

		Persona personaIndicada = buscarPersona(mail, nombre);

		if (personaIndicada != null) {

			listado = new ArrayList<>();

			for (Persona persona : personas) {

				if (persona != personaIndicada) { // Sino serías narcicista ...

					if (verificarCoincidenciaTotal(personaIndicada, persona)) {
						listado.add(persona);
					}
				}
			}

		} else {
			System.out.println("La persona buscada no existe!!!");
		}

		return listado;
	}

}
