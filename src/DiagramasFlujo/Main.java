package DiagramasFlujo;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Ingrese 2 numeros: ");
 Scanner leer = new Scanner(System.in); 
 
int A = leer.nextInt(); 
System.out.println("Numero ingresado: "+A);
	
int B = leer.nextInt(); 
System.out.println("Numero ingresado: "+B);
int S  = A + B; 
int S1 = A - B; 
int S2 = A * B; 
int S3 = A / B; 
int S4 = A % B; 

System.out.println("La SUMA es: "+S);
System.out.println("La RESTA es: "+S1);
System.out.println("La MULTIPLICACION es: "+S2);
System.out.println("La DIVISION es: "+S3);
System.out.println("El RESIDUO es: "+S4);
	}

}
