package tablero.tarea;

import java.util.Arrays;

public class MainAjedres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
	
		Ajedrez peonrojo= new Ajedrez();
		peonrojo.setPeonRojo();
		
		Ajedrez torrerojo= new Ajedrez();
		torrerojo.setTorre("Rojo");
		
		Ajedrez caballorojo= new Ajedrez();
		caballorojo.setCaballo("Rojo");
		
		Ajedrez alfilrojo= new Ajedrez();
		alfilrojo.setAlfil("Rojo");
		
		Ajedrez reyrojo= new Ajedrez();
		reyrojo.setRey();
		
		Ajedrez damarojo= new Ajedrez();
		damarojo.setDama("Rojo");
		
		Ajedrez peonazul= new Ajedrez();
		peonrojo.setPeonAzul();
		
		Ajedrez torreazul= new Ajedrez();
		torrerojo.setTorre("Azul");
		
		Ajedrez caballoazul= new Ajedrez();
		caballorojo.setCaballo("Rojo");
		
		Ajedrez alfilazul= new Ajedrez();
		alfilrojo.setAlfil("Azul");
		
		Ajedrez reyazul= new Ajedrez();
		reyrojo.setRey();
		
		Ajedrez damaazul= new Ajedrez();
		damarojo.setDama("Azul");
		
	
	Ajedrez tablero [][]=new Ajedrez[8][8];
	
		tablero [1][0]=peonrojo;
		tablero [1][1]=peonrojo;
		tablero [1][2]=peonrojo;
		tablero [1][3]=peonrojo;
		tablero [1][4]=peonrojo;
		tablero [1][5]=peonrojo;
		tablero [1][6]=peonrojo;
		tablero [1][7]=peonrojo;
		
		
		tablero [0][0]=torrerojo;
		tablero [0][1]=torrerojo;
		tablero [0][2]=caballorojo;
		tablero [0][3]=caballorojo;
		tablero [0][4]=reyrojo;
		tablero [0][5]=reyrojo;
		tablero [0][6]=damarojo;
		tablero [0][7]=damarojo;
		
		
		tablero [7][0]=torreazul;
		tablero [7][1]=torreazul;
		tablero [7][2]=caballoazul;
		tablero [7][3]=caballoazul;
		tablero [7][4]=reyazul;
		tablero [7][5]=reyazul;
		tablero [7][6]=damaazul;
		tablero [7][7]=damaazul;
		
		
		tablero [6][0]=peonazul;
		tablero [6][1]=peonazul;
		tablero [6][2]=peonazul;
		tablero [6][3]=peonazul;
		tablero [6][4]=peonazul;
		tablero [6][5]=peonazul;
		tablero [6][6]=peonazul;
		tablero [6][7]=peonazul;	 
	}
}



