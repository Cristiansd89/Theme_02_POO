package Cuentas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaCorrienteConIn extends CCuenta {
	//Atributos 
		protected int transacciones;//Almacena el numero de transaccione efectuadas en esta cuenta
		protected double importePorTrans;//importe que la entidad cobrara a por cada transaccion
		protected int transExentas;//numero de transacciones  gratuitas

	
	public CCuentaCorrienteConIn(String nombreCuenta,String numCuenta,double saldo,double TipoInteres,int transacciones,double importePorTrans,int transExentas){
	
		super(nombreCuenta,numCuenta,saldo,TipoInteres);
		this.transacciones = 0;
		this.importePorTrans = importePorTrans;
		this.transExentas = transExentas;
	}
	public CCuentaCorrienteConIn(){
		
		
	}

	public int getTransacciones() {
		return transacciones;
	}


	public void setTransacciones(int transacciones) {
		this.transacciones = transacciones;
	}


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
	@Override
	public double interes() {

		//para crear el objeto calendario
		GregorianCalendar Cobrofecha = new GregorianCalendar();
		int dia = Cobrofecha.get(Calendar.DAY_OF_MONTH);
		double InteresGenerado = 0;
		dia = 1;
		if(dia == 1) 
		{
			if (saldo > 30000) 
			{
				InteresGenerado += TipoInteres * saldo/100;
				saldo =  saldo + InteresGenerado;
			/*}else {
				return saldo;
			}*/
			}
		}
		return saldo;
	}
	@Override
	public void comisiones() {
		// TODO Auto-generated method stub
		
	}
	
}
