package Trabajo.Grupal;

import java.util.Scanner;

public class MainCalcularEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leer = new Scanner(System.in); 
int ab, ab1; 
int dia, mes, año; 
int dt, mt, at; 

System.out.println("Ingrese Día de nacimiento: ");
 int dn = leer.nextInt();
 System.out.println("Ingrese Mes de nacimiento: ");
 int mn = leer.nextInt();
 System.out.println("Ingrese Año de nacimiento: ");
 int an = leer.nextInt();

if (mn == 1) {
 
if(dn >= 1 && dn <= 31) {
	if(an < 2021) {
	System.out.println("Fecha VALIDA.");	
				

}else {
	System.out.println("Fecha NO valida.");
}
}
}

if (mn == 2) {
	ab = an%4; 
  if(ab == 0) {
	  if(dn >= 1 && dn <= 29) {
		  if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
}else if(ab != 0) {
if(dn >= 1 && dn <= 28) {
System.out.println("Fecha VALIDA.");
}else {
System.out.println("Fecha NO valida.");
}

}
}
}
}
if (mn == 3) {
	 
	if(dn >= 1 && dn <= 31) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}	
if (mn == 4) {
	 
	if(dn >= 1 && dn <= 30) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}

if (mn == 5) {
	 
	if(dn >= 1 && dn <= 31) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}
if (mn == 6) {
	 
	if(dn >= 1 && dn <= 30) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
		
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}
if (mn == 7) {
	 
	if(dn >= 1 && dn <= 31) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}
if (mn == 8) {
	 
	if(dn >= 1 && dn <= 31) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}
if (mn == 9) {
	 
	if(dn >= 1 && dn <= 30) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}

if (mn == 10) {
	 
	if(dn >= 1 && dn <= 31) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}
if (mn == 11) {
	 
	if(dn >= 1 && dn <= 30) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}
if (mn == 12) {
	 
	if(dn >= 1 && dn <= 31) {
		if(an < 2021) {
		System.out.println("Fecha VALIDA.");	
	
	}else {
		System.out.println("Fecha NO valida.");
}
	}
}
System.out.println("Ingrese Día actual: ");
 int da = leer.nextInt();
 System.out.println("Ingrese Mes actual: ");
 int ma = leer.nextInt();
 System.out.println("Ingrese Año actual ");
 int aa = leer.nextInt();
 
 if (ma == 1) {
	 
		if(da >= 1 && da <= 31) {
			if(aa == 2021) {
			System.out.println("Fecha VALIDA.");	
						
		
		}else {
			System.out.println("Fecha NO valida.");
	}
		}
	}
	
		if (ma == 2) {
			ab1 = an%4; 
		  if(ab1 == 0) {
			  if(da >= 1 && da <= 29) {
				  if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
	}else if(ab1 != 0) {
		if(da >= 1 && da <= 28) {
		System.out.println("Fecha VALIDA.");
	}else {
		System.out.println("Fecha NO valida.");
	}

	}
	}
	}
		}
		if (ma == 3) {
			 
			if(da >= 1 && da <= 31) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}	
		if (ma == 4) {
			 
			if(da >= 1 && da <= 30) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
	
		if (ma == 5) {
			 
			if(da >= 1 && da <= 31) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
		if (ma == 6) {
			 
			if(da >= 1 && da <= 30) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
				
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
		if (ma == 7) {
			 
			if(da >= 1 && da <= 31) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
		if (ma == 8) {
			 
			if(da >= 1 && da <= 31) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
		if (ma == 9) {
			 
			if(da >= 1 && da <= 30) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
	
		if (ma == 10) {
			 
			if(da >= 1 && da <= 31) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
		if (ma == 11) {
			 
			if(da >= 1 && da <= 30) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
		if (ma == 12) {
			 
			if(da >= 1 && da <= 31) {
				if(aa == 2021) {
				System.out.println("Fecha VALIDA.");	
			
			}else {
				System.out.println("Fecha NO valida.");
		}
			}
		}
		if(da>=dn && ma>=mn && aa>=an){
		    dt=da-dn;
		 mt=ma-mn;
		  at=aa-an;
		  System.out.println("Su edad es: " +dt+ " dias  "  +mt+ " meses " +at+ " años ");
}else if(da<dn && ma<mn && aa>=an) {
	da=da+31;
	dt=da-dn;
	mt=13+ma-mn;
	mt=mt-2;
	at=aa-an-1;
	System.out.println("Su edad es: " +dt+ " dias  "  +mt+ " meses " +at+ " años ");
}else if(da<dn && ma>=mn && aa>=an) {
	da=da+29;
	dt=da-dn;
	mt=ma-mn;
	at = aa - an; 
	System.out.println("Su edad es: " +dt+ " dias  "  +mt+ " meses " +at+ " años ");
	}else if(da>dn && ma<mn && aa>=an) {
		dt= da-dn;
		mt=13 + ma-mn;
		mt=mt-1;	
		at=aa-an-1;
		System.out.println("Su edad es: " +dt+ " dias  "  +mt+ " meses " +at+ " años ");
		}
	}

}