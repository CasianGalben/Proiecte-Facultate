package problema2;

public class Caine extends Mamifer {
	public Caine(int varsta, String nume,Mediu mediu,int nr_copii)
	{
		super(varsta, nume, mediu,nr_copii);
		
	}

	@Override
	public String toString() {
		return "Caine [nr_copii=" + nr_copii + ", varsta=" + varsta + ", nume=" + nume + ", mediu=" + mediu + "]";
	}
	
   public boolean poateZbura() {
	   
	   return false;
   }
   public boolean poateInota()
   {
	   return true;
	   
   }
   
   public boolean poateCatara()
   {
	   return false;
	   
   }
}
