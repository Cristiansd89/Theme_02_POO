package claseString;


import java.util.Scanner;
public class ClaseString {
	
	//Atributos
	String cadena;
	int longitud;
	int Posicion;
	
	
	
	public ClaseString (String cadena) {
		this.cadena = cadena;
	}
	
	
	public ClaseString () {
		this.cadena ="Hola Mundo";
	}
	
	
	public String getCadena() {
		return cadena;
	}
	
	
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public String PideCadena() {
		Scanner ent = new Scanner(System.in);
		System.out.println("introduce una cadena:");
		cadena = ent.nextLine();
		
		return this.cadena;
	}
	
	
	public void LongitudCadena() {
		this.longitud = cadena.length();
		System.out.println("La cadena tiene una longitud de :" +longitud);
	}
	
	
	public void MostrarCadena() {
		System.out.println(cadena);
	}
	
	
	public void posicionChar () {
		this.Posicion = cadena.charAt(3);
		System.out.println("El caracter que esta en 4º posicion es : " +Posicion );
		
	}

}
