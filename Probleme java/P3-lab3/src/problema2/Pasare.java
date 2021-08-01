package problema2;

public abstract class Pasare extends Animal {
	
	protected int viteza;
	
	public Pasare(int varsta,String nume,Mediu mediu,int viteza) {
		
		super(varsta,mediu,nume);
		this.viteza=viteza;
	}

}
