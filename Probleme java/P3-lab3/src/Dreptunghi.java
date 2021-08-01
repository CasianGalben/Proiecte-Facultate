
public class Dreptunghi extends Figura {
   
	int lungime;
    int latime;
    
    public Dreptunghi() {
		// TODO Auto-generated constructor stub
	}
    
    public Dreptunghi(int lungime,int latime,boolean culoare) {
		// TODO Auto-generated constructor stub
    	this.lungime=lungime;
    	this.latime=latime;
    	this.culoare=culoare;
    	
	}
    
    public double perimetru()
    {
    	return 2*(lungime+latime);
    }
    
    public double arie()
    {
    	return lungime*latime;
    }

	@Override
	public String toString() {
		return "Dreptunghi [lungime=" + lungime + ", latime=" + latime + ", culoare=" + culoare + "]";
	}
    
   
}
