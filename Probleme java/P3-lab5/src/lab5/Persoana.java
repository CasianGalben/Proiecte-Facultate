package lab5;

public class Persoana {
	String nume;
	String prenume;
	String studiiAbs;
	int anul_nasterii;
	
	public Persoana(String nume, String prenume, String studiiAbs, int anul_nasterii) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.studiiAbs = studiiAbs;
		this.anul_nasterii = anul_nasterii;
	}

	public Persoana() {
		super();
	}

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", prenume=" + prenume + ", studiiAbs=" + studiiAbs + ", anul_nasterii="
				+ anul_nasterii + "]";
	}
	
	
	

	
}
