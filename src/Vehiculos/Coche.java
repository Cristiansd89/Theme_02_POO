package Vehiculos;

public class Coche extends Vehiculo
{
	private int pasajeros;
	
	public Coche (int ruedas, int autonomia, int pasajeros) {
		super(ruedas, autonomia);
		this.pasajeros = pasajeros;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	public void verDatos() {
		//Reutilizamos el codigo de vehiculo
		super.verDatos();//si se llamaran diferentes no nos haria falta super
		System.out.println("Pasajeros : " +pasajeros);
		
	}
}
