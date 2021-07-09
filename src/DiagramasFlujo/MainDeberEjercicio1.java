package DiagramasFlujo;
import java.util.Scanner; 
public class MainDeberEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner L = new Scanner(System.in); 
		
		System.out.println("Ingrese primer numero: ");
		 
		 float A = L.nextInt(); 
		
System.out.println("Ingrese segundo numero: ");
		 
float B = L.nextInt(); 
		 
		 if (B == 0) {
			
		 System.out.println("No es posible realizar tal división. ");
		}else { 
			float	 c = A / B; 
		 System.out.println("La division es: " +c);
		
	}
	
	
	
	}

}
