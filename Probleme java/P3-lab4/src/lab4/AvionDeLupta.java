package lab4;

public class AvionDeLupta extends Avion{
	private int capacitate_arme;
	private boolean camuflaj;
	
	public AvionDeLupta(String producator, String cod, int nr_zboruri, int capacitate_combustibil, int capacitate_arme,
			boolean camuflaj) {
		super(producator, cod, nr_zboruri, capacitate_combustibil);
		this.capacitate_arme = capacitate_arme;
		this.camuflaj = camuflaj;
	}

	@Override
	public String toString() {
		return "AvionDeLupta [capacitate_arme=" + capacitate_arme + ", camuflaj=" + camuflaj + ", producator="
				+ producator + ", cod=" + cod + ", nr_zboruri=" + nr_zboruri + ", capacitate_combustibil="
				+ capacitate_combustibil + "]";
	}

	public AvionDeLupta(String producator, String cod, int nr_zboruri, int capacitate_combustibil) {
		super(producator, cod, nr_zboruri, capacitate_combustibil);
	}
	
	
	

}
