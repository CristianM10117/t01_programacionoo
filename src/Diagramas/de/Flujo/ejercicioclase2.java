package Diagramas.de.Flujo;

import java.util.Scanner;

public class ejercicioclase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner L = new Scanner (System.in); 
		
		int sp = 0; 
	  int si = 0;
	  int pi = 0;
	    int ci = 0; 
	    int a;
	do {
		System.out.println("Ingrese numero positivo: ");
		a = L.nextInt(); 

		if (a <= 0) {
			a = -2; 
		
		}else if(a % 2 == 0) {
			sp = sp + a; 
		}else {
			si = si + a; 
			ci = ci + 1; 
			pi = si / ci; 
		}	
	}while(a >= 0);			
		
	  System.out.println("La suma de los pares es: "+sp);
      System.out.println("el promedio de los impares es: " +pi); 
	     System.out.println("cantidad numeros impares ingresados: "+ci);
		
	}


}



