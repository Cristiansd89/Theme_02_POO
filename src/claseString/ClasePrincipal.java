package claseString;

import java.util.Scanner;
public class ClasePrincipal {

	public static void main(String[] args) {
		///Objeto de la clase String
		ClaseString C1= new ClaseString();
		//Metodos pedidos en el ejercicio
		C1.MostrarCadena();
		C1.LongitudCadena();
		C1.posicionChar();
		
		String S1 = "Hola mundo";
		String S2 = "Hola mundo";
		String S3 = "holamundo";
		
		
		///Primera Comparacion
		
		System.out.println("");	
		System.out.println("------Primera Comparacion-------------");	
		if(S1.equals(S2)) {
			System.out.println("Son iguales.");
		}else {
			System.out.println("Son Diferentes");
		}
		
		
		
		System.out.println("");	
		System.out.println("------Segunda Comparacion-------------");
		
		////Segunda Comparacion
		if (S1.equalsIgnoreCase(S2)) {
			System.out.println(S1 + " y " + S2 + " son IGUALES");
		}else {
			System.out.println(S1 + " y " + S2 + " son DIFERENTES");
		}
		if (S1.equalsIgnoreCase(S3)) {
			System.out.println(S1 + " y " + S3 + " son IGUALES");
		}else {
			System.out.println(S1 + " y " + S3 + " son DIFERENTES");
	
		
		///comparacion Lexica
			
		System.out.println("");	
		System.out.println("------Tercera Comparacion-------------");
		
		}if(S1.compareTo(S2) == 0) {
			System.out.println("S1 y S2 son iguales.");
		}
		else if(S1.compareTo(S2) > 0){
			System.out.println(S1 + " alfabeticamente va después de " + S2);
		}
		else {
			System.out.println(S2 + " alfabeticamente va después de " + S1);
		}
		
		//Visualiza la primera posicion del caracter "u"
		System.out.println("");	
		System.out.println("El carater se encuentra en la posicion");
		System.out.println(S1.indexOf('u'));
		
		
		///Sustituye el carácter ‘o’ por ‘e’ en S2.
		System.out.println("");	
		S2 = S2.replace('o', 'e');
		System.out.println(S2);
		
		/*Declara una variable Num de tipo String, inicia un double con 5.6, transforma el
		double en una cadena almacenando su contenido en Num. Visualiza Num.*/
		System.out.println("");	
		
		double numero = 5.6;
		String num = String.valueOf(numero);
		System.out.println(num);
		
		
		
		/*Pide por teclado una cadena. Visualiza su contenido. A continuación visualiza el
		mensaje “Cadena invertida” junto con la cadena invertida utiliza para ello los métodos
		aprendidos.*/
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduzca la cadena:");
		String S4 = ent.nextLine();
		System.out.println(S4);
		System.out.println("Cadena invertida: ");
		
		for(int i = S4.length(); i > 0; i--) {
			System.out.print(S4.charAt(i-1));
		
		}
	}
}
