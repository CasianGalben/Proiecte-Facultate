
public class Cerc extends Figura{
	private int raza;
	/**
	 * @param raza
	 */
	public Cerc(int r,boolean c) {
		raza=r;
		culoare=c;		
	}
	/**
	 * 
	 */
	public Cerc() {
		
	}

	@Override
	public String toString() {
		return "Cerc " + raza +" "+culoare;
	}

	@Override
	public double Arie() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raza*raza;
	}

	@Override
	public double Perimetru() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raza;
	}
	
}
