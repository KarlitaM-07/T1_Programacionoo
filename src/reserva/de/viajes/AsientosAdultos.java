package reserva.de.viajes;

public class AsientosAdultos {

	private String Nombre;
	private String Apellido;
	private int CSS;
	private String EmpresaT;
	
	
	public AsientosAdultos (String Nombre, String Apellido, int CSS, String EmpresaT) {
		this.Nombre=Nombre;
		this.setApellido(Apellido);
		this.setCSS(CSS);
		this.setEmpresaT(EmpresaT);
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre() {
		this.Nombre=Nombre;
		
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getCSS() {
		return CSS;
	}
	public void setCSS(int cSS) {
		CSS = cSS;
	}
	public String getEmpresaT() {
		return EmpresaT;
	}
	public void setEmpresaT(String empresaT) {
		EmpresaT = empresaT;
	}
	
	


}
