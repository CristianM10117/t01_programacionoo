package DiagramasFlujo;
import java.util.Scanner; 
public class mainejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Ingrese el sueldo: ");
		 
		 int A = leer.nextInt(); 
		if (A < 300) {
			
		 System.out.println("No recibe bonificacion. ");
		}else { 
			int b = A + 40; 
		 System.out.println("Su bonificacion es: " +b);
		
	}

}
}