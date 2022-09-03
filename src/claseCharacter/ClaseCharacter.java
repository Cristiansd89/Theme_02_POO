package claseCharacter;

import java.io.IOException;
import java.util.Scanner;


public class ClaseCharacter {
	
	//Atributos 
	char letra ;
	
	//Metodo Constructor
	public ClaseCharacter(char letra) {
		this.letra = letra;
		
		
	}
	
	public ClaseCharacter() {
		this.letra = 'z';
		
		
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	//Metodo para pedir un caracter
	public char PedirCharacter () throws IOException {
		Scanner ent = new Scanner (System.in);
		System.out.println("introduce Un Character nuevo:");
		letra = (char)System.in.read();
		
		return this.letra;
	}
	//Metdo para mostrar un caracter
	public void MostrarCharacter() {
		System.out.println("El Character introducido es: " +letra);
		
	}
	
	//Metodo para analizar El tipo De caracter intorducido
	public void AnalizaCharacter() {
		if(Character.isDigit(letra)) {
			System.out.println("El Character introducido es un numero");
		}else if (letra > 'A' && letra <'Z') {
			letra = Character.toLowerCase(letra);
			System.out.println("El Character introducido es una letra Mayuscula, asi seria en Minuscula:" +letra );
		}else if (letra > 'a' && letra <'z') {
			letra = Character.toUpperCase(letra);
			System.out.println("El Character introducido es una letra Minuscula,asi seria en Mayuscula: " +letra );
		
		}
	}
}
