package tinder;

public class Test {

	public static void main(String[] args) {
		
		Aplicacion aplicacion = new Aplicacion("TindORT");
		
		System.out.println(aplicacion.registrarPersona("Juan", "juan@mail.com", Genero.MASCULINO,30,Genero.FEMENINO,25,35));
		System.out.println(aplicacion.registrarPersona("Carlos", "carlos@mail.com", Genero.MASCULINO,45,Genero.FEMENINO,30,50));
		System.out.println(aplicacion.registrarPersona("Carlos", "carlos@mail.com", Genero.MASCULINO,45,Genero.FEMENINO,25,35));
		System.out.println(aplicacion.registrarPersona("Maria", "maria@mail.com", Genero.FEMENINO,28,Genero.MASCULINO,30,40));
		System.out.println(aplicacion.registrarPersona("Ana", "ana@mail.com", Genero.FEMENINO,32,Genero.MASCULINO,28,42));
		System.out.println(aplicacion.registrarPersona("Eva", "eva@mail.com", Genero.FEMENINO,32,Genero.MASCULINO,40,50));
		
		System.out.println(aplicacion.mostrarListado("juan@mail.com","Juan"));
		System.out.println(aplicacion.mostrarListado("carlos@mail.com", "Carlos"));
	}

}
