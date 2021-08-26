package tarea.ordenamiento.gpf;

public class Personal  implements Comparable <Personal>{
	
		private String Nombre;
		private String Apellido;
		private int edad;
		private int salario;
		
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
		
		//edad
		public int getEdad() {
			return edad;
			
		}
		public void setEdad(int edad){
			this.edad=edad;
			
		}
		
		//salario
		public int getSalario() {
			return salario;
		}
		
		public void setSalario(int salario) {
			this.salario=salario;
			
		}
		
		public int compareTo1 (Personal o) {
			// 3 posibles retornos
			// 0
			//1
			if(this.salario>o.getSalario()) {
				return 1;	
			}else if (this.salario==o.getSalario()) {
				return 0;
				
			}else {
				return -1;
			}	
		}
		
		@Override
		public int compareTo(Personal o) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public String toString() {
			return "Personal [Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", salario=" + salario
					+ "]";
		}
	}
