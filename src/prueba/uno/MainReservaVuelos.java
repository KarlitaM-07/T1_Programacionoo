package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese informacion de pasajero");
		System.out.println("Ingrese nombre");
		String nombre= teclado.nextLine();
		System.out.println("Ingrese apellido");
		String apellido= teclado.nextLine();
		System.out.println("Ingrese edad");
		int edad = teclado.nextInt();
		System.out.println("Que tipo de pasajero es:  1: Pasajero Vip  2: Pasajero Eco");
		int opcion = teclado.nextInt();
		
		String membresia = "";
		String descuento ="";
		if (opcion ==1)
		if (opcion ==1) {
			System.out.println("Ingrese codigo membresia");
			membresia = teclado.nextLine();
		}else {
			System.out.println("Ingrese Codigo Descuento");
			descuento=teclado.nextLine();
			
		}
		
		PasajeroVip pasajero1=new PasajeroVip("Andres", "torres","dfgdfg",30);
		pasajero1.setApellido("Teran");
		pasajero1.setNombre("daniel");
		pasajero1.setCodigoMembresia("as876dasg");
		pasajero1.setEdad(25);
		
		PasajeroVip pasajero2=new PasajeroVip("javier", "cruz","dfgdfg",30);
		
		PasajeroEconomico pasajeroEconomico1=new PasajeroEconomico();
		pasajero1.setApellido("Cayambe");
		pasajero1.setNombre("Edison");
		pasajero1.setCodigoMembresia("65jd");
		pasajero1.setEdad(34);
		
		PasajeroEconomico pasajeroEconomico2=new PasajeroEconomico();
		pasajero1.setApellido("Edison2");
		pasajero1.setNombre("Cayambe2");
		pasajero1.setCodigoMembresia("65jd");
		pasajero1.setEdad(34);
		
		Pasajero[][]asientos = new Pasajero [4][5];
		asientos [0][0]=pasajero1;
		asientos [0][1]=pasajero2;
		asientos [0][2]=pasajeroEconomico1;
		asientos [3][2]=pasajeroEconomico2;
		
		int opcionSalir= 0;
		
		
		do {
			System.out.println("Ingrese datos del asiento, 0 continuar, -1 SALTAR");
			opcionSalir= teclado.nextInt();
			if (opcionSalir ==0) {
				System.out.println("Ingrese fila de asiento");
				int fila = teclado.nextInt();
				System.out.println("Ingrese la columna del asiento ");
				int columna = teclado.nextInt();
				
				System.out.println("Los datos del pasajero son :");
				System.out.println(asientos [fila][columna]);
			}else if (opcionSalir== -1) {
				System.out.println("Va a salir del sistema");
			}
	
		}while (opcionSalir!=-1);	

	}

}
