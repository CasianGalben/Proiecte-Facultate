/**
 * 
 */

/**
 * @author Razvan
 *
 */
public class Actor {   
     
	public Actor(String nume, String prenume, int anNastere, String scoala) {                 
		this.nume = nume;
		this.prenume = prenume;
		this.anNastere = anNastere;
		this.scoala = scoala;
	}

	public Actor() {}

	/**
	 * @return tip de date String
	 */
	public String getNume() {
		return nume;
	}
	/**
	 * @param nume Valoare de tip String
	 * Seteaza o valoare pentru nume
	 */
	public void setNume(String nume) {
		this.nume = nume;
	}
	/**
	 * @return the prenume
	 */
	public String getPrenume() {
		return prenume;
	}
	/**
	 * @param prenume the prenume to set
	 */
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	@Override
	public String toString() {
		return "Actor [nume=" + nume + ", prenume=" + prenume + ", anNastere=" + anNastere + ", scoala=" + scoala + "]";
	}

	/**
	 * @param args
	 */
	private String nume;
	private String prenume;
	int anNastere;
	public String scoala="FARA SCOALA";
	/**
	 * @param nume
	 * @param prenume
	 * @param anNastere
	 */
	public Actor(String nume, String prenume, int anNastere) {
		this.nume = nume;
		this.prenume = prenume;
		this.anNastere = anNastere;
	}

	/**
	 * @return the scoala
	 */
	public String getScoala() {
		return scoala;
	}

	/**
	 * @param scoala the scoala to set
	 */
	public void setScoala(String scoala) {
		this.scoala = scoala;
	}
	
	


}
