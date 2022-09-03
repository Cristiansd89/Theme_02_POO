package Bombillas;

public class Bombilla {
	
	//atributos
	private  static boolean interruptorGeneral = true;
	private boolean interruptor;
	
	//Constructor
	public Bombilla () {
		interruptor = false;
		
	}
	//metodos
	public boolean encender() {
		interruptor = true;
		
		return interruptor;
	}
	public boolean apagar () {
		interruptor = false;
		
		return interruptor;
	}
	public void setGeneral(boolean interruptorGeneral) {
		this.interruptorGeneral =interruptorGeneral;
	}
	public boolean getGeneral() {
		return interruptorGeneral;
	}
	public boolean estado() {
		boolean estado;
		if (interruptorGeneral == true && interruptor == true) 
			//si el interriptor de la bombilla  está activado y hay luz general
		{
			estado = true;
			
		}
		else 
		{
			estado = false;
		}
		return (estado);
		
	}
	//devuelve una cadena con el estado de la bombilla
	public String muestraEstado() {
		String estado;
		if (estado() == true) {
			estado = "Encendida";
		}else {
			estado ="Apagada";
		}
		return (estado);
	}

}
