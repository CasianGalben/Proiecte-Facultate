 package lab4;

public class Avion {
	protected String producator;
	protected String cod;
	protected int nr_zboruri;
	protected int capacitate_combustibil;
	public Avion(String producator, String cod, int nr_zboruri, int capacitate_combustibil) {
		this.producator = producator;
		this.cod = cod;
		this.nr_zboruri = nr_zboruri;
		this.capacitate_combustibil = capacitate_combustibil;
	}
	public Avion() {
		super();
	}
	/**
	 * @return the capacitate_combustibil
	 */
	public int getCapacitate_combustibil() {
		return capacitate_combustibil;
	}
	
	

}
