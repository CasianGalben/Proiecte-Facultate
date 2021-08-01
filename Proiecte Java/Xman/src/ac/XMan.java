package ac;
/**
 * Clasa Xman de baza
 * @author Galben Casian
 *
 */
public abstract class XMan {
    int varsta;
    double punctaj=0.0f;// initializeaza pe 0 float
    String nume="";
    /**
     * Constructor pentru varsta
     * @param varsta int
     */
    public XMan(int varsta) {
        this.varsta = varsta;
    }
    public XMan() { }
    /**
     * Constructor pentru varsta si punctaj
     * @param varsta int
     * @param punctaj double
     */
    public XMan(int varsta, double punctaj) {
        this.varsta = varsta;
        this.punctaj = punctaj;
    }
    /**
     * Constructor pentru afisare
     */
    void afisare() {
        System.out.println(punctaj);
    }
    
    
}
