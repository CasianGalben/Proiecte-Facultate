
public class Dreptunghi extends Figura {
	
	int lungime;
	int latime;

	public double Arie() {
		return lungime*latime;
	}

	public double Perimetru() {
		
		return 2*(lungime+latime);
	}

	/**
	 * @param lungime
	 * @param latime
	 */
	public Dreptunghi(int lungime, int latime, boolean culoare) {
		super();
		this.lungime = lungime;
		this.latime = latime;
		this.culoare=culoare;
	}
	
   public Dreptunghi()
   {
	   super();
   }

@Override
public String toString() {
	return "Dreptunghi [lungime=" + lungime + ", latime=" + latime + ", culoare=" + culoare + "]";
}
	
}
