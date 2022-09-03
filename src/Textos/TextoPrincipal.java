package Textos;



public class TextoPrincipal {

	public static void main(String[] args) {
		Texto t1= new Texto(5);
		
		t1.addPrincipio("Ho");
		t1.addPrincipio(';');
		t1.add("LA");
		t1.add('X');//este caracter no cabe en e texto. Nose añade.
		
		t1.Mostrar();
		System.out.println("Numero de vocales : " + t1.numVocales());

	}

}
