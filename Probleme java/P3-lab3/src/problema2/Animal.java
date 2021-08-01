package problema2;

public abstract class Animal {
	
	protected int varsta;
	protected String nume;
	Mediu mediu;
	
	public Animal(int varsta, String nume, Mediu mediu) {
		super();
		this.varsta = varsta;
		this.nume = nume;
		this.mediu = mediu;
	}

	public Animal() {
		super();
	}
}
