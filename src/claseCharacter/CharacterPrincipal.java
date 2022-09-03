package claseCharacter;

import java.io.IOException;

public class CharacterPrincipal {

	public static void main(String[] args) throws IOException {
		ClaseCharacter caracter = new ClaseCharacter('A');
		
		caracter.MostrarCharacter();
		caracter.PedirCharacter();
		caracter.MostrarCharacter();
		caracter.AnalizaCharacter();
		
		
	}

}
