package tablero.tarea;

import java.util.Scanner;

public class MainAjedres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada =new Scanner(System.in);
		
		String [][] tablero = new String [8][8];
		
		for (int i=0; i<8; i++) {
			
			for (int j = 0; j<8; j++) {
				tablero[i][j]="p";
				
			} int j = 0;
			if ((i==0||i==7) && (j==0||j==7)){
				tablero[i][j]="T";
				
			}else if ((i==1||i==6) && (j==0||j==7)){
				tablero [i][j]="C";
				
			}else if ((i==2||i==5) && (j==0||j==7)){
				tablero[i][j]="A";
				
			}else if ((i==3) && (j==0||j==7)){
				tablero[i][j]="D";
				
			}else if (i==4 && (j==0||j==7)) {
				tablero[i][j]="R";
			}
				
		}
		
	
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++)
			System.out.println(tablero[i][j]+ "\t");
		
		System.out.println();
		
	}
	}
}

