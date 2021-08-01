package lab5;

public class Student extends Persoana{
	int nr_semestre;

	public Student(String nume, String prenume, String studiiAbs, int anul_nasterii, int nr_semestre) {
		super(nume, prenume, studiiAbs, anul_nasterii);
		this.nr_semestre = nr_semestre;
	}
	public Student()
	{
		super();
	}

}
