package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Desarrollar un programa que imprima la siguiente imagen (excel)
		
		Scanner lector = new Scanner (System.in);
		
		char K[][]= new char [5][5];
		for (int fila = 0;fila < 5; fila ++) {
			for (int columna= 0;columna <5; columna++) {
				if(fila==columna) {
					
				}
				System.out.println("el valor fila: "+ fila +"y columna: " + columna+ "es:"+K[fila][columna]);
		
				char n =lector.next().charAt(0);
				K[fila][columna]=n;
				
	}
}
	}
}

