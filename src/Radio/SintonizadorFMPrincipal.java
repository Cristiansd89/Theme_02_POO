package Radio;

public class SintonizadorFMPrincipal {

	public static void main(String[] args) {
		
		//primera radio subimos frecuencia
		SintonizadorFM radio = new SintonizadorFM(107);
		radio.subir(); radio.subir(); radio.subir(); radio.subir(); 
		radio.Mostrar();
		
		
		//segunda radio bajamos la frecuencia
		SintonizadorFM radio2 = new SintonizadorFM(80.5);
		radio2.bajar(); radio2.bajar(); radio2.bajar();
		radio2.Mostrar();
		
		
		//frecuencia fuera de rango
		radio = new SintonizadorFM(200);
		radio.Mostrar();
		
		

	}

}
