package t01_programacionoo;

public class vendedor extends consecionario{

	private String nombre; 
	
	void vendercliente() {
		 cliente vender = new cliente(); 
		 vender.comprar(nombre);
	}
	
	void comprar() {
	}
	}

