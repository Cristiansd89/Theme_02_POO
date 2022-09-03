package Cuentas;

public abstract class CCuenta {
	//Atributos
	protected String nombreCuenta;
	protected String numCuenta;
	public double saldo;
	protected double TipoInteres;
	
	public CCuenta(String nombreCuenta,String numCuenta,double saldo,double TipoInteres) {
		this.nombreCuenta = nombreCuenta;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.TipoInteres = TipoInteres;
		
	
	}
	public CCuenta() {
		this.nombreCuenta = "se desconoce";
		this.numCuenta = "se desconoce";
		this.saldo = saldo;
		this.TipoInteres = TipoInteres;
	}

	public void setnombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}
	public  String getnombreCuenta () {
		return nombreCuenta;
	}
	public void setnumCuenta (String numCuenta) {
		this.numCuenta = numCuenta;
		
	}
	public String getnumCuenta() {
		return numCuenta;
		
	}
	
	public void setSaldo() {
		this.saldo = saldo;
		
	}
	public double getSaldo(){
		return saldo;
		
	}
	

	
	public double getTipoInteres() {
		return TipoInteres;
	}
	public void setTipoInteres(double TipoInteres) {
		this.TipoInteres = TipoInteres;
	}
	//Metodos funcionales
	public double ingreso(double cantidad) {
		return saldo = saldo + cantidad;
	}
	public double reintegro (double cantidad) {
		return saldo = saldo - cantidad;
	}
	
	
		//Este el el metodo abstracto o general que se va utilizar en las demas subclases
	public abstract void comisiones() ;
		
	public abstract double interes();//Calcula los interes producidos
}
