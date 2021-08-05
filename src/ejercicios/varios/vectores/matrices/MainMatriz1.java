package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner L = new Scanner(System.in); 
		System.out.println("Ingrese longitud de fila: ");
		int lf = L.nextInt();
		System.out.println("Ingrese longitud de columna: ");
		int lc = L.nextInt();
	char A[][] = new char [lf][lc]; 
	for (int fila = 0; fila < lf; fila++) {
		for (int columna = 0; columna < lc; columna++) {
		System.out.println("Ingrese el valor de la fila: "+ fila + " columna: "+columna);	
	   char a = L.next().charAt(0);
	   System.out.println("");
		A[fila][columna] = a;  
		}	
	}
	for (int fila = 0; fila < lf; fila++) {
		for (int columna = 0; columna < lc; columna++) {
		System.out.print(A[fila][columna]+" ");
}
		System.out.println("");
		
	}
}
}
