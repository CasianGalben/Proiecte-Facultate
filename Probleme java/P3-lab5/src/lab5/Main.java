package lab5;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Pereche<Persoana>> lista = new ArrayList<Pereche<Persoana>>();
		lista.add(new Pereche<Persoana>(new Persoana("abc","abc","liceu",1997),new Persoana("abc","abd","liceu",1997)));
		lista.add(new Pereche<Persoana>(new Persoana("abc","abc","liceu",1997),new Persoana("abc","abd","liceu",1997)));
	    for(Pereche<Persoana> i : lista)
	    	System.out.println(i);
	    
	    Comparator<Pereche<Persoana>> compara = new Comparator<Pereche<Persoana>>()
	    {

			@Override
			public int compare(Pereche<Persoana> o1, Pereche<Persoana> o2) {
				// TODO Auto-generated method stub
				if(o1.x.nume.equals(o2.x.nume))
					return o1.y.nume.compareTo(o2.y.nume) ;
				return o2.x.nume.compareTo(o2.x.nume);
			}   
	    	
	    };
	    Collections.sort(lista,compara);
	    
	    for(Pereche<Persoana> i : lista)
	    	System.out.println(i);
	    
	    Map<String,ArrayList<Persoana>> map = new HashMap<String,ArrayList<Persoana>>();
	    for(Pereche<Persoana> i : lista) {
	    	Persoana x=i.x;
	    	Persoana y=i.y;
	    	if(map.containsKey(x.studiiAbs))
	    		map.get(x.studiiAbs).add(x);
	    	else
	    	{
	    		ArrayList<Persoana> lista2 = new ArrayList<Persoana>();
	    		lista2.add(x);
	    		map.put(x.studiiAbs,lista2);
	    		
	    	}
	    	if(map.containsKey(y.studiiAbs))
	    		map.get(y.studiiAbs).add(y);
	    	else
	    	{
	    		ArrayList<Persoana> lista2 = new ArrayList<Persoana>();
	    		lista2.add(y);
	    		map.put(y.studiiAbs,lista2);
	    		
	    	}
	    		
	    }
	    System.out.println("------------------");
	    for(Map.Entry<String,ArrayList<Persoana>> j : map.entrySet()) 
	    	System.out.println(j.getKey()+" "+j.getValue());
	    
	}
	static <T> void afisare(ArrayList<T> lista)
	{
		if(lista.get(0) instanceof Persoana)
			System.out.println(lista);
	}

}
