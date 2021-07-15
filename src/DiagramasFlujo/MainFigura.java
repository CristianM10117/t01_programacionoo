package DiagramasFlujo;

import java.util.Scanner;

public class MainFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Ingrese Día de nacimiento: ");
		 int n = leer.nextInt();
		 for (int fila = 1; fila <= n; fila++) {
			 for (int ast = 1; ast <= fila; ast++) {
				 
				System.out.print("*");
			 }
			 System.out.println();
		 }
	
	}

}
