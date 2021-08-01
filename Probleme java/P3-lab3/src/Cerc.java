
public class Cerc extends Figura{
	
	int raza;

	public Cerc(int raza,boolean culoare) {
		//super();
		this.raza = raza;
		this.culoare=culoare;
		
	}
	
	public double perimetru()
	{
		return 2*Math.PI*raza;
		
	}
	
	public double arie()
	{
		return Math.PI*raza*raza;
	}

	@Override
	public String toString() {
		return "Cerc [raza=" + raza + ", culoare=" + culoare + "]";
	}
	

}
