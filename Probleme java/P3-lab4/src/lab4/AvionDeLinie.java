package lab4;

public class AvionDeLinie extends Avion implements LuxuryOptions{
	private int pasageri;
	private boolean castiAnz;
	private boolean tv;

	public AvionDeLinie(String producator, String cod, int nr_zboruri, int capacitate_combustibil, int pasageri,boolean castiAnz,boolean tv) {
		super(producator, cod, nr_zboruri, capacitate_combustibil);
		this.pasageri = pasageri;
		this.castiAnz=castiAnz;
		this.tv=tv;
	}

	public AvionDeLinie(String producator, String cod, int nr_zboruri, int capacitate_combustibil) {
		super(producator, cod, nr_zboruri, capacitate_combustibil);
	}

   

	@Override
	public String toString() {
		return "AvionDeLinie [pasageri=" + pasageri + ", castiAnz=" + castiAnz + ", tv=" + tv + ", producator="
				+ producator + ", cod=" + cod + ", nr_zboruri=" + nr_zboruri + ", capacitate_combustibil="
				+ capacitate_combustibil + "]";
	}

	@Override
	public boolean castiAnz() {
		// TODO Auto-generated method stub
		return castiAnz;
	}

	@Override
	public boolean tv() {
		// TODO Auto-generated method stub
		return tv;
	}
	
	
	
	
	
	

}
