package ac;
/**
 * Clasa Putere care extinde clasa Xman
 * @author Galben Casian
 *
 */
public abstract class Putere extends XMan {
    XMan xman;
    /**
     * Constructorul pentru punctaj
     * @param x XMan
     */
    public Putere(XMan x){
        this.punctaj = getPunctaj() + x.punctaj;
        this.xman = x;
    }
    
    public abstract double getPunctaj();

}
