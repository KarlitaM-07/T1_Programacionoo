package tarea.ordenamiento.gpf;

import java.util.Arrays;

public class MainPersonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//
		
		
		Personal jose= new Personal();
		jose.setNombre("Jose");
		jose.setApellido("Chipantasi");
		jose.setEdad(41);
		jose.setSalario(1500);
		System.out.println("Jose");
		System.out.println(jose);
			
		Personal marco= new Personal();
		marco.setNombre("Marco");
		marco.setApellido("Torres");
		marco.setEdad(44);
		marco.setSalario(1250);
		System.out.println("Marco");
		System.out.println(marco);
		
		Personal anibal = new Personal();
		anibal.setNombre("Anibal");
		anibal.setApellido("Paz");
		anibal.setEdad(42);
		anibal.setSalario(1325);
		System.out.println("Anibal");
		System.out.println(anibal);
		
		Personal jorge = new Personal();
		jorge.setNombre("Jorge");
		jorge.setApellido("Correa");
		jorge.setEdad(48);
		jorge.setSalario(1255);
		System.out.println("Jorge");
		System.out.println(jorge);
		
		Personal xavier= new Personal();
		xavier.setNombre("Xavier");
		xavier.setApellido("Andrade");
		xavier.setEdad(49);
		xavier.setSalario(1508);
		System.out.println("Xavier");
		System.out.println(xavier);
		
		Personal patricio= new Personal();
		patricio.setNombre("Patricio");
		patricio.setApellido("Soria");
		patricio.setEdad(42);
		patricio.setSalario(1220);
		System.out.println("Patricio");
		System.out.println(patricio);
			
		Personal william= new Personal();
		william.setNombre("William");
		william.setApellido("Nuñez");
		william.setEdad(47);
		william.setSalario(2000);
		System.out.println("William");
		System.out.println(william);
		
		Personal henry= new Personal();
		henry.setNombre("Henry");
		henry.setApellido("Salguero");
		henry.setEdad(44);
		henry.setSalario(1345);
		System.out.println("Henry");
		System.out.println(henry);
			
		Personal carlos= new Personal();
		carlos.setNombre("Carlos");
		carlos.setApellido("Tapa");
		carlos.setEdad(40);
		carlos.setSalario(1555);
		System.out.println("Carlos");
		System.out.println(carlos);
		
		Personal antonio= new Personal();
		antonio.setNombre("Antonio");
		antonio.setApellido("Sucre");
		antonio.setEdad(43);
		antonio.setSalario(2200);
		System.out.println("Antonio");
		System.out.println(antonio);
		
		
		
		// Alex dame tu numero de lista 
		
		System.out.println("Jefe mi salario es : "+ jose.getSalario());
		System.out.println("Jefe mi salario es : "+ marco.getSalario());
		
		
		Personal salario[]=new Personal[10];
		salario[0]= jose;
		salario[1]= marco;
		salario[2]= anibal;
		salario[3]= jorge;
		salario[4]= xavier;
		salario[5]= patricio;
		salario[6]= william;
		salario[7]= henry;
		salario[8]= carlos;
		salario[9]= antonio;
		
		//Vector antes de ordanar
		
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(salario));
		
		//Aqui ordeno la lista
		Arrays.sort(salario);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(salario));
		
	}

	}
