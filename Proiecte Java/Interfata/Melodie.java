
public class Melodie {

	
	String titlu, interpret;
	int durata;
	
	public Melodie(String titlu, String interpret, int durata) {
		super();
		this.titlu = titlu;
		this.interpret = interpret;
		this.durata = durata;
	}
	public String getTitlu() {
		return titlu;
	}
	public String getInterpret() {
		return interpret;
	}
	public int getDurata() {
		return durata;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	
	
	
}
