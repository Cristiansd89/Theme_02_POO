package Cuentas;

import java.util.Scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaCorriente extends CCuenta {
	//Atributos 
	protected int transacciones;//Almacena el numero de transaccione efectuadas en esta cuenta
	protected double importePorTrans;//importe que la entidad cobrara a por cada transaccion
	protected int transExentas;//numero de transacciones  gratuitas
	
	//Metodo Constructor
	public CCuentaCorriente(String nombreCuenta,String numCuenta,double saldo,double TipoInteres,int transacciones,double importePorTrans,int transExentas)
	{
		super(nombreCuenta,numCuenta,saldo,TipoInteres);
		this.transacciones = 0;
		this.importePorTrans = importePorTrans;
		this.transExentas = transExentas;
		
	}
	public CCuentaCorriente(){
		
		
	}
		///Metodos gets
	public double getImportePorTrans() {
		return importePorTrans;
	}

	public void setImportePorTrans(double importePorTrans) {
		this.importePorTrans = importePorTrans;
	}

	public int getTransExentas() {
		return transExentas;
	}

	public void setTransExentas(int transExentas) {
		this.transExentas = transExentas;
	}
	
	public int decrementarTransacciones () {
		return transacciones = transacciones -1;
		
	}
	//si el saldo mas la cantidad es mayor al saldo quiere decir ha habido un ingreso
	//Entonces el numero de transacciones aumentara en uno
	@Override
	public double ingreso(double cantidad) {
		super.ingreso(cantidad);
		if((saldo + cantidad) > saldo) {
			transacciones ++; 
		}
		return saldo;
	}
	@Override
	public double reintegro(double cantidad) {
		super.reintegro(cantidad);
		return saldo;
	}
	
	/*public int transaccionesRealizadas(double cantidad) {
		
		if((saldo + cantidad) > saldo) {
			transacciones ++; 
		}
		return transacciones;
	}*/
	//si el numero de transacciones realizadas es mayor a 2 el banco cobrara una comision
	public double CantidadAcumulada(double cantidad) {
		if (transacciones < 2) {
			importePorTrans = 0;
		}else {
			importePorTrans +=  0.2 * cantidad/100;
		}
		return importePorTrans;
	}
	
	
	@Override
	public void comisiones() {
		
		/// asi intanciamos el objeto fecha
		//para crear el objeto calendirio
		GregorianCalendar Cobrofecha = new GregorianCalendar();
		System.out.println("Introduzca un dia del mes");
		int dia = Cobrofecha.get(Calendar.DAY_OF_MONTH);
		
		
		if(dia  == 1) {
			System.out.println("las comisiones acumuladas son : " +importePorTrans);
			importePorTrans = 0;
			}else{
				
			}
	}
	@Override
	public double interes() {
		
		double interesMensual = 0;
		//para crear el objeto calendirio
		GregorianCalendar Cobrofecha = new GregorianCalendar();
		int dia = Cobrofecha.get(Calendar.DAY_OF_MONTH);
		dia = 1;
		if (dia  == 1){
			if (saldo <= 300000) {
				interesMensual += TipoInteres * saldo/100;
				saldo =  saldo + interesMensual;
			}else {
				interesMensual = 0;
			}
		}
		return saldo;
	}
}