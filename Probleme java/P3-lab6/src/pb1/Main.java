package pb1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args)
	{   
		Map<String, Vector> note = new HashMap<String,Vector>();
		note.put("Matematica",new Vector<Integer>(Arrays.asList(8,6,10)));
		note.put("Informatica",new Vector<Integer>(Arrays.asList(8,9,10)));
		
		
		//Elev e = new Elev("Popescu Ion",10,note);
		//elevi = (Vector<Elev>) elevi.stream().sorted(Comparator.comparingDouble(e->e.mediaGenerala())).collect(Collectors.toCollection());
		
		
	}
	

}
