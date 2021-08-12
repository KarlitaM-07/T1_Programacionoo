package ejercicio.metodos;

public class Matriculacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// deberia validar que paso el alumno 
		// deberia validar que no hay cruces de materias 
		// que exista profesores
		// Validaciones en genral de la matriculacion 
		// si tdo esta bien 
		// Deberia mandar a imprimir 
		
		
		impresion imprimir1=new impresion();// instancia la clase
		int numeroimpresion=imprimir1.imprimir("Matriculacion exitosa #123456", 8);	
		imprimir1.imprimir("Matriculacion exitosa #123456 17", 8);
		System.out.println(" Se imprime a matricula con numero de impresion:  "+ numeroimpresion);
		
		
		

	}

}
