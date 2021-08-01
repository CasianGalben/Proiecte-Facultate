import java.util.Arrays;

/**
 * 
 */

/**
 * @author Razvan
 *
 */
public class TestActor {
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor [] tablou = new Actor[5];
		creare(tablou);
		afisare(tablou);
		numarare(tablou);
		String val="Popescu";
		nume(tablou,val);
		
		
		
	}
	
	static void creare(Actor [] tablou) {
		Actor a=new Actor("Popescu","Ion",1900,"Timisoara");
		tablou[0]=a;
		tablou[1]=new Actor("Mihai","Ion",1923,"Iasi");
		tablou[2]=new Actor("Gheorghe","Ion",1900);
		tablou[3]=new Actor("George","Ion",1900);
		tablou[4]=new Actor("Gheorghe","Ion",1900,"Timisoara");
	}
	
	static void afisare(Actor [] tablou) {
		System.out.println("------");
		System.out.println(Arrays.toString(tablou));
		System.out.println("------");
		for(Actor e: tablou) 	
			System.out.println(e);
		System.out.println("------");
		Arrays.stream(tablou).forEach(System.out::println);
	}
	
	static void numarare(Actor [] tablou)
	{
		int contor=0;
		for(Actor e: tablou) 
			if(e.getScoala().equals("FARA SCOALA"))
				contor++;
		System.out.println(contor);
		
	}
	static void nume(Actor [] tablou,String val) {
		System.out.println("------");
		for(Actor e: tablou)
			if(e.getNume().startsWith(val) || e.getNume().equals(val))
				System.out.println(e.getNume());

	}

}
