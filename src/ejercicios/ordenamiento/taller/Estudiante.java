package ejercicios.ordenamiento.taller;

public class Estudiante implements Comparable <Estudiante> {
	private String Nombre;
	private String Apellido;
	private int numeroLista;
	private int edad;
	
	
	// new Estudiante()
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre) {
		this.Nombre=nombre;
	}
	
	public Estudiante(String Nombre, String Apellido) {
		this.Nombre=Nombre;
		this.Apellido=Apellido;
	}
	public Estudiante(String Nombre, String Apellido, int numeroLista, int numeroEdad) {
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.numeroLista= numeroLista;
		this.edad=edad;
		
	}
		
	// ALT + SHIFT+rs
	
	// Get y SET
	
	public String getNombre() {
		return Nombre;
		
	}
	public void setNombre(String Nombre) {
		this.Nombre= Nombre;
		
	}
	
	public String getApellido() {
		return Apellido;
		
	}
	
	public void setApellido(String Apellido) {
		this.Apellido=Apellido;
	}
		
	
	public int getnumeroLista() {
		return numeroLista;
		
	}
	public void setNumeroLista(int numeroLista){
		this.numeroLista=numeroLista;
		
	}
	
	//edad
	public int getEdad() {
		return edad;
		
	}
	public void setEdad(int edad){
		this.edad=edad;
		
	}
	
	
	
	public int compareTo1 (Estudiante o) {
		// 3 posibles retornos
		// 0
		//1
		if(this.edad>o.getEdad()) {
			return 1;	
		}else if (this.edad==o.getEdad()) {
			return 0;
			
		}else {
			return -1;
		}
		
		
	}
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return 0;
		
	}
	@Override
	public String toString() {
		return "Estudiante [Nombre=" + Nombre + ", Apellido=" + Apellido + ", numeroLista=" + numeroLista + ", edad="
				+ edad + "]";
	}


}
