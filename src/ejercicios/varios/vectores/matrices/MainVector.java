package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner L  = new Scanner(System.in);
		
		char X[] =new char [3];

	for (int i = 0; i < 3; i++) {
		System.out.println("Ingrese valor de la posicion: "+i);
		char a = L.next().charAt(0);
X[i] = a; 
	
	}
	for (int i = 0; i < 3; i++) {
		System.out.println("El valor de la posicion: "+i);
		System.out.println(X[i]);
	}
	
	}
  
}
