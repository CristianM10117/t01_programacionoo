package prueba.uno;

public class PasajeroVip extends Pasajero{
	
	private String codigoMembresia;

	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	@Override
	public String toString() {
		return "PasajeroVip [codigoMembresia=" + codigoMembresia + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + "]";
	}


	} 

