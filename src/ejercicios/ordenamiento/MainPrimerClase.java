package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer dia de clases
		//L1 profesor nos da nuestro numero lista
		
		Estudiante danilo= new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		System.out.println("Danilo");
		System.out.println(danilo);
		
		
		Estudiante andres= new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);
		
		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		
		Estudiante stefany= new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		
		Estudiante jonny= new Estudiante();
		jonny.setNombre("Jonny");
		jonny.setNumeroLista(21);
		
		// Alex dame tu numero de lista 
		
		System.out.println("Inge soy el : "+ alex.getnumeroLista());
		System.out.println("Inge soy el : "+ jonny.getnumeroLista());
		
		
		Estudiante listaEstudiante[]=new Estudiante[5];
		listaEstudiante[0]= danilo;
		listaEstudiante[1]= andres;
		listaEstudiante[2]= alex;
		listaEstudiante[3]= stefany;
		listaEstudiante[4]= jonny;
		
		
		//Vector antes de ordanar
		
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiante));
		
		//Aqui ordeno la lista
		
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiante));
		
		
	}

}
