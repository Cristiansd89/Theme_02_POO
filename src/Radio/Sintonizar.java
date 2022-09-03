package Radio;

import java.util.Scanner;

public class Sintonizar 
{
	private final double frecuenciaMin = 80.0;
	private  final double frecuenciaMax = 108;
	private double frecuencia;

	
	public Sintonizar(double frecuencia) 
	{
		this.frecuencia = frecuencia;
		
		
	}
	public Sintonizar() 
	{
		this.frecuencia = 92;
		
	}
	
	public double subir() 
	{
		
			frecuencia = frecuencia + 0.5;
			comprobarFrec ();
			
			return frecuencia;
	}

	public double bajar() 
	{
		
		frecuencia = frecuencia - 0.5;
		comprobarFrec ();
			
		return frecuencia;
	}
	public void comprobarFrec () 
	{
		if (frecuencia < frecuenciaMin) 
		{
			frecuencia = frecuenciaMax;
		}else if (frecuencia > frecuenciaMax) 
		{
			frecuencia = frecuenciaMin;
		}
		
		
	}
	public void Mostrar() {
		System.out.println("Sintonizado : " +frecuencia + "MHz");
		
	}
}
