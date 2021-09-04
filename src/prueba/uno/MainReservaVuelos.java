package prueba.uno;
import java.util.Scanner;
public class MainReservaVuelos {
	
	public static void main(String[] args) {
		Scanner Li = new Scanner(System.in); 
		Scanner Ls = new Scanner(System.in); 
		
		System.out.println("Ingrese informacion de pasajero");
		System.out.println("Ingrese Nombre");
		String nombre = Ls.nextLine(); 
		System.out.println("Ingrese Apellido");
		String apellido = Ls.nextLine();
		System.out.println("Ingrese Edad");
		int edad = Li.nextInt();
		System.out.println("Que tipo de pasajero es: 1:Pasajero Vip  2:Pasajero Eco");
		int op = Li.nextInt();
		
		String membresia = "";
		String descuento = "";
		
		if(op == 1) {
			System.out.println("Ingrese Codigo de Membresia");
			membresia = Ls.nextLine();
		}else { 
			
			System.out.println("Ingrese Codigo Descuento");
			descuento = Ls.nextLine(); 
		}
		
       PasajeroVip pasajero1 = new PasajeroVip(); 
       pasajero1.setNombre(nombre);
       pasajero1.setApellido(apellido);
       pasajero1.setCodigoMembresia(membresia);
       pasajero1.setEdad(edad);
       
       PasajeroVip pasajero2 = new PasajeroVip(); 
       pasajero2.setNombre("Daniela");
       pasajero2.setApellido("Guacapiña");
       pasajero2.setCodigoMembresia("23sd234");
       pasajero2.setEdad(21);
       
       PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico(); 
       pasajeroEconomico1.setNombre("Edison");
       pasajeroEconomico1.setApellido("Cayambe");
       pasajeroEconomico1.setCodigoDescuento("sdfsdf");
       pasajeroEconomico1.setEdad(25);
       
       PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico(); 
       pasajeroEconomico2.setNombre("Edison2");
       pasajeroEconomico2.setApellido("Cayambe2");
       pasajeroEconomico2.setCodigoDescuento("sdfsdf");
       pasajeroEconomico2.setEdad(25);
       
       Pasajero [][] asientos = new Pasajero[4][5];
       asientos[0][0] = pasajero1;
       asientos[0][1] = pasajero2;
       asientos[0][2] = pasajeroEconomico1;
       asientos[0][3] = pasajeroEconomico2;
	
       int os;
       do {
		System.out.println("Ingrese Datos del asiento, 0 CONTINUAR, -1 SALIR");	
		os = Li.nextInt();
		if(os == 0) {
		System.out.println("Ingrese Fila del asiento");
		int fila = Li.nextInt();
		System.out.println("Ingrese Columna del asiento");
		int columna = Li.nextInt(); 
		System.out.println("Los Datos del pasajero son: ");
		
		System.out.println(asientos[fila][columna]);
		}else if(os == -1){
			System.out.println("Va a salir del sistema");
			
		}
		
	}while(os != -1); 

}
}
