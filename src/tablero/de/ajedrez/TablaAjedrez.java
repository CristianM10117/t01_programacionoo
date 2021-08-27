package tablero.de.ajedrez;

public class TablaAjedrez {

	public static void main(String[] args) {
			 
			 System.out.println("TABLA DE AJEDREZ. ");
			 
			 Rey reynegro = new Rey();
			 reynegro.setNombreColor("Rey Negro");
			 Rey reyblanco = new Rey();   
			 reyblanco.setNombreColor("Rey Blanco.");
			 
			 Reina reinanegro = new Reina();
			 reinanegro.setNombreColor("Reina Negro");
			 Reina reinablanco = new Reina();   
			 reinablanco.setNombreColor("Reina Blanco."); 
			 
			 Torre torre1 = new Torre(); 
			 torre1.setNombreColor("Torre Negra 1");
			 Torre torre2 = new Torre(); 
			 torre2.setNombreColor("Torre Negra 2");
			 Torre torre3 = new Torre(); 
			 torre3.setNombreColor("Torre Blanca 1");
			 Torre torre4 = new Torre(); 
			 torre4.setNombreColor("Torre Blanca 2");
			 
			 Alfil alfil1 = new Alfil(); 
			 alfil1.setNombreColor("Alfil Negro 1");
			 Alfil alfil2 = new Alfil(); 
			 alfil2.setNombreColor("Alfil Negro 2");
			 Alfil alfil3 = new Alfil(); 
			 alfil3.setNombreColor("Alfil Blanco 1");
			 Alfil alfil4 = new Alfil(); 
			 alfil4.setNombreColor("Alfil Blanco 2");
			 
			 Caballo caballo1 = new Caballo(); 
			 caballo1.setNombreColor("Caballo Negro 1");
			 Caballo caballo2 = new Caballo(); 
			 caballo2.setNombreColor("Caballo Negro 2");
			 Caballo caballo3 = new Caballo(); 
			 caballo3.setNombreColor("Caballo Blanco 1");
			 Caballo caballo4 = new Caballo(); 
			 caballo4.setNombreColor("Caballo Blanco 2");
			 
			 Peon peon1 = new Peon(); 
			 peon1.setNombreColor("Peon Negro 1");
			 Peon peon2 = new Peon(); 
			 peon2.setNombreColor("Peon Negro 2");
			 Peon peon3 = new Peon(); 
			 peon3.setNombreColor("Peon Negro 3");
			 Peon peon4 = new Peon(); 
			 peon4.setNombreColor("Peon Negro 4");
			 Peon peon5 = new Peon(); 
			 peon5.setNombreColor("Peon Negro 5");
			 Peon peon6 = new Peon(); 
			 peon6.setNombreColor("Peon Negro 6");
			 Peon peon7 = new Peon(); 
			 peon7.setNombreColor("Peon Negro 7");
			 Peon peon8 = new Peon(); 
			 peon8.setNombreColor("Peon Negro 8");
			 Peon peon9 = new Peon(); 
			 peon9.setNombreColor("Peon Blanco 1");
			 Peon peon10 = new Peon(); 
			 peon10.setNombreColor("Peon Blanco 2");
			 Peon peon11 = new Peon(); 
			 peon11.setNombreColor("Peon Blanco 3");
			 Peon peon12 = new Peon(); 
			 peon12.setNombreColor("Peon Blanco 4");
			 Peon peon13 = new Peon(); 
			 peon13.setNombreColor("Peon Blanco 5");
			 Peon peon14 = new Peon(); 
			 peon14.setNombreColor("Peon Blanco 6");
			 Peon peon15 = new Peon(); 
			 peon15.setNombreColor("Peon Blanco 7");
			 Peon peon16 = new Peon(); 
			 peon16.setNombreColor("Peon Blanco 8");
			
			 
			 
			 PiezaAjedrez TableroAjedrez[][] = new PiezaAjedrez [8][8]; 
			 
			 TableroAjedrez[0][0] = torre1;
			 TableroAjedrez[0][1] = caballo1;
			 TableroAjedrez[0][2] = alfil1;
			 TableroAjedrez[0][3] = reinanegro;
			 TableroAjedrez[0][4] = reynegro;
			 TableroAjedrez[0][5] = alfil2;
			 TableroAjedrez[0][6] = caballo2;
			 TableroAjedrez[0][7] = torre2;
			 TableroAjedrez[1][0] = peon1;
			 TableroAjedrez[1][1] = peon2;
			 TableroAjedrez[1][2] = peon3;
			 TableroAjedrez[1][3] = peon4;
			 TableroAjedrez[1][4] = peon5;
			 TableroAjedrez[1][5] = peon6;
			 TableroAjedrez[1][6] = peon7;
			 TableroAjedrez[1][7] = peon8;
			 TableroAjedrez[7][0] = torre3;
			 TableroAjedrez[7][1] = caballo3;
			 TableroAjedrez[7][2] = alfil3;
			 TableroAjedrez[7][3] = reinablanco;
			 TableroAjedrez[7][4] = reyblanco;
			 TableroAjedrez[7][5] = alfil4;
			 TableroAjedrez[7][6] = caballo4;
			 TableroAjedrez[7][7] = torre4;
			 TableroAjedrez[6][0] = peon9;
			 TableroAjedrez[6][1] = peon10;
			 TableroAjedrez[6][2] = peon11;
			 TableroAjedrez[6][3] = peon12;
			 TableroAjedrez[6][4] = peon13;
			 TableroAjedrez[6][5] = peon14;
			 TableroAjedrez[6][6] = peon15;
			 TableroAjedrez[6][7] = peon16;
			 
			 System.out.println("Posicion de la matriz [0][0] = " + TableroAjedrez[0][0] );
			 System.out.println("Posicion de la matriz [0][1] = " + TableroAjedrez[0][1] );
			 System.out.println("Posicion de la matriz [0][2] = " + TableroAjedrez[0][2] );
			 System.out.println("Posicion de la matriz [0][3] = " + TableroAjedrez[0][3] );
			 System.out.println("Posicion de la matriz [0][4] = " + TableroAjedrez[0][4] );
			 System.out.println("Posicion de la matriz [0][5] = " + TableroAjedrez[0][5] );
			 System.out.println("Posicion de la matriz [0][6] = " + TableroAjedrez[0][6] );
			 System.out.println("Posicion de la matriz [0][7] = " + TableroAjedrez[0][7] );
			 System.out.println("Posicion de la matriz [1][0] = " + TableroAjedrez[1][0] );
			 System.out.println("Posicion de la matriz [1][1] = " + TableroAjedrez[1][1] );
			 System.out.println("Posicion de la matriz [1][2] = " + TableroAjedrez[1][2] );
			 System.out.println("Posicion de la matriz [1][3] = " + TableroAjedrez[1][3] );
			 System.out.println("Posicion de la matriz [1][4] = " + TableroAjedrez[1][4] );
			 System.out.println("Posicion de la matriz [1][5] = " + TableroAjedrez[1][5] );
			 System.out.println("Posicion de la matriz [1][6] = " + TableroAjedrez[1][6] );
			 System.out.println("Posicion de la matriz [1][7] = " + TableroAjedrez[1][7] );
			 System.out.println("Posicion de la matriz [7][0] = " + TableroAjedrez[7][0] );
			 System.out.println("Posicion de la matriz [7][1] = " + TableroAjedrez[7][1] );
			 System.out.println("Posicion de la matriz [7][2] = " + TableroAjedrez[7][2] );
			 System.out.println("Posicion de la matriz [7][3] = " + TableroAjedrez[7][3] );
			 System.out.println("Posicion de la matriz [7][4] = " + TableroAjedrez[7][4] );
			 System.out.println("Posicion de la matriz [7][5] = " + TableroAjedrez[7][5] );
			 System.out.println("Posicion de la matriz [7][6] = " + TableroAjedrez[7][6] );
			 System.out.println("Posicion de la matriz [7][7] = " + TableroAjedrez[7][7] );
			 System.out.println("Posicion de la matriz [6][0] = " + TableroAjedrez[6][0] );
			 System.out.println("Posicion de la matriz [6][1] = " + TableroAjedrez[6][1] );
			 System.out.println("Posicion de la matriz [6][2] = " + TableroAjedrez[6][2] );
			 System.out.println("Posicion de la matriz [6][3] = " + TableroAjedrez[6][3] );
			 System.out.println("Posicion de la matriz [6][4] = " + TableroAjedrez[6][4] );
			 System.out.println("Posicion de la matriz [6][5] = " + TableroAjedrez[6][5] );
			 System.out.println("Posicion de la matriz [6][6] = " + TableroAjedrez[6][6] );
			 System.out.println("Posicion de la matriz [6][7] = " + TableroAjedrez[6][7] );

 
              












			
			}
	
 		
		
		 
		
	}
	

