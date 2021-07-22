package t01_programacionoo;

import java.util.Scanner;
public class ejercicio {

	public static void main(String[] args) {
		
		Scanner L = new Scanner (System.in);
			
	System.out.println("Ingrese un numero: "); 
	int a = L.nextInt();
	 int t = a; 
	  int e = 0; 
	  int nn = 0; 
	  for (int i = 0; t > 0; i++) {
		   e = t % 10;
		    nn = (nn * 10) + e; 
		    t = t / 10; 
	}
if (a ==  nn) {
	System.out.println("Palindromo");
}else {
		System.out.println("No palindromo"); 
}

	}
}
