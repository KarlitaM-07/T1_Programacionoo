package ejercicio.interfaces;

public class CajeroProdubanco implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese codigo de tarjeta");
		
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Ingresar clave");
		System.out.println("Validar clave");
		
		
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el tipo de transaccion");
		System.out.println("Realizar transaccion");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el monto deseado");
		System.out.println("Confirmar Monto deseado");
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		System.out.println(" se valida el Saldo");
		double Saldo=100;
		
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Entregar Dinero");
		
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Realizar la transaccion");
		
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Imprimir recibo");
		
	}

}