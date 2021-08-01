package problema2;

public abstract class Mamifer extends Animal{
	protected int nr_copii;
	
	public Mamifer(int varsta, String nume, Mediu mediu, int nr_copii2) {
		super(varsta,nume,mediu);
		//this.varsta = varsta;
		//this.nume = nume;
		//this.mediu = mediu;
		this.nr_copii=nr_copii;
	}

}
