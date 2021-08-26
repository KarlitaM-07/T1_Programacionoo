package ejercicios.ordenamiento;

public class Estudiante implements Comparable <Estudiante> {
	private String Nombre;
	private int numeroLista;
	
	// ALT + SHIFT+rs
	
	// Get y SET
	
	public String getNombre() {
		return Nombre;
		
	}
	public void setNombre(String Nombre) {
		this.Nombre= Nombre;
		
	}
	public int getnumeroLista() {
		return numeroLista;
		
	}
	public void setNumeroLista(int numeroLista){
		this.numeroLista=numeroLista;
		
	}
	public int comparelo (Estudiante o) {
		// 3 posibles retornos
		// 0
		//1
		if(this.numeroLista>o.getnumeroLista()) {
			return 1;	
		}else if (this.numeroLista==o.getnumeroLista()) {
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
		return "Estudiante [Nombre=" + Nombre + ", numeroLista=" + numeroLista + "]";
	}
	

}
