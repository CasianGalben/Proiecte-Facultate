import java.util.Arrays;

public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura[] tablou= new Figura[4];
		tablou[0]=new Cerc(5,true);
		tablou[1]=new Cerc(7,false);
		tablou[2]=new Dreptunghi(5,5,true);
		tablou[3]=new Dreptunghi(7,8,false);
		
		
		for(Figura f : tablou)
			System.out.println(f);
		
		for(Figura f : tablou) {
			if( f instanceof Cerc)
				System.out.println(f.Arie());
	      if(f instanceof Dreptunghi)
		       System.out.println(f.Perimetru());
		
	}
		tablou=Arrays.copyOf(tablou, 5);
		tablou[4]=new Cerc(10,true);
		for(Figura f: tablou)
			System.out.println(f);	
}
}
