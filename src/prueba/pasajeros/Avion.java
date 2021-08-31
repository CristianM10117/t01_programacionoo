package prueba.pasajeros;
import java.util.Scanner; 
public class Avion {
	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		int i, i1, j, j1; 
		
		PasajeroAdolescente Cristian = new PasajeroAdolescente(); 
		Cristian.setNombre("Cristian");
		Cristian.setApellido("Chulca");
		Cristian.setDeportePractica("Fútbol");
		
		PasajeroAdolescente Maria = new PasajeroAdolescente(); 
		Maria.setNombre("Maria");
		Maria.setApellido("Benavides");
		Maria.setDeportePractica("Basket");
		
		PasajeroAdolescente Franklin = new PasajeroAdolescente(); 
		Franklin.setNombre("Franklin");
		Franklin.setApellido("Espinoza");
		Franklin.setDeportePractica("Basket");
		
		PasajeroAdolescente Jose = new PasajeroAdolescente(); 
		Jose.setNombre("Jose");
		Jose.setApellido("Montero");
		Jose.setDeportePractica("Voley");
		
		PasajeroAdolescente Vicente = new PasajeroAdolescente(); 
		Vicente.setNombre("Vicente");
		Vicente.setApellido("Llanos");
		Vicente.setDeportePractica("No practica");
		
		PasajeroAdolescente Patricia = new PasajeroAdolescente(); 
		Patricia.setNombre("Patricia");
		Patricia.setApellido("Arcos");
		Patricia.setDeportePractica("Futbol");
		
		PasajeroAdolescente Blanca = new PasajeroAdolescente(); 
		Blanca.setNombre("Blanca");
		Blanca.setApellido("Gomez");
		Blanca.setDeportePractica("No practica");
		
		PasajeroAdolescente Sofia = new PasajeroAdolescente(); 
		Sofia.setNombre("Sofia");
		Sofia.setApellido("Andrade");
		Sofia.setDeportePractica("altetismo");
		
		PasajeroAdolescente Martin = new PasajeroAdolescente(); 
		Martin.setNombre("Martin");
		Martin.setApellido("Robayo");
		Martin.setDeportePractica("Boxeo");
		
		PasajeroAdulto Juan = new PasajeroAdulto(); 
		Juan.setNombre("Juan");
		Juan.setApellido("Quilsaimba");
        Juan.setCodigoSS("12345");
        Juan.setEmpresaTrabajo("Coca Cola");
        
        PasajeroAdulto Margarita = new PasajeroAdulto(); 
        Margarita.setNombre("Margarita");
        Margarita.setApellido("Luje");
        Margarita.setCodigoSS("42764");
        Margarita.setEmpresaTrabajo("Marcimex");
        
        PasajeroAdulto Pablo = new PasajeroAdulto(); 
        Pablo.setNombre("Pablo");
        Pablo.setApellido("Tasiguano");
        Pablo.setCodigoSS("23848");
        Pablo.setEmpresaTrabajo("Banco Guayaquil");
        
        PasajeroAdulto Lupe = new PasajeroAdulto(); 
        Lupe.setNombre("Lupe");
        Lupe.setApellido("Casame");
        Lupe.setCodigoSS("23217");
        Lupe.setEmpresaTrabajo("Banco Pichincha");
        
        PasajeroAdulto Kevin = new PasajeroAdulto(); 
        Kevin.setNombre("Kevin");
        Kevin.setApellido("Montatixe");
        Kevin.setCodigoSS("45678");
        Kevin.setEmpresaTrabajo("Confiteca");
        
        PasajeroAdulto Dayana = new PasajeroAdulto(); 
        Dayana.setNombre("Dayana");
        Dayana.setApellido("Aldas");
        Dayana.setCodigoSS("34562");
        Dayana.setEmpresaTrabajo("Bodega Aloag");
        
        PasajeroAdulto Andrea = new PasajeroAdulto(); 
        Andrea.setNombre("Andrea");
        Andrea.setApellido("Tipan");
        Andrea.setCodigoSS("10293");
        Andrea.setEmpresaTrabajo("Pepsi");
        
        PasajeroAdulto Melany = new PasajeroAdulto(); 
        Melany.setNombre("Melany");
        Melany.setApellido("Caiza");
        Melany.setCodigoSS("32847");
        Melany.setEmpresaTrabajo("Big Cola");
        
        PasajeroAdulto Oswaldo = new PasajeroAdulto(); 
        Oswaldo.setNombre("Oswaldo");
        Oswaldo.setApellido("Quinatoa");
        Oswaldo.setCodigoSS("67953");
        Oswaldo.setEmpresaTrabajo("Farmacia Cruz Verde");
        
        PasajeroAdulto Wladimir = new PasajeroAdulto(); 
        Wladimir.setNombre("Wladimir");
        Wladimir.setApellido("Gomez");
        Wladimir.setCodigoSS("54321");
        Wladimir.setEmpresaTrabajo("Aerolineas Tu Hogar");
        
        
        Pasajeros avion[][] = new Pasajeros[3][4]; 
        
        avion[0][0] = Juan; 
        avion[0][1] = Margarita; 
        avion[0][2] = Pablo;
        avion[0][3] = Lupe;
        avion[0][4] = Kevin;
        avion[3][0] = Dayana;
        avion[3][1] = Andrea;
        avion[3][2] = Melany;
        avion[3][3] = Oswaldo;
        avion[3][1] = Wladimir;
        avion[1][0] = Cristian; 
        avion[1][1] = Maria; 
        avion[1][2] = Franklin;
        avion[1][3] = Jose; 
        avion[1][4] = Vicente; 
        avion[2][0] = Patricia;
        avion[2][1] = Blanca;
        avion[2][2] = Sofia; 
        avion[2][3] = Martin; 
        avion[2][4] = Juan; 


      for (j = 0; j <= 3; j++) {
    	  
    	  for(i = 0; i <= 4; i++) {   		  
    	  }
    	  System.out.println(avion[i][j]); 
    	  
    	  System.out.println("Ingrese posicion 1: ");
      }
		
		
	}
}
