package calseAlumno;

public class Alumno {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	

	//metodo constructor
	public Alumno(int años,String nom, String ape) {
		nombre = nom;
		apellido = ape;
		edad = años;
		
	}
	public void Mostrar() {
		System.out.println("El alumno se llama: " + nombre);
		System.out.println("con apellido :" + apellido);
		System.out.println("Tiene : " +edad+ " años");
	}
}