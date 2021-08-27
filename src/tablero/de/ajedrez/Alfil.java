package tablero.de.ajedrez;

public class Alfil extends PiezaAjedrez{

String NombreColor;
	
	public String getNombreColor() {
	return NombreColor;
}

public void setNombreColor(String nombreColor) {
	NombreColor = nombreColor;
}

@Override
public String toString() {
	return  NombreColor ;
}



}



