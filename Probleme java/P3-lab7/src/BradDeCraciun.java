
import java.io.Serializable;

public class BradDeCraciun implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
   private double pret;
   private String tip;
   private int inaltime;
   
   private transient double tranzient;

public BradDeCraciun(double pret, String tip, int inaltime) {
	super();
	this.pret = pret;
	this.tip = tip;
	this.inaltime = inaltime;
	tranzient = pret-(pret*10)/100;
}

public BradDeCraciun() {
	super();
}

public String toString() {
	return "BradDeCraciun [pret=" + pret + ", tip=" + tip + ", inaltime=" + inaltime + ", tranzient=" + tranzient + "]";
}




   
   
   
   
	

}
