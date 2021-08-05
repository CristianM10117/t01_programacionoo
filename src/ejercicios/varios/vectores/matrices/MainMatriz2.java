package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = new int [5][5]; 
	   
	   for(int i = 0; i < 5; i++) {
	   for (int j = 0; j < 5; j++) {
		   if(i == j) {
			   A[i][j] = 1; 
			   
		   }else {
			   A[i][j] = 0;
		   }
		  System.out.print(A[i][j]+" ");
	   }
	   System.out.println(" ");
	   }
	}

}
