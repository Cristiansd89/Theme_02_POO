package Textos;

public class Texto {
	private String frase;
	private final int tamMax;
	static final String vocales = "aeiouáéíóúü";//cadena constante statica que contiene todas las posibles 
	//vocales minusculas
	
	public Texto(int tamMax) 
	{
		frase = "";/*frase referencia a un objeto String  con valor "", no se puede utilizar frase = null,
		en este caso frase no referencia a niungun objeto  y no es posile utilizar sus metodos*/
		this.tamMax = tamMax;//tamaño maximo permitido para el texto
	}
	public void add (char c) 
	{
		if ( tamMax > frase.length()) 
		{//si tamaño maximo es mayor que la longuitiud de la frase 
			frase = frase + c; //concatena el caracte al final
		}
	}
	public void add(String c) {
		if (tamMax >= frase.length() + c.length()) {
			//añade una cadena  al final del texto, siempre y cuando quede sitio
			frase = frase + c;
		}
	}
	public void addPrincipio(char c) {

		if ( tamMax > frase.length()) {
			frase = c + frase;
		}
		
	}
	public void addPrincipio(String c) {
		if (tamMax >= frase.length() + c.length()) {//añade siempre una cadena al princioio siempre y cuando quede sitio
			//añade una cadena  al final del texto, siempre y cuando quede sitio
			frase = c + frase;
		}
	}
	public void Mostrar () {
		System.out.println(frase);
		
	}
	//devuelve el numero de vocales en el texto 
	
	public int numVocales() {
		int voc = 0; // numero de vocales en el texto
		for (int i = 0;i < frase.length();i++) {
			if (esVocal(frase.charAt(i))) {
				voc++;
			}
				
		}return voc;
	}//comprueba si el carácter introducido es una vocal: mayuscula / minuscula / acentuada
	private  boolean esVocal(char c) {
		boolean vocal = false;
		
		c = Character.toLowerCase(c); //convertimos el caracter en minuscula
		if (vocales.indexOf(c) != -1) {//buscamos el caracter (en minuscula ) entre todas las posibles vocales
			vocal = true;
		}
		return (vocal);
	}
}
