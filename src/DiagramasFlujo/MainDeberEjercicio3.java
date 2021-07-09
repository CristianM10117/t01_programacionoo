package DiagramasFlujo;

import java.util.Scanner;

public class MainDeberEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner L = new Scanner(System.in); 
		
		System.out.println("Ingrese su sueldo: ");
		 
		int a = L.nextInt(); 
	
	if (a < 300) {
		System.out.println("Bonificación: 100$. ");		
		int b = a + 100; 
		System.out.println("Su sueldo total con su bonificación es: " +b);
		
	}else if (a > 300 && a <400) {
		System.out.println("Bonificación: 70$. ");		
		int b = a + 70; 
		System.out.println("Su sueldo total con su bonificación es: " +b);
		
	}else if (a >= 300 && a <= 400) {
			System.out.println("Bonificación: 70$. ");		
			int b = a + 70; 
			System.out.println("Su sueldo total con su bonificación es: " +b);
			
	}else if (a > 400) {
		System.out.println("Bonificación: 50$. ");		
		int b = a + 50; 
		System.out.println("Su sueldo total con su bonificación es: " +b);
	

}
}
}
