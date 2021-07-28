package Diagramas.de.Flujo;

import java.util.Scanner;

public class Mainprueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner L = new Scanner (System.in); 
		
		int s = 0; 
	  int p = 0;
	    int c = 0; 
	    
		  for (int i = 1; i != 0;i++ ) {
			  
				System.out.println("Ingrese numero positivo: ");
				int a = L.nextInt(); 
	
	       if (a == 0) {
	    	   i = -1;
	    	   
	       }else {
	    	
	    	   s = s + a; 
	    	   p = s/i;   
	    	   c = c = c + 1; 
	       }
	}
	
		  System.out.println("La suma es: "+s);
         System.out.println("el promedio es: " +p); 
	     System.out.println("cantidad numeros ingresados: "+c);
	}
}
         
         