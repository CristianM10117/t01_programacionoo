package tablero.de.ajedrez;

public class Reina extends PiezaAjedrez {

String NombreColor;
	
	public String getNombreColor() {
	return NombreColor;
}

public void setNombreColor(String nombreColor) {
	NombreColor = nombreColor;
}
public String toString() {
	return NombreColor;
}

}
