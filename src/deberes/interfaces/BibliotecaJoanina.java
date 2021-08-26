package deberes.interfaces;

public class BibliotecaJoanina implements BibliotecaInterfaz {

public void alquilarLibros() {
		
		System.out.println("Nombre del libro que desea alquilar. ");
		System.out.println("Nombre de la persona que alquila el libro. ");
		System.out.println("Nombre del libro que desea alquilar. ");
		System.out.println("Precio libro alquilado. ");
		System.out.println("Recibo. ");
		
	}

	@Override
	public void donaciones() {
		
		System.out.println("Nombre de persona que desea hacer su donacion. ");
		System.out.println("Tipo de donacion que se realiza. ");
		
		
	}

	@Override
	public void promocionBiblioteca() {
		
		System.out.println("Promocionar la biblioteca en redes sociales. ");
		System.out.println("Acciones publicitarias, pancartas, volantes. ");
	}

	@Override
	public void adquirirLibros() {
		
		System.out.println("Entidad de la cual adquiriran los productos. ");
		System.out.println("Adquirir los productos. ");
		
	}

	@Override
	public void preguntasPersonal() {
		
		System.out.println("Realizar un cuestionario o banco de preguntas a los empleados. ");
		
		
	}

}
