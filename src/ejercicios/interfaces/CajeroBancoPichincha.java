package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		System.out.println("Ingresar usuario de tarjeta. " +numero);
		
		
	}

	@Override
	public void solicitarClave(String clave) {
		System.out.println("Ingresar clave de tarjeta. " +clave);
		
	}

	@Override
	public void solicitarTipoTransaccion() {
		System.out.println("Ingresar tipo de transaccion. ");
		
	}

	@Override
	public void solicitarMonto(int monto) {
		System.out.println("Ingresar monto a pedir: " +monto);
		
	}

	@Override
	public void validarSaldo() {
		System.out.println("Validar saldo. ");
		System.out.println("revisar en la base de datos. ");
		System.out.println("Restar el saldo. ");
	}

	@Override
	public void enregarDinero() {
		System.out.println("recoja su dinero. " );
		
	}

	@Override
	public void realizarTransaccion() {
		System.out.println("Ingresar a quien va dirigido la transaccion. ");
		
	}

	@Override
	public void entregarRecibo() {
		System.out.println("Recoja su recibo. ");
		System.out.println("Gracias por preferirnos. ");
	}

}
