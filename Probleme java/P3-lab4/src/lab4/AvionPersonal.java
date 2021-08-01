package lab4;

import java.util.Arrays;

public class AvionPersonal extends Avion implements LuxuryOptions {
	
	private String proprietar;
	private String[] fosti_proprietari;
	private boolean castiAnz;
	private boolean tv;
	
	public AvionPersonal() {
		super();
	}

	public AvionPersonal(String producator, String cod, int nr_zboruri, int capacitate_combustibil, String proprietar,
			String[] fosti_proprietari,boolean castiAnz,boolean tv) {
		super(producator, cod, nr_zboruri, capacitate_combustibil);
		this.proprietar = proprietar;
		this.fosti_proprietari = fosti_proprietari;
		this.castiAnz=castiAnz;
		this.tv=tv;
	}

	@Override
	public String toString() {
		return "AvionPersonal [proprietar=" + proprietar + ", fosti_proprietari=" + Arrays.toString(fosti_proprietari)
				+ ", castiAnz=" + castiAnz + ", tv=" + tv + ", producator=" + producator + ", cod=" + cod
				+ ", nr_zboruri=" + nr_zboruri + ", capacitate_combustibil=" + capacitate_combustibil + "]";
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

	/**
	 * @return the fosti_proprietari
	 */
	public String[] getFosti_proprietari() {
		return fosti_proprietari;
	}

	
	

}
