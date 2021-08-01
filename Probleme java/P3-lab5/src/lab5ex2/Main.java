package lab5ex2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Floare> f = new ArrayList<Floare>();
		f.add(new Floare("lalea","florea",15));
		f.add(new Floare("zambila","florea",15));
		f.add(new Floare("trandafir","florea",20));
		
		f.forEach(e -> System.out.println(e));
		f.stream().mapToInt(e->e.getPret()).average().ifPresent(medie->System.out.println("Media este: "+medie));
		ArrayList<Floare> extragere = (ArrayList<Floare>) f.stream().filter(e->e.nume.startsWith("la")).collect(Collectors.toList());
		System.out.println(extragere);
	}
	
	
	
	
      

}
