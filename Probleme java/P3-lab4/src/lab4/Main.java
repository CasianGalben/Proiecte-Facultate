package lab4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
	public static void main(String[] args)
	{
		List<Avion> lista = new ArrayList<Avion>();
	    creare(lista);
	    afisare(lista);
	    dictionar(lista);
	    avioane_casti(lista);
	    avioane_proprietari(lista);
		
	}
	
	static void creare(List<Avion> lista) {
		lista.add(new AvionDeLupta("Boeing","747", 2000, 30000, 100,true));
		lista.add(new AvionPersonal("Wizz","748",3000,2000, "John",new String[] {"Dani,Darius"},true,false));
		lista.add(new AvionDeLinie("Boeing","765",43,200,60,true,false));
		lista.add(new AvionPersonal("AirBus","452",2010,4500,"John",new String[] {"Ionel","Andrei","Gicu"},true,true));
	}
	
	static void afisare(List<Avion> lista)
	{
		for(Avion a: lista)
			System.out.println(a);
	}
	
	static void dictionar(List<Avion> lista)
	{
		Map<String,Integer> map =new HashMap<String,Integer>();
		for(Avion a: lista) {
			if(map.containsKey(a.getClass().getSimpleName())==true)
				map.put(a.getClass().getSimpleName(),map.get(a.getClass().getSimpleName())+1);
			
			else
				map.put(a.getClass().getSimpleName(), 1);
		}
		for(Map.Entry<String,Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
	}
		
	}
	
	static void avioane_casti(List<Avion> lista)
	{
		for(Avion a : lista) {
		
			if( a instanceof LuxuryOptions) {
				
				if(((LuxuryOptions)a).castiAnz()==true) 
				 System.out.println(a); 
		
	} }
	
	}
	
	static void avioane_proprietari(List<Avion> lista)
	{   System.out.println("Avioane cu cei mai multi proprietari");
		int maxim=0;
	    for(Avion a : lista) 
		if(a instanceof AvionPersonal) 
		    
			if(((AvionPersonal) a).getFosti_proprietari().length>maxim)
             maxim=((AvionPersonal)a).getFosti_proprietari().length;
	 
		for(Avion a : lista) {
			if(a instanceof AvionPersonal) 
			    
				if(((AvionPersonal) a).getFosti_proprietari().length==maxim)
                 System.out.println(a);
			
		}
	}
	static void combustibil_mediu(List<Avion> lista)
	{
		Map<String,List<Integer>> map = new HashMap<String,List<Integer>>();
		for(Avion a: lista) {
			if(map.containsKey(a.getClass().getSimpleName()))
				map.get(a.getClass().getSimpleName()).add(a.getCapacitate_combustibil());
			
			else {
				List<Integer> lst = new ArrayList<Integer>();
				lst.add(a.capacitate_combustibil);
			    map.put(a.getClass().getSimpleName(),lst);
			    
			}
			    
		}
	}
}


