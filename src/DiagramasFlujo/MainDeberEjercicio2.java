package DiagramasFlujo;
import java.util.Scanner; 
public class MainDeberEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner L = new Scanner(System.in); 
		
		System.out.println("Ingrese primer numero: ");
		 
		int a = L.nextInt(); 
		
        System.out.println("Ingrese segundo numero: ");
		 
        int b = L.nextInt(); 
	
	    int c = a % b; 
	
	    if (c == 0) {
	    	
	    System.out.println(+a+ " es multiplo de " +b+ ".");
	    	
	    	}else {
	    		
	    		 System.out.println("No son multiplos. ");
	    	}
	}

}
