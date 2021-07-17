package DiagramasFlujo;

import java.util.Scanner;

public class Maininvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Buenas Noches
Scanner leer = new Scanner(System.in); 
		
		System.out.println("Ingrese numero de asteriscos: ");
		 int n = leer.nextInt();
		 for (int fila = n; fila >= 1; fila--) {
			 for (int ast = fila; ast >= 1; ast--) {
				 
				System.out.print("*");
			 }
			 System.out.println();
		 }
	
	}

}
