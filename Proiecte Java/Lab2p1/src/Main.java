/**
 * Implementaeza Actor
 * @author Casian
 *
 */
public class Main {
    
 static void Numarare(Actor[] a) {
	 int k=0;
	 for(int i=0;i<a.length;i++)
		 if(a[i].numeScoala.equals("FARA SCOALA"))
			k++;
	 System.out.println(k);
 }
 static void AfisareNume(Actor[] a,String x) {
	 
	 for(int i=0;i<a.length;i++)
		 if(a[i].getNume().equals(x) || a[i].getNume().startsWith(x))
			System.out.println(a[i].getNume());
 }
	
	public static void main(String[] args) {
		Actor a=new Actor();
		Actor b=new Actor("Ionescu","Ion",2000);
		Actor c=new Actor("Popescu","Vlad",1999,"UVT");
        Actor[] lista=new Actor[4];
        lista[0]=new Actor("Ion","Ion",1998,"Uvt");
        lista[1]=b;
        lista[2]=c;
        lista[3]=new Actor("Andrei","Marin",2001);
        
        for(int i=0;i<lista.length;i++)
        	System.out.println(lista[i]);
        
     Numarare(lista);
     AfisareNume(lista,args[0]);
	}
    
}
