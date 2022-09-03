package Bombillas;

public class BombillaPrincipal {

	public static void main(String[] args) {
		Bombilla b1= new Bombilla();
		Bombilla b2= new Bombilla();
		
		b1.encender();
		b2.apagar();
		
		System.out.println("b1 " +b1.muestraEstado());
		System.out.println("b2 " +b2.muestraEstado());
		
		
		b1.setGeneral(false);// cortamos la luz
		
		System.out.println("\nActivamos la luz general");
		System.out.println("b1 " +b1.muestraEstado());
		System.out.println("b2 " +b2.muestraEstado());
		
		
		b2.setGeneral(true);// cortamos la luz
		
		System.out.println("\nActivamos la luz general");
		System.out.println("b1 " +b1.muestraEstado());
		System.out.println("b2 " +b2.muestraEstado());

	}

}
