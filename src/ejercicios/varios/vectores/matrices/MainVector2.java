package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare un vector X[3] cuya longitud se solicita al usuario de tipo int y construya un programa que pida al 
		// usuario que 
		// ingrese los valores de cada posicion
		// y finalmente que se imprima todos los valores ingresados 
		
		
		
		Scanner lector = new Scanner (System.in);
		System.out.println("Ingrese el valor de la posicion: ");
		
		int n = lector.nextInt();
		int B[]=new  int [n];
		
		 for (int i =0; i < n; i++ ) {
			 System.out.println("Ingrese el valor de la posicion:  "+i);
			 n = lector.nextInt();
			 B[i]=n;
			 
			 
		 }
		 
		 // Recorriendo el vector lleno
		 for(int i=0; i <n; i++);
		 System.out.println("Ingrese el valor de la posicion:  "+ n);
		 
		 System.out.println(B[n]);
		 
		 

	}

}
