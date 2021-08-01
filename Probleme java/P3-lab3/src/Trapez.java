
public class Trapez extends Figura {
	int baza_mare;
	int baza_mica;
	int inaltime;
	
	public Trapez(int baza_mare, int baza_mica, int inaltime,boolean culoare) {
		//super();
		
		this.baza_mare = baza_mare;
		this.baza_mica = baza_mica;
		this.inaltime = inaltime;
		this.culoare=culoare;
	}

	@Override
	public double perimetru() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public double arie() {
		// TODO Auto-generated method stub
		
		return ((baza_mare+baza_mica)/2)*inaltime;
	}

	@Override
	public String toString() {
		return "Trapez [baza_mare=" + baza_mare + ", baza_mica=" + baza_mica + ", inaltime=" + inaltime + ", culoare="
				+ culoare + "]";
	}
	
	
	
	

}
