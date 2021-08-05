package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declare una matriz [3,4] de tipo char y desarrolle un programa que vaya solicitando 
		// cada una de las posiciones 
		
		
		char A[][]= new char [3][4];
		for (int fila = 0;fila < 3; fila ++) {
			for (int columna= 0;columna <4; columna++) {
				System.out.println("el valor fila: "+ fila +"y columna: " + columna+ "es:"+A[fila][columna]);
				// el usuario digita el valor por teclado y a continuacion lo leo
				Scanner lector =new Scanner (System.in);
				char n =lector.next().charAt(0);
				A[fila][columna]=n;
				
			}
			
			
		
		}
		

	}

}
