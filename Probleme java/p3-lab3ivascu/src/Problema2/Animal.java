package Problema2;

public abstract class Animal {
	
	int varsta;
	String nume;
	Mediu mediu;
	/**
	 * 
	 */
	public Animal() {
		super();
	}
	/**
	 * @param varsta
	 * @param nume
	 * @param mediu
	 */
	public Animal(int varsta, String nume, Mediu mediu) {
		super();
		this.varsta = varsta;
		this.nume = nume;
		this.mediu = mediu;
	}
	
	

}
