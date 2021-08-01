package problema2;

public abstract class Reptila extends Animal {
    protected int nr_oua;
    
    public Reptila(int varsta, String nume, Mediu mediu,int nr_oua) {
		super(varsta,nume,mediu);
		//this.varsta = varsta;
		//this.nume = nume;
		//this.mediu = mediu;
		this.nr_oua=nr_oua;
	}
}
