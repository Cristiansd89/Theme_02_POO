package Vehiculos;

public class Camion  extends Vehiculo
{
	private int LimCarga;
	
	
	public Camion(int ruedas, int autonomia, int LimCarga)
	{
		super(ruedas, autonomia);
		this.LimCarga = LimCarga;
		
	}


	public int getLimCarga() {
		return LimCarga;
	}


	public void setLimCarga(int LimCarga) {
		this.LimCarga = LimCarga;
	}
	
	
	public void verDatos() {
		super.verDatos();
		System.out.println("Limite de carga : " +LimCarga );
	}
}
