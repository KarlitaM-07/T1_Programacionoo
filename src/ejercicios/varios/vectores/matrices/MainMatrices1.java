package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declare una matriz [3,4] de tipo char y desarrolle un programa que vaya solicitando 
		// cada una de las posiciones
		
		//Este es mi teclado
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingrese el numero de filas del vector ");
		// el usuario digita el numero de filas y yo debo leer desde el teclado 
		int longitudFila= lector.nextInt();
		
		System.out.println("Ingrese e numero de columnas del vector: ");
		//El usuario digita el numero de colunmas y yo debo leer desde teclado
		int longitudColumna= lector.nextInt();
		
		char A[][]= new char [longitudFila][longitudColumna];
		for (int fila = 0;fila < 3; fila ++) {
			for (int columna= 0;columna <4; columna++) {
				System.out.println("el valor fila: "+ fila +"y columna: " + columna+ "es:"+A[fila][columna]);
				// el usuario digita el valor por teclado y a continuacion lo leo
		
				char n =lector.next().charAt(0);
				A[fila][columna]=n;
				
			}	
		
		}
		for (int fila = 0;fila < longitudFila; fila ++) {
			for (int columna= 0;columna < longitudColumna; columna++) {
				System.out.println(A[fila][columna]+" ");
				System.out.println("el valor fila: "+ fila +"y columna: " + columna+ "es:"+ A[fila][columna]);
		
			}
			System.out.println();
		}
	}

}
