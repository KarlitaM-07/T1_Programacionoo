package grupal;

import java.util.Arrays;
import java.util.Scanner;

public class MainMergeShort {

	public static void main(String[]args) {
		
		
		VectorProceso mergeSort = new VectorProceso();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la longitud del vector:");
		int N = teclado.nextInt();
		int X[] = new int[N];
		for (int i=0;i<N;i++) {
		System.out.println("Ingrese valor de la posicion: " + i);
		int M = teclado.nextInt();
		X[i]=M;
		}
		System.out.println("Los valores ingresados son: ");
		for (int i=0;i<N;i++) {
		System.out.print( X[i] + " | ");
		}
		System.out.println();


		System.out.println("Valores ordenados son: ");
		VectorProceso.sort(X,0,N-1);
		VectorProceso.printX(X);
		
		System.out.println(" Vector ordenado por Java ");
		Arrays.sort(X);
		System.out.println("El vector antes de ordenar: "+ Arrays.toString(X));
		
		System.out.println("El vector despues de ordenar: "+ Arrays.toString(X));
		}
		}
		