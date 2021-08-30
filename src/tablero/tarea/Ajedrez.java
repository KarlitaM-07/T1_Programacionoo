package tablero.tarea;

public class Ajedrez {
	
	private String PeonRojo;
	private String PeonNegro;
	private String TorreRojo;
	private String TorreNegro;
	private String CaballoRojo;
	private String CaballoNegro;
	private String AlfilRojo;
	private String AlfilNegro;
	private String ReyRojo;
	private String ReyNegro;
	private String DamaRojo;
	private String DamaNegro;
	
	

	public Ajedrez() {
		
	}
	
	public void Peon(String PeonRojo,String TorreRojo, String CaballoRojo, String AlfilRojo, String ReyRojo, String DamaRojo) {
		this.PeonRojo=PeonRojo;
		this.TorreRojo=TorreRojo;
		this.CaballoRojo=CaballoRojo;
		this.AlfilRojo=AlfilRojo;
		this.setReyRojo(ReyRojo);
		this.DamaRojo=DamaRojo;
	}
	
	public String getPeon() {
		return PeonRojo;
	}
	public void setPeon(String PeonRojo) {
		this.PeonRojo=PeonRojo;
	}
	public String getTorre() {
		return TorreRojo;	
	}
	public void setTorre(String TorreRojo) {
		this.TorreRojo=TorreRojo;
	}
	public String getCaballo() {
		return CaballoRojo;	
	}
	public void setCaballo(String CaballoRojo) {
		this.CaballoRojo=CaballoRojo;
	}
	public String getAlfil() {
		return AlfilRojo;
	}
	public void setAlfil(String AlfilRojo) {
		this.AlfilRojo=AlfilRojo;
	}
	public String getReyRojo() {
		return ReyRojo;
	}

	public void setReyRojo(String reyRojo) {
		ReyRojo = reyRojo;
	}
	
	public String getDama() {
		return DamaRojo;
	}
	public void setDama(String DamaRojo) {
		this.DamaRojo=DamaRojo;
	}

	public String getPeonNegro() {
		return PeonNegro;
	}

	public void setPeonNegro(String peonNegro) {
		PeonNegro = peonNegro;
	}

	public String getTorreNegro() {
		return TorreNegro;
	}

	public void setTorreNegro(String torreNegro) {
		TorreNegro = torreNegro;
	}

	public String getCaballoNegro() {
		return CaballoNegro;
	}

	public void setCaballoNegro(String caballoNegro) {
		CaballoNegro = caballoNegro;
	}

	public String getAlfilNegro() {
		return AlfilNegro;
	}

	public void setAlfilNegro(String alfilNegro) {
		AlfilNegro = alfilNegro;
	}

	public String getReyNegro() {
		return ReyNegro;
	}

	public void setReyNegro(String reyNegro) {
		ReyNegro = reyNegro;
	}

	public String getDamaNegro() {
		return DamaNegro;
	}

	public void setDamaNegro(String damaNegro) {
		DamaNegro = damaNegro;
	}

	public void setPeonRojo() {
		// TODO Auto-generated method stub
		
	}

	public void setRey() {
		// TODO Auto-generated method stub
		
	}

	public void setPeonAzul() {
		// TODO Auto-generated method stub
		
	}
	}