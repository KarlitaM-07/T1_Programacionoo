//1.Declaracion de un paquete
package ejercicio.metodos;

//2. Declaracion de importaciones

// 3. Comentarios
// Clase que se encargara de realizar una impresion en formato A4

//4. DECLARACION DE UNA CLASE
public class impresion {
	
	// 5.CONSTANTES
	//6. VARIABLES
	public String color;
	
	
	// 7.CONSTRUCTOR 
	public String  impresora;
	
	// 8. metodos 
	
	public int imprimir(String datosAimprimir, int letra ) {
		
		System.out.println("Logo UCE");
		System.out.println("------------");
		System.out.println(datosAimprimir);
		System.out.println("-----------");
		System.out.println("Pie de firma");
		return 7;
	}

}
