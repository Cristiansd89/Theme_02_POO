package Persona;

public class personaConcreta {

	public static void main(String[] args) {
		TipoPersona juan = new TipoPersona();
		juan.setedad(20);
		juan.setNombre("juan Carlos");
		System.out.println("Esta persona  se llama "+juan.getNombre()+ " y tiene " +juan.getedad());
		 
	}

}
