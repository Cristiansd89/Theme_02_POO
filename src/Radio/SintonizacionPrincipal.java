package Radio;

public class SintonizacionPrincipal {

	public static void main(String[] args) {
		Sintonizar radio1 = new Sintonizar(107);
		
		radio1.subir();	radio1.subir();	radio1.subir();	radio1.subir();
		radio1.Mostrar();
		
		////////////////////////////////////////
		Sintonizar radio2 = new Sintonizar(80.5);
		
		radio2.bajar(); radio2.bajar(); radio2.bajar();
		radio2.Mostrar();
		
		radio1 = new Sintonizar(200);
		radio1.Mostrar();
		
		
	}

}
