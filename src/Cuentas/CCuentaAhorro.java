package Cuentas;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaAhorro extends CCuenta {
	
	//Atributos
	private double cuotaMantenimiento;
	
	
	public CCuentaAhorro(String nombreCuenta,String numCuenta,double saldo,double TipoInteres,double cuotaMantenimiento){
		super(nombreCuenta,numCuenta,saldo,TipoInteres);
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	@Override
	public void comisiones() {
		
		/// asi intanciamos el objeto fecha
		//para crear el objeto calendirio
		GregorianCalendar Cobrofecha = new GregorianCalendar();
		int dia = Cobrofecha.get(Calendar.DAY_OF_MONTH);
		
		if(dia  == 1) {
			cuotaMantenimiento += cuotaMantenimiento;
			
		}else {
			cuotaMantenimiento += 0;
		}
	}
	//Este metodo esta mal una cosa es el tipo de interes y otra los intereses generados
	@Override
	public double interes() {
		
		double InteresGenerado = 0;
		//para crear el objeto calendario
		GregorianCalendar Cobrofecha = new GregorianCalendar();
		int dia = Cobrofecha.get(Calendar.DAY_OF_MONTH);
		dia = 1;
		if(dia == 1)  {
			InteresGenerado += TipoInteres * saldo/100;
			saldo =  saldo + InteresGenerado;
		}else {
			InteresGenerado = 0;
		}
		return saldo;
	}

}
