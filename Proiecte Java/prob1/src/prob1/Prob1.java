package prob1;

public abstract class TitlusiNumar{

	private String titlu;
	private Integer numar;
}
	
	
	
	
	
	public class sectiune extends TitlusiNumar{
	
	}
	
	
	public class Capitole extends TitlusiNumar{
	
	private String rezumat;
	private Collection<Sectiune> sectiui= new linkedList<>();
	
	gett sett pt rezumat 
	
	
	public void addSectiune(Sectiune sectiune)
	{ sectiuni.add(sectiune);
	}
	
	gett sectiune
	
	}
	
	public class parti extends TitlusiNumar{
	
	private Collection<Capitol> capitole= new linkedList<>();
	
	get capitole
	
	public void addCapitol(Capitol capitol){
	capitol.add(capitol);
	
	}
	
	public class Carte{
	private String editor;
	private Date fataPublice;
	private string ISBM
	
	
	gett si set pt toate
	
	
	
	public void addParte(Parte parte)
	{ parti.add(parte);
	}
	
	
