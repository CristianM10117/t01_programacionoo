package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner L  = new Scanner(System.in);
		
		System.out.println("Ingrese el limite del vector:" );
		int n = L.nextInt();
		
		char X[] =new char [n];

		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese valor de la posicion: "+i);
			char a = L.next().charAt(0);
	X[i] = a; 
		
		}
		for (int i = 0; i < n; i++) {
			System.out.println("El valor de la posicion: "+i);
			System.out.println(X[i]);
		}
		
		}
	
	
	
	}
	


