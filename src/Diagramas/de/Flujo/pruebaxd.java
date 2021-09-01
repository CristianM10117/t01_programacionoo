package Diagramas.de.Flujo;
import java.util.Scanner; 
public class pruebaxd {
	
	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		int op;
		String b; 
		do{

		System.out.println("Ingrese opcion de la Lista: ");
		
		 op = L.nextInt();
		
		if(op == 1) {
			System.out.println("Ingrese valor a retirar: ");
			int a = L.nextInt();
			System.out.println("El valor a retirar es: ");
			
		} else if (op == 2) {
			System.out.println("Ingrese nueva clave: ");
		    b = L.nextLine();
		    System.out.println("Su clave a sido cambiada.");
			
		}else if (op == 3) {
		
			System.out.println("SU CUENTA HA SIDO BLOQUEADA. ");
		}
		

        
}while(op != 4); 
	}
}