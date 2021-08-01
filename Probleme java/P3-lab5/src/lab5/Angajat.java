package lab5;

public class Angajat extends Persoana{
	float salariu;

	public Angajat(String nume, String prenume, String studiiAbs, int anul_nasterii, float salariu) {
		super(nume, prenume, studiiAbs, anul_nasterii);
		this.salariu = salariu;
	}
	 public Angajat()
	 {
		 super();
	 }

}
