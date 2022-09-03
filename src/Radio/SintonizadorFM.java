package Radio;

public class SintonizadorFM {
	
	//Atributos
	private double frecuencia;
	
	//constructor
	public SintonizadorFM() 
	{
		frecuencia = 80;//Frecuencia inicial
		/*otra forma de invocar al constructor que permite asignar una frecuencia.
		 * La siguiente instruccion debe ser la primera  en el constructor actual:
		 * this(80);
		 */
	}
	//2º constructor
	public SintonizadorFM(double frecuenciaInicial) 
	{//este construcctor permite asignar una frecuencia inicial
		if (frecuenciaInicial <  80 ) 
		{
			frecuencia = 80;
		}
		else if (frecuenciaInicial >108)
		{
			frecuencia = 108;
		
		}
		else 
		{
			frecuencia = frecuenciaInicial;
		}
	}
	public double bajar() 
	{
		frecuencia = frecuencia - 0.5;
		comprobarRango();
		
		return frecuencia;
	}
	public double subir() 
	{
		frecuencia = frecuencia + 0.5;
		comprobarRango();
		
		return frecuencia;
	
	}
	public void Mostrar() 
	{
		System.out.println("Sintonizado : " +frecuencia + "MHz");
		
	}
	private void comprobarRango() 
	{
		if (frecuencia < 80) 
		{
			frecuencia = 108;
		}
		else if(frecuencia > 108)
		{
			frecuencia = 80;
		}
	}
}
