package ac;
/**
 * Clasa Aripi care extinde clasa Putere
 * @author Galben Casian
 *
 */
public class Aripi extends Putere {
    /**
     * Constructor pentru Aripi
     * @param x XMan
     */
    public Aripi(XMan x) {
        super(x);
    }
    /**
     * Returneaza punctajul
     */
    @Override
    public double getPunctaj() {
        return 0.7;
    }
}
