package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar un vector [3] de tipo char y construya un programa que pida 
		// usuario que 
		// Ingrese los valors para cada posicion 
		
		
		char X[]=new char[3];
		 for (int i =0; i < 3; i++ ) {
			 System.out.println("Ingrese el valor de la posicion:  "+i);
			 
			 
			 Scanner lector = new Scanner(System.in);
			 char n =lector.next().charAt(0);
			 
			 X[i]=n;
			 
			 
		 }
		 for(int i=0; i <3; i++);
		 
		 System.out.println(X);
		 
		 
		
		
		

		


	}

}
