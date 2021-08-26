package ejercicios.ordenamiento.taller;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer dia de clases
		//L1 profesor nos da nuestro numero lista
		
		Estudiante danilo = new Estudiante("Danilo","Alvarracin");
		danilo.setNumeroLista(1);
		danilo.setEdad(20);
		
		// ingrese al menu
		//selecciona la opcion
		
		danilo.setNombre("Pepito");
		
		
		Estudiante danilo1= new Estudiante();
		danilo1.setNombre("Danilo");
		danilo1.setNumeroLista(1);
		danilo1.setApellido("Alvarracin");
		danilo1.setEdad(20);
		System.out.println("Danilo");
		System.out.println(danilo1);
		
		
		Estudiante andres= new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);
		andres.setApellido("Asitimbay");
		andres.setEdad(21);
		System.out.println("Andres");
		System.out.println(andres);
		
		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(21);
		alex.setApellido("Perez");
		alex.setEdad(25);
		System.out.println("Alex");
		System.out.println(alex);
		
		Estudiante stefany= new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		stefany.setApellido("Cruz");
		stefany.setEdad(18);
		System.out.println("Stefany");
		System.out.println(stefany);
		
		Estudiante jonny= new Estudiante();
		jonny.setNombre("Jonny");
		jonny.setNumeroLista(21);
		jonny.setApellido("Ninabanda");
		jonny.setEdad(28);
		System.out.println("Jonny");
		System.out.println(jonny);
		
		// Alex dame tu numero de lista 
		
		System.out.println("Inge soy el : "+ alex.getnumeroLista());
		System.out.println("Inge soy el : "+ jonny.getnumeroLista());
		
		System.out.println("Cambiemosle la edad a Pepito");
		danilo.setEdad(1);
		
		Estudiante listaEstudiante[]=new Estudiante[5];
		listaEstudiante[0]= danilo1;
		listaEstudiante[1]= andres;
		listaEstudiante[2]= alex;
		listaEstudiante[3]= stefany;
		listaEstudiante[4]= jonny;
		
		
		//Vector antes de ordanar
		
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiante));
		
		//Aqui ordeno la lista
		Arrays.sort(listaEstudiante);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiante));
		
	}

}
