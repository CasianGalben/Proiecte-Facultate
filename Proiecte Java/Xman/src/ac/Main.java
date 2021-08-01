package ac;
import java.util.HashMap;
/**
 * Clasa Main
 * @author Galben Casian
 *
 */
public class Main {
    public static void main(String[] args) {
//        XMan apo = new Apocalipsa(); // pctj = 15
//        apo = new Teleportare(apo); // pctj = 25
//        apo = new Aripi(apo); // pctj = 25.7
//        apo.afisare();

        XMan[] xmans = new XMan[10];

        xmans[0]=new Apocalipsa();
        xmans[1]=new Apocalipsa();
        xmans[1].nume="Apo2";
        xmans[1]=new Aripi(xmans[1]);
        xmans[2]=new Magneto();
        xmans[2]=new Teleportare(xmans[2]);
        xmans[2]=new Aripi(xmans[2]);
       
        HashMap<Class,Integer> dict=new HashMap<>();
        
        for(XMan x: xmans) {
        	vfRec(x,dict);
        	
        }
        
        boolean ok = false;
        for(Class c : dict.keySet()){
            if(dict.get(c) == 1){
                ok = true;
            }
        }
        if(ok == false){
            return;
        }
        
        for(XMan x : xmans) {
        	afisare(dict,x,ultimulXman(x));
        }

 
    }
    /**
     * Merge recursiv pentru a construi un dictionar de frecventa
     * @param x XMan
     * @param dict HashMap<Class,Integer>
     */
    public static void vfRec(XMan x,HashMap<Class,Integer> dict) {
    	if(x instanceof Putere) {
    		if(dict.get(x.getClass())==null) {
    			dict.put(x.getClass(),1);			
    		}
    		else
    		{
    			int i=dict.get(x.getClass());
    			dict.put(x.getClass(),i+1);
    		}
    		vfRec(((Putere)x).xman,dict);
    	}   	
    }
    /**
     * Merge recursiv pentru a cauta cea mai cea mai adanca putere 
     * @param y XMan
     * @return y
     */
    public static XMan ultimulXman(XMan y) {
    	if(y instanceof Putere) {
    		return ultimulXman(((Putere)y).xman);
    	}
    	return y;
    }
    /**
     * Afiseaza din dictionar puterea 
     * @param dict HashMap<Class,Integer>
     * @param x XMan
     * @param y XMan
     */
    public static void afisare(HashMap<Class,Integer> dict,XMan x,XMan y) {
    	if(x instanceof Putere) {
    		if(dict.get(x.getClass())==1) {
    			System.out.println(y.nume);
    		}
    		afisare(dict,((Putere)x).xman,y);
    	}
    }
    
    
    
    
    
}
