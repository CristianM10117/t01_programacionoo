package Diagramas.de.Flujo;

import java.util.Scanner;

public class ejercicioclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner L = new Scanner (System.in); 
		
		int s = 0; 
	  int p = 0;
	    int c = 0; 
	    int a = -1; 

	    while (a != 0) {
				System.out.println("Ingrese numero mayor a 0: ");
				 a = L.nextInt();   
				 
				
			    	if (a == 0) {
			    		c = c - 1; 
                        		    	
			    	}
			    	   s = s + a;
			    	   c = c + 1;
			    	   p = s / c;   
			    	    
			       }
		  System.out.println("La suma es: "+s);
         System.out.println("el promedio es: " +p); 
	     System.out.println("cantidad numeros ingresados: "+c);
	}
	}


         
	
	


