package reserva.de.viajes;

public class AdolescentesAsientos {
	
	private String Nombre;
	private String Apellido;
	private String Deporte;
	
	public AdolescentesAsientos(String Nombre, String Apellido, String Deporte) {
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.Deporte=Deporte;
		
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDeporte() {
		return Deporte;
	}
	public void setDeporte(String deporte) {
		Deporte = deporte;
	}
	

}
