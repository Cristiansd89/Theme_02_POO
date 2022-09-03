package Cuentas;

import java.io.IOException;

public class CuentaPrincipal {

	public static void main(String[] args)throws IOException {
				System.out.println("-----------------Primer Objeto-----------------------");
		///Primer objeto
		CCuentaAhorro cliente01 = new CCuentaAhorro(
				"Angel Lillo", "111/6666", 10000, 3.5, 30);
				System.out.println("Nombre de CCuentaAhorro: "+cliente01.getnombreCuenta());
				System.out.println("Numero de CCuentaAhorro: "+cliente01.getnumCuenta());
				System.out.println("Saldo de CCuentaAhorro: "+cliente01.getSaldo());
				System.out.println("Interes de CCuentaAhorro: "+cliente01.interes());
				cliente01.comisiones();
				System.out.println("Tipo Interes de CCuentaAhorro: " +cliente01.getTipoInteres());
				
				
				System.out.println("");
				System.out.println("----------------------Segundo Objeto-----------------");
				
				//Te queda revisar apartir del segundo objeto
				///Segundo objeto
				///como se crea un  constructor heredado son parametros preguntar a luis
				CCuentaCorrienteConIn cliente02 = new CCuentaCorrienteConIn();
				cliente02.setnombreCuenta("Ainhoa");
				cliente02.setnumCuenta("1234567890");
				
				cliente02.setTipoInteres(3.0);
				cliente02.setTransExentas(0);
				cliente02.setImportePorTrans(1.0);
				cliente02.ingreso(400000);
				cliente02.reintegro(10000);
				cliente02.interes();
				cliente02.comisiones();
				System.out.println("Nombre de CCuentaCorrienteConIn: "+cliente02.getnombreCuenta());
				System.out.println("Numero de CCuentaCorrienteConIn: "+cliente02.getnumCuenta());
				System.out.println("saldo de CCuentaCorrienteConIn: "+cliente02.getSaldo());
				System.out.println("Tipo Interes de CCuentaCorrienteConIn: "+cliente02.getTipoInteres());
				System.out.println("Interes de CCuentaCorrienteConIn: "+cliente02.interes());

				System.out.println("");
				System.out.println("----------------------Tercer Objeto-----------------");
				
				CCuentaCorriente Cliente03 = new CCuentaCorriente();
				Cliente03.setnombreCuenta("carlos");
				Cliente03.setnombreCuenta("Ainhoa");
				Cliente03.setnumCuenta("1234567890");
				Cliente03.setTipoInteres(3.0);
				Cliente03.setTransExentas(0);
				Cliente03.setImportePorTrans(1.0);
				Cliente03.ingreso(20000);
				Cliente03.reintegro(10000);
				Cliente03.interes();
				Cliente03.comisiones();
				System.out.println("Nombre de CCuentaCorrienteConIn: "+Cliente03.getnombreCuenta());
				System.out.println("Numero de CCuentaCorrienteConIn: "+Cliente03.getnumCuenta());
				System.out.println("saldo de CCuentaCorrienteConIn: "+Cliente03.getSaldo());
				System.out.println("Interes de CCuentaAhorro: "+Cliente03.interes());
				System.out.println("Tipo Interes de CCuentaAhorro: "+Cliente03.getTipoInteres());
	}

}
