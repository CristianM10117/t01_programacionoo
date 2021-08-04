package ejercicios.varios.vectores.matrices;

public class MainDeberVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     /* 1.- Declara un vector X(8) */
		
		System.out.println("Ejercicio 1 declarado. ");
		System.out.println("");
		int X[] =new int [8];
		
	 /* 2.- Declarar un vector Y(3) de tipo char y asignar a la posici�n 2 el valor de A */
	   
		System.out.println("Ejercicio 2: ");
		char Y[] = new char [3]; 	
	         Y[2] = 'A';
	    System.out.println(Y);
	    System.out.println("");
	    
	 /* 3.- Declarar un vector A(5) asignar a la posici�n 0 el valor 25, posici�n 3 el valor 49 y a la posici�n 2 el valor de la posici�n 0 */
	
	    System.out.println("Ejercicio 3: ");
	    int A[] = new int [5]; 
            A[0] = 25;
            A[3] = 49;
            A[2] = A[0];
        System.out.println(A[0]);
        System.out.println(A[3]);
        System.out.println(A[2]);
        System.out.println("");
  
      /* 4.- Declarar un vector B(10), a la posici�n B[0] asignele el valor del vecto A[3] del ejercicio anterior */
	
        System.out.println("Ejercicio 4: ");
        int B[] = new int [10];     
            B[0] = A[3];
        System.out.println(B[0]);    
        System.out.println("");
        
       /* 5.- Declara un vector Z(12) y asignar a todas sus posiciones valores que inician desde 1 y son secuenciales */  
        
        System.out.println("Ejercicio 5: ");
        int Z[] = new int [12]; 
            Z[0] = 1;
            Z[1] = 2;
            Z[2] = 3;	
            Z[3] = 4;
            Z[4] = 5;
            Z[5] = 6;
            Z[6] = 7;
            Z[7] = 8;
            Z[8] = 9; 
            Z[9] = 10;
            Z[10] = 11;
            Z[11] = 12; 
         System.out.println(Z[0]);
         System.out.println(Z[1]);
         System.out.println(Z[2]);
         System.out.println(Z[3]);
         System.out.println(Z[4]);
         System.out.println(Z[5]);
         System.out.println(Z[6]);
         System.out.println(Z[7]);
         System.out.println(Z[8]);
         System.out.println(Z[9]);
         System.out.println(Z[10]);
         System.out.println(Z[11]);
         System.out.println("");
	
       /* 6.- Declara un vector Y(10) y asignar a todas sus posiciones valores impares que inician desde 1 y son secuenciales */
	
         System.out.println("Ejercicio 6: ");
         int y[] = new int [10]; 
             y[0] = 1;     
             y[1] = 3;
             y[2] = 5;
             y[3] = 7;
             y[4] = 9;
             y[5] = 11;
             y[6] = 13;
             y[7] = 15;
             y[8] = 17;
             y[9] = 19;
        System.out.println(y[0]);      
        System.out.println(y[1]);
        System.out.println(y[2]);
        System.out.println(y[3]);
        System.out.println(y[4]);
        System.out.println(y[5]);
        System.out.println(y[6]);
        System.out.println(y[7]);
        System.out.println(y[8]);
        System.out.println(y[9]);
        System.out.println("");
	
        /* 7.- Declara un vector H(10) y asignar solo a las posiciones impares letras que inician desde la A secuencialmente */
        
        System.out.println("Ejercicio 7: ");  
        char H[] = new char [10];
               H[1] = 'A';
               H[3] = 'B';
               H[5] = 'C';
               H[7] = 'D';
               H[9] = 'E';
        System.out.println(H);   
        System.out.println("");
        
        /* 8.- Declarar un vector F(10) y en base al ejercicio anterior asignar los valores de la siguiente manera:
         * F[0]=H[3]
           F[3]=H[2]
           F[4]=H[6]
           F[7]=H[0]
           F[8]=H[1]
           F[9]=H[9] */
	 
        System.out.println("Ejercicio 8:");
        char F[] = new char [10];  
	    
	            F[0]=H[3];
	            F[3]=H[2];
	            F[4]=H[6];
	            F[7]=H[0];
	            F[8]=H[1];
	            F[9]=H[9];
	    
	    System.out.println(F); 
	    System.out.println("");
	
	    /* 9.- Declara un vector L(15) y asignar valores en base a los siguiente:
               L[0]= (promedio de 3,5,7 y 9)
               L[4]= (la suma de 5, 7, 8 y 15)
               L[7]= (la multiplicaci�n de 6, 7 y 3)
               L[10]= (la divisi�n de 10/2) */
	
	    System.out.println("Ejercicio 9:");
	    int L[] = new int [15]; 
	
	         L[0]= 6; 
	         L[4]= 35;
	         L[7]= 126;
	         L[10]= 5;
	         
	    System.out.println(L[0]); 
	    System.out.println(L[4]);
	    System.out.println(L[7]);
	    System.out.println(L[10]);
	    System.out.println("");
	
	    /* 10.-Declarar un vector N(12) y realizar las siguientes asignaciones:
              N[0]= (promedio de 3,10 y 9)
              N[4]= (la suma de 7, 8 y 10)
              N[12]= (la multiplicaci�n de 5, 7 y 3)
              N[20]= (la suma de 7, -3 y 8)
              en la �ltima posici�n el valor de 20/4 */
	
	    System.out.println("Ejercicio 10");
	    int N[] = new int [12]; 
		
	         N[0]= 11;
	         N[4]= 25;
	         /*N[12]= 105 No existe, ERROR.*/
	         /*N[20]= 12  No existe, ERROR.*/
	         N[11]= 5;    
	
	     System.out.println(N[0]); 
	     System.out.println(N[4]);
	     System.out.println(N[11]);
	
	
	
	
	
	
	}

}
