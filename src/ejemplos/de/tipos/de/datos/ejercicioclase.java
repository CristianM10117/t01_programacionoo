package ejemplos.de.tipos.de.datos;
import java.util.Scanner; 
public class ejercicioclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner L = new Scanner (System.in); 

System.out.println("Ingrese numero: ");
int a = L.nextInt(); 

int i = 1; 

while (i <= a) {
	int r = i*2; 
	System.out.println(+r);
	i = i + 1; 
}
	
	}

}
