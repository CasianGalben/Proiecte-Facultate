import java.text.*;
public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura[] tablou=new Figura[5];
		System.out.println("punctul a");
		obiecte(tablou);
		System.out.println("punctul b");
		arie_perimetru(tablou);
		DecimalFormat a=new DecimalFormat(".##");
		System.out.println(a.format(tablou[1].arie())); //formatare 
		System.out.println("punctul c");
		append(tablou);
		
		System.out.println("Elementele tabloului");
		for(Figura f : tablou)
			System.out.println(f);
		
		
	}
	
	public static void obiecte(Figura[] tablou)
	{
		tablou[0]=new Cerc(7,true);
		tablou[1]=new Cerc(2,false);
		tablou[2]=new Dreptunghi(4,2,false);
		tablou[3]=new Dreptunghi(5,3,true);
		
		for(Figura f: tablou)
			System.out.println(f);
	}
	
	public static void arie_perimetru(Figura[] tablou) {
		
		for(Figura f: tablou) {
			if( f instanceof Cerc)
				System.out.printf("Aria cercului: %.2f \n",f.arie()) ;
			if( f instanceof Dreptunghi)
				System.out.println("Perimetrul dreptunghiului: "+f.perimetru()) ;
		}
	}
	
	public static void append(Figura[] tablou)
	{
		tablou[tablou.length-1]=new Trapez(5,6,7,true);
		for(Figura f : tablou)
			System.out.println(f);
		
	}

}
