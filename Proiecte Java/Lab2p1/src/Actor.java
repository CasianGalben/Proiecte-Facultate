
/**
*Actor.java clasa definescte un actor
* @author Casian
* @version 1.0
* @since 05.10.20


*/

public class Actor {
	private String nume,prenume;
	int anNastere;
	public String numeScoala="FARA SCOALA";
	
    public Actor() {
    	
    }
/**
 * Constructorul explicit al clasei Actor	
 * @param nume String
 * @param p String
 * @param an int
 * @param nScoala String
 */
    public Actor(String nume,String p,int an,String nScoala) {
    	this.nume=nume;
    	prenume=p;
    	anNastere=an;
    	numeScoala=nScoala;
    }
    
    public Actor(String nume,String p,int an) {
    	this.nume=nume;
    	prenume=p;
    	anNastere=an;
    	
    }
    
    public String toString() {
    	return nume+" "+prenume+" "+anNastere+" "+numeScoala;
    }
    /**
     * returneaza numele actorului 
     * @return nume String
     */
    public String getNume() {
    	return nume;
    }
    /**
     * Seteaza o valoare
     * @param n nume String
     */
    public void setNume(String n) {
    	nume=n;
    }
    public int getAn() {
    	return anNastere;
    }
    public void setAn(int an) {
    	anNastere=an;
    }
    
  
}
